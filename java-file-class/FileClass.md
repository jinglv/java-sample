# Java文件类的学习

## IO流（Input Output）
在学习File类首先了解一下IO技术

IO技术主要的作用是解决设备与设备之间的数据传输问题。比如：硬盘-->内存，内存的数据---->硬盘上，把键盘的数据--->内存中

IO技术的应用场景：导出报表，上传大头照，下载，解析xml文件……

数据保存到硬盘上，该数据就可以做到永久性能的保存。数据一般是以文件的形式保存到硬盘。

### IO流技术
#### IO流分类
如果是按照数据的流向划分：
- 输入流
- 输出流

如果按照处理的单位划分
- 字节流：字节流读取的都是文件中二进制数据，读取到二进制数据不会经过任何的处理
- 字符流：字符流读取的数据是以字符为单位的。字符流也是读取文件中的二进制数据，不过会把这些二进制数据转换成我们能识别的字符
    - 字符流 = 字节流 + 解码

## File类
sun使用了一个File类描述了文件或者文件夹的，File类可以描述一个文件或者一个文件夹

File类的构造方法：
- File(String pathname) 指定文件或者文件夹的路径创建一个File文件
- File(File parent, String child)  根据parent抽象路径名和child路径名字符串创建一个新File实例
- File(String parent, String child)  根据parent路径名字符串和child路径名字符串创建一个新File实例

目录分隔符：在windows机器上的目录分隔符是\，在linux机器上的目录分隔符是/

注意：在windows上面\与/都可以使用作为目录分隔符。而且，如果些/的时候只需要写一个正斜杠即可

路径问题：
- 绝对路径：该文件在硬盘上的完整路径。绝对路径一般都是以盘符开头的
- 相对路径：相对路径就是资源文件相对于当前程序所在的路径
    - . 当前路径
    - ..上一级路径
    
注意：如果程序当前所在的路径与资源文件不是同一个盘下面，是没法写相对路径的

### File类的常用方法
#### 创建
- **createNewFile()**：在指定位置创建一个空文件，成功就返回true，如果已存在就不创建然后返回false
- **mkdir()**: 在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛异常
- **mkdirs()**: 在指定位置创建目录，这会创建路径中所有不存在的目录
- **renameTo(File dest)**: 重命名文件或文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切,剪切时候不能操作非空的文件夹。移动/重命名成功则返回true，失败则返回false
#### 删除
- **delete()**:删除文件或一个空文件夹，如果是文件夹且不为空，则不能删除，成功返回true，失败返回false
- **deleteOnExit()**:在虚拟机终止时，请求删除此抽象路径名表示的文件或目录，保证程序异常时创建的临时文件也可以被删除
#### 判断
- **exists()**:文件或文件夹是否存在
- **isFile()**:是否是一个文件，如果不存在，则始终为false
- **isDirectory()**:是否是一个目录，如果不存在，则始终为false
- **isHidden()**:是否是一个隐藏的文件或者是否是隐藏的目录
- **isAbsolute()**:测试此抽象路径名是否为绝对路径名
#### 获取
- **getName()**:获取文件或文件夹的名称，不包含上级路径
- **getPath()**:返回绝对路径，可以是相对路径，但是目录要指定
- **getAbsolutePath()**:获取文件的绝对路径，与文件是否存在没关系
- **length()**:获取文件的大小（字节数），如果文件不存在则返回0L,如果是文件夹也返回0L
- **getParent()**:返回此抽象路径名父目录的路径名称字符串，如果此路径名没有指定父目录，则返回null
- **lastModified()**:获取最后一次被修改的时间
#### 文件夹相关
- **static File[] listRoots()**:列出所有的根目录（Windows中所有的系统盘符）
- **list()**:返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null
- **listFiles()**:返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null

## 字节流
字节流读取的是文件中的二进制数据，读到的数据并不会帮你转换成你看得懂的字符
### 输入字节流
InputStream（抽象类）所有输入字节流的基类
- FileInputStream读取文件数据的输入字节流
    - 使用FileInputStream读取文件数据的步骤
        1. 找到目标文件
        2. 建立数据的输入通道
        3. 读取文件中的数据
        4. 关闭资源，实际上是释放资源

### 输出字节流
OutputStream 是所有输出字节流的父类。抽象类
    - FileOutStream 向文件输出数据的输出字节流
        - FileOutputStream使用步骤
            1. 找到目标文件
            2. 建立数据的输出通道
            3. 把数据转换成字节数组写出
            4. 关闭资源

FileOutputStream要注意的细节：
1. 使用FileOutputStream的时候，如果目标文件不存在，那么会自动创建该文件
2. 使用FileOutputStream写数据的时候，如果目标文件已经存在，那么会先情况目标文件中的数据，然后再写入数据
3. 使用FileOutputStream写数据的时候，如果目标文件已经存在，需要在原来的数据基础上追加数据的时候应该使用new FileOutputStream(file,true)构造函数，第二个参数为true
4. 使用FileOutputStream的write方法写数据的时候，虽然接收的是一个int类型的数据，但是真正写出的只是一个字节的数据，只是把第八位的二进制数据写出，其他二十四味数据全部丢弃

## 字符流
字符流会把读取到的二进制的数据进行对应的编码与解码的工作。字符流 = 字节流 + 编码（解码）
### 输入字符流
Reader 输入字符流的基类抽象类
- FileReader 读取文件的输入字符流
    - FileReader的用法：
        1. 找到目标文件
        2. 建立数据的输入通道
        3. 建立缓冲字符数组读取文件数据
        4. 关闭资源
        
### 输出字符流
- Write 输出字符流的基类。抽象类
    - FileWrite 向文件数据输出字符流
        1. 找到目标文件
        2. 建立数据输出通道
        3. 写出数据
        4. 关闭资源

FileWrite要注意的事项：
1. 使用FileWrite写数据的时候，FileWrite内部是维护了一个1024个字符数组的，写数据的时候会先写入到它内部维护的字符数组中，如果需要把数据真正写到硬盘上，需要调用flush或者是close方法或者是填满内部的字符数组
2. 使用FileWriter的时候，如果目标文件不存在，那么会自动创建目标文件
3. 使用FileWriter的时候，如果目标文件已经存在了，那么默认情况会先清空文件中的数据，然后再写入数据，如果需要在原来的基础上追加数据，需要使用 new FileWriter(File,boolean) 的构造方法，第二参数为true

### 缓冲输入字符流
- Reader 所有输入字符流的基类抽象类
    - FileReader 读取文件字符的输入字符流
    - BufferedReader 缓冲输入字符类缓冲输入字符流出现的目的是为了提高读取文件字符的效率和拓展FileReader的功能，其实该类内部也是维护了一个字符数组
        - BufferedReader的使用步骤
            1. 找到目标文件
            2. 建立数据的输入通道
            3. 建立缓冲输入字节流
            4. 关闭资源

注意：缓冲流都不具备读写文件的能力

### 缓冲输出字符流
- Write 所有输出字符流的基类抽象类
    - FileWrite 向文件输出字符数据的输出字符流
    - BufferedWrite 缓冲速出字符流  缓冲输出字符流作用：提高FileWriter的写输出效率与拓展FileWrite的功能
        - BufferedWrite的使用步骤
            1. 找到目标文件
            2. 建立数据输出通道
            3. 建立缓冲输出流
            4. 写出数据
            5. 关闭资源
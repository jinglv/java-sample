# Java开发常用工具合集

## lombok
[lombok官网](https://projectlombok.org)

### 引言
- **还记得刚刚接触java,学习面向对象时因为手写get,set,hashcode,equals等方法的痛苦吗?**
- **还记得后来上手了Eclipse|Idea这样工具可以快速生成get,set等相关方法的兴奋吗? 好强大..**
- **后来工作时间长了,这种兴奋渐渐就变成了的苦恼?**

很重要一个原因就是因为随着项目业务模块功能不断扩展,项目中涉及库表越来越多,导致项目中实体类(Entity)对象越来越多,每次写Entity对象最头疼就是生成Get,SET等相关方法,极大影响开发效率,如何更好的解决呢? lombok出现仿佛让我们回到曾经的那种喜悦!!!

### lombok是什么
Lombok项目是一个Java库，它会自动插入编辑器和构建工具中，Lombok提供了一组有用的注释(注解)，用来消除Java类中的大量样板代码。仅五个字符(@Data)就可以替换数百行代码从而产生干净，简洁且易于维护的Java类 ---百度百科

Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more. --摘自官网

通俗解释: lombok快速开发工具,提供了一组java相关注解,通过注解用来更快速生成java对象中我们想要的相关方法(get,set,toString ....)等一系列方法

### lombok使用实战
1. 创建maven项目，引入依赖
    ```xml
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.12</version>
        <scope>provided</scope>
    </dependency>
    ```
    
2. 使用提供的注解
    - `@Data`注解：自动给对象提供 GET SET ToString hashCode equals 等方法
    ```java
    package com.example.lombok;
    
    import lombok.Data;
    
    import java.util.Date;
    
    /**
     * @author jinglv
     * @date 2020/10/05
     */
    @Data
    public class User {
        private Integer id;
        private String name;
        private Integer age;
        private Date birthday;
    }
    ```
   测试：
   ```
   @Test
   void testUser() {
       User user = new User();
       user.setId(1);
       user.setName("王二花");
       user.setAge(18);
       user.setBirthday(new Date());

       System.out.println(user);
   }
   ```
   运行结果
   ```
    User(id=1, name=王二花, age=18, birthday=Mon Oct 05 11:32:38 CST 2020)
   ```
   
3. lombok原理

    ![image-20201005113740517](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005113740517.png)

    - SOURCE：在代码编译时生效
    
### lombok常用注解

#### @Data

- 修饰范围在**类**上

- 作用：用来生成对象中GET SET ToString HashCode equals等相关方法

  ```java
  package com.example.lombok;
  
  import lombok.Data;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Data
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```

  

#### @Getter/@Setter

- 修饰范围在**类**上

- 作用：用来只生成对应GET/SET方法

  ```java
  package com.example.lombok;
  
  import lombok.Getter;
  import lombok.Setter;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Getter
  @Setter
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```



#### @ToString

- 修饰范围在**类**上

- 作用：用来生成toString方法

  ```java
  package com.example.lombok;
  
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Getter
  @Setter
  @ToString
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```



#### @AllArgsConstructor/@NoArgsConstructor(全部参数的有参构造/无参构造)

- 修饰范围在**类**上

- 作用：用来生成全部参数的有参构造和无参构造

- 注意：一旦提供有参构造，也要类提供无参构造

  ```java
  package com.example.lombok;
  
  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```

#### @Accessors

- 修饰范围在**类**上

- 作用：用来给类中set方法开启**链式**调用，**chain属性**: 用来指定是否开启SET方法链式调用 true开启 false不开启（默认）

  ```java
  package com.example.lombok;
  
  import lombok.Data;
  import lombok.experimental.Accessors;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Data
  @Accessors(chain = true)
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```

  测试

  ```
  @Test
  void testUser() {
    User user = new User();
    /*user.setId(1);
    user.setName("王二花");
    user.setAge(18);
    user.setBirthday(new Date());*/
  
    user.setId(1).setName("王二虎").setId(16).setBirthday(new Date());
  
    System.out.println(user);
  }
  ```



#### @Slf4j

- 修饰范围在**类**上

- 作用：用来快速给类中定义一个日志变量

- 原理：在对应类上加入这个注解相当于在这个类中声明了一个日志对象

  ```
  private Logger log = LoggerFactory.getLogger(this.getClass());
  ```

- 具体用法

  ```java
  @Controller
  @RequestMapping("user")
  @Slf4j
  public class UserController {
      @RequestMapping("findAll")
      public String findAll(){
          log.info("进入findAll方法");
          log.info("姓名:[{}],年龄:[{}]",name,age);
          return "index";
      }
  }
  ```

#### @EqualsAndHashCode
  
- 修饰范围在**类**上
  
- 作用：用来生成equals(Object other)和hashCode()方法的实现，**callSuper属性**: 用来指定是否调用父类的equals和hashCode方法， true开启 false不开启（默认）



### idea中安装lombok
**注意:默认在idea中不支持lombok语法,写上之后没有任何效果,需要在idea中额外安装插件才可以继续使用lombok**

IntelliJ IDEA --> Preferences --> Plugins --> 搜索lombok 下载安装 安装完成重启idea即可

![image-20201005114344180](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005114344180.png)

**安装完成之后出现如下问题的解决方案:**

![image-20201005120211047](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005120211047.png)

解决方法：

![](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005120252513-20201005120310109-20201005120312988.png)



## hutool

[hutool官方网站](https://www.hutool.cn)

### 简介
Hutool是一个小而全的Java工具类库，通过静态方法封装，降低相关API的学习成本，提高工作效率，使Java拥有函数式语言般的优雅，让Java语言也可以"甜甜的"。

Hutool中的工具方法来自于每个用户的精雕细琢，它涵盖了Java开发底层代码中的方方面面，它既是大型项目开发中解决小问题的利器，也是小型项目中的有效担当。

Hutool是项目中"util"包友好的代替，它节省了开发人员对项目中公用类和公共工具方法的封装时间，使开发专注于业务，同时可以最大限度的避免封装不完善带来的bug。

1. 名字由来

Hutool = Hu + tool，是原公司项目底层代码剥离后的开源库。"Hu"是公司名称的表示，tool表示工具，Hutool谐音"糊涂"，一方面简洁易懂，一方面寓意"难得糊涂"。

2. Hutool如何改变我们的coding方式

Hutool的目标是使用一个工具方法代替一段复杂代码，从而最大限度的避免"复制粘贴"代码的问题，彻底改变我们写代码的方式。



以计算MD5为例

- 【以前】打开搜索引擎 -> 搜索"Java MD5加密" -> 打开某篇博客 -> 复制粘贴 -> 改改好用
- 【现在】引入Hutool -> SecureUtil.md5()



### 包含组件

一个Java基础工具类，对文件、流、加密解密、转码、正则、线程、XML等JDK方法进行封装，组成各种Util工具类，同时提供以下组件：

| 模块               | 介绍                                                         |
| ------------------ | ------------------------------------------------------------ |
| hutool-aop         | JDK动态代理封装，提供非IOC下的切面支持                       |
| hutool-bloomFilter | 布隆过滤，提供一些Hash算法的布隆过滤                         |
| hutool-cache       | 简单缓存实现                                                 |
| hutool-core        | 核心，包括Bean操作、日期、各种Util等                         |
| hutool-cron        | 定时任务模块，提供类Crontab表达式的定时任务                  |
| hutool-crypto      | 加密解密模块，提供对称、非对称和摘要算法封装                 |
| hutool-db          | JDBC封装后的数据操作，基于ActiveRecord思想                   |
| hutool-dfa         | 基于DFA模型的多关键字查找                                    |
| hutool-extra       | 扩展模块，对第三方封装（模板引擎、邮件、Servlet、二维码、Emoji、FTP、分词等） |
| hutool-http        | 基于HttpUrlConnection的Http客户端封装                        |
| hutool-log         | 自动识别日志实现的日志门面                                   |
| hutool-script      | 脚本执行封装，例如Javascript                                 |
| hutool-setting     | 功能更强大的Setting配置文件和Properties封装                  |
| hutool-system      | 系统参数调用封装（JVM信息等）                                |
| hutool-json        | JSON实现                                                     |
| hutool-captcha     | 图片验证码实现                                               |
| hutool-poi         | 针对POI中Excel和Word的封装                                   |
| hutool-socket      | 基于Java的NIO和AIO的Socket封装                               |

可以根据需求对每个模块单独引入，也可以通过引入hutool-all方式引入所有模块。

### 使用Hutool

maven项目中，直接在项目中引入如下依赖即可：

```xml
<dependency>
  <groupId>cn.hutool</groupId>
  <artifactId>hutool-all</artifactId>
  <version>5.3.8</version>
</dependency>
```

### Convert类型转换

[使用官方文档](https://www.hutool.cn/docs/#/core/类型转换/类型转换工具类-Convert)

#### 痛点

在Java开发中我们要面对各种各样的类型转换问题，尤其是从命令行获取的用户参数、从HttpRequest获取的Parameter等等，这些参数类型多种多样，我们怎么去转换他们呢？常用的办法是先整成String，然后调用XXX.parseXXX方法，还要承受转换失败的风险，不得不加一层try catch，这个小小的过程混迹在业务代码中会显得非常难看和臃肿。

#### Convert类

Convert类可以说是一个工具方法类，里面封装了针对Java常见类型的转换，用于简化类型转换。Convert类中大部分方法为toXXX，参数为Object，可以实现将任意可能的类型转换为指定类型。同时支持第二个参数defaultValue用于在转换失败时返回一个默认值。



### IO流

[使用官方文档](https://www.hutool.cn/docs/#/core/IO/概述)

#### 介绍

IO的操作包括读和写，应用场景包括网络操作和文件操作。IO操作在Java中是一个较为复杂的过程，我们在面对不同的场景时，要选择不同的InputStream和OutputStream实现来完成这些操作。而如果想读写字节流，还需要Reader和Writer的各种实现类。这些繁杂的实现类，一方面给我我们提供了更多的灵活性，另一方面也增加了复杂性。

#### 封装

io包的封装主要针对流、文件的读写封装，主要以工具类为主，提供常用功能的封装，这包括：

- `IoUtil` 流操作工具类
- `FileUtil` 文件读写和操作的工具类。
- `FileTypeUtil` 文件类型判断工具类
- `WatchMonitor` 目录、文件监听，封装了JDK1.7中的WatchService
- `ClassPathResource`针对ClassPath中资源的访问封装
- `FileReader` 封装文件读取
- `FileWriter` 封装文件写入
package com.demo.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jingLv
 * @date 2020/11/19
 */
public class FileDemoMethod {

    public static void main(String[] args) {
        //创建
        File file = new File("F:\\b.txt");
        try {
            //createNewFile创建一个指定的文件，如果该文件存在了，则不会创建，如果还没有存在则创建。创建成功返回true，否则返回false。
            System.out.println("创建成功了吗？" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File dir = new File("F:\\aaa");
        //mkdir创建一个单级的文件夹
        System.out.println("创建文件夹成功吗？" + dir.mkdir());
        dir = new File("F:\\aa\\bb");
        System.out.println("创建多级文件夹：" + dir.mkdirs());

        //删除
        //renameTo(),如果目标文件与源文件是在同一个路径下，那么renameTo的作用是重命名，如果目标文件与源文件不是在同一个路径下，那么renameTo的作用就是剪切，而且不能操作文件夹
        File destFile = new File("F:\\abc.txt");
        System.out.println("重命名成功了吗？" + file.renameTo(destFile));

        File dFile = new File("F:\\a.txt");
        //delete方法不能用于删除非空的文件夹。delete方法会马上删除一个文件
        System.out.println("删除成功吗？" + dFile.delete());
        //jvm退出的时候删除文件。一般用于删除临时文件

        dFile.deleteOnExit();
        //判断
        File eFile = new File("F:\\a.txt");
        System.out.println("存在吗？" + eFile.exists());
        //如果是文件返回true，否则返回false
        System.out.println("判断是否是一个文件：" + eFile.isFile());
        //如果是文件夹返回true，否则返回false
        System.out.println("判断是否是一个文件夹：" + eFile.isDirectory());
        System.out.println("是隐藏的文件吗?" + eFile.isHidden());
        System.out.println("是绝对路径吗？" + eFile.isAbsolute());

        File fileTow = new File("..\\..\\a.txt");
        //不管文件存不存在都会返回用户名
        System.out.println("文件名：" + fileTow.getName());
        //传什么返回什么
        System.out.println("获取绝对路径：" + fileTow.getPath());
        //会加上当前路径的,getAbsolutePath获取绝对路径：D:\JavaProject\JavaTest\..\..\a.txt
        System.out.println("获取文件的大小（字节为单位）:" + fileTow.length());
        System.out.println("getAbsolutePath获取绝对路径：" + fileTow.getAbsolutePath());
        //获取文件的父路径：..\..
        System.out.println("获取文件的父路径：" + fileTow.getParent());
        System.out.println("获取最后一次修改时间（毫秒值）：" + fileTow.lastModified());
        //使用毫秒值转换成Date对象
        long lastModified = fileTow.lastModified();
        Date date = new Date(lastModified);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println("获取最后一次修改时间" + dateFormat.format(date));

        //文件夹相关操作
        //列出所有的根目录
        File[] roots = File.listRoots();
        for (File files : roots) {
            System.out.println(files);
        }

        File lFile = new File("D:\\JavaProject\\JavaTest\\");
        //列出当前文件夹下面的所有子文件名与子文件夹名，存储到一个String类型的数组中返回
        String[] list = lFile.list();
        for (String filename : list) {
            System.out.println(filename);
        }
        // 把当前文件夹下面的所有子文件与子文件夹都使用了一个File对象描述，然后把这些File对象存储到一个File数组中返回
        File[] files = lFile.listFiles();
        for (File fileItem : files) {
            System.out.println("文件名：" + fileItem.getName());
        }

        File dirTwo = new File("E:\\2015年传智java基础+就业班 32期完整版\\2015基础班32期\\day16");
        listjava(dirTwo);
    }

    //文件名过滤器
    public static void listjava(File dir) {
        //得到文件夹下面的所有子文件与文件夹
        File[] files = dir.listFiles(new MyFilter());
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}

/**
 * 自定义一个文件名过滤器
 */
class MyFilter implements FilenameFilter {

    public boolean accept(File dir, String name) {
        //dir文件目录
        //name 文件名
        //System.out.println("文件夹：" + dir + "文件名：" + name );
        return name.endsWith(".java");
    }
}
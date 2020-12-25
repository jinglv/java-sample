package com.demo.system;

import com.demo.model.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 抛出异常：Exception in thread "main" java.io.NotSerializableException: com.demo.model.Student
 * NotSerializableException： 抛出一个实例需要一个Serializable接口，序列化运行时或实例的类可能会抛出此异常
 * 类的序列化由实现java.io.Serializable接口的类启用。不实现此接口的类将不会使任何状态序列化或反序列化
 * 因此，需要的对象实现Serializable接口，即Student对象实现Serializable接口
 *
 * @author jingLv
 * @date 2020/12/22
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // ObjectOutputStream(OutputStream out):创建一个写入执行的OutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-file-class/oos.txt"));
        // 创建对象
        Student student = new Student("001", "张三", 25, "北京");
        // void writeObject(Object obj):将指定的对象写入ObjectOutpuStream
        oos.writeObject(student);
        // 释放资源
        oos.close();
    }
}

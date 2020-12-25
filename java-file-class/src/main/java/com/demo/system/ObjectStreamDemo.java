package com.demo.system;

import com.demo.model.Person;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/23
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // write();
        // 修改Person(注意：Person实体没有serialVersionUID序列id)对象，增加一个toString方法，在执行
        read();
    }

    /**
     * 反序列化
     */
    private static void read() throws IOException, ClassNotFoundException {
        // ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-file-class/oos.txt"));
        // Object.readObject():从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        Person person = (Person) obj;
        System.out.println(person.getName() + "," + person.getAge());

        // 释放资源
        ois.close();
    }

    /**
     * 序列化
     */
    private static void write() throws IOException {
        // ObjectOutputStream(OutputStream out):创建一个写入执行的OutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-file-class/oos.txt"));
        // 创建对象
        Person person = new Person("张三", 25);
        // void writeObject(Object obj):将指定的对象写入ObjectOutpuStream
        oos.writeObject(person);
        // 释放资源
        oos.close();
    }
}

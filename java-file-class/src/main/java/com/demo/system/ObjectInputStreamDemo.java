package com.demo.system;

import com.demo.model.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author jingLv
 * @date 2020/12/22
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-file-class/oos.txt"));
        // Object.readObject():从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        Student student = (Student) obj;
        System.out.println(student.getSid() + "," + student.getName() + "," + student.getAge() + "," + student.getAddress());

        // 释放资源
        ois.close();
    }
}

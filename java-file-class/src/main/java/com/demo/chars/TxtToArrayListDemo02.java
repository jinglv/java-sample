package com.demo.chars;

import com.demo.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author jingLv
 * @date 2020/12/15
 */
public class TxtToArrayListDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. 定义学生类-- model/Student.java
        // 2. 创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java-file-class/students.txt"));
        // 3. 创建ArrayList集合对象
        ArrayList<Student> students = new ArrayList<>();
        // 4. 调用字符缓冲输入流对象的方法读取数据
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // 5. 把读取到额字符串数据用split()进行分割，得到一个字符串数组
            String[] strings = line.split(",");
            // 6. 创建学生对象
            Student student = new Student();
            // 7. 把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
            student.setSid(strings[0]);
            student.setName(strings[1]);
            student.setAge(Integer.parseInt(strings[2]));
            student.setAddress(strings[3]);
            // 8. 把学生对象添加到集合
            students.add(student);
        }
        // 9. 释放资源
        bufferedReader.close();
        // 遍历集合
        students.forEach(System.out::println);
    }
}

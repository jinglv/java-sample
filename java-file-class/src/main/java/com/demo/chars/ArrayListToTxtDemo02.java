package com.demo.chars;

import com.demo.model.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author jingLv
 * @date 2020/12/15
 */
public class ArrayListToTxtDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. 定义学生类-- model/Student.java
        // 2. 创建ArrayList集合
        ArrayList<Student> students = new ArrayList<>();
        // 3. 创建学生对象
        Student student1 = new Student("stu001", "张三", 25, "北京");
        Student student2 = new Student("stu002", "李四", 30, "武汉");
        Student student3 = new Student("stu003", "王五", 20, "上海");
        Student student4 = new Student("stu004", "赵六", 18, "成都");
        // 4. 把学生对象添加到集合中
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        // 5. 创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java-file-class/students.txt"));
        // 6. 遍历集合，得到每一个学生对象
        for (Student student : students) {
            // 7. 把学生对象的数据拼接成指定格式的字符串
            StringBuilder stringBuilder = new StringBuilder();
            // 字符串拼接
            stringBuilder.append(student.getSid()).append(",")
                    .append(student.getName()).append(",")
                    .append(student.getAge()).append(",")
                    .append(student.getAddress());
            // 8. 调用字符缓冲输出流对象的方法写数据
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        // 9. 释放资源
        bufferedWriter.close();
    }
}

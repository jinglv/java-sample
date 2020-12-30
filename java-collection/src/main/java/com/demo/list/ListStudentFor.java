package com.demo.list;

import com.demo.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jingLv
 * @date 2020/12/29
 */
public class ListStudentFor {
    public static void main(String[] args) {
        // 创建list集合对象
        List<Student> students = new ArrayList<>();
        // 创建学生对象
        Student student1 = new Student("张三", 20);
        Student student2 = new Student("李四", 21);
        Student student3 = new Student("王五", 22);
        // 把学生添加到集合中去
        students.add(student1);
        students.add(student2);
        students.add(student3);
        // 迭代器：集合特有的遍历方式
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println(student);
        }
        System.out.println("-----------------");
        // 普通for：带有索引的遍历方式
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
        }
        System.out.println("-----------------");
        // 增强for：最方便的遍历方式
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

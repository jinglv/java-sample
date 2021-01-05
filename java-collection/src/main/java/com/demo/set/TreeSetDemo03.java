package com.demo.set;

import com.demo.entity.Student;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author jingLv
 * @date 2021/01/05
 */
public class TreeSetDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
            }
        });
        // 创建学生对象
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);
        Student s5 = new Student("linqingxia", 33);
        // 相同的元素，添加不到集合中
        Student s6 = new Student("linqingxia", 33);
        // 将学生添加到集合
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        // 遍历集合
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

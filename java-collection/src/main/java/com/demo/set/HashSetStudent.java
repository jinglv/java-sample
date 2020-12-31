package com.demo.set;

import com.demo.entity.Student;

import java.util.HashSet;

/**
 * @author jingLv
 * @date 2020/12/31
 */
public class HashSetStudent {
    public static void main(String[] args) {
        // 创建HashSet集合对象
        HashSet<Student> hs = new HashSet<>();
        // 创建学生对象
        Student s1 = new Student("张三", 22);
        Student s2 = new Student("王五", 23);
        Student s3 = new Student("李四", 24);

        Student s4 = new Student("李四", 24);
        // 把学士添加到集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        hs.add(s4);
        // 遍历集合（增强for）
        for (Student h : hs) {
            System.out.println(h.getName() + ":" + h.getAge());
        }
    }
}

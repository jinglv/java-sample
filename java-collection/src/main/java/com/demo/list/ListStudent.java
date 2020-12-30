package com.demo.list;

import com.demo.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jingLv
 * @date 2020/12/28
 */
public class ListStudent {

    public static void main(String[] args) {
        // 创建list集合对象
        List<Student> list = new ArrayList<>();
        // 创建学生对象
        Student s1 = new Student("张三", 22);
        Student s2 = new Student("李四", 23);
        Student s3 = new Student("王五", 24);
        // 把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 遍历集合--迭代器方式
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + ":" + s.getAge());
        }
        System.out.println("---------------");
        // 遍历集合--for循环方式
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + ":" + s.getAge());
        }
    }
}

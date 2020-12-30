package com.demo.collection;

import com.demo.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jingLv
 * @date 2020/12/28
 */
public class CollectionStudent {

    public static void main(String[] args) {
        // 创建Collection集合对象
        Collection<Student> c = new ArrayList<>();
        // 创建学生对象
        Student s1 = new Student("张三", 21);
        Student s2 = new Student("李四", 22);
        Student s3 = new Student("王五", 23);
        // 把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        // 遍历集合（迭代器方式）
        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + ":" + s.getAge());
        }
    }
}

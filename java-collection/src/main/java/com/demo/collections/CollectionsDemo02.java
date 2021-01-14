package com.demo.collections;

import com.demo.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author jingLv
 * @date 2021/01/14
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        // 创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<>();
        // 创建学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 23);
        Student s4 = new Student("zhaoliu", 26);
        // 把学生对象添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        // 使用Collections对ArrayList集合排序
        // 指定比较器，不然Student需要实现Comparator接口
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 按照年龄从小到大排序，年龄相同时，按照姓名字母顺序排序
                int num = s1.getAge() - s2.getAge();
                return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
            }
        });
        // 遍历集合
        for (Student student : array) {
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}

package com.demo.map;

import com.demo.entity.Student;

import java.util.HashMap;
import java.util.Set;

/**
 * @author jingLv
 * @date 2021/01/08
 */
public class MapDemo07 {
    public static void main(String[] args) {
        // 创建HashMap集合对象
        HashMap<Student, String> hashMap = new HashMap<>();
        // 创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        // 把学生添加到集合
        hashMap.put(s1, "西安");
        hashMap.put(s2, "武汉");
        hashMap.put(s3, "郑州");
        // 遍历集合
        Set<Student> keySet = hashMap.keySet();
        for (Student student : keySet) {
            String value = hashMap.get(student);
            System.out.println(student.getName() + "," + student.getAge() + "," + value);
        }
    }
}

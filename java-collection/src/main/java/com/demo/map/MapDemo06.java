package com.demo.map;

import com.demo.entity.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jingLv
 * @date 2021/01/08
 */
public class MapDemo06 {
    public static void main(String[] args) {
        // 创建HashMap集合对象
        HashMap<String, Student> hashMap = new HashMap<>();
        // 创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        // 把学生添加到集合
        hashMap.put("stu001", s1);
        hashMap.put("stu002", s2);
        hashMap.put("stu003", s3);
        // 遍历集合
        // 方式一：键找值
        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            Student value = hashMap.get(s);
            System.out.println(s + "," + value.getName() + "," + value.getAge());
        }
        // 方式二：键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Student> studentEntry : entrySet) {
            String key = studentEntry.getKey();
            Student value = studentEntry.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}

package com.demo.generic;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class GenericDemo02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());

        System.out.println("-------------------");

        Person<String> g1 = new Person<>();
        g1.setT("张三");
        System.out.println(g1.getT());

        Person<Integer> g2 = new Person<>();
        g2.setT(30);
        System.out.println(g2.getT());

        Person<Boolean> g3 = new Person<>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}

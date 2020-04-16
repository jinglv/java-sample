package com.java.example.lambda.method;

/**
 * @author jingLv
 * @date 2020-04-16 1:27 PM
 */
public interface IPerson {
    /**
     * 抽象方法：通过指定类型的构造方法和初始化对象数据
     *
     * @param name
     * @param gender
     * @param age
     * @return
     */
    Person initPerson(String name, String gender, int age);
}

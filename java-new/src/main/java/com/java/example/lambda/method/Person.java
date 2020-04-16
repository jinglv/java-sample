package com.java.example.lambda.method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jingLv
 * @date 2020-04-16 1:02 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private int age;

    /**
     * 静态方法
     *
     * @param person1
     * @param person2
     * @return
     */
    public static int compareByAge(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}

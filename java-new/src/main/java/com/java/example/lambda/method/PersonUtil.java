package com.java.example.lambda.method;

/**
 * @author jingLv
 * @date 2020-04-16 1:23 PM
 */
public class PersonUtil {
    //增加一个实例方法
    public int compareByName(Person person1, Person person2) {
        return person1.getName().hashCode() - person2.getName().hashCode();
    }
}

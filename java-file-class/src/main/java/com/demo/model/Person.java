package com.demo.model;

import java.io.Serializable;

/**
 * @author jingLv
 * @date 2020/12/23
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -8627218638897120134L;

    private String name;
    private transient Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

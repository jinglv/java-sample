package com.demo.model;

import java.io.Serializable;

/**
 * @author jingLv
 * @date 2020/12/15
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -3657072962604195830L;

    private String sid;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String sid, String name, int age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void study() {
        System.out.println("学生们在学习");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

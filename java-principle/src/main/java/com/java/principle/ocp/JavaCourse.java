package com.java.principle.ocp;

import lombok.Getter;

/**
 * Java课程
 *
 * @author jinglv
 * @date 2020-04-06 17:50
 */
@Getter
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

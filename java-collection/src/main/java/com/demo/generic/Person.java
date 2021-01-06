package com.demo.generic;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class Person<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

package com.demo.generic;

/**
 * @author jingLv
 * @date 2021/01/06
 * <p>
 * 泛型类改进
 * @param <T>
 * <p>
 * 泛型类改进
 * @param <T>
 */
/*public class Show {

    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer i) {
        System.out.println(i);
    }

    public void show(Boolean b) {
        System.out.println(b);
    }
}*/

/**
 * 泛型类改进
 *
 * @param <T>
 */
/*
public class Show<T> {
    public void show(T t) {
        System.out.println(t);
    }
}
*/

/**
 * 泛型方法改进
 *
 */
public class Show {
    public <T> void show(T t) {
        System.out.println(t);
    }
}

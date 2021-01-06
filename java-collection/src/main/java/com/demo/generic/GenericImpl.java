package com.demo.generic;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class GenericImpl<T> implements Generic<T> {
    @Override
    public void show(T t) {
        System.out.println();
    }
}

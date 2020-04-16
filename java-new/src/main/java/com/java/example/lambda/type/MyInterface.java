package com.java.example.lambda.type;

/**
 * @author jingLv
 * @date 2020-04-15 1:10 PM
 */
@FunctionalInterface
public interface MyInterface<T, R> {
    R strategy(T t, R r);
}

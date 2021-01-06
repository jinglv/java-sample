package com.demo.generic;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class GenericDemo04 {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<>();
        g1.show("张三");

        Generic<Integer> g2 = new GenericImpl<>();
        g2.show(30);
    }
}

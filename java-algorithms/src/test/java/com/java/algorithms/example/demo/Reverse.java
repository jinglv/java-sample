package com.java.algorithms.example.demo;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020/09/22
 */
public class Reverse {

    public static void reverseOne() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            b[a.length - i - 1] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }

    public static void reverseTwo() {
        int[] a = {1, 2, 3, 4, 5};
        int tmp;
        for (int i = 0; i < (a.length / 2); i++) {
            tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        reverseOne();
        reverseTwo();
    }
}

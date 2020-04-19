package com.java.example.lambda.type;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda表达式类型检查
 *
 * @author jingLv
 * @date 2020-04-15 1:11 PM
 */
public class App {
    public static void test(MyInterface<String, List> iner) {
        List<String> list = iner.strategy("hello", new ArrayList());
        System.out.println(list);
    }

    public static void main(String[] args) {
        test(new MyInterface<String, List>() {
            @Override
            public List strategy(String s, List list) {
                list.add(s);
                return list;
            }
        });

        /**
         * 对于lambda表达式的类型检查，MyInterface接口就是lambda表达式的目标类型（target typing）
         *
         * (x,y)->{...}-->test(param)-->param==MyInterface-->lambda表达式->Interface类型
         *
         * 对于参数类型的检查
         * (x,y)->{...} --> MyInterface.strategy(T r, R r) --> MyInterface<String, List> iner --> T==String R==List
         * --> lambda-->(x,y)==strategy(T t, R r) --> x==T==String y==R==List
         */
        test((x, y) ->{
            y.add(x);
            return y;
        });
    }
}

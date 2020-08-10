package com.java.example.lambda.function;

import java.util.UUID;
import java.util.function.*;

/**
 * Java类型系统内建函数式接口
 *
 * @author jingLv
 * @date 2020/04/13
 */
public class Main {
    public static void main(String[] args) {
        //Predicate<String> pre = (String username) -> "admin".equals(username);
        Predicate<String> pre = "admin"::equals;
        System.out.println(pre.test("manager"));
        System.out.println(pre.test("admin"));

        Consumer<String> consumer = (String message) -> {
            System.out.println("要发送消息：" + message);
            System.out.println("消息发送完成！");
        };
        consumer.accept("hello gus！");
        consumer.accept("lambda expression!");

        Function<String, Integer> function = (String gender) -> "male".equals(gender) ? 1 : 0;
        System.out.println(function.apply("male"));
        System.out.println(function.apply("female"));

        Supplier<String> supplier = () -> UUID.randomUUID().toString();
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        UnaryOperator<String> unaryOperator = (String image) -> {
            image += "[100*1024]";
            return image;
        };
        System.out.println(unaryOperator.apply("原图--"));

        BinaryOperator<Integer> binaryOperator = (Integer i1, Integer i2) -> i1 > i2 ? i1 : i2;
        System.out.println(binaryOperator.apply(12, 13));
    }
}

package com.java.example.guava;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 学习Java8中Optional使用方法
 *
 * @author jingLv
 * @date 2020/10/30
 */
public class OptionalTest {

    @Test
    public void test() {
        // 三种创建Optional对象方法
        // 1.创建空的Optional对象
        Optional.empty();

        // 2.使用非null值创建Optional对象
        Optional.of("xiaohong");

        // 3. 使用任意值创建Optional对象
        Optional<Object> o = Optional.ofNullable("xiaohong");

        // 判断是否引用缺失的方法(建议不直接使用)
        o.isPresent();

        // 当Optional引用存在时执行
        // 类似的方法：map filter flatMap
        o.ifPresent(System.out::println);

        // 当Optional引用缺失时执行
        o.orElse("引用缺失");
        
        o.orElseGet(() -> {
            // 自定义引用缺失时的返回值
            return "自定义引用缺失";
        });

        o.orElseThrow(() -> {
            // 这里返回一个异常
            throw new RuntimeException("引用缺失异常");
        });
    }

    public static void stream(List<String> list) {
        // list.stream().forEach(System.out::println);
        Optional.ofNullable(list).map(List::stream).orElseGet(Stream::empty).forEach(System.out::println);
    }

    public static void main(String[] args) {
        stream(null);
    }
}

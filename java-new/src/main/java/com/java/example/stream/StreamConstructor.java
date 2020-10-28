package com.java.example.stream;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 流的四种构建形式
 *
 * @author jingLv
 * @date 2020/10/28
 */
public class StreamConstructor {

    /**
     * 由数值直接构建流
     */
    @Test
    public void streamFromValue() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(System.out::println);
    }

    /**
     * 通过数组构建流
     */
    @Test
    public void streamFromArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(System.out::println);
    }

    /**
     * 通过文件生成流
     *
     * @throws IOException
     */
    @Test
    public void streamFromFile() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("/Users/apple/JavaProject/java-sample/java-new/src/main/resources/Interfaces.sql"));
        lines.forEach(System.out::println);
    }

    /**
     * 通过函数生成的流（无限流）
     */
    @Test
    public void streamFromFunction() {
        // 通过迭代的方式生成流, 无限的生成
        // Stream<Integer> iterate = Stream.iterate(0, n -> n + 2);
        // 通过生成器，随机生成无限的流
        Stream<Double> generate = Stream.generate(Math::random);
        generate.limit(100).forEach(System.out::println);
    }
}

package com.java.example.file;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.function.Consumer;

/**
 * @author jingLv
 * @date 2020/10/27
 */
public class FileServiceTest {

    @Test
    public void testFileHandle() throws IOException {
        FileService fileService = new FileService();
        // 通过lambda表达式，打印文件内容
        fileService.oldFileHandle("/Users/apple/JavaProject/java-sample/java-new/src/main/resources/Interfaces.sql", fileContent -> System.out.println(fileContent));
    }

    /**
     * (args) -> ClassName.staticMethod(args);
     * ClassName::staticMethod;
     */
    public void test1() {
        Consumer<String> consumer1 = (String number) -> Integer.parseInt(number);
        Consumer<String> consumer2 = Integer::parseInt;
    }

    /**
     * (args) -> args.instanceMethod;
     * ClassName::instanceMethod;
     */
    public void test2() {
        Consumer<String> consumer1 = (String str) -> str.length();
        Consumer<String> consumer2 = String::length;
    }

    /**
     * (args) -> object.instanceMethod(args);
     * object::instanceMethod
     */
    public void test3() {
        StringBuilder stringBuilder = new StringBuilder();
        Consumer<String> consumer1 = (String str) -> stringBuilder.append(str);
        Consumer<String> consumer2 = stringBuilder::append;
    }
}
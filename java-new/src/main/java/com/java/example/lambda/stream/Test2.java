package com.java.example.lambda.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1.聚合操作
 * <p>
 * 2.stream的处理流程
 * - 数据源
 * - 数据转换
 * - 获取结果
 * <p>
 * 3.获取stream对象
 * - 从集合或者数组中获取[**]
 * Collection.stream()
 * Collection.parallelStream() 并发处理的stream
 * Arrays.stream(T t)
 * <p>
 * - BufferReader
 * BufferReader.lines() -> stream()
 * <p>
 * - 静态工厂
 * java.util.stream.IntStream.range()
 * java.nio.file.Files.walk()..
 * <p>
 * - 自行构建
 * java.util.Spliterator
 * <p>
 * -更多的方式
 * Random.ints()
 * Pattern.splitAsStream()
 * <p>
 * 4.中间操作API{intermediate}
 * 操作结果是一个Stream，中间操作可以有一个或多个连续的中间操作，需要注意的是：中间操作只记录操作方式，不做具体执行，直到结束操作发生时，才做数据的最终执行
 * <p>
 * 中间操作：就是业务逻辑处理
 * <p>
 * 中间操作过程：
 * - 无状态：数据处理时，不受前置中间操作的影响
 * map/filter/peek/parallel/sequential/unordered
 * - 有状态
 * distinct/sorted/limit/skip
 * <p>
 * 5.终结操作/结束操作{Terminal}
 * 需要注意：一个Stream对象，只能有一个Terminal操作，这个操作一旦发生，就会真是处理数据，生成对应的处理结果。(是不可逆的)
 * <p>
 * 终结操作：
 * - 非短路操作：当前的Stream对象必须处理完集合中所有数据，才能得到处理结果
 * forEach/forEachOrdered/toArray/reduce/collect/min/max/count/iterator
 * - 短路操作：当前的Stream对象在处理过程中，一旦满足某个条件，就可以得到结果
 * anyMatch/allMatch/noneMatch/findFirst/findAny等
 * <p>
 * 短路操作也称为：Short-circuiting
 * 短路操作什么时候使用：无限大的Stream -> 有限大的Stream (考虑性能问题时，需要加一个Short-circuiting)
 *
 * @author jingLv
 * @date 2020-04-17 12:18 PM
 */
public class Test2 {

    public static void main(String[] args) {
        // 1.批量数据 -> stream对象
        // 多个数据转换得到stream对象
        Stream stream1 = Stream.of("admin", "tome", "manager");

        //数组
        String[] strArrays = new String[]{"tome", "jerry"};
        Stream stream2 = Arrays.stream(strArrays);

        //列表
        List<String> list = new ArrayList<String>() {{
            add("少林");
            add("武当");
            add("峨眉");
            add("青城");
        }};
        Stream stream3 = list.stream();

        // 集合
        Set<String> set = new HashSet<String>() {{
            add("少林罗汉拳");
            add("峨眉剑法");
            add("青城剑法");
        }};
        Stream stream4 = set.stream();

        //Map
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("tom", 1000);
            put("jack", 500);
            put("may", 600);
        }};
        Stream stream5 = map.entrySet().stream();

        // 2.stream对象对于基本数据类型的功能封装
        // int/long/double
        IntStream.of(new int[]{10, 20, 30}).forEach(System.out::println);
        IntStream.range(1, 5).forEach(System.out::println);
        IntStream.rangeClosed(1, 5).forEach(System.out::println);

        // 3.stream对象-->转换得到指定的数据类型
        // 数组
        Object[] objects = stream1.toArray(String[]::new);

        //字符串
        String str = stream2.collect(Collectors.joining()).toString();
        System.out.println(str);

        // 列表
        List<String> list1 = (List<String>) stream3.collect(Collectors.toList());

        // 集合
        Set<String> set1 = (Set<String>) stream4.collect(Collectors.toSet());
        System.out.println(set1);

        // Map
        Map<String, String> map1 = (Map<String, String>) stream5.collect(Collectors.toMap(x -> x, y -> "value:" + y));
        System.out.println(map1);

        // 4. Stream常见的API操作
        List<String> accountList = new ArrayList<String>() {{
            add("one");
            add("two");
            add("three");
            add("four");
            add("five");
            add("six");
        }};

        // map()中间操作，map()方法接收一个Functional接口
        //accountList = accountList.stream().map(x -> "Number:" + x).collect(Collectors.toList());


        // filter() 添加过滤条件，过滤符合条件的用户
        //accountList = accountList.stream().filter(x -> x.length() > 3).collect(Collectors.toList());

        // forEach 增强型循环
        //accountList.forEach(x -> System.out.println("forEach:" + x));

        // peek() 中间操作， 迭代数据完成数据的依次处理过程
        accountList.stream().peek(x -> System.out.println("peek1:" + x))
                .peek(x -> System.out.println("peek2:" + x))
                .forEach(System.out::println);

        //accountList.forEach(System.out::println);

        // stream中对于数字运算的支持
        List<Integer> integerList = new ArrayList<Integer>() {{
            add(12);
            add(80);
            add(79);
            add(45);
            add(65);
            add(24);
            add(35);
            add(80);
            add(80);
        }};

        // skip() 中间操作，有状态，跳过部分数据
        //integerList.stream().skip(3).forEach(System.out::println);

        // limit()中间操作，有状态，限制输出数据量
        //integerList.stream().skip(3).limit(2).forEach(System.out::println);

        // distinct()中间操作，有状态，删除重复的数据
        //integerList.stream().distinct().forEach(System.out::println);

        // sorted() 中间操作，有状态， 排序
        //integerList.stream().sorted().forEach(System.out::println);
        // max()  获取最大值
//        Optional optional = integerList.stream().max((x, y) -> x - y);
//        System.out.println(optional.get());
        // min()  获取最小值
//        Optional optional = integerList.stream().min((x, y) -> x - y);
//        System.out.println(optional.get());
        // reduce()  合并处理数据
        Optional optional = integerList.stream().reduce((sum, x) -> sum + x);
        System.out.println(optional.get());
    }

}

package com.java.example.stream;

import com.alibaba.fastjson.JSON;
import com.java.example.cart.entity.Sku;
import com.java.example.cart.enums.SkuCategoryEnum;
import com.java.example.cart.service.CartService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * 演示流的各种操作
 *
 * @author jingLv
 * @date 2020/10/28
 */
public class StreamOperator {

    List<Sku> skus;

    @BeforeClass
    public void init() {
        skus = CartService.getCartSKuList();
    }

    /**
     * filter使用：过滤调不符合断言判断的数据
     */
    @Test
    public void filterTest() {
        skus.stream()
                // 过滤图书类的商品
                .filter(sku -> SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory()))
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));
    }

    /**
     * map使用：将一个元素转换成另一个元素
     */
    @Test
    public void mapTest() {
        skus.stream()
                // 转换为商品的名称集合
                .map(sku -> sku.getSkuName())
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));
    }

    /**
     * flatMap使用：将一个对象转换成流
     */
    @Test
    public void flatMapTest() {
        skus.stream()
                // 将商品名称分割为字符流返回
                .flatMap(sku -> Arrays.stream(sku.getSkuName().split("")))
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));
    }

    /**
     * peek使用：对流进行遍历操作，与forEach类似，但不会销毁流元素
     * peek和forEach都是遍历操作，有什么区别：
     * peek是中间操作，流操作完还是继续可以使用，传递到下一步操作
     * forEach是终端操作，流操作完事不可用的
     * <p>
     * 执行以下代码会发现，peek和forEach交替打印的，并不是peek执行完，在执行forEach，这也是流执行个一个特点：
     * 流是惰性执行，只有遇到终端操作，流的执行才会从上到下依次执行
     */
    @Test
    public void peekTest() {
        skus.stream()
                // sku的名称进行循环打印
                .peek(sku -> System.out.println(sku.getSkuName()))
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));

    }


    /**
     * sorted使用：对流中元素进行排序，可选择自然排序或指定排序规则。
     * 无参的是按照默认的自然排序操作排
     * <p>
     * 执行以下代码会发现，peek会先打印出来，forEach会后打印出来，这是因为在中间加了一个sorted有状态的操作，所有经过peek的数据都要在sorted里面做一个汇总，由sorted统一排序之后再交由下一个环节处理
     * 有状态操作和无状态的操作区别，会对数据执行的先后有所影响
     */
    @Test
    public void sortedTest() {
        skus.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .sorted(Comparator.comparing(Sku::getTotalPrice))
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));
    }

    /**
     * distinct操作：对流元素进行去重。
     */
    @Test
    public void distinctTest() {
        skus.stream()
                .map(Sku::getSkuCategory)
                .distinct()
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));
    }

    /**
     * skip使用：跳过前N条记录
     */
    @Test
    public void skipTest() {
        skus.stream()
                .sorted(Comparator.comparing(Sku::getTotalPrice))
                .skip(3)
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));
    }

    /**
     * limit使用：截断前N条记录
     */
    @Test
    public void limitTest() {
        skus.stream()
                .sorted(Comparator.comparing(Sku::getTotalPrice))
                .limit(3)
                .forEach(item -> System.out.println(JSON.toJSONString(item, true)));
    }

    /**
     * allMatch使用：终端操作，短路操作。所有元素匹配，返回true
     * 如何查看是短路操作，使用peek打印一下，依次匹配流中数据，只要遇到不匹配则直接返回
     */
    @Test
    public void allMatchTest() {
        boolean b = skus.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .allMatch(sku -> sku.getTotalPrice() > 1000);
        System.out.println(b);
    }

    /**
     * anyMatch使用：任何元素匹配要匹配，返回true
     */
    @Test
    public void anyMatchTest() {
        boolean b = skus.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .anyMatch(sku -> sku.getTotalPrice() > 1000);
        System.out.println(b);
    }

    /**
     * noneMatch使用：任何元素都不匹配返回true
     */
    @Test
    public void noneMatchTest() {
        boolean b = skus.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .noneMatch(sku -> sku.getTotalPrice() > 10000);
        System.out.println(b);
    }

    /**
     * findFirst使用：找到第一个
     */
    @Test
    public void findFirstTest() {
        Optional<Sku> skuOptional = skus.stream().findFirst();
        System.out.println(JSON.toJSONString(skuOptional.get(), true));
    }

    /**
     * findAny使用：找到任何一个
     * findAny和findFirst区别：并行上会有区别，找第一个元素在并行上限制会更多一些，任意元素在并行上就会少，在并行上findAny会比findFirst上快
     * findAny缺点是会随机匹配到元素
     * 流是串行的情况下：findAny和findFirst是没有区别的
     */
    @Test
    public void findAnyTest() {
        Optional<Sku> skuOptional = skus.stream().findAny();
        System.out.println(JSON.toJSONString(skuOptional.get(), true));
    }

    /**
     * max使用：获取流统计的最大值
     */
    @Test
    public void maxTest() {
        OptionalDouble optionalDouble = skus.stream()
                // 获取总价
                .mapToDouble(Sku::getTotalPrice)
                // 获取总价最大的值
                .max();
        System.out.println(optionalDouble.getAsDouble());
    }

    /**
     * min使用：获取流统计的最小值
     */
    @Test
    public void minTest() {
        OptionalDouble optionalDouble = skus.stream()
                // 获取总价
                .mapToDouble(Sku::getTotalPrice)
                // 获取总价最小的值
                .min();
        System.out.println(optionalDouble.getAsDouble());
    }

    /**
     * count使用：获取流中元素的个数
     */
    @Test
    public void countTest() {
        // 获取流中元素的个数
        long count = skus.stream().count();
        System.out.println(count);
    }
}

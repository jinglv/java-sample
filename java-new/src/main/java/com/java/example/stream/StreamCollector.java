package com.java.example.stream;

import com.alibaba.fastjson.JSON;
import com.java.example.cart.entity.Sku;
import com.java.example.cart.service.CartService;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 常见预定义收集器使用
 *
 * @author jingLv
 * @date 2020/10/28
 */
public class StreamCollector {

    /**
     * 集合收集器
     */
    @Test
    public void toList() {
        List<Sku> skus = CartService.getCartSKuList();
        List<Sku> collect = skus.stream()
                .filter(sku -> sku.getTotalPrice() > 100)
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect, true));
    }

    /**
     * 分组
     */
    @Test
    public void group() {
        List<Sku> skus = CartService.getCartSKuList();
        // Map<分组条件, 结果集合>
        Map<Object, List<Sku>> collect = skus.stream().collect(Collectors.groupingBy(Sku::getSkuCategory));
        System.out.println(JSON.toJSONString(collect, true));
    }

    /**
     * 分区
     */
    @Test
    public void partition() {
        List<Sku> skus = CartService.getCartSKuList();
        Map<Boolean, List<Sku>> collect = skus.stream().collect(Collectors.partitioningBy(sku -> sku.getTotalPrice() > 100));
        System.out.println(JSON.toJSONString(collect, true));
    }
}

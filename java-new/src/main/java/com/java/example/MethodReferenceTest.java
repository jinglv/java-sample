package com.java.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 实战案例：四种方法引用的使用场景及区别
 *
 * @author jingLv
 * @date 2020/10/27
 */
public class MethodReferenceTest {

    static class Sku {
        private String skuName;
        private Integer skuPrice;

        public Integer getSkuPrice() {
            return skuPrice;
        }

        // 静态方法
        public static int staticComparePrice(Sku sku1, Sku sku2) {
            return sku1.getSkuPrice() - sku2.getSkuPrice();
        }

        // 实例方法
        public int instanceComparePrice(Sku sku) {
            return this.getSkuPrice() - sku.getSkuPrice();
        }
    }

    class PriceComparator {
        // 实例方法
        public int instanceComparePrice(Sku sku1, Sku sku2) {
            return sku1.getSkuPrice() - sku2.getSkuPrice();
        }
    }

    public void test() {
        List<Sku> skuList = new ArrayList<>();
        // 进行单价排序
        skuList.sort((sku1, sku2) -> sku1.getSkuPrice() - sku2.getSkuPrice());

        // 在Sku中写一个静态方法与排序的逻辑一直则可以替换方法引用
        // 类名::静态方法名
        skuList.sort(Sku::staticComparePrice);
        // 类名::静态方法名的展开形式
        skuList.sort((Sku sku1, Sku sku2) -> {
            return Sku.staticComparePrice(sku1, sku2);
        });

        PriceComparator priceComparator = new PriceComparator();
        // 对象::实例方法名
        skuList.sort(priceComparator::instanceComparePrice);
        // 对象::实例方法名的展开形式
        skuList.sort((Sku sku1, Sku sku2) -> {
            return priceComparator.instanceComparePrice(sku1, sku2);
        });

        // 类名::实例方法名
        skuList.sort(Sku::instanceComparePrice);
        // 类名::实例方法名的展开形式
        skuList.sort((Sku object, Sku sku) -> {
            return object.instanceComparePrice(sku);
        });

        // 构造方法，skuList防空处理
        Optional.ofNullable(skuList).orElseGet(ArrayList::new);
    }
}

package com.java.example.stream;

import com.alibaba.fastjson.JSON;
import com.java.example.cart.entity.Sku;
import com.java.example.cart.enums.SkuCategoryEnum;
import com.java.example.cart.service.CartService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * 对比：原始集合操作与Stream集合操作
 *
 * @author jingLv
 * @date 2020/10/27
 */
public class StreamVs {
    /**
     * 需求条件：
     * 1 想看看购物车中都有什么商品
     * 2 图书类商品都给买
     * 3 其余的商品中买两件最贵的
     * 4 只需要两件商品的名称和总价
     */

    /**
     * 以原始集合操作实现需求
     */
    public static void oldCartHandle() {
        List<Sku> cartSKuList = CartService.getCartSKuList();
        //1. 打印所有商品
        for (Sku sku : cartSKuList) {
            System.out.println(JSON.toJSONString(sku, true));
        }

        //2. 图书类过滤
        List<Sku> notBooksSkuList = new ArrayList<>();
        for (Sku sku : cartSKuList) {
            if (!SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory())) {
                notBooksSkuList.add(sku);
            }
        }

        //3. 对总价格进行排序
        notBooksSkuList.sort(new Comparator<Sku>() {
            @Override
            public int compare(Sku sku1, Sku sku2) {
                if (sku1.getTotalPrice() > sku2.getTotalPrice()) {
                    return -1;
                } else if (sku1.getTotalPrice() < sku2.getTotalPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        //4. 查找两件最贵的商品
        List<Sku> topTwoSkuList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            topTwoSkuList.add(notBooksSkuList.get(i));
        }

        //5. 求两件商品的总价
        Double money = 0.00;
        for (Sku sku : topTwoSkuList) {
            money += sku.getTotalPrice();
        }

        //6. 获取两件商品的名称
        List<String> resultSkuNameList = new ArrayList<>();
        for (Sku sku : topTwoSkuList) {
            resultSkuNameList.add(sku.getSkuName());
        }

        // 打印输出结果
        System.out.println(JSON.toJSONString(resultSkuNameList, true));
        System.out.println("商品总价：" + money);
    }

    /**
     * 以Stream流的方式实现需求
     */
    public static void newCartHandle() {
        AtomicReference<Double> money = new AtomicReference<>(0.0);

        List<String> resultSkuNameList = CartService.getCartSKuList()
                .stream()
                //1. 打印商品信息
                .peek(sku -> System.out.println(JSON.toJSONString(sku, true)))
                //2. 过滤掉所有图书类商品
                .filter(sku -> !SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory()))
                //3. 根据总价进行排序
                .sorted(Comparator.comparing(Sku::getTotalPrice).reversed())
                //4. 查找两件最贵的商品
                .limit(2)
                //5. 求两件商品的总价
                .peek(sku -> money.set(money.get() + sku.getTotalPrice()))
                //6. 获取两件商品的名称
                .map(Sku::getSkuName)
                // 结果收集
                .collect(Collectors.toList());

        // 打印输出结果
        System.out.println(JSON.toJSONString(resultSkuNameList, true));
        System.out.println("商品总价：" + money.get());
    }

    public static void main(String[] args) {
        newCartHandle();
    }
}

package com.java.example.cart;

import com.alibaba.fastjson.JSON;
import com.java.example.cart.entity.Sku;
import com.java.example.cart.enums.SkuCategoryEnum;
import com.java.example.cart.predicate.SkuPredicate;
import com.java.example.cart.predicate.SkuTotalPricePredicate;
import com.java.example.cart.service.CartService;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author jinglv
 * @date 2020/10/24
 */
public class CartServiceTest {

    @Test
    public void testFilterElectronicsSkus() {
        // 1. 获取所有的商品列表
        List<Sku> cartSKuList = CartService.getCartSKuList();
        // 2. 获取数码产品的商品列表
        List<Sku> skus = CartService.filterElectronicsSkus(cartSKuList);
        // 3. 格式化输出
        System.out.println(JSON.toJSONString(skus, true));
    }

    @Test
    public void testFilterSkusByCategory() {
        // 1. 获取所有的商品列表
        List<Sku> cartSKuList = CartService.getCartSKuList();
        // 2. 获取指定商品类型的商品列表
        List<Sku> skus = CartService.filterSkusByCategory(cartSKuList, SkuCategoryEnum.BOOKS);
        // 3. 格式化输出
        System.out.println(JSON.toJSONString(skus, true));
    }

    @Test
    public void testFilterSkusByPrice() {
        // 1. 获取所有的商品列表
        List<Sku> cartSKuList = CartService.getCartSKuList();
        // 2. 获取总价大于200的商品
        List<Sku> skus = CartService.filterSkusByPrice(cartSKuList, null, 2000.00, false);
        // 3. 格式化输出
        System.out.println(JSON.toJSONString(skus, true));
    }

    @Test
    public void testFilterSkus() {
        // 1. 获取所有的商品列表
        List<Sku> cartSKuList = CartService.getCartSKuList();
        // 2. 过滤商品总价大于2000的商品
        List<Sku> skus = CartService.filterSkus(cartSKuList, new SkuTotalPricePredicate());
        // 3. 格式化输出
        System.out.println(JSON.toJSONString(skus, true));
    }

    @Test
    public void testFilterSkus01() {
        // 1. 获取所有的商品列表
        List<Sku> cartSKuList = CartService.getCartSKuList();
        // 2. 过滤商品单价大于1000的商品，使用匿名类调用
        List<Sku> skus = CartService.filterSkus(cartSKuList,
                new SkuPredicate() {
                    @Override
                    public boolean test(Sku sku) {
                        return sku.getSkuPrice() > 1000;
                    }
                });
        // 3. 格式化输出
        System.out.println(JSON.toJSONString(skus, true));
    }

    @Test
    public void testFilterSkusLambda() {
        // 1. 获取所有的商品列表
        List<Sku> cartSKuList = CartService.getCartSKuList();
        // 2. 过滤商品单价大于1000的商品，使用lambda表达式一句实现
        List<Sku> skus = CartService.filterSkus(cartSKuList,
                (Sku sku) -> sku.getSkuPrice() > 1000);
        // 3. 格式化输出
        System.out.println(JSON.toJSONString(skus, true));
    }
}
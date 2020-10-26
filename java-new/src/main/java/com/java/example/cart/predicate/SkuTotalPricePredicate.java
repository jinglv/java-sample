package com.java.example.cart.predicate;

import com.java.example.cart.entity.Sku;

/**
 * 对Sku的总价是否超出2000作为的判断标准
 *
 * @author jinglv
 * @date 2020/10/24
 */
public class SkuTotalPricePredicate implements SkuPredicate {
    @Override
    public boolean test(Sku sku) {
        return sku.getTotalPrice() > 2000;
    }
}

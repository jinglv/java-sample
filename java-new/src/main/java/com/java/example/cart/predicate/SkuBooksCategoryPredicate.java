package com.java.example.cart.predicate;

import com.java.example.cart.entity.Sku;
import com.java.example.cart.enums.SkuCategoryEnum;

/**
 * 对Sku的商品类型为图书类的判断标准
 *
 * @author jinglv
 * @date 2020/10/24
 */
public class SkuBooksCategoryPredicate implements SkuPredicate {
    @Override
    public boolean test(Sku sku) {
        return SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory());
    }
}

package com.java.example.cart.predicate;

import com.java.example.cart.entity.Sku;

/**
 * Sku选择谓词接口
 *
 * @author jinglv
 * @date 2020/10/24
 */
public interface SkuPredicate {

    /**
     * 选择判断标准
     *
     * @param sku
     * @return
     */
    boolean test(Sku sku);
}

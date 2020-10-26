package com.java.example.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 下单商品信息对象
 *
 * @author jinglv
 * @date 2020/10/24
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Sku {

    /**
     * 编号
     */
    private Integer skuId;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 单价
     */
    private Double skuPrice;
    /**
     * 购买个数
     */
    private Integer totalNum;
    /**
     * 总价
     */
    private Double totalPrice;
    /**
     * 商品类型
     */
    private Enum skuCategory;
}

package com.java.example.lambda.performance;

import lombok.Data;

/**
 * @author jingLv
 * @date 2020-04-21 1:42 PM
 */
@Data
public class Product {
    /**
     * 名称
     */
    private String name;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 热度
     */
    private Integer hot;

    public Product(String name, Integer stock, Integer hot) {
        this.name = name;
        this.stock = stock;
        this.hot = hot;
    }
}

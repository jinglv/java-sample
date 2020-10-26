package com.java.example.cart.enums;

/**
 * 商品类型枚举
 *
 * @author jinglv
 * @date 2020/10/24
 */
public enum SkuCategoryEnum {
    CLOTHING(10, "服装类"),
    ELECTRONICS(30, "数码类"),
    SPORTS(30, "运动类"),
    BOOKS(40, "图书类");

    /**
     * 商品类型的编号
     */
    private Integer code;

    /**
     * 商品类型的名称
     */
    private String name;

    /**
     * 构造方法
     *
     * @param code
     * @param name
     */
    SkuCategoryEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}

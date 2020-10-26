package com.java.example.cart.service;

import com.java.example.cart.entity.Sku;
import com.java.example.cart.enums.SkuCategoryEnum;
import com.java.example.cart.predicate.SkuPredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车服务类
 *
 * @author jinglv
 * @date 2020/10/24
 */
public class CartService {

    /**
     * 加入到购物车的商品信息
     */
    private static final List<Sku> cartSkuList = new ArrayList<Sku>() {
        {
            add(new Sku(654032, "无人机", 4999.00, 1, 4999.00, SkuCategoryEnum.ELECTRONICS));
            add(new Sku(654033, "VR一体机", 2299.00, 1, 2299.00, SkuCategoryEnum.ELECTRONICS));
            add(new Sku(654221, "跑步机", 3999.00, 1, 3999.00, SkuCategoryEnum.SPORTS));
            add(new Sku(654121, "Java编程思想", 79.80, 1, 79.80, SkuCategoryEnum.BOOKS));
            add(new Sku(654122, "Java核心技术", 149.80, 1, 149.80, SkuCategoryEnum.BOOKS));
            add(new Sku(654021, "睡衣套装", 299.00, 1, 299.00, SkuCategoryEnum.CLOTHING));
            add(new Sku(654022, "牛仔裤", 1999.00, 1, 1999.00, SkuCategoryEnum.CLOTHING));
        }
    };

    /**
     * 获取商品列表
     *
     * @return 返回商品列表
     */
    public static List<Sku> getCartSKuList() {
        return cartSkuList;
    }

    /**
     * 找出购物车中所有电子产品
     * version 1.0.0
     *
     * @param cartSkuList 商品列表
     * @return 返回商品列表
     */
    public static List<Sku> filterElectronicsSkus(List<Sku> cartSkuList) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            // 如果商品类型等于电子类，加入到结果集合
            if (SkuCategoryEnum.ELECTRONICS.equals(sku.getSkuCategory())) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 根据传入商品类型参数，找出购物车中同种商品类型的商品列表
     * version2.0.0
     *
     * @param cartSkuList     商品列表
     * @param skuCategoryEnum 商品类型
     * @return 返回已处理的商品列表
     */
    public static List<Sku> filterSkusByCategory(List<Sku> cartSkuList, SkuCategoryEnum skuCategoryEnum) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            // 如果商品类型等于电子类，加入到结果集合
            if (skuCategoryEnum.equals(sku.getSkuCategory())) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 支持通过商品类型或总价过滤商品
     * version 3.0.0
     *
     * @param cartSkuList     商品列表
     * @param skuCategoryEnum 商品枚举
     * @param totalPrice      总价
     * @param categoryOrPrice true：根据商品类型 false：根据商品总价
     * @return 返回过滤完成商品列表
     */
    public static List<Sku> filterSkusByPrice(List<Sku> cartSkuList, SkuCategoryEnum skuCategoryEnum, Double totalPrice, Boolean categoryOrPrice) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            // 如果根据商品类型判断，sku类型与输入类型比较
            // 如果根据商品总价判断，sku总价与输入总价比较
            if ((categoryOrPrice && skuCategoryEnum.equals(sku.getSkuCategory())) ||
                    (!categoryOrPrice && sku.getTotalPrice() > totalPrice)) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 根据不同的Sku判断标准，对Sku列表进行过滤
     * version4.0.0
     *
     * @param cartSkuList  商品列表
     * @param skuPredicate 不同的Sku判断标准策略
     * @return 返回过滤完成商品列表
     */
    public static List<Sku> filterSkus(List<Sku> cartSkuList, SkuPredicate skuPredicate) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            // 根据不同的Sku判断标准策略，对Sku进行判断
            if (skuPredicate.test(sku)) {
                result.add(sku);
            }
        }
        return result;
    }
}

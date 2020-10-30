package com.java.example.stream;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.util.HashMap;
import java.util.List;

/**
 * 归约和汇总操作
 *
 * @author jingLv
 * @date 2020/10/29
 */
public class ReduceAndCollectTest {


    @Test
    public void reduceTest() {
        /*
         * 订单对象
         */
        @Data
        @AllArgsConstructor
        class Order {
            /**
             * 订单编号
             */
            private Integer id;
            /**
             * 商品数量
             */
            private Integer productCount;
            /**
             * 消费总金额
             */
            private Double totalAmount;
        }

        // 准备数据
        List<Order> list = Lists.newArrayList();
        list.add(new Order(1, 2, 25.12));
        list.add(new Order(2, 5, 257.23));
        list.add(new Order(3, 3, 25512.12));

        // 传统的方式：
        // 1.计算商品数量
        // 2.计算消费总金额

        // 汇总商品数量和总金额
        // 注意：stream().reduce()，Stream直接调用reduce是不会开启并行模式的，加入parallel才会开启并行模式
        Order order = list.stream()
                .parallel()
                .reduce(
                        // 初始化值
                        new Order(0, 0, 0.0),
                        // Stream中两个元素的计算逻辑
                        (Order order1, Order order2) -> {
                            System.out.println("执行计算逻辑");
                            int productCount = order1.getProductCount() + order2.getProductCount();
                            double totalAmount = order1.getTotalAmount() + order2.getTotalAmount();
                            return new Order(0, productCount, totalAmount);
                        },
                        // 并行情况下，多个并行结果如何合并
                        (Order order1, Order order2) -> {
                            System.out.println("执行合并方法");
                            int productCount = order1.getProductCount() + order2.getProductCount();
                            double totalAmount = order1.getTotalAmount() + order2.getTotalAmount();
                            return new Order(0, productCount, totalAmount);
                        }
                );

        System.out.println(JSON.toJSONString(order, true));
    }

    @Test
    public void collectTest() {
        /*
         * 订单对象
         */
        @Data
        @AllArgsConstructor
        class Order {
            /**
             * 订单编号
             */
            private Integer id;
            /**
             * 用户账号
             */
            private String account;
            /**
             * 商品数量
             */
            private Integer productCount;
            /**
             * 消费总金额
             */
            private Double totalAmount;
        }

        // 准备数据
        List<Order> list = Lists.newArrayList();
        list.add(new Order(1, "zhangsan", 2, 25.12));
        list.add(new Order(2, "zhangsan", 5, 257.23));
        list.add(new Order(3, "lisi", 3, 25512.12));

        // Map<用户账号，订单(商品数量和金额)>
        // 注意：stream().collect()，Stream直接调用collect是不会开启并行模式的，加入parallel才会开启并行模式
        HashMap<String, Order> orderHashMap = list.stream()
                .parallel()
                .collect(
                        () -> {
                            System.out.println("执行初始化容器操作");
                            return new HashMap<String, Order>();
                        },
                        (HashMap<String, Order> map, Order newOrder) -> {
                            System.out.println("执行新元素添加到容器操作");
                            // 1. 新元素的account已经在map中存在了
                            // 2. 新元素的account已经在map中不存在了
                            String account = newOrder.getAccount();
                            // 如果此账号已存在，将新订单的数据累加上
                            if (map.containsKey(account)) {
                                Order order = map.get(account);
                                order.setProductCount(newOrder.getProductCount() + order.getProductCount());
                                order.setTotalAmount(newOrder.getTotalAmount() + order.getTotalAmount());
                            } else {
                                // 如果不存在，直接将新订单存入map
                                map.put(account, newOrder);
                            }
                        },
                        (HashMap<String, Order> map1, HashMap<String, Order> map2) -> {
                            System.out.println("执行并行结果合并操作");
                            map2.forEach((key, value) -> {
                                // merge:如果从map1中发现了这个key，那么就把这个value作为参数，map1中的value也作为参数(order1, order2)进行传递
                                // 如果这个key没有在map1中出现，那直接将value push到map1中
                                map1.merge(key, value, (order1, order2) -> {
                                    // 注意：一定要用map1做合并，因为最后collect返回是map1
                                    return new Order(0, key,
                                            order1.getProductCount() + order2.getProductCount(),
                                            order1.getTotalAmount() + order2.getTotalAmount());
                                });
                            });
                        }
                );
        System.out.println(JSON.toJSONString(orderHashMap, true));
    }
}

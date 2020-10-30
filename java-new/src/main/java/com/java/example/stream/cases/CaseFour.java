package com.java.example.stream.cases;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 案例四
 *
 * @author jingLv
 * @date 2020/10/29
 */
public class CaseFour {

    @Data
    @AllArgsConstructor
    class Order {
        /**
         * 订单编号
         */
        private Integer orderId;
        /**
         * 账户编号
         */
        private String accountId;
    }

    /**
     * 模拟数据库查询
     *
     * @param accountIds 账户id
     * @return 订单列表
     */
    public List<Order> selectFromDB(List<String> accountIds) {
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orders.add(
                    new Order(i, accountIds.get(i % accountIds.size()))
            );
        }
        return orders;
    }

    /**
     * 接口
     *
     * @param accountIds
     * @return
     */
    public Map<String, List<Order>> queryOrderByAccountIds(List<String> accountIds) {
        return Optional.ofNullable(selectFromDB(accountIds))
                .map(List::stream)
                .orElseGet(Stream::empty)
                // group分组
                .collect(Collectors.groupingBy(Order::getAccountId));
    }

    @Test
    public void test() {
        Map<String, List<Order>> stringListMap = queryOrderByAccountIds(Lists.newArrayList("张三", "李四", "王五"));
        System.out.println(JSON.toJSONString(stringListMap, true));
    }
}

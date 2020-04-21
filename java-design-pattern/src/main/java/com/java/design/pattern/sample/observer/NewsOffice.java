package com.java.design.pattern.sample.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者（ 报社 ）
 *
 * @author jingLv
 * @date 2020-04-21 3:54 PM
 */
public class NewsOffice {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    // 模拟报纸来啦~~~
    public void newspaperCome() {
        this.notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Customer customer : customers) {
            customer.update();
        }
    }
}

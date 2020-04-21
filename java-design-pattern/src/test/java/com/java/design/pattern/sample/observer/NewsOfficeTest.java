package com.java.design.pattern.sample.observer;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-21 3:57 PM
 */
public class NewsOfficeTest {

    @Test
    public void test() {
        NewsOffice office = new NewsOffice();

        Customer customerA = new CustomerA();

        Customer customerB = new CustomerB();

        // 客户A订阅报纸
        office.addCustomer(customerA);

        // 客户B订阅报纸
        office.addCustomer(customerB);

        // 报纸来啦
        office.newspaperCome();

    }

}
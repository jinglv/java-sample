package com.java.design.pattern.sample.decorator;

/**
 * 测试类
 *
 * @author jingLv
 * @date 2020/04/13
 */
public class Main {
    public static void main(String[] args) {
        Person lily = new Lily();
        // 穿上夹克
        lily = new Jacket(lily);
        //穿上帽子
        lily = new Hat(lily);

        lily.show();
        System.out.println("莉莉买单，总共消费：" + lily.cost());
    }
}

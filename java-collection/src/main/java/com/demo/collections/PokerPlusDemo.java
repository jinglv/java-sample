package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author jingLv
 * @date 2021/01/14
 */
public class PokerPlusDemo {
    public static void main(String[] args) {
        // 创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<>();
        // 创建ArrayList，存储编号
        ArrayList<Integer> array = new ArrayList<>();
        // 创建花色数组和点数数组
        // 定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 定义点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
        // 洗牌（洗的是编号），用Collections的shuffle()方法实现
        Collections.shuffle(array);
        // 发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接收)
        TreeSet<Integer> playerOne = new TreeSet<>();
        TreeSet<Integer> playerTwo = new TreeSet<>();
        TreeSet<Integer> playerThree = new TreeSet<>();
        TreeSet<Integer> cards = new TreeSet<>();
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            // 底牌剩余三张
            if (i >= array.size() - 3) {
                cards.add(num);
            } else if (i % 3 == 0) {
                playerOne.add(num);
            } else if (i % 3 == 1) {
                playerTwo.add(num);
            } else {
                playerThree.add(num);
            }
        }
        // 调用看牌方法
        lookPoker("One:", playerOne, hm);
        lookPoker("Two:", playerTwo, hm);
        lookPoker("Three:", playerThree, hm);
        lookPoker("底牌:", cards, hm);
    }

    /**
     * 定义方法看牌(遍历TreeSet集合，获取编号，到HashMap集合找到对应的牌)
     *
     * @param name 玩家名字
     * @param ts   牌的编号
     * @param hm   编号与牌的对应关系
     */
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是：");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

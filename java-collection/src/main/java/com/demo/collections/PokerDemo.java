package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author jingLv
 * @date 2021/01/14
 */
public class PokerDemo {
    public static void main(String[] args) {
        // 创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> array = new ArrayList<>();
        // 往牌盒里面装牌
        /*
           ♦2,♦3,♦4...♦K,♦A
           ♣2,♣3,♣4...♣K,♣A
           ♥2,♥3,♥4...♥K,♥A
           ♠2,♠3,♠4...♠K,♠A
           小王、大王
         */
        // 定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String s : numbers) {
                array.add(color + s);
            }
        }
        array.add("大王");
        array.add("小王");
        // 洗牌，也就是把牌打散，用Collections的shuffle()方法实现
        Collections.shuffle(array);
        // 发牌，也就是遍历集合，给三个玩家发牌
        ArrayList<String> playerOne = new ArrayList<>();
        ArrayList<String> playerTwo = new ArrayList<>();
        ArrayList<String> playerThree = new ArrayList<>();
        ArrayList<String> cards = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                cards.add(poker);
            } else if (i % 3 == 0) {
                playerOne.add(poker);
            } else if (i % 3 == 1) {
                playerTwo.add(poker);
            } else {
                playerThree.add(poker);
            }
        }
        // 看牌，也就是三个玩家分别遍历自己的牌
        lookPoker("One:", playerOne);
        lookPoker("Two:", playerTwo);
        lookPoker("Three:", playerThree);
        lookPoker("底牌:", cards);
    }

    /**
     * 看牌的方法
     *
     * @param name  玩家的名字
     * @param array 玩家获得的牌
     */
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + ",");
        }
        System.out.println();
    }
}

package com.demo.system;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jingLv
 * @date 2020/12/23
 */
public class GuessNumber {
    /**
     * 私有构造方法，不允许外部实例化
     */
    private GuessNumber() {
    }

    public static void start() {
        // 猜数字游戏，使用随机生成数字，范围1~100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            // 实现键盘录入，输入猜测色数字值
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您要猜数字的值：");
            int guessNumber = scanner.nextInt();
            // 比较输入的数字和随机生成的数字，根据不同的情况进行结果显示
            if (guessNumber > number) {
                System.out.println("您猜的数字：" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("您猜的数字：" + guessNumber + "小了");
            } else {
                System.out.println("恭喜您猜中了！");
                break;
            }
        }
    }
}

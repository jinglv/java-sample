package com.demo.system;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author jingLv
 * @date 2020/12/23
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //  从文件中获取数据到Properties集合，用load()方法
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("java-file-class/game.txt");
        properties.load(fileReader);
        fileReader.close();
        // 通过Properties集合获取到玩游戏的次数
        String count = properties.getProperty("count");
        int number = Integer.parseInt(count);
        // 判断次数是否到3次了
        if (number >= 3) {
            // 如果到了，给出提示：游戏试玩已结束，想玩请充值
            System.out.println("游戏试玩已结束，想玩请充值");
        } else {
            // 玩游戏
            GuessNumber.start();
            // 次数+1，重新写回文件，用Properties的store()方法实现
            number++;
            properties.setProperty("count", String.valueOf(number));
            FileWriter fileWriter = new FileWriter("java-file-class/game.txt");
            properties.store(fileWriter, null);
            fileWriter.close();
        }
    }
}

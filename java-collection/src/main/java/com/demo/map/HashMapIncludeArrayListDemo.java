package com.demo.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author jingLv
 * @date 2021/01/12
 */
public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        // 创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        // 创建ArrayList集合，并添加元素
        ArrayList<String> three = new ArrayList<>();
        three.add("诸葛亮");
        three.add("赵云");
        // 把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义", three);
        // 创建ArrayList集合，并添加元素
        ArrayList<String> west = new ArrayList<>();
        west.add("唐僧");
        west.add("孙悟空");
        // 把ArrayList作为元素添加到HashMap集合
        hm.put("西游记", west);
        // 创建ArrayList集合，并添加元素
        ArrayList<String> water = new ArrayList<>();
        water.add("武松");
        water.add("鲁智深");
        // 把ArrayList作为元素添加到HashMap集合
        hm.put("水浒传", water);
        // 遍历HashMap集合
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}

package com.demo.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author jingLv
 * @date 2021/01/12
 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<>();
        // 创建HashMap集合，并添加键值对元素
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
        // 把HashMap作为元素添加到ArrayList集合
        array.add(hm1);
        // 创建HashMap集合，并添加键值对元素
        HashMap<String, String> hm2 = new HashMap<>();
        hm1.put("郭靖", "黄蓉");
        hm1.put("杨过", "小龙女");
        // 把HashMap作为元素添加到ArrayList集合
        array.add(hm2);
        // 创建HashMap集合，并添加键值对元素
        HashMap<String, String> hm3 = new HashMap<>();
        hm1.put("令狐冲", "任盈盈");
        hm1.put("林平之", "岳灵珊");
        // 把HashMap作为元素添加到ArrayList集合
        array.add(hm3);
        // 遍历ArrayList集合
        for (HashMap<String, String> hashMap : array) {
            Set<String> keySet = hashMap.keySet();
            for (String s : keySet) {
                String value = hashMap.get(s);
                System.out.println(s + "," + value);
            }
        }
    }
}

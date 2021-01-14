package com.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jingLv
 * @date 2021/01/08
 */
public class MapDemo05 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String, String> map = new HashMap<>();
        // V put(K key, V value) 添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        // 获取所有键值对对象集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 遍历键值对的集合，得到每一个键值对对象
        for (Map.Entry<String, String> entry : entrySet) {
            // 根据键值对对象获取键和值
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

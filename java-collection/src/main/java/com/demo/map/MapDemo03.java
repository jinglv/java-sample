package com.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jingLv
 * @date 2021/01/08
 */
public class MapDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String, String> map = new HashMap<>();
        // V put(K key, V value) 添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        // V get(Object key) 根据键获取值
        System.out.println(map.get("张无忌"));
        // 不存在的键值，返回null
        System.out.println(map.get("张师傅"));

        // Set<K> keySet() 获取所有键的集合
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s);
        }

        // Collection<V> value() 获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}

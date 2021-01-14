package com.demo.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jingLv
 * @date 2021/01/08
 */
public class MapDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String, String> map = new HashMap<>();
        // V put(K key, V value)将指定的值与该映射中的指定的键相关联
        map.put("stu001", "张三");
        map.put("stu002", "李四");
        map.put("stu003", "王五");
        // 键值是唯一的，如果键值是唯一的，第二次的值就会将第一次的值替换掉
        map.put("stu003", "赵六");
        // 输出集合对象
        System.out.println(map);
    }
}

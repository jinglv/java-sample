package com.demo.system;

import java.util.Properties;
import java.util.Set;

/**
 * @author jingLv
 * @date 2020/12/23
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        Properties properties = new Properties();
        // 存储元素
        properties.put("name", "xiaohong");
        properties.put("age", "25");
        properties.put("address", "Beijing");
        // 遍历集合
        Set<Object> keySet = properties.keySet();
        for (Object key : keySet) {
            Object value = properties.get(key);
            System.out.println(key + "," + value);
        }
    }
}

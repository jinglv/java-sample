package com.demo.system;

import java.util.Properties;
import java.util.Set;

/**
 * @author jingLv
 * @date 2020/12/23
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        Properties properties = new Properties();
        // Object setProperties(String key, String value): 设置集合的键和值，都是String类型，底层调用Hashtable方法put
        properties.setProperty("num001", "zhangsan");
        /**
         * Object setProperty(String key, String value) {
         *         return put(key, value);
         *     }
         *
         * Object put(Object key, Object value) {
         *         return map.put(key, value);
         *     }
         */
        properties.setProperty("num002", "lisi");
        properties.setProperty("num003", "wangwu");
        System.out.println(properties);
        // String getProperty(String key):使用此属性列表中指定的键搜索属性
        System.out.println(properties.getProperty("num002"));
        // Set<String> stringPropertyName():从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> names = properties.stringPropertyNames();
        for (String name : names) {
            // System.out.println(name);
            String value = properties.getProperty(name);
            System.out.println(name + "," + value);
        }
    }
}

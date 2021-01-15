package com.demo;

/**
 * java中预定的一些注解
 * 1. @Override：检测被该注解标注方法是否是继承自父类（接口）的
 * 2. @Deprecated：该注解标注的内容，表示已过时
 * 3. @SuppressWarnings：压制警告
 *
 * @author jingLv
 * @date 2021/01/14
 */
@SuppressWarnings("all")
public class AnnoDemo01 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        // 有缺陷
    }

    // show2方法没有被使用，就会出现警告，此时使用@SuppressWarnings，就可以删除警告
    public void show2() {
        // 新方法替代show1方法
    }
    
    public void demo() {
        // 调用show1()方法可以使用，但是方法上有横线，表示方法可以用，但是已过时
    }
}

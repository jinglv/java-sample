package com.java.principle.ocp;

/**
 * 一个课程体系的接口
 *
 * @author jinglv
 * @date 2020-04-06 17:47
 */
public interface ICourse {
    /**
     * 获取课程的id
     *
     * @return 课程id
     */
    Integer getId();

    /**
     * 获取课程名称
     *
     * @return 课程名称
     */
    String getName();

    /**
     * 获取课程价格
     *
     * @return 课程价格
     */
    String getPrice();
}

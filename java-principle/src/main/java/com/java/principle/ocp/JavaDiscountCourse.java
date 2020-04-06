package com.java.principle.ocp;

/**
 * Java课程需要搞活动，价格优惠，如果直接修改JavaCourse中的getPrice()方法，则存在一定的风险，可能影响其他地方的调用结果。
 *
 * @author jinglv
 * @date 2020-04-06 17:54
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.5;
    }

}

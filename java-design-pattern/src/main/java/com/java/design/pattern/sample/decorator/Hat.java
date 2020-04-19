package com.java.design.pattern.sample.decorator;

/**
 * 帽子类
 * 具体实现类
 *
 * @author jingLv
 * @date 2020-04-13 7:08 PM
 */
public class Hat extends ClothesDecorator{

    public Hat(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        // 帽子累积金额100
        return person.cost() + 50;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("戴上帽子，累积消费：" + this.cost());
    }
}

package com.java.design.pattern.sample.decorator;

/**
 * 装饰器的超类
 * 和被装饰器的对象实现同一个接口Person
 *
 * @author jingLv
 * @date 2020-04-13 7:04 PM
 */
public abstract class ClothesDecorator implements Person {
    //装饰器中要使用被装饰器的对象，构造方法传入
    protected Person person;

    public ClothesDecorator(Person person) {
        this.person = person;
    }
}

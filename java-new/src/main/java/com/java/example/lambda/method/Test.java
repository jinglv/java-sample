package com.java.example.lambda.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 静态方法引用的使用
 * 类型名称.方法名称() --> 类型名称::方法名称
 * <p>
 * 实例方法引用
 * 创建类型对应的一个对象 --> 对象引用::实例方法名称
 *
 * @author jingLv
 * @date 2020-04-16 1:12 PM
 */
public class Test {

    public static void main(String[] args) {
        // 存储Person对象列表
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jack", "男", 15));
        personList.add(new Person("May", "女", 13));
        personList.add(new Person("Lois", "女", 18));
        personList.add(new Person("Tom", "男", 22));
        personList.add(new Person("Jerry", "男", 17));

        //根据对象的年龄进行排序
        // 1.匿名内部类实现方式
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(personList);

        //2.lambda表达式的实现方式
        Collections.sort(personList, (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(personList);

        //3.静态方法引用
        Collections.sort(personList, Person::compareByAge);
        System.out.println(personList);

        //4.实例方法引用
        PersonUtil personUtil = new PersonUtil();
        Collections.sort(personList, personUtil::compareByName);
        System.out.println("Tome".hashCode());
        System.out.println("Jerry".hashCode());
        System.out.println(personList);

        //5.构造方法引用：绑定函数接口
        IPerson iPerson = Person::new;
        Person person = iPerson.initPerson("Huahua", "女", 25);
        System.out.println(person);
    }
}

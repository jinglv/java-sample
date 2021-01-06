package com.demo.generic;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class GenericDemo03 {
    public static void main(String[] args) {
        /*
        System.out.println("---------普通方法---------");
        Show show = new Show();
        show.show("张三");
        show.show(30);
        show.show(true);*/

        /*
        System.out.println("---------泛型类---------");
        Show<String> show1 = new Show<>();
        show1.show("张三");

        Show<Integer> show2 = new Show<>();
        show2.show(30);

        Show<Boolean> show3 = new Show<>();
        show3.show(true);*/

        System.out.println("---------泛型方法---------");
        Show show = new Show();
        show.show("张三");
        show.show(30);
        show.show(true);
    }
}

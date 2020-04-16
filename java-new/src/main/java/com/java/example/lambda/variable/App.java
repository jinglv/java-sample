package com.java.example.lambda.variable;

/**
 * @author jingLv
 * @date 2020-04-14 1:44 PM
 */
public class App {
    String s1 = "全局变量";
    String s3 = "HaHa";

    // 1.匿名内部类中对于变量的访问
    public void testInnerClass() {
        String s2 = "局部变量";

        new Thread(new Runnable() {
            String s3 = "内部变量";

            @Override
            public void run() {
                // 访问全局变量
                //System.out.println(this.s1); // this关键字~表示是当前内部类型的对象，全局变量不可以这么访问
                System.out.println(s1);

                System.out.println(s2); // 局部变量的访问，~不能对局部变量进行数据的修改【final】
                // s2 = "Hello"; // 报错了

                System.out.println(s3);
                System.out.println(this.s3);
            }
        }).start();
    }

    // 2.lambda表达式变量捕获
    public void testLambda() {
        String s2 = "局部变量lambda";

        new Thread(() -> {
            String s3 = "内部变量lambda";

            //访问全局变量
            System.out.println(s1); //this关键字，表示的就是所属方法所在类型的对象

            //访问局部变量
            System.out.println(s2);
            //s2="Hello"; // 不能进行数据修改，默认推导变量的修饰符是：final
            System.out.println(s3);
            s3 = "lambda 内部变量直接修改";
            System.out.println(s3);
        }).start();
    }

    public static void main(String[] args) {
        App app = new App();
        app.testInnerClass();
        app.testLambda();
    }
}

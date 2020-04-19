package com.java.example.lambda.overload;

/**
 * 方法重载对于Lambda表达式的影响
 *
 * @author jingLv
 * @date 2020-04-15 1:26 PM
 */
public class App {
    interface Param1 {
        void outInfo(String info);
    }

    interface Param2 {
        void outInfo(String info);
    }

    //定义方法重载
    public void lambdaMethod(Param1 param1) {
        System.out.println("Hello param1");
    }

    public void lambdaMethod(Param2 param2) {
        System.out.println("Hello param2");
    }

    public static void main(String[] args) {
        App app = new App();

        //匿名内部类调用实现
        app.lambdaMethod(new Param1() {
            @Override
            public void outInfo(String info) {
                System.out.println(info);
            }
        });

        System.out.println("----------------");
        app.lambdaMethod(new Param2() {
            @Override
            public void outInfo(String info) {
                System.out.println(info);
            }
        });

        /**
         * lambda表达式调用，语法检查报错
         *
         * lambda表达式存在类型检查 --> JVM自动推导lambda表达式的目标类型
         * lambdaMethod() -> 方法为重载方法
         *          -> Param1  函数式接口
         *          -> Param2  函数式接口
         *          -> 调用方法 -> 传递Lambda表达式 -> JVM自动推导会造成混淆 -> Param1 | Param2
         */
//        app.lambdaMethod((String info) -> { // 语法报错
//            System.out.println(info);
//        });

    }
}

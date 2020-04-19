package com.java.example.lambda.base;

/**
 * lambda表达式的基本语法
 *
 * @author jingLv
 * @date 2020-04-14 1:12 PM
 */
public class Main {

    public static void main(String[] args) {
        // 没有参数，没有返回值的lambda表达式绑定的接口
        ILambda i1 = () -> {
            System.out.println("Hello Lambda!");
            System.out.println("Welcome Lambda!");
        };
        i1.test();

        // 如果代码块中有多行代码，则必须要有{}括起来，如果只有一行代码，则不需要{},如下
        ILambda i2 = () -> System.out.println("Hello Gus!");
        i2.test();

        //带有参数，没有返回值的lambda表达式
        ILambda2 i21 = (String n, int a) -> System.out.println(n + " say:my year's old is" + a);
        i21.test("咪咪", 15);

        // 不指定参数的类型，JVM会自动传入参数的类型
        ILambda2 i22 = (n, a) -> System.out.println(n + " 说：我今年" + a + "岁了");
        i22.test("花花", 28);

        //带有参数，带有返回值的lambda表达式
        ILambda3 i31 = (x, y) -> {
            int z = x + y;
            return z;
        };
        System.out.println(i31.test(1, 3));

        ILambda3 i32 = (x, y) -> x + y;
        System.out.println(i32.test(5, 6));
    }
}

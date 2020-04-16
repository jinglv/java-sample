# java8新特性

## 面向对象 VS 函数式编程
- `面向对象编程`是对**数据**进行抽象
- `函数式编程`是对**行为**进行抽象

## Lambda表达式
### 什么是Lambda
- Lambda表达式也被称为箭头函数、匿名函数、闭包
- Lambda表达式体现的是轻量级函数式编程思想
- '->' 符号式Lambda表达式核心操作符号，符号左侧是操作参数，符号右侧是操作表达式
- JDK8新特性

### Model Code As Data
- Model Code as Data，编码及数据，尽可能轻量级
- 解决方案：接口 & 实现类（匿名内部类）
- 存在问题：语法冗余，this关键字，变量捕获，数据控制等

### 功能接口设计及优化
- 需求环境：线程类的创建
- 解决方案：匿名内部类实现
- 解决方案：Lambda表达式实现

### 为什么要使用lambda表达式
- 它不是解决未知问题的新技术
- 对现有解决方案的语义化优化
- 需要根据实际需求考虑性能问题

### Lambda表达式基础知识
#### 函数式接口（function interface）
- 函数是接口，就是Java类型系统中的接口
- 函数式接口，是只包含一个接口方法的特殊接口
- 语义化检测注解：@FunctionalInterface
- 默认接口方法
- 静态接口方法
- 来自Object继承的方法（函数式接口定义集成Object的方法如toString...是可以的）

#### Lambda表达式和函数式接口的关系
- 函数式接口，只包含一个操作方法
- Lambda表达式，只能操作一个方法
- Java中的Lambda表达式，核心就是一个函数式接口实现
```
//单独实现类
IUserCredential ic = new UserCredentialImpl();
System.out.println(ic.getCredential("admin"));


// 匿名内部类，实现接口的抽象
IUserCredential ic2 = new IUserCredential() {
    @Override
    public String verifyUser(String username) {
        return "admin".equals(username) ? "管理员" : "普通会员";
    }
};
System.out.println(ic2.verifyUser("admin"));

// lambda表达式，针对函数式接口的简单实现
IUserCredential ic3 = (String username) -> "admin".equals(username) ? "管理员" : "普通会员";
System.out.println(ic3.verifyUser("manager"));
```

#### Java类型系统内建函数式接口
- java.lang.Runnable
- java.lang.Comparable
- java.lang.Comparator
- java.io.FileFilter
- ...


- jdk8提供了java.util.function包，提供了常用的函数式功能接口
- java.util.function.Predicate<T>
    - 接收参数对象T，返回一个boolean类型结果
    ```
    Predicate<String> pre = "admin"::equals;
    System.out.println(pre.test("manager"));
    System.out.println(pre.test("admin"));
    ```
- java.util.function.Consumer<T>
    - 接收参数对象T，不返回结果
    ```
    Consumer<String> consumer = (String message) -> {
        System.out.println("要发送消息：" + message);
        System.out.println("消息发送完成！");
    };
    consumer.accept("hello gus！");
    consumer.accept("lambda expression!");
    ```
- java.util.function.Function<T,R>
    - 接收参数对象T，返回结果对象R
    ```
    Function<String, Integer> function = (String gender) -> "male".equals(gender) ? 1 : 0;
    System.out.println(function.apply("male"));
    System.out.println(function.apply("female"));
    ```
- java.util.function.Supplier<T>
    - 不接收参数，提供T对象的创建工厂
    ```
    Supplier<String> supplier = () -> UUID.randomUUID().toString();
    System.out.println(supplier.get());
    System.out.println(supplier.get());
    System.out.println(supplier.get());
    ```
- java.util.function.UnaryOperator<T>
    - 接收参数对象T，返回结果对象T
    ```
    UnaryOperator<String> unaryOperator = (String image) -> {
        image += "[100*1024]";
        return image;
    };
    System.out.println(unaryOperator.apply("原图--"));
    ```
- java.util.function.BinaryOperator<T>
    - 接收两个T对象，返回一个T对象结果
    ```
    BinaryOperator<Integer> binaryOperator = (Integer i1, Integer i2) -> i1 > i2 ? i1 : i2;
    System.out.println(binaryOperator.apply(12, 13));
    ```

java.util.function提供了大量的函数式接口：
- Predicate 接收参数T对象，返回一个boolean类型结果
- Consumer 接收参数T对象，没有返回值
- Function 接收参数T对象，返回R对象
- Supplier 不接收任何参数，直接通过get()获取指定类型的对象
- UnaryOperator 接收参数T对象，执行业务处理后，返回更新后的T对象
- BinaryOperator 接收两个T对象，执行业务处理后，返回一个T对象

#### Lambda语法及使用
- Lambda表达式基本语法
    - 声明：和lambda表达式绑定的接口类型
    - 参数：包含在一对圆括号中，和绑定的接口中的抽象方法中的参数个数及顺序一致
    - 操作符：->
    - 执行代码块：包含在一对大括号中，出现在操作符号的右侧
    ```
    [接口声明] = (参数) -> {执行代码块}
    ```
    
    总结：
        - lambda表达式，必须和接口进行绑定
        - lambda表达式的参数，可以附带0个到n个参数，括号中的参数类型可以不用指定，jvm在运行时，会自动根据绑定的抽象方法中的参数进行推导
        - lambda表达式的返回值，如果代码块只有一行，并且没有大括号，不用写return关键字，单行代码的执行结果，会自动返回，如果添加了大括号，或者多行代码，必须通过return关键字返回执行结果
        - 
- 带参数的Lambda表达式
- 带返回值的Lambda表达式

#### Lambda表达式变量捕获
- 匿名内部类中的变量捕获
- Lambda表达式中的变量捕获

总结：Lambda表达式中的变量操作优化了匿名内部类型中this关键字，不在单独建立对象作用域，表达式本身就是所属对象的一部分，在语法语义上使用更加简洁

#### Lambda表达式类型检查
- 表达式类型检查
- 参数类型检查

#### 方法重载和Lambda表达式
- 方法重载的问题
    - Java类型系统中的方法重载
    - 方法重载的实现
    - 当方法重载遇上Lambda表达式
如果参数是函数式接口时，使用匿名调用类代替Lambda表达式

#### Lambda表达式运行原理
- Lambda表达式底层解析运行原理
- Lambda表达式在JVM底层解析成私有静态方法和匿名内部类
- 通过实现接口的匿名内部类型中接口方法调用静态实现方法，完成Lambda表达式的执行

### Lambda表达式在集合中的运用
#### 方法引用
- 方法引用是结合Lambda表达式的一种语法特性
- 静态方法引用
- 实例方法引用
- 构造方法引用
#### Stream API
- Stream概述（流处理）
    - 什么是流处理
    - Stream的作用
#### Stream操作原理
#### 操作集合元素

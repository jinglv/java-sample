# MyBatisPlus学习
## MyBatis vs JPA
MyBatis优势
- SQL语句可以自由控制，更灵活，性能较高
- SQL与代码分离，易于阅读和维护
- 提供XML标签，支持编写动态SQL语句
JPA优势
- JPA移植性比较好（JPQL）
- 提供了很多CRUD方法，开发效率高
- 对象化程度更高

MySQL劣势
- 简单CRUD操作还得写SQL语句
- XML中有大量的SQL要维护
- MyBatis自身功能很有限，但支持Plugin

## MyBatis-Plus简介
MP是一个MyBatis的增强工具，只做增强不做改变

[MyBatis-Plus官方地址](https://mybatis.plus/)

## MyBatis-Plus框架结构
![image](https://mybatis.plus/img/mybatis-plus-framework.jpg)
## MyBatis-Plus特性
特性介绍
- 无侵入、损耗小、强大的CRUD操作
- 支持Lambda形式调用、支持多种数据库
- 支持主键自动生成，支持ActiveRecord模式
- 支持自定义全局通用操作，支持关键词自动转义
- 内置代码生成器、内置分页插件、内置性能分析插件
- 内置全局拦截插件、内置SQL注入剥离器

## MyBatis-Plus学习
- Maven工程中引入依赖，见pom.xml文件

## 通用传统模式介绍
- SSM传统编程模式
    - 接口中写抽象方法
    - XML或注解写SQL
    - Service中调用接口
    - Controller中调用

## 通用Mapper
- 新增（Create）
    - 新增方法

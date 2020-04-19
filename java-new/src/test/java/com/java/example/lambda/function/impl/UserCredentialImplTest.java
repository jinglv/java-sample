package com.java.example.lambda.function.impl;

import com.java.example.lambda.function.IUserCredential;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * 测试
 * 需求改动：
 * 所有的用户验证，可以同时获取用户的验证信息【是否认证成功，成功则返回用户，失败则返回null】
 *
 * @author jingLv
 * @date 2020-04-13 1:04 PM
 */
public class UserCredentialImplTest {

    @Test
    public void testVerifyUser() {
        //单独实现类
        IUserCredential ic = new UserCredentialImpl();
        System.out.println(ic.verifyUser("admin"));

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

    }
}
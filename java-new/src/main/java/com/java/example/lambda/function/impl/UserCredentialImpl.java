package com.java.example.lambda.function.impl;

import com.java.example.lambda.function.IUserCredential;

/**
 * @author jingLv
 * @date 2020/04/09
 */
public class UserCredentialImpl implements IUserCredential {
    @Override
    public String verifyUser(String username) {
        String systemManager = "admin";
        String userManager = "manager";
        if (systemManager.equals(username)) {
            return "系统管理员";
        } else if (userManager.equals(username)) {
            return "用户管理员";
        }
        return "普通会员";
    }
}

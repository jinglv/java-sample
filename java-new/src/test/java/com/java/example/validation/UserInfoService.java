package com.java.example.validation;

import javax.validation.Valid;

/**
 * 用户信息服务类
 *
 * @author jingLv
 * @date 2020/11/10
 */
public class UserInfoService {

    /**
     * UserInfo作为输入参数
     *
     * @param userInfo
     */
    public void setUserInfo(@Valid UserInfo userInfo) {
    }

    /**
     * UserInfo作为输出参数
     *
     * @return
     */
    public @Valid UserInfo getUserInfo() {
        return new UserInfo();
    }

    /**
     * 默认构造函数
     */
    public UserInfoService() {
    }

    /**
     * 接收UserInfo作为参数的构造函数
     *
     * @param userInfo
     */
    public UserInfoService(@Valid UserInfo userInfo) {
    }
}

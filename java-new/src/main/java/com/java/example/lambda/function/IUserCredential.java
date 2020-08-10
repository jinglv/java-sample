package com.java.example.lambda.function;

/**
 * 用户身份认证标记接口
 * 函数式接口，是只包含一个接口方法的特殊接口
 *
 * @author jingLv
 * @date 2020/04/09
 */
@FunctionalInterface
public interface IUserCredential {
    /**
     * 通过用户账号，验证用户身份信息的接口
     *
     * @param username 要验证的用户账号
     * @return 返回身份信息【系统管理员、用户管理员、普通用户】
     */
    String verifyUser(String username);

    /**
     * 集成Object的方法
     *
     * @return 返回
     */
    @Override
    String toString();

    /**
     * 默认方法, 功能的扩展
     *
     * @param username 要验证的用户账号
     * @return 返回身份信息【系统管理员、用户管理员、普通用户】
     */
    default String getCredential(String username) {
        String systemManager = "admin";
        String userManager = "manager";

        // 模拟方法
        if (systemManager.equals(username)) {
            return "admin + 系统管理员";
        } else if (userManager.equals(username)) {
            return "manager + 用户管理员";
        } else {
            return "commons + 普通会员用户";
        }
    }
}

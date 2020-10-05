package com.example.lombok;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author jinglv
 * @date 2020/10/05
 */
class UserTest {

    @Test
    void testUser() {
        User user = new User();
        /*user.setId(1);
        user.setName("王二花");
        user.setAge(18);
        user.setBirthday(new Date());*/

        user.setId(1).setName("王二虎").setId(16).setBirthday(new Date());

        System.out.println(user);
    }

}
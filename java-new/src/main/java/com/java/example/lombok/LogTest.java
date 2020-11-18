package com.java.example.lombok;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * Slf4j注解
 *
 * @author jingLv
 * @date 2020/11/06
 */
@Slf4j
public class LogTest {

    @Test
    public void func() {
        log.error("错误日志！！");
    }

}

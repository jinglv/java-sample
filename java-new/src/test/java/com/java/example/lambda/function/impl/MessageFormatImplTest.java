package com.java.example.lambda.function.impl;

import com.java.example.lambda.function.IMessageFormat;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-13 1:14 PM
 */
public class MessageFormatImplTest {

    @Test
    public void testFormat() {
        String msg = "hello world";
        IMessageFormat format = null;
        if (IMessageFormat.verifyMessage(msg)) {
            format = new MessageFormatImpl();
        }

        format.format(msg, "json");
    }
}
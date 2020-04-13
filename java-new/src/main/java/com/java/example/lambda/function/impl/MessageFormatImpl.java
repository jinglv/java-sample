package com.java.example.lambda.function.impl;

import com.java.example.lambda.function.IMessageFormat;

/**
 * @author jingLv
 * @date 2020-04-09 2:10 PM
 */
public class MessageFormatImpl implements IMessageFormat {
    @Override
    public String format(String message, String format) {
        System.out.println("消息转换...");
        return message;
    }
}

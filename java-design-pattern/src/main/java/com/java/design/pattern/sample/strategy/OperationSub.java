package com.java.design.pattern.sample.strategy;

/**
 * @author jingLv
 * @date 2020/04/21
 */
public class OperationSub implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}

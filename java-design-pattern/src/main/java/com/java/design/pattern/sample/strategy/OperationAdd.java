package com.java.design.pattern.sample.strategy;

public class OperationAdd implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}

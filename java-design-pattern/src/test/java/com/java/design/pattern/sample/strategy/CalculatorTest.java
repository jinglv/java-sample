package com.java.design.pattern.sample.strategy;

import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testDoOperationAdd() {
        calculator.setOperation(new OperationAdd());
        int result = calculator.doOperation(1,2);
        System.out.println(result);
    }

    @Test
    public void testDoOperationSub() {
        calculator.setOperation(new OperationSub());
        int result = calculator.doOperation(1,2);
        System.out.println(result);
    }
}
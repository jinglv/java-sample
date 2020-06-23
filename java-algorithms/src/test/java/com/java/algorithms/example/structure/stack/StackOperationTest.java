package com.java.algorithms.example.structure.stack;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author jingLv
 * @date 2020-06-23 4:08 下午
 */
public class StackOperationTest {

    @Test
    public void testPushStack() {
        //初始化栈(⽆元素)
        Stack stack = new Stack(new StackNode(), new StackNode());
        //栈顶和栈尾是同⼀指向
        stack.stackBottom = stack.stackTop;
        //指向null
        stack.stackTop.next = null;
        // 进栈
        StackOperation.pushStack(stack, 10);
        // 遍历
        StackOperation.traverse(stack);
    }

    @Test
    public void testTraverse() {

    }
}
package com.java.algorithms.example.structure.stack;

/**
 * @author jingLv
 * @date 2020-06-23 4:01 下午
 */
public class Stack {
    // 栈顶
    public StackNode stackTop;
    // 栈底
    public StackNode stackBottom;

    public Stack(StackNode stackTop, StackNode stackBottom) {
        this.stackTop = stackTop;
        this.stackBottom = stackBottom;
    }

    public Stack() {
    }
}

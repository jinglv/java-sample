package com.java.algorithms.example.structure.stack;

/**
 * 栈--使用链表实现
 *
 * @author jingLv
 * @date 2020-06-23 3:58 下午
 */
public class StackNode {
    //数据域
    public int data;
    //指针域
    public StackNode next;

    public StackNode() {
    }

    public StackNode(int data) {
        this.data = data;
    }

    public StackNode(int data, StackNode next) {
        this.data = data;
        this.next = next;
    }
}

package com.java.algorithms.example.structure.linked;

/**
 * 定义⼀个类作为节点
 * - 数据域
 * - 指针域
 *
 * @author jingLv
 * @date 2020-04-13 11:07 AM
 */
public class Node {

    /**
     * 数据域
     */
    public Integer data;

    /**
     * 指针域，指向下⼀个节点
     */
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

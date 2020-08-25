package com.java.algorithms.example.structure.linked;

import org.junit.jupiter.api.Test;

/**
 * @author jingLv
 * @date 2020/08/24
 */
class BubbleSortLinkedTest {
    // 定义全局变量，链表的头指针
    private static final Node head = new Node();

    @Test
    void bubbleSortLink() {
        NodeOperation.addNode(head, 45);
        NodeOperation.addNode(head, 50);
        NodeOperation.addNode(head, 60);
        NodeOperation.addNode(head, 25);
        NodeOperation.addNode(head, 35);
        NodeOperation.addNode(head, 40);

        BubbleSortLinked.bubbleSortLink(head);
        NodeOperation.traversal(head);
    }
}
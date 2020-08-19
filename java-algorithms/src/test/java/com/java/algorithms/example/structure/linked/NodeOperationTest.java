package com.java.algorithms.example.structure.linked;

import org.junit.jupiter.api.Test;

/**
 * @author jingLv
 * @date 2020-04-13 11:26 AM
 */
public class NodeOperationTest {

    // 定义全局变量，链表的头指针
    private static Node head = new Node();

    /**
     * 链表添加节点
     */
    @Test
    public void testAddData() {

        NodeOperation.addNode(head, 45);
        NodeOperation.addNode(head, 50);
        NodeOperation.addNode(head, 60);
        NodeOperation.addNode(head, 25);
        NodeOperation.addNode(head, 35);
        NodeOperation.addNode(head, 40);

        NodeOperation.traversal(head);
    }

    /**
     * 链表中插入节点
     */
    @Test
    public void testInsertNode() {
        NodeOperation.insertNode(head, 2, 35);
        NodeOperation.traversal(head);
    }

    /**
     * 获取链表的长度
     */
    @Test
    public void testLinkListLength() {
        System.out.println(NodeOperation.linkListLength(head));
    }

    /**
     * 删除链表中的节点
     */
    @Test
    public void testDeleteNode() {
        NodeOperation.deleteNode(head, 3);
        NodeOperation.traversal(head);
    }

    /**
     * 对链表进行排序
     */
    @Test
    public void testSortLinded() {
        NodeOperation.sortLinkList(head);
        NodeOperation.traversal(head);
    }

    /**
     * 找到链表中倒数第k个节点
     */
    @Test
    public void testFindNode() {
        Node p = NodeOperation.findNode(head, 2);
        assert p != null;
        System.out.println("倒数第k个节点：" + p.data);
    }

    /**
     * 查询单链表的中间节点
     */
    @Test
    public void testSearchMid() {
        Node p = NodeOperation.searchMid(head);
        System.out.println("中间节点：" + p.data);
    }

    /**
     * 通过递归从尾到头输出单链表
     */
    @Test
    public void testPrintListReversely() {
        NodeOperation.printListReversely(head);
    }

    /**
     * 实现链表反转
     */
    @Test
    public void testReverseList() {
        Node p = NodeOperation.reverseList(head);
        NodeOperation.traversal(head);
    }
}
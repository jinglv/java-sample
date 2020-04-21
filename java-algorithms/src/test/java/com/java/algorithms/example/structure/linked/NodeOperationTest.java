package com.java.algorithms.example.structure.linked;

import org.testng.annotations.Test;

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

        NodeOperation.traversal(head);
    }

    /**
     * 链表中插入节点
     */
    @Test(dependsOnMethods = {"testAddData"})
    public void testInsertNode() {
        NodeOperation.insertNode(head, 2, 35);
        NodeOperation.traversal(head);
    }

    /**
     * 获取链表的长度
     */
    @Test(dependsOnMethods = {"testAddData"})
    public void testLinkListLength() {
        System.out.println(NodeOperation.linkListLength(head));
    }

    /**
     * 删除链表中的节点
     */
    @Test(dependsOnMethods = {"testAddData"})
    public void testDeleteNode(){
        NodeOperation.deleteNode(head, 3);
        NodeOperation.traversal(head);
    }

}
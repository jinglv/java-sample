package com.java.algorithms.example.structure.linked;

/**
 * @author jingLv
 * @date 2020/08/24
 */
public class BubbleSortLinked {

    /**
     * 链表的冒泡排序
     *
     * @param head 链表的头节点
     */
    public static void bubbleSortLink(Node head) {
        Node currentNode;
        Node nextNode;

        for (currentNode = head.next; currentNode.next != null; currentNode = currentNode.next) {
            for (nextNode = head.next; nextNode.next != null; nextNode = nextNode.next) {
                if (nextNode.data > nextNode.next.data) {
                    int temp = nextNode.data;
                    nextNode.data = nextNode.next.data;
                    nextNode.next.data = temp;
                }
            }
        }
    }
}

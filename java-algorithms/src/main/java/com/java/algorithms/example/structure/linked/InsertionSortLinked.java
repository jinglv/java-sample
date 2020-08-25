package com.java.algorithms.example.structure.linked;

/**
 * @author jingLv
 * @date 2020/08/24
 */
public class InsertionSortLinked {

    public static void insertionSortLinked(Node head) {
        Node currentNode;
        Node nextNode;

        for (currentNode = head.next; currentNode.next != null; currentNode = currentNode.next) {
            int temp = head.next.data;
            for (nextNode = head.next.next; nextNode.next != null; nextNode = nextNode.next) {
                nextNode.next = nextNode;
            }
            nextNode.next.next.data = temp;
        }
    }
}

package com.java.algorithms.example.structure.linked;

/**
 * 链表的操作
 * - 创建链表(增加节点)
 * 向链表中插⼊数据：
 * - 找到尾节点进⾏插⼊
 * - 即使头节点.next为null，不⾛while循环，也是将头节点与新节点连接的(我已经将head节点初始化过了，因此没必要判断头节点是否为null)
 * <p>
 * - 插入节点
 * - 插入一个节点到链表，首先判断这个位置是否合法，才能进行插入
 * - 找到想要插入的位置
 * <p>
 * - 获取链表的长度
 * - 遍历一下，每得到一个节点+1
 * <p>
 * - 遍历链表
 * - 如果节点不为空，直接输出
 * <p>
 * - 删除节点
 * - 将上一个节点的指针域改变一下，就可以删除
 *
 * @author jingLv
 * @date 2020-04-13 11:14 AM
 */
public class NodeOperation {

    /**
     * 向链表添加数据
     *
     * @param head  头指针
     * @param value 需要添加的数据
     */
    public static void addNode(Node head, int value) {
        //初始化要加⼊的节点
        Node newNode = new Node(value);

        //临时节点
        Node temp = head;

        // 找到尾节点
        while (temp.next != null) {
            temp = temp.next;
        }

        // 已经包括了头节点.next为null的情况了
        temp.next = newNode;
    }

    /**
     * 插入节点
     *
     * @param head  头指针
     * @param index 要插入的位置
     * @param value 要插入的值
     */
    public static void insertNode(Node head, int index, int value) {
        // 首先需要判断指定位置是否合法
        if (index < 1 || index > linkListLength(head) + 1) {
            System.out.println("插入位置不合法");
            return;
        }

        //临时节点，从头节点开始
        Node temp = head;

        //记录遍历当前的位置
        int currentPos = 0;

        // 初始化要插入的节点
        Node insertNode = new Node(value);

        while (temp.next != null) {
            //找到上一个节点的位置了
            if ((index - 1) == currentPos) {
                //temp表示的是上一个节点
                //将原本由上一个节点的指向由插入的节点来指向
                insertNode.next = temp.next;

                // 将上一个节点的指针域指向要插入的节点
                temp.next = insertNode;

                return;
            }

            currentPos++;
            temp = temp.next;
        }

    }

    /**
     * 获取链表的长度
     *
     * @param head 头指针
     * @return 返回链表的长度
     */
    public static int linkListLength(Node head) {
        // 初始化长度的值
        int length = 0;

        //临时节点，从首节点开始
        Node temp = head.next;

        // 找到尾结点
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }

    /**
     * 遍历链表
     *
     * @param head 头节点
     */
    public static void traversal(Node head) {

        // 临时节点，从首节点开始
        Node temp = head.next;

        while (temp != null) {
            // 如果节点数据不为空，直接输出
            if (temp.data != null) {
                System.out.println(temp.data);
            }
            // 继续下一个
            temp = temp.next;
        }
    }

    /**
     * 根据位置删除节点
     *
     * @param head  头指针
     * @param index 要删除的位置
     */
    public static void deleteNode(Node head, int index) {
        // 首先需要判断指定位置是否合法
        if (index < 1 || index > linkListLength(head) + 1) {
            System.out.println("删除位置不合法");
            return;
        }

        //临时节点，从头节点开始
        Node temp = head;

        //记录遍历的当前位置
        int currentPos = 0;

        while (temp.next != null) {
            //找到上一个节点的位置
            if ((index - 1) == currentPos) {
                //temp表示上一个节点，temp.next表示的是想要删除的节点
                //将想要删除的节点存储一下
                Node deleteNode = temp.next;

                //想要删除的节点，又该节点的下一个节点来控制
                temp.next = deleteNode.next;

                //JVM会回收
                deleteNode = null;

                return;
            }
            currentPos++;
            temp = temp.next;
        }
    }

}
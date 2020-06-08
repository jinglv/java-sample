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
 * <p>
 * - 对链表进行排序（冒泡排序）
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

    /**
     * 对链表进行排序
     *
     * @param head 头节点
     */
    public static void sortLinkList(Node head) {
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

    /**
     * 找到链表中倒数第k个节点
     * 找到链表中倒数第k个节点（设置两个指针p1，p2，让p2比p1块k个节点，同事向后遍历，当p2为空，则p1位倒数第k个节点）
     *
     * @param head 头节点
     * @param k    倒数第k个节点
     * @return 找到节点返回
     */
    public static Node findNode(Node head, int k) {
        if (k < 1 || k > linkListLength(head)) {
            return null;
        }

        Node p1 = head;
        Node p2 = head;

        // p2比p1快k个节点
        for (int i = 0; i < k - 1; i++) {
            p2 = p2.next;
        }

        // 只要p2为null，那么p1就是倒数第k个节点了
        while (p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p1;
    }

    /**
     * 查询单链表的中间节点
     * 一个每次走一步，一个每次走两步，走两步的遍历完，然后走一步的指针，那就是中间节点
     *
     * @param head 头节点
     * @return 返回找到的节点
     */
    public static Node searchMid(Node head) {
        Node p1 = head;
        Node p2 = head;

        // 一个走一步，一个走两步，直到为null，走一步的达到的就是中间节点
        while (p2 != null && p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    /**
     * 通过递归从尾到头输出单链表
     *
     * @param head 头节点
     */
    public static void printListReversely(Node head) {
        if (head != null) {
            printListReversely(head.next);
            if (head.data != null) {
                System.out.println(head.data);
            }
        }
    }

    /**
     * 实现链表的反转
     *
     * @param head 头节点
     * @return 返回反转的节点
     */
    public static Node reverseList(Node head) {
        Node pre = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;

            cur = next;
        }
        return pre;
    }

}
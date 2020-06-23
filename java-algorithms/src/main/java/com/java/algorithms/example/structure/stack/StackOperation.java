package com.java.algorithms.example.structure.stack;

/**
 * @author jingLv
 * @date 2020-06-23 4:05 下午
 */
public class StackOperation {

    /**
     * 进栈
     *
     * @param stack 栈
     * @param value 要进栈的元素
     */
    public static void pushStack(Stack stack, int value) {

        // 封装数据成节点
        StackNode newNode = new StackNode(value);

        // 栈顶本来指向的节点交由新节点来指向
        newNode.next = stack.stackTop;

        // 栈顶指针向新节点
        stack.stackTop = newNode;
    }

    /**
     * 遍历栈
     * 只要栈顶元素的指针不指向栈底，那么就一直输出遍历结果
     *
     * @param stack 栈
     */
    public static void traverse(Stack stack) {
        StackNode stackTop = stack.stackTop;

        while (stackTop != stack.stackBottom){
            System.out.println(stackTop.data);
            stackTop = stackTop.next;
        }
    }
}

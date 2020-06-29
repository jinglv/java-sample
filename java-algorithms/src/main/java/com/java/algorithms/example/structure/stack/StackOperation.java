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

        while (stackTop != stack.stackBottom) {
            System.out.println(stackTop.data);
            stackTop = stackTop.next;
        }
    }

    /**
     * 判断该栈是否为空
     * 只要栈顶和栈底同一指向，那么该栈就为空
     *
     * @param stack 栈
     * @return 栈返回不为空
     */
    public static boolean isEmpty(Stack stack) {
        if (stack.stackTop == stack.stackBottom) {
            System.out.println("该栈为空");
        } else {
            System.out.println("该栈不为空");
        }
        return true;
    }

    /**
     * 出栈（将栈顶的指针指向下一个节点）
     * 1.在出栈之前看看该栈是否为空，不为空才出栈
     * 2.将栈顶的元素的指针（指向下一个节点）赋值给栈顶指针（完成出栈）
     *
     * @param stack 栈
     */
    public static void popStack(Stack stack) {
        // 栈不为空才能出栈
        if (!isEmpty(stack)) {
            // 栈顶元素
            StackNode top = stack.stackTop;

            // 栈顶指针指向下一个节点
            stack.stackTop = top.next;

            System.out.println(top.data);
        }
    }

    /**
     * 清空栈
     * 栈顶指向栈底，就清空了栈
     *
     * @param stack 栈
     */
    public static void clearStack(Stack stack) {
        stack.stackTop = null;
        stack.stackBottom = stack.stackTop;
    }
}

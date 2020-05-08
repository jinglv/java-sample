package com.java.algorithms.example.structure.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * jdk的队列数据结构
 * 队列操作：项目需求
 * <p>
 * 高并发的业务操作，需要同时处理多个用户的请求（例如：抢购系统）
 * 问题：后端的程序不能及时的处理所有用户的请求
 * 缓冲操作：将用户的请求排队存放（有顺序的存放），让后台系统逐个处理
 * 思考：使用什么样的技术实现起来更加友好
 * <p>
 * 可以使用普通集合实现
 * 提高效率，使用多线程操作，普汀集合存在并发问题需要处理
 * <p>
 * 可以使用线程安全的集合
 * 使用多线程的情况下，完成高效率的操作
 * 处理完每个请求之后，需要删除对应的请求数据
 * <p>
 * 可以使用队列操作（线程安全）
 * 既能保证多线程情况下的高效率处理
 * 又能保证每个请求处理之后自动删除
 * [
 * >保存每个抢购请求时-->入队操作 offer(url)
 * >处理每个超狗请求时-->出队操作 poll()
 * ]
 *
 * @author jingLv
 * @date 2020-05-06 8:14 下午
 */
public class QueueTest {

    public static void main(String[] args) {
        //声明一个队列：存储3个数据
        Queue<String> msg = new ArrayBlockingQueue<String>(3);

        // Collections集合发的方法，增加数据
        msg.add("One");

        // 队列的操作方法：增加数据：入队
        msg.offer("Two");

        // 查询队首位置的第一个数据：不删除
        msg.element();

        // 查询并删除队首位置的第一个数据：head/front
        msg.poll();

        // Collections集合的方法，查询队列中的所有数据总数
        msg.size();
    }
}

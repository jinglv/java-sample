package com.java.algorithms.example.sort;

/**
 * Comparable是排序接口。若一个类实现了Comparable接口，就意味着该类支持排序。
 * 实现了Comparable接口的类的对象的列表或数组可以通过Collections.sort或Arrays.sort进行自动排序。
 *
 * @author jinglv
 * @date 2020-04-06 16:12
 */
public class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 定义Student的compareTo函数
     * 如果分数相等，则按照名字的字母序排序
     * 如果分数不等，则分数高的靠前
     *
     * @param o 对象
     * @return 比较结果
     */
    @Override
    public int compareTo(Student o) {
        if (this.score < o.score) {
            return -1;
        } else if (this.score > o.score) {
            return 1;
        } else { // this.score == that.score
            return this.name.compareTo(o.name);
        }
    }

    /**
     * 定义Student实例的打印输出方式
     *
     * @return toString
     */
    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString(this.score);
    }
}

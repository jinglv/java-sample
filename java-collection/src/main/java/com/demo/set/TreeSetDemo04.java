package com.demo.set;

import com.demo.entity.StudentScore;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author jingLv
 * @date 2021/01/05
 */
public class TreeSetDemo04 {
    public static void main(String[] args) {
        // 创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<StudentScore> studentScores = new TreeSet<>(new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore s1, StudentScore s2) {
                // 主要条件
                int num = s2.getSum() - s1.getSum();
                // 次要条件
                int n = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                return n == 0 ? s1.getName().compareTo(s2.getName()) : n;
            }
        });
        // 创建学生对象
        StudentScore s1 = new StudentScore("张三", 98, 100);
        StudentScore s2 = new StudentScore("李四", 95, 96);
        StudentScore s3 = new StudentScore("王五", 100, 92);
        StudentScore s4 = new StudentScore("赵六", 100, 90);
        StudentScore s5 = new StudentScore("刘七", 98, 98);
        StudentScore s6 = new StudentScore("阿花", 97, 99);
        StudentScore s7 = new StudentScore("阿花", 97, 99);
        StudentScore s8 = new StudentScore("阿咪", 97, 99);
        // 把学生对象添加到集合
        studentScores.add(s1);
        studentScores.add(s2);
        studentScores.add(s3);
        studentScores.add(s4);
        studentScores.add(s5);
        studentScores.add(s6);
        studentScores.add(s7);
        studentScores.add(s8);
        // 遍历集合
        for (StudentScore studentScore : studentScores) {
            System.out.println(studentScore.getName() + ":" + studentScore.getChinese() + ":" + studentScore.getMath());
        }
    }
}

package com.demo.chars;

import com.demo.model.StudentSource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author jingLv
 * @date 2020/12/17
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        // 1. 定义学生类--model/StudentSource.java
        // 2. 创建TreeSet集合，通过比较器排序进行排序
        TreeSet<StudentSource> students = new TreeSet<>(new Comparator<StudentSource>() {
            @Override
            public int compare(StudentSource s1, StudentSource s2) {
                // 成绩总分从高到低
                int num = s2.getSum() - s1.getSum();
                // 次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                return num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
            }
        });
        // 3. 键盘录入数据
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第：" + (i + 1) + "个学生的信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            // 4. 创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            StudentSource studentSource = new StudentSource();
            studentSource.setName(name);
            studentSource.setChinese(chinese);
            studentSource.setMath(math);
            studentSource.setEnglish(english);

            // 5. 把学生对象添加到TreeSet集合
            students.add(studentSource);
        }
        // 6. 创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java-file-class/studentSource.txt"));
        // 7. 遍历集合，得到每一个学生对象
        for (StudentSource student : students) {
            // 8. 把学生对象的数据拼接成指定格式的字符串
            // 9. 调用字符缓冲输出流对象的方法写数据
            String str = student.getName() + "," +
                    student.getChinese() + "," +
                    student.getMath() + "," +
                    student.getEnglish() + "," +
                    student.getSum();
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        // 10. 释放资源
        bufferedWriter.close();
    }
}

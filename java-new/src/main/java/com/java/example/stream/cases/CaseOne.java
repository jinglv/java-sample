package com.java.example.stream.cases;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 案例一
 *
 * @author jingLv
 * @date 2020/10/29
 */
public class CaseOne {

    /**
     * 考试成绩模型
     */
    @Data
    @AllArgsConstructor
    class ExamStudentScore {
        /**
         * 学生姓名
         */
        private String studentName;
        /**
         * 成绩
         */
        private Integer scoreValue;
        /**
         * 科目
         */
        private String subject;
    }

    /**
     * 存放学生考试成绩
     */
    Map<String, List<ExamStudentScore>> stringListMap;

    @BeforeClass
    public void init() {
        stringListMap = new HashMap<>();
        List<ExamStudentScore> zsSourceList = new ArrayList<>();
        zsSourceList.add(new ExamStudentScore("张三", 30, "CHINESE"));
        zsSourceList.add(new ExamStudentScore("张三", 40, "ENGLISH"));
        zsSourceList.add(new ExamStudentScore("张三", 50, "MATHS"));
        stringListMap.put("张三", zsSourceList);

        List<ExamStudentScore> lsSourceList = new ArrayList<>();
        lsSourceList.add(new ExamStudentScore("李四", 80, "CHINESE"));
        lsSourceList.add(new ExamStudentScore("李四", null, "ENGLISH"));
        lsSourceList.add(new ExamStudentScore("李四", 60, "MATHS"));
        stringListMap.put("李四", lsSourceList);

        List<ExamStudentScore> wwSourceList = new ArrayList<>();
        wwSourceList.add(new ExamStudentScore("王五", null, "CHINESE"));
        wwSourceList.add(new ExamStudentScore("王五", null, "ENGLISH"));
        wwSourceList.add(new ExamStudentScore("王五", 70, "MATHS"));
        stringListMap.put("王五", wwSourceList);
    }

    @Test
    public void findStudent() {
        stringListMap.forEach((studentName, scoreList) -> {
            // 匹配score集合中为null,为空返回true，否则为false
            boolean b = scoreList.stream().anyMatch(score -> {
                // anyMatch只要匹配到任意一条符合条件的数据就会返回，不会继续查找了，尽量减少循环的次数，满足需求
                System.out.println(score);
                return score.getScoreValue() == null;
            });

            if (b) {
                System.out.println("此学生[ " + studentName + " ]有缺考");
            }
        });
    }
}

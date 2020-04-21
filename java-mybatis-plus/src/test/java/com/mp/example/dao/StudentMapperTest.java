package com.mp.example.dao;


import com.mp.example.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author jingLv
 * @date 2020-04-17 5:41 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelect() {
        List<Student> list = studentMapper.selectList(null);
        // 输出数据
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        Student student = new Student();
        student.setSId("s07");
        student.setSName("荷花");
        student.setSAge(16);
        student.setCreateTime(LocalDateTime.now());
        int rows = studentMapper.insert(student);
        System.out.println("影响记录数：" + rows);
    }

}

package com.mp.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author jingLv
 * @date 2020-04-17 5:18 PM
 */
@Data
@TableName("t_student")
public class Student {
    /**
     * 主键
     */
    private Long id;
    /**
     * 学号
     */
    @TableField("Sid")
    private String sId;
    /**
     * 学生姓名
     */
    @TableField("Sname")
    private String sName;
    /**
     * 学生年龄
     */
    @TableField("Sage")
    private Integer sAge;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}

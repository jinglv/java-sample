package com.example.lombok;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author jinglv
 * @date 2020/10/05
 */
@Data
@Accessors(chain = true)
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
}

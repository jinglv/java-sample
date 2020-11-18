package com.java.example.lombok;

import lombok.Data;

/**
 * Data注解，集成的一个注解，包含@Getter @Setter @ToString @ToEqualsAndHashCode
 *
 * @author jingLv
 * @date 2020/11/06
 */
@Data
public class DataTest {

    private String field1;
    private String field2;
}

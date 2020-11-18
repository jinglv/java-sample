package com.java.example.lombok;

import lombok.Setter;
import lombok.ToString;
import org.testng.annotations.Test;

/**
 * ToString注解 生成toString方法
 * 必须作用在类上
 *
 * @author jingLv
 * @date 2020/11/06
 */
@ToString(
        includeFieldNames = false,
        //exclude = {"field1"},
        // of = {"field1"},
        doNotUseGetters = true
)
public class ToStringTest {
    @Setter
    private String field1;
    @Setter
    private String field2;

    public String getField2() {
        System.out.println("调用get方法！");
        return this.field2;
    }

    /**
     * 如果：doNotUseGetters = true
     * 则该语句不会输出：System.out.println("调用get方法！");
     */
    @Test
    public void test() {
        ToStringTest toStringTest = new ToStringTest();
        toStringTest.setField1("xiaohong");
        toStringTest.setField2("xiaohuang");
        System.out.println(toStringTest.toString());
    }
}

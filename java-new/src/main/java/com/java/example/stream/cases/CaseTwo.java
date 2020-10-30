package com.java.example.stream.cases;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.util.List;

/**
 * 案例二
 *
 * @author jingLv
 * @date 2020/10/29
 */
public class CaseTwo {

    /**
     * 用户请求的创建标签模型
     */
    @Data
    @AllArgsConstructor
    class TagReqDTO {
        /**
         * 标签的名字
         */
        private String name;
        /**
         * 标签值
         */
        private Integer age;
    }

    /**
     * 从DB中查询出来的已经存在的标签名
     */
    List<String> tagListFromDB;
    /**
     * 用户请求的标签列表
     */
    List<TagReqDTO> tagListFromReq;

    @BeforeClass
    public void init() {
        // 数据库中存在的标签名列表
        tagListFromDB = Lists.newArrayList("李四", "王五", "赵六");
        // 用户提交
        tagListFromReq = Lists.newArrayList(
                new TagReqDTO("张三", 10),
                new TagReqDTO("李四", 30),
                new TagReqDTO("王五", 10));
    }

    @Test
    public void distinctTag() {
        tagListFromReq.stream()
                // 里面的表达式为true时，表示这条数据不会被过滤，为false时，没有通过测试，则会被过滤
                .filter(tag -> !tagListFromDB.contains(tag.getName()))
                // 比较元素的equals对元素进行比较
                .distinct()
                .forEach(System.out::println);
    }
}

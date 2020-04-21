package com.java.example.lambda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jingLv
 * @date 2020-04-16 1:31 PM
 */
public class Test {
    public static void main(String[] args) {
        //1.添加测试数据，存储多个账号列表
//        List<String> accounts = new ArrayList<String>();
//        accounts.add("tom");
//        accounts.add("jerry");
//        accounts.add("beita");
//        accounts.add("shuke");
//        accounts.add("damu");

        // java黑魔法，双括号初始化
        List<String> accounts = new ArrayList<String>() {{
            add("tom");
            add("jerry");
            add("beita");
            add("shuke");
            add("damu");
        }};
        //1.1业务要求：账号长度大于等于5的是有效账号
        for (String account : accounts) {
            if (account.length() >= 5) {
                System.out.println("有效账号：" + account);
            }
        }

        //1.2迭代方式进行操作
        Iterator<String> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            String account = iterator.next();
            if (account.length() >= 5) {
                System.out.println("有效账号：" + account);
            }
        }

        //1.3Stream结合lambda表达式，完成业务处理
        List valiAccount = accounts.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
        System.out.println(valiAccount);
    }
}

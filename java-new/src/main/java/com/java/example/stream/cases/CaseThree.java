package com.java.example.stream.cases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 案例三
 *
 * @author jingLv
 * @date 2020/10/29
 */
public class CaseThree {

    /**
     * 角色
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Role {
        /**
         * 权限列表
         */
        private List<Permission> permissions;
    }

    /**
     * 权限
     */
    @Data
    @AllArgsConstructor
    class Permission {
        /**
         * 权限名称
         */
        private String name;
    }

    /**
     * 用户权限列表
     */
    List<Role> roles;

    @BeforeClass
    public void init() {
        roles = new ArrayList<>();

        Role adminRole = new Role();
        List<Permission> adminPermissionList = Lists.newArrayList(
                new Permission("删除"),
                new Permission("查看"),
                new Permission("导出")
        );
        adminRole.setPermissions(adminPermissionList);

        Role userRole = new Role();
        List<Permission> userPermissionList = Lists.newArrayList(
                new Permission("新建"),
                new Permission("修改"),
                new Permission("删除"),
                new Permission("查看")
        );
        userRole.setPermissions(userPermissionList);

        roles.add(adminRole);
        roles.add(userRole);
    }

    /**
     * 对两个角色的权限，去并集
     */
    @Test
    public void findPermission() {
        roles.stream()
                // 扁平化Map 获取对象中的集合类属性，组成一个新的流
                // roles是三层结构，角色列表下有两个角色，每个角色下又有权限的列表，扁平化是将这个三层结构的列表只取权限这一层的列表，将权限的列表进行整合，整合为一个新的流，对新的流进行后续操作
                .flatMap(role -> role.getPermissions().stream())
                .peek(permission -> System.out.println("新的流：" + permission))
                .distinct()
                .forEach(System.out::println);
    }
}

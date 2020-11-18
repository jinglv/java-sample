package com.java.example.validation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;

/**
 * 验证测试类
 *
 * @author jingLv
 * @date 2020/11/09
 */
public class ValidationTest {
    /**
     * 验证器对象
     */
    private Validator validator;
    /**
     * 待验证对象
     */
    private UserInfo userInfo;
    /**
     * 验证结果集合
     */
    private Set<ConstraintViolation<UserInfo>> set;
    /**
     * 验证结果集合
     */
    private Set<ConstraintViolation<UserInfoService>> otherSet;

    /**
     * 初始化操作
     */
    @BeforeTest
    public void init() {
        // 初始化验证器
        validator = Validation.buildDefaultValidatorFactory().getValidator();
        // 初始化待验证对象-用户信息
        userInfo = new UserInfo();
        //userInfo.setUserId("xiaohong");
        userInfo.setUserName("小红");
        userInfo.setPassword("1234567");
        //userInfo.setEmail("xiaohong@qq.com");
        userInfo.setAge(20);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.DECEMBER, 8);
        userInfo.setBirthday(calendar.getTime());
        UserInfo friend = new UserInfo();
        friend.setUserId("xiaoxiaohua").setUserName("王小花").setPassword("123123").setEmail("1231@qq.com").setPhone("15811112222");
        userInfo.setFriends(new ArrayList() {{
            add(friend);
        }});
        userInfo.setPhone("15811112222");
    }

    /**
     * 结果打印
     */
    @AfterTest
    public void print() {
        set.forEach(item -> {
            // 输出验证错误信息
            System.out.println(item.getMessage());
        });
    }

    @Test
    public void nullValidationTest() {
        // 使用验证器对对象进行验证
        set = validator.validate(userInfo);
    }

    /**
     * 级联验证
     * 验证集合中的对象
     */
    @Test
    public void graphValidation() {
        // 使用验证器对对象进行验证
        set = validator.validate(userInfo);
    }

    /**
     * 分组验证
     */
    @Test
    public void groupValidation() {
        // 使用验证器对对象进行验证
        set = validator.validate(userInfo, UserInfo.RegisterGroup.class, UserInfo.LoginGroup.class);
    }

    /**
     * 组序列
     */
    @Test
    public void groupSequenceValidation() {
        set = validator.validate(userInfo, UserInfo.Group.class);
    }

    /**
     * 对方法输入参数进行约束注解校验
     */
    @Test
    public void paramValidation() {
        // 获取校验执行器
        ExecutableValidator executableValidator = validator.forExecutables();
        // 构造待验证对象
        UserInfoService userInfoService = new UserInfoService();
        // 待验证方法
        Method setUserInfo = null;
        try {
            setUserInfo = userInfoService.getClass().getMethod("setUserInfo", UserInfo.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        // 方法输入参数
        Object[] paramObject = new Object[]{new UserInfo()};
        // 对方法的输入参数进行校验
        otherSet = executableValidator.validateParameters(userInfoService, setUserInfo, paramObject);
    }

    /**
     * 对方法返回值进行约束校验
     */
    @Test
    public void returnValueValidation() {
        // 获取校验执行器
        ExecutableValidator executableValidator = validator.forExecutables();
        // 构造要验证的方法对象
        UserInfoService userInfoService = new UserInfoService();
        // 待验证方法
        Method getUserInfo = null;
        try {
            getUserInfo = userInfoService.getClass().getMethod("getUserInfo");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        // 调用方法得到返回值
        Object returnValue = null;
        try {
            returnValue = getUserInfo.invoke(userInfoService);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 校验方法返回值是否符合约束
        otherSet = executableValidator.validateReturnValue(userInfoService,
                getUserInfo,
                returnValue);
    }

    /**
     * 对构造函数输入参数进行校验
     */
    @Test
    public void constructorValidation() {
        // 获取验证执行器
        ExecutableValidator executableValidator = validator.forExecutables();
        // 获取构造函数
        Constructor<UserInfoService> constructor = null;
        try {
            constructor = UserInfoService.class.getConstructor(UserInfo.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        // 构造输入参数
        Object[] paramObjects = new Object[]{new UserInfo()};
        // 校验构造函数
        otherSet = executableValidator.validateConstructorParameters(constructor, paramObjects);
    }
}

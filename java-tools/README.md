# Java开发常用工具合集

## lombok
[lombok官网](https://projectlombok.org)

### 引言
- **还记得刚刚接触java,学习面向对象时因为手写get,set,hashcode,equals等方法的痛苦吗?**
- **还记得后来上手了Eclipse|Idea这样工具可以快速生成get,set等相关方法的兴奋吗? 好强大..**
- **后来工作时间长了,这种兴奋渐渐就变成了的苦恼?**

很重要一个原因就是因为随着项目业务模块功能不断扩展,项目中涉及库表越来越多,导致项目中实体类(Entity)对象越来越多,每次写Entity对象最头疼就是生成Get,SET等相关方法,极大影响开发效率,如何更好的解决呢? lombok出现仿佛让我们回到曾经的那种喜悦!!!

### lombok是什么
Lombok项目是一个Java库，它会自动插入编辑器和构建工具中，Lombok提供了一组有用的注释(注解)，用来消除Java类中的大量样板代码。仅五个字符(@Data)就可以替换数百行代码从而产生干净，简洁且易于维护的Java类 ---百度百科

Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more. --摘自官网

通俗解释: lombok快速开发工具,提供了一组java相关注解,通过注解用来更快速生成java对象中我们想要的相关方法(get,set,toString ....)等一系列方法

### lombok使用实战
1. 创建maven项目，引入依赖
    ```xml
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.12</version>
        <scope>provided</scope>
    </dependency>
    ```
    
2. 使用提供的注解
    - `@Data`注解：自动给对象提供 GET SET ToString hashCode equals 等方法
    ```java
    package com.example.lombok;
    
    import lombok.Data;
    
    import java.util.Date;
    
    /**
     * @author jinglv
     * @date 2020/10/05
     */
    @Data
    public class User {
        private Integer id;
        private String name;
        private Integer age;
        private Date birthday;
    }
    ```
   测试：
   ```
   @Test
   void testUser() {
       User user = new User();
       user.setId(1);
       user.setName("王二花");
       user.setAge(18);
       user.setBirthday(new Date());

       System.out.println(user);
   }
   ```
   运行结果
   ```
    User(id=1, name=王二花, age=18, birthday=Mon Oct 05 11:32:38 CST 2020)
   ```
   
3. lombok原理

    ![image-20201005113740517](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005113740517.png)

    - SOURCE：在代码编译时生效
    
### lombok常用注解

#### @Data

- 修饰范围在**类**上

- 作用：用来生成对象中GET SET ToString HashCode equals等相关方法

  ```java
  package com.example.lombok;
  
  import lombok.Data;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Data
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```

  

#### @Getter/@Setter

- 修饰范围在**类**上

- 作用：用来只生成对应GET/SET方法

  ```java
  package com.example.lombok;
  
  import lombok.Getter;
  import lombok.Setter;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Getter
  @Setter
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```



#### @ToString

- 修饰范围在**类**上

- 作用：用来生成toString方法

  ```java
  package com.example.lombok;
  
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Getter
  @Setter
  @ToString
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```



#### @AllArgsConstructor/@NoArgsConstructor(全部参数的有参构造/无参构造)

- 修饰范围在**类**上

- 作用：用来生成全部参数的有参构造和无参构造

- 注意：一旦提供有参构造，也要类提供无参构造

  ```java
  package com.example.lombok;
  
  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;
  
  import java.util.Date;
  
  /**
   * @author jinglv
   * @date 2020/10/05
   */
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class User {
      private Integer id;
      private String name;
      private Integer age;
      private Date birthday;
  }
  ```

#### @Accessors

- 修饰范围在**类**上

- 作用：用来给类中set方法开启**链式**调用，**chain属性**: 用来指定是否开启SET方法链式调用 true 开启 false  不开启

  ```java
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
  ```

  测试

  ```
  @Test
  void testUser() {
    User user = new User();
    /*user.setId(1);
    user.setName("王二花");
    user.setAge(18);
    user.setBirthday(new Date());*/
  
    user.setId(1).setName("王二虎").setId(16).setBirthday(new Date());
  
    System.out.println(user);
  }
  ```



#### @Slf4j

- 修饰范围在**类**上

- 作用：用来快速给类中定义一个日志变量

- 原理：在对应类上加入这个注解相当于在这个类中声明了一个日志对象

  ```
  private Logger log = LoggerFactory.getLogger(this.getClass());
  ```

- 具体用法

  ```java
  @Controller
  @RequestMapping("user")
  @Slf4j
  public class UserController {
      @RequestMapping("findAll")
      public String findAll(){
          log.info("进入findAll方法");
          log.info("姓名:[{}],年龄:[{}]",name,age);
          return "index";
      }
  }
  ```

  



### idea中安装lombok
**注意:默认在idea中不支持lombok语法,写上之后没有任何效果,需要在idea中额外安装插件才可以继续使用lombok**

IntelliJ IDEA --> Preferences --> Plugins --> 搜索lombok 下载安装 安装完成重启idea即可

![image-20201005114344180](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005114344180.png)

**安装完成之后出现如下问题的解决方案:**

![image-20201005120211047](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005120211047.png)

解决方法：

![](https://gitee.com/JeanLv/study_image2/raw/master///image-20201005120252513-20201005120310109-20201005120312988.png)



## hutool

[hutool官方网站](https://www.hutool.cn)


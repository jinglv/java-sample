-- 新建数据库
CREATE DATABASE /*!32312 IF NOT EXISTS */`school` /*!40100 DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_general_ci */;

-- 进入数据库
USE `school`;

-- 新建数据表
/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id`          BIGINT(20)                           NOT NULL                     AUTO_INCREMENT,
  `Sid`         VARCHAR(255) COLLATE utf8mb4_general_ci                           DEFAULT NULL
  COMMENT '学生ID',
  `Sname`       VARCHAR(255) COLLATE utf8mb4_general_ci                           DEFAULT NULL
  COMMENT '学生姓名',
  `Sage`        INT(11) COLLATE utf8mb4_general_ci                                DEFAULT NULL
  COMMENT '学生年龄',
  `create_time` DATETIME COLLATE utf8mb4_general_ci                               DEFAULT NULL
  COMMENT '创建时间',
  `update_time` TIMESTAMP COLLATE utf8mb4_general_ci NOT NULL                     DEFAULT CURRENT_TIMESTAMP
  ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci
  COMMENT ='学生表';

/*Table structure for table `t_teacher` */

DROP TABLE IF EXISTS `t_teacher`;

CREATE TABLE `t_teacher` (
  `id`          INT(11)                              NOT NULL                        AUTO_INCREMENT,
  `Tid`         VARCHAR(255) COLLATE utf8mb4_general_ci                              DEFAULT NULL
  COMMENT '教师ID',
  `Tname`       VARCHAR(255) COLLATE utf8mb4_general_ci                              DEFAULT NULL
  COMMENT '学生姓名',
  `create_time` DATETIME COLLATE utf8mb4_general_ci                                  DEFAULT NULL
  COMMENT '创建时间',
  `update_time` TIMESTAMP COLLATE utf8mb4_general_ci NOT NULL                        DEFAULT CURRENT_TIMESTAMP
  ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci
  COMMENT ='教师表';

/*Table structure for table `t_course` */

DROP TABLE IF EXISTS `t_course`;

CREATE TABLE `t_course` (
  `id`          INT(11)                              NOT NULL                        AUTO_INCREMENT,
  `Cid`         VARCHAR(255) COLLATE utf8mb4_general_ci                              DEFAULT NULL
  COMMENT '课程ID',
  `Cname`       VARCHAR(255) COLLATE utf8mb4_general_ci                              DEFAULT NULL
  COMMENT '课程名称',
  `Cteacher`    VARCHAR(255) COLLATE utf8mb4_general_ci                              DEFAULT NULL
  COMMENT '授课教师',
  `create_time` DATETIME COLLATE utf8mb4_general_ci                                  DEFAULT NULL
  COMMENT '创建时间',
  `update_time` TIMESTAMP COLLATE utf8mb4_general_ci NOT NULL                        DEFAULT CURRENT_TIMESTAMP
  ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci
  COMMENT ='课程表';

/*Table structure for table `t_source` */

DROP TABLE IF EXISTS `t_source`;

CREATE TABLE `t_source` (
  `id`          INT(11)                              NOT NULL                        AUTO_INCREMENT,
  `Sid`         VARCHAR(255) COLLATE utf8mb4_general_ci                              DEFAULT NULL
  COMMENT '学生ID',
  `Cid`         VARCHAR(255) COLLATE utf8mb4_general_ci                              DEFAULT NULL
  COMMENT '课程ID',
  `Csource`     INT(11) COLLATE utf8mb4_general_ci                                   DEFAULT NULL
  COMMENT '课程的成绩',
  `create_time` DATETIME COLLATE utf8mb4_general_ci                                  DEFAULT NULL
  COMMENT '创建时间',
  `update_time` TIMESTAMP COLLATE utf8mb4_general_ci NOT NULL                        DEFAULT CURRENT_TIMESTAMP
  ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci
  COMMENT ='成绩表';
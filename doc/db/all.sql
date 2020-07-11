drop table if exists `tset`;

CREATE TABLE `test`  (
                               `id` int(0) NOT NULL AUTO_INCREMENT,
                               `name` varchar(255) NULL,
                               PRIMARY KEY (`id`)
);



create table `chapter`
(
  `id`        char(8) not null comment 'ID',
  `course_id` char(8) comment '课程ID',
  `name`      varchar(50) comment '名称',
  primary key (`id`)

) engine = innodb
  default charset = utf8mb4 comment '大章';

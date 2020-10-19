drop table if exists r_image_remote_cate;
#id, title, orderNo, creator, createTime
CREATE TABLE r_image_remote (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  title varchar(100) NOT NULL,
  orderNo int(10) DEFAULT 0,
  creator bigint(20) NOT NULL,
  createTime int(10) DEFAULT 0,
  PRIMARY KEY (id)
) ENGINE=innodb AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '远程图片';

drop table if exists r_image_remote_info;
#id, title, url, cateId, orderNo, creator, createTime
CREATE TABLE r_image_remote_info (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  title varchar(500) NOT NULL,
  url varchar(200) DEFAULT NULL comment '连接地址',
  cateId bigint(20) DEFAULT 0,
  orderNo int(10) DEFAULT 0,
  creator bigint(20) NOT NULL,
  createTime int(10) DEFAULT 0,
  PRIMARY KEY (id)
) ENGINE=innodb AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '远程图片';

drop table if exists r_image_remote_log;
#id, urlId, title, url, content, state, orderNo, creator, createTime
CREATE TABLE r_image_remote_log (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  urlId bigint(20) NOT NULL,
  title varchar(500) NOT NULL,
  url varchar(200) DEFAULT NULL comment '连接地址',
  content mediumtext DEFAULT null,
  state int(2) DEFAULT 0 comment '0:未获取，1：待处理 3:有问题 4:完成 5: 发布',
  orderNo int(10) DEFAULT 0,
  creator bigint(20) NOT NULL,
  createTime int(10) DEFAULT 0,
  PRIMARY KEY (id)
) ENGINE=innodb AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '图片处理';
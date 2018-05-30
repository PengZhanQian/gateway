CREATE TABLE `test_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(256) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '密码',
  `mobile_no` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '手机号码',
  `delete_flag` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '逻辑删除标识 1删除 0 未删除 默认0 ',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `created_by` bigint(20) NOT NULL DEFAULT '1' COMMENT '创建人ID',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `modified_by` bigint(20) DEFAULT '1' COMMENT '修改人ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
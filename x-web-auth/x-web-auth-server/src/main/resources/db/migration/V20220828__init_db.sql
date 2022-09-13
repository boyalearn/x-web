/*
 Navicat MySQL Data Transfer

 Source Server         : 192.168.0.204_3306
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : 192.168.0.204:3306
 Source Schema         : x-auth

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 13/09/2022 21:52:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client`  (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `create_time` datetime NULL DEFAULT NULL,
                           `client_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `client_secret` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `authorized_grant_types` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `redirect_uris` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `scope` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `tenant_id` int(11) NULL DEFAULT NULL,
                           PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES (1, 'XAuth应用', '授权应用', '2022-09-03 11:07:34', 'dae5ba88-befc-495b-903c-ce0a90e0d9ea', 'f90360a0-d4a2-4c60-816f-d0a212de592a', 'authorization_code,password,implicit,client_credentials', 'http://localhost:8080', 'all', 1);

-- ----------------------------
-- Table structure for client_user_role
-- ----------------------------
DROP TABLE IF EXISTS `client_user_role`;
CREATE TABLE `client_user_role`  (
                                     `client_id` int(11) NOT NULL,
                                     `role_id` int(11) NOT NULL,
                                     `user_id` int(11) NOT NULL,
                                     `create_time` datetime NULL DEFAULT NULL,
                                     PRIMARY KEY (`client_id`, `role_id`, `user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of client_user_role
-- ----------------------------
INSERT INTO `client_user_role` VALUES (1, 1, 1, NULL);
INSERT INTO `client_user_role` VALUES (1, 1, 2, '2022-09-03 04:18:51');
INSERT INTO `client_user_role` VALUES (1, 18, 2, '2022-09-13 09:38:27');
INSERT INTO `client_user_role` VALUES (1, 19, 2, '2022-09-13 09:38:27');
INSERT INTO `client_user_role` VALUES (5, 15, 1, NULL);
INSERT INTO `client_user_role` VALUES (7, 12, 1, NULL);
INSERT INTO `client_user_role` VALUES (7, 13, 1, NULL);

-- ----------------------------
-- Table structure for flyway_schema_history
-- ----------------------------
DROP TABLE IF EXISTS `flyway_schema_history`;
CREATE TABLE `flyway_schema_history`  (
                                          `installed_rank` int(11) NOT NULL,
                                          `version` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                                          `description` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                          `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                          `script` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                          `checksum` int(11) NULL DEFAULT NULL,
                                          `installed_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                          `installed_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                          `execution_time` int(11) NOT NULL,
                                          `success` tinyint(1) NOT NULL,
                                          PRIMARY KEY (`installed_rank`) USING BTREE,
                                          INDEX `flyway_schema_history_s_idx`(`success`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of flyway_schema_history
-- ----------------------------
INSERT INTO `flyway_schema_history` VALUES (1, '1', '<< Flyway Baseline >>', 'BASELINE', '<< Flyway Baseline >>', NULL, 'root', '2022-08-28 02:09:07', 0, 1);
INSERT INTO `flyway_schema_history` VALUES (2, '20220828', 'init db', 'SQL', 'V20220828__init_db.sql', 1560937002, 'root', '2022-08-28 02:47:01', 44, 1);
INSERT INTO `flyway_schema_history` VALUES (3, '20220828', 'init', 'SQL', 'V20220828__init.sql', -1017752081, 'root', '2022-08-28 16:14:39', 42, 1);

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource`  (
                             `id` int(11) NOT NULL AUTO_INCREMENT,
                             `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                             `client_id` int(11) NULL DEFAULT NULL,
                             `code` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                             `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                             `create_time` datetime NULL DEFAULT NULL,
                             PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of resource
-- ----------------------------
INSERT INTO `resource` VALUES (27, '更新应用', 1, 'APP_UPDATE', '更新应用', '2022-09-13 09:43:21');
INSERT INTO `resource` VALUES (28, '删除应用', 1, 'APP_DELTET', '删除应用', '2022-09-13 09:43:49');
INSERT INTO `resource` VALUES (29, '添加应用', 1, 'APP_INSERT', '添加应用', '2022-09-13 09:45:53');
INSERT INTO `resource` VALUES (30, '查询应用', 1, 'APP_SELECT', '查询应用', '2022-09-13 09:46:23');
INSERT INTO `resource` VALUES (31, '新增角色', 1, 'ROLE_INSERT', '新增角色', '2022-09-13 09:47:06');
INSERT INTO `resource` VALUES (32, '更新角色', 1, 'ROLE_UPDATE', '更新角色', '2022-09-13 09:47:42');
INSERT INTO `resource` VALUES (33, '删除角色', 1, 'ROLE_DELETE', '删除角色', '2022-09-13 09:48:07');
INSERT INTO `resource` VALUES (34, '查询角色', 1, 'ROLE_SELECT', '查询角色', '2022-09-13 09:48:29');
INSERT INTO `resource` VALUES (35, '添加权限', 1, 'AUTH_INSERT', '添加权限', '2022-09-13 09:49:50');
INSERT INTO `resource` VALUES (36, '更新权限', 1, 'AUTH_UPDATE', '更新权限', '2022-09-13 09:50:14');
INSERT INTO `resource` VALUES (37, '删除权限', 1, 'AUTH_DELETE', '删除权限', '2022-09-13 09:50:44');
INSERT INTO `resource` VALUES (38, '查询权限', 1, 'AUTH_SELECT', '查询权限', '2022-09-13 13:33:47');
INSERT INTO `resource` VALUES (39, '添加租户', 1, 'TENANT_INSERT', '添加租户', '2022-09-13 13:34:32');
INSERT INTO `resource` VALUES (40, '修改租户', 1, 'TENANT_UPDATE', '修改租户', '2022-09-13 13:34:55');
INSERT INTO `resource` VALUES (41, '删除租户', 1, 'TENANT_DELETE', '删除租户', '2022-09-13 13:35:24');
INSERT INTO `resource` VALUES (42, '查询租户', 1, 'TENANT_SELECT', '查询租户', '2022-09-13 13:35:49');
INSERT INTO `resource` VALUES (43, '添加用户', 1, 'USER_INSERT', '添加用户', '2022-09-13 13:36:37');
INSERT INTO `resource` VALUES (44, '修改用户', 1, 'USER_UPDATE', '修改用户', '2022-09-13 13:37:03');
INSERT INTO `resource` VALUES (45, '删除用户', 1, 'USER_DELETE', '删除用户', '2022-09-13 13:37:37');
INSERT INTO `resource` VALUES (46, '查询用户', 1, 'USER_SELECT', '查询用户', '2022-09-13 13:38:01');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `client_id` int(11) NULL DEFAULT NULL,
                         `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `create_time` datetime NULL DEFAULT NULL,
                         `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 1, '超级管理员', '无法无天，为所欲为的超级管理员', '2022-08-28 20:00:26', 'SA');
INSERT INTO `role` VALUES (2, 1, '租户管理员', '管理租户的管理员', '2022-09-04 08:41:24', 'ZA');
INSERT INTO `role` VALUES (3, 1, '普通管理', '普普通通也能当管理', '2022-09-04 08:50:58', 'A');


-- ----------------------------
-- Table structure for role_resource
-- ----------------------------
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource`  (
                                  `role_id` int(11) NOT NULL,
                                  `resource_id` int(11) NOT NULL,
                                  `create_time` datetime NULL DEFAULT NULL,
                                  PRIMARY KEY (`role_id`, `resource_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of role_resource
-- ----------------------------
INSERT INTO `role_resource` VALUES (1, 27, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 28, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 29, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 30, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 31, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 32, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 33, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 34, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 35, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 36, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 37, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 38, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 39, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 40, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 41, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 42, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 43, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 44, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 45, '2022-09-13 13:38:48');
INSERT INTO `role_resource` VALUES (1, 46, '2022-09-13 13:38:48');

-- ----------------------------
-- Table structure for system_logger
-- ----------------------------
DROP TABLE IF EXISTS `system_logger`;
CREATE TABLE `system_logger`  (
                                  `id` int(11) NOT NULL AUTO_INCREMENT,
                                  `user_id` int(11) NULL DEFAULT NULL,
                                  `client_id` int(11) NULL DEFAULT NULL,
                                  `model` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                                  `option` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                                  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
                                  `create_time` datetime NULL DEFAULT NULL,
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for tenant
-- ----------------------------
DROP TABLE IF EXISTS `tenant`;
CREATE TABLE `tenant`  (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                           `create_time` datetime NULL DEFAULT NULL,
                           PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tenant
-- ----------------------------
INSERT INTO `tenant` VALUES (1, 'XAuth租户', '超级租户', '2022-08-28 19:54:45');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `account` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `create_time` datetime NULL DEFAULT NULL,
                         PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '管理员', '12345678', '2022-09-01 11:48:06');

SET FOREIGN_KEY_CHECKS = 1;

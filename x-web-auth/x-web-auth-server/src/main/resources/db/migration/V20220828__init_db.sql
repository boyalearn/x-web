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

 Date: 11/09/2022 11:23:53
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
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES (1, 'XAuth应用', '授权应用', '2022-09-03 11:07:34', 'dae5ba88-befc-495b-903c-ce0a90e0d9ea', 'f90360a0-d4a2-4c60-816f-d0a212de592a', 'authorization_code,password,implicit,client_credentials', 'http://localhost:8080', 'all', 1);
INSERT INTO `client` VALUES (14, 'AAAAAA', 'BBBBBB', '2022-09-03 03:07:22', '43a7eb74-0803-49c5-886a-0c4f50764824', 'c18140f3-773b-40d4-bc59-20faf22c0444', 'authorization_code,password,implicit,client_credentials', 'CCCCCCCC', 'FFFFFFFFF', 1);

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
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of resource
-- ----------------------------
INSERT INTO `resource` VALUES (1, '22', NULL, '323', '2323', NULL);
INSERT INTO `resource` VALUES (5, '2323', NULL, '2323', '2323', NULL);
INSERT INTO `resource` VALUES (6, 'sdfsd', NULL, 'sdfsdf', 'sdfsdf', NULL);
INSERT INTO `resource` VALUES (7, '23', NULL, '23', '2323', NULL);
INSERT INTO `resource` VALUES (8, 's\'d\'f', 3, 'd\'f\'s', 'fsddfs', NULL);
INSERT INTO `resource` VALUES (10, 'AAA', 5, 'DBD', 'DFDFS', NULL);
INSERT INTO `resource` VALUES (11, '租户管理', 1, 'ZH', '管理租户', NULL);
INSERT INTO `resource` VALUES (12, '23333', 14, '233', '32323', '2022-09-04 08:57:46');
INSERT INTO `resource` VALUES (13, '23333', 14, '233asdas', '32323', '2022-09-04 08:57:59');
INSERT INTO `resource` VALUES (14, '23333', 14, '233asdas', '32323asdasd', '2022-09-04 08:58:06');
INSERT INTO `resource` VALUES (15, '23333asda', 14, '233asdasasdas', '32323asdasdasdas', '2022-09-04 08:58:15');
INSERT INTO `resource` VALUES (16, '23333asdadasd', 14, '233asdasasdasasdas', '32323asdasdasdas', '2022-09-04 08:58:22');
INSERT INTO `resource` VALUES (17, '23333asdadasddas', 14, '233asdasasdasasdas', '32323asdasdasdas', '2022-09-04 08:58:27');
INSERT INTO `resource` VALUES (18, 'eqwe', 14, 'qweqwe', 'qweqweqw', '2022-09-04 09:01:08');
INSERT INTO `resource` VALUES (19, 'fdsfsdf', 14, 'sdfsdf', 'dfsdfsd', '2022-09-04 09:01:23');
INSERT INTO `resource` VALUES (20, 'sdfsdf', 14, 'fsdfsdf', 'dfsdf', '2022-09-04 09:01:34');
INSERT INTO `resource` VALUES (21, 'dsfsdfs', 14, 'dfsdfsdf', 'dfsdfsdf', '2022-09-04 09:01:43');
INSERT INTO `resource` VALUES (22, 'fsdfsdf', 14, 'sdfsdf', 'sdfsdfsd', '2022-09-04 09:01:55');
INSERT INTO `resource` VALUES (23, '55555', 14, '555555', '555555', '2022-09-04 09:02:04');
INSERT INTO `resource` VALUES (24, 'gdfg', 14, 'dfgd', 'dfgdfg', '2022-09-04 09:05:07');
INSERT INTO `resource` VALUES (25, 'q', 14, 'qweq', 'qweqw', '2022-09-04 09:11:33');
INSERT INTO `resource` VALUES (26, '12', 14, '12', '1212', '2022-09-04 09:13:45');

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
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 1, '超级管理员', '无法无天，为所欲为的超级管理员', '2022-08-28 20:00:26', 'SA');
INSERT INTO `role` VALUES (2, NULL, '223', '2323', NULL, '2323');
INSERT INTO `role` VALUES (3, NULL, '角色1', '角色描述', NULL, '');
INSERT INTO `role` VALUES (4, NULL, '23423', '2342', NULL, '');
INSERT INTO `role` VALUES (5, NULL, 'RO！', '3434', NULL, '');
INSERT INTO `role` VALUES (6, NULL, '222', '222', NULL, '');
INSERT INTO `role` VALUES (7, NULL, '222', '222', NULL, '');
INSERT INTO `role` VALUES (8, NULL, '222', '222', NULL, '43434');
INSERT INTO `role` VALUES (9, NULL, '333', '333', NULL, '333');
INSERT INTO `role` VALUES (10, NULL, '323', '2323', NULL, '2323');
INSERT INTO `role` VALUES (11, 3, 'we\'we', '为wew', NULL, 'wwe\'wewe');
INSERT INTO `role` VALUES (12, 7, 'sdfsd', 'dfsdf', NULL, 'sdfsd');
INSERT INTO `role` VALUES (13, 7, 'sdfsd', 'dfsdf666', NULL, '555');
INSERT INTO `role` VALUES (14, 5, 'dfs', 'sdfsdf', NULL, 'sdfs');
INSERT INTO `role` VALUES (15, 5, '32222', '233333333', NULL, '2333');
INSERT INTO `role` VALUES (17, 14, '3434', '3434', '2022-09-04 08:16:20', '343');
INSERT INTO `role` VALUES (18, 1, '租户管理员', '管理租户的管理员', '2022-09-04 08:41:24', 'ZA');
INSERT INTO `role` VALUES (19, 1, '普通管理', '普普通通也能当管理', '2022-09-04 08:50:58', 'A');
INSERT INTO `role` VALUES (20, 14, '6666666', '75656', '2022-09-04 08:52:41', '777777');
INSERT INTO `role` VALUES (21, 14, '6666666', '75656', '2022-09-04 08:53:27', '777777');
INSERT INTO `role` VALUES (22, 14, '3434', '3434', '2022-09-04 08:55:28', '3434');
INSERT INTO `role` VALUES (23, 14, '3434343', '3434444', '2022-09-04 08:55:44', '34344444');
INSERT INTO `role` VALUES (24, 14, '3333', '343444433', '2022-09-04 08:55:56', '333');
INSERT INTO `role` VALUES (25, 14, 's\'d\'f', 'sdfsd\'f\'s\'d\'fdfsdf', '2022-09-04 08:56:39', 'sdfss\'d\'f');
INSERT INTO `role` VALUES (26, 14, '2323', '232323', '2022-09-04 08:56:48', '2323');
INSERT INTO `role` VALUES (27, 14, '2323444444444', '23232344444444', '2022-09-04 08:56:59', '232344444444');
INSERT INTO `role` VALUES (28, 14, '23234444444442', '23232344444444232', '2022-09-04 08:57:07', '232344444444123');
INSERT INTO `role` VALUES (29, 14, '2323444444444223', '232323444444442322323', '2022-09-04 08:57:15', '23234444444412323');

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
INSERT INTO `role_resource` VALUES (1, 11, NULL);
INSERT INTO `role_resource` VALUES (14, 10, NULL);
INSERT INTO `role_resource` VALUES (15, 10, NULL);
INSERT INTO `role_resource` VALUES (16, 10, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tenant
-- ----------------------------
INSERT INTO `tenant` VALUES (1, 'XAuth租户', '超级租户', '2022-08-28 19:54:45');
INSERT INTO `tenant` VALUES (2, 'eee', 'dssssssfsd', '2022-09-03 09:22:04');
INSERT INTO `tenant` VALUES (3, '34444', '4343434', '2022-09-03 09:22:54');
INSERT INTO `tenant` VALUES (4, '4444', '44444444', '2022-09-03 09:23:00');
INSERT INTO `tenant` VALUES (5, '55555', '55555555', '2022-09-03 09:23:05');
INSERT INTO `tenant` VALUES (6, '66', '6666', '2022-09-03 09:23:10');
INSERT INTO `tenant` VALUES (7, '77777', '777777', '2022-09-03 09:23:17');
INSERT INTO `tenant` VALUES (8, '8888888888', '8888888888', '2022-09-03 09:23:23');
INSERT INTO `tenant` VALUES (9, '98', '9989', '2022-09-03 09:23:30');

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
INSERT INTO `user` VALUES (1, '18328508416', '管理员', '123', '2022-09-01 11:48:06');

SET FOREIGN_KEY_CHECKS = 1;

/*
 Navicat Premium Data Transfer

 Source Server         : local_docker_mysql
 Source Server Type    : MySQL
 Source Server Version : 80028 (8.0.28)
 Source Host           : localhost:3306
 Source Schema         : logbackdemo

 Target Server Type    : MySQL
 Target Server Version : 80028 (8.0.28)
 File Encoding         : 65001

 Date: 16/09/2022 14:13:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for logback_user
-- ----------------------------
DROP TABLE IF EXISTS `logback_user`;
CREATE TABLE `logback_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of logback_user
-- ----------------------------
BEGIN;
INSERT INTO `logback_user` (`id`, `username`, `password`) VALUES (1, 'test', '123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

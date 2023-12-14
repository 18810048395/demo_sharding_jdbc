/*
 Navicat Premium Data Transfer

 Source Server         : atguigu-server-user
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : 192.168.1.36:3301
 Source Schema         : db_user

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 14/12/2023 10:54:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `uname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------

-- ----------------------------
-- Table structure for t_yh0
-- ----------------------------
DROP TABLE IF EXISTS `t_yh0`;
CREATE TABLE `t_yh0`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_yh0
-- ----------------------------
INSERT INTO `t_yh0` VALUES (1, 'test0', '2022-12-31 17:55:11');
INSERT INTO `t_yh0` VALUES (2, 'test2', '2023-03-04 17:55:12');

-- ----------------------------
-- Table structure for t_yh1
-- ----------------------------
DROP TABLE IF EXISTS `t_yh1`;
CREATE TABLE `t_yh1`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_yh1
-- ----------------------------
INSERT INTO `t_yh1` VALUES (1, 'test1', '2023-02-01 17:55:12');
INSERT INTO `t_yh1` VALUES (2, 'test3', '2023-04-13 17:55:12');

-- ----------------------------
-- Table structure for t_yh2023_1
-- ----------------------------
DROP TABLE IF EXISTS `t_yh2023_1`;
CREATE TABLE `t_yh2023_1`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_yh2023_1
-- ----------------------------
INSERT INTO `t_yh2023_1` VALUES (1, 'test0', '2023-01-07 17:30:30');

-- ----------------------------
-- Table structure for t_yh2023_2
-- ----------------------------
DROP TABLE IF EXISTS `t_yh2023_2`;
CREATE TABLE `t_yh2023_2`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_yh2023_2
-- ----------------------------
INSERT INTO `t_yh2023_2` VALUES (1, 'test1', '2023-02-12 17:30:32');

-- ----------------------------
-- Table structure for t_yh2023_3
-- ----------------------------
DROP TABLE IF EXISTS `t_yh2023_3`;
CREATE TABLE `t_yh2023_3`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_yh2023_3
-- ----------------------------
INSERT INTO `t_yh2023_3` VALUES (1, 'test2', '2023-03-06 17:30:32');

-- ----------------------------
-- Table structure for t_yh2023_4
-- ----------------------------
DROP TABLE IF EXISTS `t_yh2023_4`;
CREATE TABLE `t_yh2023_4`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_yh2023_4
-- ----------------------------
INSERT INTO `t_yh2023_4` VALUES (1, 'test3', '2023-04-06 17:30:32');

-- ----------------------------
-- Table structure for t_yh2023_5
-- ----------------------------
DROP TABLE IF EXISTS `t_yh2023_5`;
CREATE TABLE `t_yh2023_5`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_yh2023_5
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;

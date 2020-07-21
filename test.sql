/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 21/07/2020 15:06:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account`  (
  `id` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `balance` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES ('1', 'zs', 120);

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `bookid` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`bookid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES ('1', 'book01', 100);
INSERT INTO `t_book` VALUES ('2', 'book02', 60);
INSERT INTO `t_book` VALUES ('3', 'book03', 80);

-- ----------------------------
-- Table structure for t_stock
-- ----------------------------
DROP TABLE IF EXISTS `t_stock`;
CREATE TABLE `t_stock`  (
  `id` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stock` int(255) NOT NULL,
  `bookid` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_stock
-- ----------------------------
INSERT INTO `t_stock` VALUES ('1', 10, '1');
INSERT INTO `t_stock` VALUES ('2', 10, '2');
INSERT INTO `t_stock` VALUES ('3', 10, '3');

SET FOREIGN_KEY_CHECKS = 1;

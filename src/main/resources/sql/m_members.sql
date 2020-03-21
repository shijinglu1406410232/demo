/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 21/03/2020 17:25:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for m_members
-- ----------------------------
DROP TABLE IF EXISTS `m_members`;
CREATE TABLE `m_members` (
  `memberId` int(11) NOT NULL,
  `memberName` varchar(255) DEFAULT NULL,
  `memberSex` varchar(255) DEFAULT NULL,
  `memberTelePhone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`memberId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of m_members
-- ----------------------------
BEGIN;
INSERT INTO `m_members` VALUES (1, '张三', '男', '18989898924');
INSERT INTO `m_members` VALUES (2, '李小四', '女', '153770674010');
INSERT INTO `m_members` VALUES (3, '王五', '男', '153770674011');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

/*
Navicat MySQL Data Transfer

Source Server         : local3306
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : bill

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2020-09-14 16:39:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `bid` int(10) NOT NULL AUTO_INCREMENT,
  `bill_code` varchar(25) DEFAULT NULL,
  `bill_name` varchar(25) DEFAULT NULL,
  `bill_com` varchar(25) DEFAULT NULL,
  `bill_num` int(8) DEFAULT NULL,
  `money` double(8,2) DEFAULT NULL,
  `pay` int(2) DEFAULT NULL COMMENT '是否付款 0 未付款， 1已付款',
  `pid` int(10) DEFAULT NULL COMMENT '供应商id',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES ('1', 'b_001', 'ESC包年云服务', '年', '88', '50000.00', '1', '2', '2018-11-17 15:22:03');
INSERT INTO `bill` VALUES ('2', 'b_002', 'ESC包月云服务', '月', '20', '26000.00', '1', '3', '2028-11-12 11:58:00');
INSERT INTO `bill` VALUES ('3', 'b_003', 'com域名', '年', '35', '15000.00', '0', '1', '2028-11-12 11:58:00');
INSERT INTO `bill` VALUES ('4', 'b_004', 'cn域名...', '小时', '10', '7000.00', '0', '1', '2028-11-12 11:58:00');
INSERT INTO `bill` VALUES ('5', 'b_005', '团购小程序', '月', '35', '60000.00', '0', '6', '2028-11-12 11:58:00');
INSERT INTO `bill` VALUES ('13', 'b_001', 'ESC包年云服务...', '年', '39', '400000.00', '1', '3', '2020-02-24 14:00:51');

-- ----------------------------
-- Table structure for provider
-- ----------------------------
DROP TABLE IF EXISTS `provider`;
CREATE TABLE `provider` (
  `pid` int(10) NOT NULL AUTO_INCREMENT,
  `provider_code` varchar(25) DEFAULT NULL,
  `providerName` varchar(25) DEFAULT NULL,
  `people` varchar(25) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `address` varchar(60) DEFAULT NULL,
  `fax` varchar(25) DEFAULT NULL,
  `describe` varchar(100) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of provider
-- ----------------------------
INSERT INTO `provider` VALUES ('1', '1', 'A货云服务供应商 ', '小码', '1888888888 ', '广州白云区 ', '020-123456', '专业ESC服务', '2020-02-24 14:00:18');
INSERT INTO `provider` VALUES ('2', '1', 'B货域名供应商', '小域', '1888886666', '北京朝阳区', '020-112312123', '专业提供域名', '2020-02-21 23:10:16');
INSERT INTO `provider` VALUES ('3', 'P_333', 'B货小程序企鹅', '小企鹅', '1888666666', '深圳南山区', '020-123123123', '专业小程序提供', '2020-02-24 18:28:01');
INSERT INTO `provider` VALUES ('6', 'P_555', '供应商', '小张', '18888666981', '深圳软件园', '0911-0123456', '品质Aaa', '2018-11-17 12:23:12');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) DEFAULT NULL,
  `real_name` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `gender` int(1) DEFAULT NULL COMMENT '性别：1 女  2 男',
  `birthday` datetime DEFAULT NULL,
  `user_type` int(1) DEFAULT NULL COMMENT '1管理员  2经理  3普通用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'lisi', '李四', '1234', '1', '1989-03-29 00:00:00', '2');
INSERT INTO `user` VALUES ('3', 'wangwu', '王五', '1234', '2', '1993-11-08 00:00:00', '3');
INSERT INTO `user` VALUES ('4', 'zhangsan', '张三', '1234', '1', '1999-06-12 00:00:00', '3');


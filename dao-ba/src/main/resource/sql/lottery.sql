/*
Navicat MySQL Data Transfer

Source Server         : 127
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : lottery

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-08-12 18:06:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tl_banner
-- ----------------------------
DROP TABLE IF EXISTS `tl_banner`;
CREATE TABLE `tl_banner` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `img_width` int(11) DEFAULT NULL,
  `img_height` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_banner
-- ----------------------------

-- ----------------------------
-- Table structure for tl_category
-- ----------------------------
DROP TABLE IF EXISTS `tl_category`;
CREATE TABLE `tl_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(50) DEFAULT NULL COMMENT '父分类名称',
  `category_code` varchar(50) DEFAULT NULL COMMENT '父分类编号',
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_category
-- ----------------------------
INSERT INTO `tl_category` VALUES ('1', '手机数码', 'P1000', '1', '2016-08-10 15:38:50', null, null, null);

-- ----------------------------
-- Table structure for tl_img_collection
-- ----------------------------
DROP TABLE IF EXISTS `tl_img_collection`;
CREATE TABLE `tl_img_collection` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `img_title` varchar(50) DEFAULT NULL COMMENT '图片标题',
  `img_url` varchar(200) DEFAULT NULL COMMENT '图片地址',
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_img_collection
-- ----------------------------
INSERT INTO `tl_img_collection` VALUES ('8', '5', null, 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0205.JPG?imageView2/1/w/80/h/80/q/85', '1', '2016-07-26 15:21:15', null, null, null);
INSERT INTO `tl_img_collection` VALUES ('9', '5', null, 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0206.JPG?imageView2/1/w/80/h/80/q/85', '1', '2016-07-26 15:21:15', null, null, null);
INSERT INTO `tl_img_collection` VALUES ('10', '5', null, 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0207.JPG?imageView2/1/w/80/h/80/q/85', '1', '2016-07-26 15:21:15', null, null, null);
INSERT INTO `tl_img_collection` VALUES ('11', '5', null, 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0209.JPG?imageView2/1/w/80/h/80/q/85', '1', '2016-07-26 15:21:15', null, null, null);
INSERT INTO `tl_img_collection` VALUES ('12', '5', null, 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0215.JPG?imageView2/1/w/80/h/80/q/85', '1', '2016-07-26 15:21:15', null, null, null);
INSERT INTO `tl_img_collection` VALUES ('13', '5', null, 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0217.JPG?imageView2/1/w/80/h/80/q/85', '1', '2016-07-26 15:21:15', null, null, null);
INSERT INTO `tl_img_collection` VALUES ('14', '5', null, 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0218.JPG?imageView2/1/w/80/h/80/q/85', '1', '2016-07-26 15:21:15', null, null, null);

-- ----------------------------
-- Table structure for tl_participate
-- ----------------------------
DROP TABLE IF EXISTS `tl_participate`;
CREATE TABLE `tl_participate` (
  `id` bigint(20) NOT NULL,
  `pruchase_id` bigint(20) DEFAULT NULL COMMENT '期数编号',
  `user_id` bigint(20) DEFAULT NULL,
  `fraction` int(11) DEFAULT '0' COMMENT '分数',
  `participate_number` int(11) DEFAULT NULL COMMENT '参与号码',
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_participate
-- ----------------------------

-- ----------------------------
-- Table structure for tl_product
-- ----------------------------
DROP TABLE IF EXISTS `tl_product`;
CREATE TABLE `tl_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `product_desc` varchar(255) DEFAULT NULL COMMENT '商品描述',
  `product_price` double DEFAULT NULL COMMENT '商品价格',
  `is_show` int(11) DEFAULT '1' COMMENT '是否显示，默认1显示',
  `product_img` varchar(50) DEFAULT NULL COMMENT '封面图片',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `state` int(11) DEFAULT NULL COMMENT '状态信息',
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_product
-- ----------------------------
INSERT INTO `tl_product` VALUES ('5', '苹果（Apple）iPhone 6s 16G版 4G手机', '有些礼物，能瞬间抓住人心，唯一的不同，是处处都不同！（颜色随机发）', '6400', '1', null, '2016-07-26 15:21:11', null, '1', null, null);

-- ----------------------------
-- Table structure for tl_product_detail
-- ----------------------------
DROP TABLE IF EXISTS `tl_product_detail`;
CREATE TABLE `tl_product_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `detail_info` text,
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_product_detail
-- ----------------------------
INSERT INTO `tl_product_detail` VALUES ('1', '5', '<img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142414922.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142430728.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142449625.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142506208.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142523544.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142540444.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142555673.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142611240.jpg\" alt=\"\" /><img src=\"http://7vih7a.com1.z0.glb.clouddn.com/20150910142627466.jpg\" alt=\"\" />', '1', '2016-08-05 14:56:37', null, null, null);

-- ----------------------------
-- Table structure for tl_product_f
-- ----------------------------
DROP TABLE IF EXISTS `tl_product_f`;
CREATE TABLE `tl_product_f` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `category_code` varchar(50) DEFAULT NULL COMMENT '父类编号',
  `type_code` varchar(50) DEFAULT NULL COMMENT '子类编号',
  `is_hot` int(11) DEFAULT NULL COMMENT '热门推荐',
  `is_new` int(11) DEFAULT NULL COMMENT '最新商品',
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_product_f
-- ----------------------------
INSERT INTO `tl_product_f` VALUES ('5', '5', 'P1000', 'S1000', '1', '1', '1', null, null, null, null);

-- ----------------------------
-- Table structure for tl_product_img
-- ----------------------------
DROP TABLE IF EXISTS `tl_product_img`;
CREATE TABLE `tl_product_img` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `product_img` varchar(200) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_product_img
-- ----------------------------
INSERT INTO `tl_product_img` VALUES ('5', '5', 'http://7vih7a.com1.z0.glb.clouddn.com/IMG_0204.JPG-80x80', '2016-07-26 15:21:14', '1', null, null, null);

-- ----------------------------
-- Table structure for tl_prod_type
-- ----------------------------
DROP TABLE IF EXISTS `tl_prod_type`;
CREATE TABLE `tl_prod_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_code` varchar(50) DEFAULT NULL,
  `type_name` varchar(50) DEFAULT NULL,
  `type_code` varchar(50) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_prod_type
-- ----------------------------
INSERT INTO `tl_prod_type` VALUES ('2', 'P1000', '手机', 'S1000', '1', '2016-08-10 17:31:26', null, null, null);

-- ----------------------------
-- Table structure for tl_purchase_cfg
-- ----------------------------
DROP TABLE IF EXISTS `tl_purchase_cfg`;
CREATE TABLE `tl_purchase_cfg` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `periods` int(11) DEFAULT NULL COMMENT '期数',
  `total_person` int(11) DEFAULT NULL COMMENT '总人次',
  `participate` int(11) DEFAULT NULL COMMENT '已参与人数',
  `residue_person` int(11) DEFAULT NULL COMMENT '剩余人次',
  `product_id` bigint(20) DEFAULT NULL COMMENT '期数对应的产品',
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_purchase_cfg
-- ----------------------------

-- ----------------------------
-- Table structure for tl_user
-- ----------------------------
DROP TABLE IF EXISTS `tl_user`;
CREATE TABLE `tl_user` (
  `id` bigint(20) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(30) DEFAULT NULL COMMENT '手机号',
  `u_password` varchar(50) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl_user
-- ----------------------------

-- ----------------------------
-- Table structure for uc_user
-- ----------------------------
DROP TABLE IF EXISTS `uc_user`;
CREATE TABLE `uc_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `mobile_phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `gender` int(11) DEFAULT NULL COMMENT '性别',
  `birth_y` int(11) DEFAULT NULL COMMENT '生日-年',
  `birth-m` int(11) DEFAULT NULL COMMENT '生日-月',
  `birth-d` int(11) DEFAULT NULL COMMENT '生日-日',
  `constellation_id` int(11) DEFAULT NULL COMMENT '星座编号',
  `province` int(11) DEFAULT NULL COMMENT '省份',
  `city` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL COMMENT '街道',
  `qq` varchar(20) DEFAULT NULL,
  `head_img` varchar(50) DEFAULT NULL COMMENT '头像',
  `is_bind_email` varchar(50) DEFAULT NULL COMMENT '是否绑定邮箱',
  `is_bind_mobile` int(11) DEFAULT NULL COMMENT '是否绑定手机号',
  `income_m` int(11) DEFAULT NULL COMMENT '月收入',
  `remark` varchar(500) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uc_user
-- ----------------------------

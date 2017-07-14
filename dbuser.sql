/*
MySQL Data Transfer
Source Host: localhost
Source Database: dbuser
Target Host: localhost
Target Database: dbuser
Date: 2016-12-28 ÉÏÎç 08:47:20
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `_id` int(11) NOT NULL auto_increment,
  `bank_id` int(11) default NULL,
  `pwd` varchar(100) NOT NULL,
  `idcard` varchar(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `money` int(11) default NULL,
  `time` datetime default NULL,
  PRIMARY KEY  (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `user` VALUES ('1', '12', '234567', '441283199607254002', 'anne', '610', '2016-12-28 00:00:00');
INSERT INTO `user` VALUES ('2', '13', '234567', '441282199702114444', 'pon', '1048', '2016-12-28 00:00:00');
INSERT INTO `user` VALUES ('3', '15', '123456', '441283199603214002', 'john', '1000', null);
INSERT INTO `user` VALUES ('4', '14', '123456', '111111111111111111', 'anne', '100', null);

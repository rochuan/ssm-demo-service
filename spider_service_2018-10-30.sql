# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 192.168.2.47 (MySQL 5.6.40)
# Database: spider_service
# Generation Time: 2018-10-30 07:24:49 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_d_site
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_d_site`;

CREATE TABLE `t_d_site` (
  `site_id` int(11) NOT NULL AUTO_INCREMENT,
  `site_name` varchar(64) NOT NULL COMMENT '站点名字',
  `site_url` varchar(255) NOT NULL COMMENT '开始检测的主页',
  `site_code` varchar(45) NOT NULL DEFAULT '' COMMENT '英文编码',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态 1 正常 0 删除',
  `gmt_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_updated` timestamp NULL DEFAULT NULL,
  `spider_status` tinyint(11) NOT NULL DEFAULT '0' COMMENT '0 未扫瞄 1 扫描中 2 扫描完成',
  `spider_gmt_created` timestamp NULL DEFAULT NULL COMMENT '爬虫开始时间',
  `sprider_gmt_updated` timestamp NULL DEFAULT NULL COMMENT '爬虫结束时间',
  `cost_value` varchar(64) DEFAULT NULL COMMENT '耗时',
  PRIMARY KEY (`site_id`),
  UNIQUE KEY `site_name` (`site_name`),
  KEY `spider_status` (`spider_status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `t_d_site` WRITE;
/*!40000 ALTER TABLE `t_d_site` DISABLE KEYS */;

INSERT INTO `t_d_site` (`site_id`, `site_name`, `site_url`, `site_code`, `status`, `gmt_created`, `gmt_updated`, `spider_status`, `spider_gmt_created`, `sprider_gmt_updated`, `cost_value`)
VALUES
	(1,'思而科测试demo','http://silkweb.mez100.cn:8030','silk',0,'2018-09-30 15:04:58','2018-10-08 17:05:26',2,'2018-10-08 17:03:01','2018-10-08 17:05:26','0天0时2分25秒'),
	(5,'宜家手机中文版','https://m2.ikea.cn/cn/zh','ikea_m2_cn',0,'2018-10-08 15:51:47','2018-10-08 17:36:00',2,'2018-10-08 17:35:58','2018-10-08 17:36:00','0天0时0分2秒'),
	(6,'宜家','https://www.ikea.com','',0,'2018-10-08 17:17:40','2018-10-08 17:18:58',2,'2018-10-08 17:18:49','2018-10-08 17:18:58','0天0时0分9秒');

/*!40000 ALTER TABLE `t_d_site` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

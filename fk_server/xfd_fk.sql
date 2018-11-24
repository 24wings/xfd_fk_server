-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: 127.0.0.1    Database: xfd_fk
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `b_order`
--

DROP TABLE IF EXISTS `b_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `b_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `actTime` datetime DEFAULT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `buyMerchCode` varchar(255) DEFAULT NULL,
  `buyMerchName` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `operatorName` varchar(255) DEFAULT NULL,
  `operatorNo` varchar(255) DEFAULT NULL,
  `orderNo` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `afterAmount` decimal(19,2) DEFAULT NULL,
  `beforeAmount` decimal(19,2) DEFAULT NULL,
  `orderType` int(11) DEFAULT NULL,
  `cardNo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=376 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `b_order`
--

LOCK TABLES `b_order` WRITE;
/*!40000 ALTER TABLE `b_order` DISABLE KEYS */;
INSERT INTO `b_order` VALUES (375,'2018-11-03 17:27:13',400.00,'00020','w','2018-11-03 17:27:13','admin',NULL,'  339','df',2,400.00,0.00,1,'00012'),(374,'2018-11-03 17:27:13',400.00,'00020','w','2018-11-03 17:27:13','admin',NULL,'  338','df',2,0.00,3000.00,2,'00012'),(373,'2018-11-03 17:27:13',500.00,'00019','w','2018-11-03 17:27:13','admin',NULL,'  337','wwwwwwww',2,500.00,0.00,1,'00019'),(372,'2018-11-03 17:27:13',500.00,'00019','w','2018-11-03 17:27:13','admin',NULL,'  336','wwwwwwww',2,0.00,0.00,2,'00019'),(371,'2018-11-03 17:27:13',500.00,'00018','www','2018-11-03 17:27:13','admin',NULL,'  335','www.baidu.com',2,500.00,0.00,1,'00002'),(370,'2018-11-03 17:27:13',500.00,'00018','www','2018-11-03 17:27:13','admin',NULL,'  334','www.baidu.com',2,0.00,0.00,2,'00002'),(369,'2018-11-03 17:27:13',500.00,'00017','w','2018-11-03 17:27:13','admin',NULL,'  333','wwww',2,500.00,0.00,1,'00000'),(368,'2018-11-03 17:27:13',500.00,'00017','w','2018-11-03 17:27:13','admin',NULL,'  332','wwww',2,0.00,50.00,2,'00000'),(367,'2018-11-03 17:27:13',500.00,'00016','w','2018-11-03 17:27:13','admin',NULL,'  331','sfd',2,500.00,0.00,1,'00004'),(366,'2018-11-03 17:27:13',500.00,'00016','w','2018-11-03 17:27:13','admin',NULL,'  330','sfd',2,0.00,500.00,2,'00004'),(364,'2018-11-03 17:27:13',500.00,'00015','w','2018-11-03 17:27:13','admin',NULL,'  328','1dgfd',2,0.00,500.00,2,'00001'),(365,'2018-11-03 17:27:13',500.00,'00015','w','2018-11-03 17:27:13','admin',NULL,'  329','1dgfd',2,500.00,0.00,1,'00001'),(362,'2018-11-03 17:27:13',2000.00,'00013','123','2018-11-03 17:27:13','admin',NULL,'  326','123',2,0.00,2000.00,2,'123'),(363,'2018-11-03 17:27:13',2000.00,'00013','123','2018-11-03 17:27:13','admin',NULL,'  327','123',2,2000.00,0.00,1,'123'),(361,'2018-11-03 17:27:13',500.00,'00012','yj1234','2018-11-03 17:27:13','admin',NULL,'  325','123',2,500.00,0.00,1,'11111'),(360,'2018-11-03 17:27:13',500.00,'00012','yj1234','2018-11-03 17:27:13','admin',NULL,'  324','123',2,0.00,500.00,2,'11111'),(359,'2018-11-03 17:27:13',500.00,'00011','yj6','2018-11-03 17:27:13','admin',NULL,'  323','yj6',2,500.00,0.00,1,'11112'),(358,'2018-11-03 17:27:13',500.00,'00011','yj6','2018-11-03 17:27:13','admin',NULL,'  322','yj6',2,0.00,500.00,2,'11112'),(356,'2018-11-03 17:27:13',500.00,'00010','134','2018-11-03 17:27:13','admin',NULL,'  320','134',2,0.00,1000.00,2,'134'),(357,'2018-11-03 17:27:13',500.00,'00010','134','2018-11-03 17:27:13','admin',NULL,'  321','134',2,500.00,0.00,1,'134'),(355,'2018-11-03 17:27:13',500.00,'00009','yangjie','2018-11-03 17:27:13','admin',NULL,'  319','yangjie',2,500.00,0.00,1,'00001'),(354,'2018-11-03 17:27:13',500.00,'00009','yangjie','2018-11-03 17:27:13','admin',NULL,'  318','yangjie',2,0.00,500.00,2,'00001'),(353,'2018-11-03 17:27:13',500.00,'00007','w','2018-11-03 17:27:13','admin',NULL,'  317','wer123',2,500.00,0.00,1,'00001'),(349,'2018-11-03 16:33:56',50.00,'00017','w','2018-11-03 16:33:56','admin',NULL,'  313','wwww',2,50.00,2900.00,1,'00000'),(350,'2018-11-03 16:35:02',0.00,'00020','w','2018-11-03 16:35:02','admin',NULL,'  314','df',2,0.00,0.00,2,'00012'),(351,'2018-11-03 16:35:02',3000.00,'00020','w','2018-11-03 16:35:02','admin',NULL,'  315','df',2,3000.00,0.00,1,'00012'),(352,'2018-11-03 17:27:13',500.00,'00007','w','2018-11-03 17:27:13','admin',NULL,'  316','wer123',2,0.00,500.00,2,'00001'),(348,'2018-11-03 16:33:56',-2900.00,'00017','w','2018-11-03 16:33:56','admin',NULL,'  312','wwww',2,0.00,2900.00,2,'00000'),(345,'2018-11-03 15:27:07',2000.00,'00008','wer','2018-11-03 15:27:07','admin',NULL,'  309','w',2,2000.00,1000.00,1,'00003'),(346,'2018-11-03 15:53:57',-1000.00,'00017','w','2018-11-03 15:53:57','admin',NULL,'  310','wwww',2,0.00,1000.00,2,'00000'),(347,'2018-11-03 15:53:57',2900.00,'00017','w','2018-11-03 15:53:57','admin',NULL,'  311','wwww',2,2900.00,1000.00,1,'00000'),(342,'2018-11-03 15:26:43',-1.00,'00008','wer','2018-11-03 15:26:43','admin',NULL,'  306','w',2,0.00,1.00,2,'00003'),(343,'2018-11-03 15:26:43',1000.00,'00008','wer','2018-11-03 15:26:43','admin',NULL,'  307','w',2,1000.00,1.00,1,'00003'),(344,'2018-11-03 15:27:07',-1000.00,'00008','wer','2018-11-03 15:27:07','admin',NULL,'  308','w',2,0.00,1000.00,2,'00003'),(341,'2018-11-03 15:25:49',1000.00,'00010','134','2018-11-03 15:25:49','admin',NULL,'  305','134',2,1000.00,500.00,1,'134'),(340,'2018-11-03 15:25:49',-500.00,'00010','134','2018-11-03 15:25:49','admin',NULL,'  304','134',2,0.00,500.00,2,'134'),(339,'2018-11-03 13:51:48',1000.00,'00017','w','2018-11-03 13:51:48','admin',NULL,'  303','wwww',2,1000.00,0.00,1,'00000'),(337,'2018-11-03 09:54:09',500.00,'00016','w','2018-11-03 09:54:09','admin',NULL,'  301','sfd',2,500.00,0.00,1,'00004'),(338,'2018-11-03 13:51:48',0.00,'00017','w','2018-11-03 13:51:48','admin',NULL,'  302','wwww',2,0.00,0.00,2,'00000'),(336,'2018-11-03 09:54:09',500.00,'00016','w','2018-11-03 09:54:09','admin',NULL,'  300','sfd',2,0.00,500.00,2,'00004'),(335,'2018-11-03 09:54:09',500.00,'00015','w','2018-11-03 09:54:09','admin',NULL,'  299','1dgfd',2,500.00,0.00,1,'00001'),(334,'2018-11-03 09:54:09',500.00,'00015','w','2018-11-03 09:54:09','admin',NULL,'  298','1dgfd',2,0.00,500.00,2,'00001'),(333,'2018-11-03 09:54:09',2000.00,'00013','123','2018-11-03 09:54:09','admin',NULL,'  297','123',2,2000.00,0.00,1,'123'),(332,'2018-11-03 09:54:09',2000.00,'00013','123','2018-11-03 09:54:09','admin',NULL,'  296','123',2,0.00,2000.00,2,'123'),(331,'2018-11-03 09:54:09',500.00,'00012','yj1234','2018-11-03 09:54:09','admin',NULL,'  295','123',2,500.00,0.00,1,'11111'),(330,'2018-11-03 09:54:09',500.00,'00012','yj1234','2018-11-03 09:54:09','admin',NULL,'  294','123',2,0.00,500.00,2,'11111'),(329,'2018-11-03 09:54:09',500.00,'00011','yj6','2018-11-03 09:54:09','admin',NULL,'  293','yj6',2,500.00,0.00,1,'11112'),(328,'2018-11-03 09:54:09',500.00,'00011','yj6','2018-11-03 09:54:09','admin',NULL,'  292','yj6',2,0.00,500.00,2,'11112'),(327,'2018-11-03 09:54:09',500.00,'00010','134','2018-11-03 09:54:09','admin',NULL,'  291','134',2,500.00,0.00,1,'134'),(325,'2018-11-03 09:54:09',500.00,'00009','yangjie','2018-11-03 09:54:09','admin',NULL,'  289','yangjie',2,500.00,0.00,1,'00001'),(326,'2018-11-03 09:54:09',500.00,'00010','134','2018-11-03 09:54:09','admin',NULL,'  290','134',2,0.00,500.00,2,'134'),(323,'2018-11-03 09:54:09',500.00,'00007','w','2018-11-03 09:54:09','admin',NULL,'  287','wer123',2,500.00,0.00,1,'00001'),(324,'2018-11-03 09:54:09',500.00,'00009','yangjie','2018-11-03 09:54:09','admin',NULL,'  288','yangjie',2,0.00,500.00,2,'00001'),(322,'2018-11-03 09:54:09',500.00,'00007','w','2018-11-03 09:54:09','admin',NULL,'  286','wer123',2,0.00,500.00,2,'00001');
/*!40000 ALTER TABLE `b_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Card`
--

DROP TABLE IF EXISTS `Card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardNo` varchar(255) DEFAULT NULL COMMENT '鍗″彿',
  `cardStatus` int(11) DEFAULT NULL,
  `merchNo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Card`
--

LOCK TABLES `Card` WRITE;
/*!40000 ALTER TABLE `Card` DISABLE KEYS */;
INSERT INTO `Card` VALUES (16,'00009',0,'00015'),(15,'00008',0,'00014'),(14,'123',0,'00013'),(13,'1245',0,'00012'),(12,'11111',0,'00011'),(11,'134',0,'00010'),(10,'00001',0,'00009'),(9,'00003',0,'00008'),(17,'00004',0,'00016'),(18,'00000',0,'00017'),(19,'00002',0,'00018'),(20,'00019',0,'00019'),(21,'00012',0,'00020');
/*!40000 ALTER TABLE `Card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Member`
--

DROP TABLE IF EXISTS `Member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(11,0) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `mealCardNo` varchar(255) DEFAULT NULL,
  `memberStatus` int(11) DEFAULT NULL,
  `mobile` varchar(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `org_orgId` int(11) DEFAULT NULL,
  `monthMoney` decimal(19,2) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile_UNIQUE` (`mobile`),
  KEY `FKq9dk1eymjdh482gaiv8qhkedc` (`org_orgId`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Member`
--

LOCK TABLES `Member` WRITE;
/*!40000 ALTER TABLE `Member` DISABLE KEYS */;
INSERT INTO `Member` VALUES (9,2000,'00008','2018-11-03 15:36:33','00003',1,'13464576757','wer','w',NULL,100.00,5),(8,500,'00007','2018-11-03 09:11:57','00001',0,'13425673469','w','wer123',NULL,100.00,5),(10,500,'00009','2018-10-29 17:38:44','00001',0,'13419597065','yangjie','yangjie',NULL,100.00,5),(11,500,'00010','2018-10-29 17:40:39','134',0,'13419597066','134','134',NULL,200.00,5),(12,500,'00011','2018-10-31 16:51:48','11112',0,'13419697063','yj6','yj6',NULL,2.00,5),(13,500,'00012','2018-11-02 14:08:55','11111',0,'13419591234','yj1234','123',NULL,NULL,5),(14,2000,'00013','2018-11-01 08:55:07','123',0,'13419597090','123','123',NULL,NULL,6),(16,500,'00015','2018-11-03 09:19:05','00001',0,'13419597091','w','1dgfd',NULL,NULL,5),(17,500,'00016','2018-11-03 09:27:48','00004',0,'13594869864','w','sfd',NULL,NULL,5),(18,500,'00017','2018-11-03 13:52:49','00000',0,'13494869864','w','wwww',NULL,NULL,5),(19,500,'00018','2018-11-03 15:52:04','00002',0,'13409243857','www','www.baidu.com',NULL,NULL,5),(20,500,'00019','2018-11-03 15:55:34','00019',0,'13948530054','w','wwwwwwww',NULL,NULL,5),(21,400,'00020','2018-11-03 16:34:15','00012',0,'13546454967','w','df',NULL,NULL,7);
/*!40000 ALTER TABLE `Member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MemberGroup`
--

DROP TABLE IF EXISTS `MemberGroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `MemberGroup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `monthMoney` decimal(19,2) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_qxnwku92c7397ppk34ck4qc10` (`name`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MemberGroup`
--

LOCK TABLES `MemberGroup` WRITE;
/*!40000 ALTER TABLE `MemberGroup` DISABLE KEYS */;
INSERT INTO `MemberGroup` VALUES (5,500.00,'普通员工'),(6,2000.00,'高级员工'),(7,400.00,'基础员工'),(8,1234.00,'dvgddfgf');
/*!40000 ALTER TABLE `MemberGroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Menu`
--

DROP TABLE IF EXISTS `Menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Menu` (
  `menuId` int(11) NOT NULL AUTO_INCREMENT,
  `badge` int(11) DEFAULT NULL,
  `badge_dot` bit(1) DEFAULT NULL,
  `badge_status` varchar(255) DEFAULT NULL,
  `config` int(11) DEFAULT NULL,
  `creatorId` int(11) DEFAULT NULL,
  `externalink` varchar(255) DEFAULT NULL,
  `hide` bit(1) DEFAULT NULL,
  `i18n` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `menuCode` int(11) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `reuse` int(11) DEFAULT NULL,
  `roleIds` varchar(255) DEFAULT NULL,
  `shortcut` int(11) DEFAULT NULL,
  `shortcut_root` int(11) DEFAULT NULL,
  `target` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `isSystem` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`menuId`)
) ENGINE=MyISAM AUTO_INCREMENT=396 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Menu`
--

LOCK TABLES `Menu` WRITE;
/*!40000 ALTER TABLE `Menu` DISABLE KEYS */;
INSERT INTO `Menu` VALUES (100,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,'系统设置',1),(101,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/user',NULL,100,NULL,NULL,NULL,NULL,NULL,'用户管理',1),(105,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,101,NULL,NULL,NULL,NULL,NULL,'用户添加',1),(106,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,101,NULL,NULL,NULL,NULL,NULL,'用户更新',1),(107,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,16,101,NULL,NULL,NULL,NULL,NULL,'用户删除',1),(108,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,101,NULL,NULL,NULL,NULL,NULL,'用户查询',1),(102,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/org',NULL,100,NULL,NULL,NULL,NULL,NULL,'组织管理',1),(110,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,102,NULL,NULL,NULL,NULL,NULL,'组织添加',1),(111,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,102,NULL,NULL,NULL,NULL,NULL,'组织更新',1),(112,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,16,102,NULL,NULL,NULL,NULL,NULL,'组织删除',1),(113,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,102,NULL,NULL,NULL,NULL,NULL,'组织查询',1),(378,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,23,377,NULL,NULL,NULL,NULL,NULL,'角色添加',1),(103,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/role',NULL,100,NULL,NULL,NULL,NULL,NULL,'角色管理',1),(153,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,16,150,NULL,NULL,NULL,NULL,NULL,'删除',1),(104,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/menu',NULL,100,NULL,NULL,NULL,NULL,NULL,'菜单管理',1),(160,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,104,NULL,NULL,NULL,NULL,NULL,'菜单添加',1),(161,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,104,NULL,NULL,NULL,NULL,NULL,'菜单更新',1),(162,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,16,104,NULL,NULL,NULL,NULL,NULL,'菜单删除',1),(163,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,104,NULL,NULL,NULL,NULL,NULL,'菜单查询',1),(120,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,'会员操作',1),(121,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/member',NULL,120,NULL,NULL,NULL,NULL,NULL,'会员开户',1),(122,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,121,NULL,NULL,NULL,NULL,NULL,'会员添加',1),(123,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,121,NULL,NULL,NULL,NULL,NULL,'会员更新',1),(124,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,16,121,NULL,NULL,NULL,NULL,NULL,'会员删除',1),(125,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,121,NULL,NULL,NULL,NULL,NULL,'会员查询',1),(126,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2048,121,NULL,NULL,NULL,NULL,NULL,'会员充值',1),(130,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/order',NULL,120,NULL,NULL,NULL,NULL,NULL,'订单查询',1),(131,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,130,NULL,NULL,NULL,NULL,NULL,'添加',1),(140,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/reset-record',NULL,120,NULL,NULL,NULL,NULL,NULL,'全部充值记录',1),(144,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,140,NULL,NULL,NULL,NULL,NULL,'查询',1),(154,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,150,NULL,NULL,NULL,NULL,NULL,'查询',1),(385,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,103,NULL,NULL,NULL,NULL,NULL,'角色添加',0),(379,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/analyze',NULL,120,NULL,NULL,NULL,NULL,NULL,'统计分析',1),(381,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/xfd_fk/admin/user/dynamic-menu/member-group',2,120,NULL,NULL,NULL,NULL,NULL,'会员分组',0),(382,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',2,381,NULL,NULL,NULL,NULL,NULL,'分组添加',0),(384,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',4,381,NULL,NULL,NULL,NULL,NULL,'会员更新',0),(386,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,103,NULL,NULL,NULL,NULL,NULL,'角色更新',0),(387,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,16,103,NULL,NULL,NULL,NULL,NULL,'角色删除',0),(395,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,381,NULL,NULL,NULL,NULL,NULL,'分组修改',0);
/*!40000 ALTER TABLE `Menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metaField`
--

DROP TABLE IF EXISTS `metaField`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `metaField` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alias` varchar(255) DEFAULT NULL,
  `config` varchar(800) DEFAULT NULL,
  `displayWidth` int(11) DEFAULT NULL,
  `fieldName` varchar(20) NOT NULL,
  `fieldType` varchar(10) NOT NULL,
  `isQuery` bit(1) NOT NULL,
  `isShow` bit(1) NOT NULL,
  `isUpdate` bit(1) NOT NULL,
  `objectCode` varchar(20) NOT NULL,
  `placeholder` varchar(200) DEFAULT NULL,
  `presetValue` varchar(200) DEFAULT NULL,
  `recno` int(11) DEFAULT NULL,
  `metaId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa07p7hamrdfxkpkkxob1qlwgp` (`metaId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metaField`
--

LOCK TABLES `metaField` WRITE;
/*!40000 ALTER TABLE `metaField` DISABLE KEYS */;
/*!40000 ALTER TABLE `metaField` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metaObject`
--

DROP TABLE IF EXISTS `metaObject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `metaObject` (
  `metaId` int(11) NOT NULL AUTO_INCREMENT,
  `bizIntercept` varchar(255) DEFAULT NULL,
  `config` varchar(800) DEFAULT NULL,
  `defaultOrder` varchar(20) DEFAULT NULL,
  `filter` varchar(500) DEFAULT NULL,
  `groupName` varchar(255) NOT NULL,
  `isCelledit` bit(1) DEFAULT NULL,
  `isFirstLoad` bit(1) DEFAULT NULL,
  `isShowNum` bit(1) DEFAULT NULL,
  `isSingle` bit(1) DEFAULT NULL,
  `objectCode` varchar(20) NOT NULL,
  `objectName` varchar(50) DEFAULT NULL,
  `parentKey` varchar(50) DEFAULT NULL,
  `pkKey` varchar(50) NOT NULL,
  `querySql` varchar(4000) NOT NULL,
  `tableName` varchar(50) NOT NULL,
  PRIMARY KEY (`metaId`),
  UNIQUE KEY `UKe5bwoynqjjxgo22h2bnvoudnd` (`objectCode`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metaObject`
--

LOCK TABLES `metaObject` WRITE;
/*!40000 ALTER TABLE `metaObject` DISABLE KEYS */;
/*!40000 ALTER TABLE `metaObject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `No`
--

DROP TABLE IF EXISTS `No`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `No` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `currentKey` varchar(255) DEFAULT NULL,
  `currentValue` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `No`
--

LOCK TABLES `No` WRITE;
/*!40000 ALTER TABLE `No` DISABLE KEYS */;
INSERT INTO `No` VALUES (1,'memberCode',20),(2,'orderNo',339);
/*!40000 ALTER TABLE `No` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Org`
--

DROP TABLE IF EXISTS `Org`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Org` (
  `orgId` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` datetime DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `creatorId` int(11) DEFAULT NULL,
  `orgName` varchar(255) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`orgId`)
) ENGINE=MyISAM AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Org`
--

LOCK TABLES `Org` WRITE;
/*!40000 ALTER TABLE `Org` DISABLE KEYS */;
INSERT INTO `Org` VALUES (2,'2018-10-26 16:13:23','系统内置',NULL,'管理员组织',1),(3,'2018-10-24 19:57:31','系统内置',NULL,'供应商',1),(4,'2018-10-24 19:57:31','系统内置',NULL,'发行商',1),(69,'2018-11-02 09:14:01','超级开发者',NULL,'发行商',1),(1,NULL,'系统',NULL,'系统',0);
/*!40000 ALTER TABLE `Org` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ResetRecord`
--

DROP TABLE IF EXISTS `ResetRecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ResetRecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(19,2) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `operatorName` varchar(255) DEFAULT NULL,
  `operatorNo` varchar(255) DEFAULT NULL,
  `relationMemberNames` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ResetRecord`
--

LOCK TABLES `ResetRecord` WRITE;
/*!40000 ALTER TABLE `ResetRecord` DISABLE KEYS */;
INSERT INTO `ResetRecord` VALUES (1,100.00,'2018-10-24 09:58:57',NULL,NULL,NULL),(2,200.00,'2018-10-24 16:01:25',NULL,NULL,NULL),(3,300.00,'2018-10-24 16:01:47',NULL,NULL,NULL),(4,100.00,'2018-10-24 19:37:08',NULL,NULL,NULL),(5,1.00,'2018-10-24 21:28:58',NULL,NULL,NULL),(6,10.00,'2018-10-24 21:32:11',NULL,NULL,NULL),(7,10.00,'2018-10-24 21:32:44',NULL,NULL,NULL),(8,10.00,'2018-10-24 21:33:31',NULL,NULL,NULL),(9,900.00,'2018-10-24 21:34:00',NULL,NULL,NULL),(10,100.00,'2018-10-24 21:34:50',NULL,NULL,NULL),(11,8080.00,'2018-10-24 21:34:58',NULL,NULL,NULL),(12,10.00,'2018-10-24 22:21:24','admin',NULL,NULL),(13,100.00,'2018-10-25 10:20:25','admin',NULL,NULL),(14,1000.00,'2018-10-25 10:22:14','admin',NULL,NULL),(15,10.00,'2018-10-25 10:22:50','admin',NULL,NULL),(16,100.00,'2018-10-25 11:18:02','admin',NULL,NULL),(17,100.00,'2018-10-26 16:00:49','admin',NULL,NULL),(18,100.00,'2018-10-26 17:03:41','admin',NULL,NULL),(19,NULL,'2018-11-01 09:37:11','admin',NULL,NULL),(20,NULL,'2018-11-01 10:18:20','admin',NULL,NULL),(21,NULL,'2018-11-02 13:20:35','admin',NULL,NULL),(22,NULL,'2018-11-02 13:48:02','admin',NULL,NULL),(23,NULL,'2018-11-02 13:52:10','admin',NULL,NULL),(24,NULL,'2018-11-02 15:32:42','admin',NULL,NULL),(25,NULL,'2018-11-02 15:32:51','admin',NULL,NULL),(26,NULL,'2018-11-02 15:33:03','admin',NULL,NULL),(27,NULL,'2018-11-02 15:33:11','admin',NULL,NULL),(28,NULL,'2018-11-03 09:01:22','admin',NULL,NULL),(29,NULL,'2018-11-03 09:05:49','admin',NULL,NULL),(30,NULL,'2018-11-03 09:41:36','admin',NULL,NULL),(31,NULL,'2018-11-03 09:54:09','admin',NULL,NULL),(32,NULL,'2018-11-03 17:27:13','admin',NULL,NULL);
/*!40000 ALTER TABLE `ResetRecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Role`
--

DROP TABLE IF EXISTS `Role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` datetime DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `creatorId` int(11) DEFAULT NULL,
  `menuIds` varchar(255) DEFAULT NULL,
  `orgId` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `roleCode` varchar(255) DEFAULT NULL,
  `roleName` varchar(255) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=MyISAM AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Role`
--

LOCK TABLES `Role` WRITE;
/*!40000 ALTER TABLE `Role` DISABLE KEYS */;
INSERT INTO `Role` VALUES (100,'2018-11-03 15:40:51',NULL,NULL,'100,101,105,106,107,108,102,110,111,112,113,103,385,386,387,104,160,161,162,163,120,121,122,123,124,125,126,395,130,131,388,140,144,379,381,382,384',3,NULL,'developer','开发者',NULL),(101,'2018-10-24 19:57:31',NULL,NULL,'120,150,151,152,153,154,121,122,123,124,125,126,130,131,132,133,134,140,141,142,143,144',2,NULL,'admin','管理员',NULL),(103,NULL,NULL,NULL,'100,101,105,106,107,108,102,110,111,112,113,104,160,161,162,163,164,120,150,151,152,153,154,121,122,123,124,125,126,130,131,132,133,134,140,141,142,143,144,103,378',3,NULL,'userS','用户',NULL);
/*!40000 ALTER TABLE `Role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` datetime DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `creatorId` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `orgId` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `roleIds` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `userName` varchar(25) NOT NULL,
  PRIMARY KEY (`id`,`userName`),
  UNIQUE KEY `userName_UNIQUE` (`userName`)
) ENGINE=MyISAM AUTO_INCREMENT=178 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,'2018-10-24 20:10:13',NULL,NULL,'超级开发者',1,'admin','100','Active','2018-10-24 20:10:13','admin'),(3,'2018-10-24 20:11:55',NULL,NULL,'管理员',2,'123s','101','Active','2018-10-24 20:11:55','admin2'),(174,'2018-10-26 16:06:47',NULL,NULL,'1',2,'123','101','Active','2018-10-26 16:06:47','w'),(175,'2018-10-25 11:06:39',NULL,NULL,'1',2,'123','103','Active','2018-10-25 11:06:39','1'),(176,'2018-11-02 15:27:36',NULL,NULL,'wan',1,'123456','100','Active','2018-11-02 15:27:36','wan'),(177,'2018-11-03 13:39:39',NULL,NULL,'w',3,'123456','100','Active','2018-11-03 13:39:39','123');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'xfd_fk'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-06 11:33:51

/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.0.18-nt : Database - goodsdbms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`goodsdbms` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `goodsdbms`;

/*Table structure for table `tb_carmessage` */

DROP TABLE IF EXISTS `tb_carmessage`;

CREATE TABLE `tb_carmessage` (
  `id` smallint(6) NOT NULL auto_increment,
  `tradeMark` varchar(30) collate utf8_unicode_ci default NULL,
  `brand` varchar(30) collate utf8_unicode_ci default NULL,
  `style` varchar(30) collate utf8_unicode_ci default NULL,
  `carLoad` varchar(30) collate utf8_unicode_ci default NULL,
  `driverName` varchar(30) collate utf8_unicode_ci default NULL,
  `licenseNumber` varchar(30) collate utf8_unicode_ci default NULL,
  `linkPhone` varchar(11) collate utf8_unicode_ci default NULL,
  `isGo` varchar(2) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_carmessage` */

insert  into `tb_carmessage`(`id`,`tradeMark`,`brand`,`style`,`carLoad`,`driverName`,`licenseNumber`,`linkPhone`,`isGo`) values (1,'11','11','大卡','11','11','11','11','0'),(2,'22','22','大卡','22','22','22','22','no');

/*Table structure for table `tb_customer` */

DROP TABLE IF EXISTS `tb_customer`;

CREATE TABLE `tb_customer` (
  `id` smallint(6) NOT NULL auto_increment,
  `name` varchar(12) collate utf8_unicode_ci default NULL,
  `password` varchar(20) collate utf8_unicode_ci default NULL,
  `email` varchar(50) collate utf8_unicode_ci default NULL,
  `gender` varchar(2) collate utf8_unicode_ci default NULL,
  `phone` varchar(11) collate utf8_unicode_ci default NULL,
  `rank` smallint(1) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_customer` */

insert  into `tb_customer`(`id`,`name`,`password`,`email`,`gender`,`phone`,`rank`) values (1,'admin','admin',NULL,NULL,NULL,1),(2,'user','user',NULL,NULL,NULL,0),(3,'lisi',NULL,'11','male','110',0);

/*Table structure for table `tb_goodsmeg` */

DROP TABLE IF EXISTS `tb_goodsmeg`;

CREATE TABLE `tb_goodsmeg` (
  `id` smallint(6) NOT NULL auto_increment,
  `goodsName` varchar(20) collate utf8_unicode_ci default NULL,
  `goodsNumber` varchar(20) collate utf8_unicode_ci default NULL,
  `goodsUnit` varchar(20) collate utf8_unicode_ci default NULL,
  `startProvince` varchar(20) collate utf8_unicode_ci default NULL,
  `startCity` varchar(20) collate utf8_unicode_ci default NULL,
  `endProvince` varchar(20) collate utf8_unicode_ci default NULL,
  `endCity` varchar(20) collate utf8_unicode_ci default NULL,
  `transportTime` varchar(20) collate utf8_unicode_ci default NULL,
  `transportStyle` varchar(20) collate utf8_unicode_ci default NULL,
  `linkPhone` varchar(11) collate utf8_unicode_ci default NULL,
  `linkMan` varchar(20) collate utf8_unicode_ci default NULL,
  `isGo` varchar(2) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_goodsmeg` */

insert  into `tb_goodsmeg`(`id`,`goodsName`,`goodsNumber`,`goodsUnit`,`startProvince`,`startCity`,`endProvince`,`endCity`,`transportTime`,`transportStyle`,`linkPhone`,`linkMan`,`isGo`) values (1,'22','22','吨','22','22','22','22','22','短途','22','22','0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;

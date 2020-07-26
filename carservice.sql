/*
SQLyog Ultimate v11.33 (32 bit)
MySQL - 5.0.24-community-nt : Database - carservice
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`carservice` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `carservice`;

/*Table structure for table `jobcarddetails` */

DROP TABLE IF EXISTS `jobcarddetails`;

CREATE TABLE `jobcarddetails` (
  `Job_no` varchar(10) NOT NULL default '',
  `V_no` varchar(12) default NULL,
  `V_model` varchar(20) default NULL,
  `Kms` bigint(20) default NULL,
  `C_name` varchar(30) default NULL,
  `Contact` bigint(12) default NULL,
  `Date` varchar(15) default NULL,
  `Time_in` varchar(10) default NULL,
  `Time_out` varchar(10) default NULL,
  `Fuel` varchar(5) default NULL,
  PRIMARY KEY  (`Job_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `jobwork` */

DROP TABLE IF EXISTS `jobwork`;

CREATE TABLE `jobwork` (
  `Job_no` varchar(10) NOT NULL default '',
  `Works` varchar(1000) default NULL,
  PRIMARY KEY  (`Job_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

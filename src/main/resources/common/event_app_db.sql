-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.19 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for ino_event_app_original
DROP DATABASE IF EXISTS `ino_event_app_original`;
CREATE DATABASE IF NOT EXISTS `ino_event_app_original` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ino_event_app_original`;

-- Dumping structure for table ino_event_app_original.city
DROP TABLE IF EXISTS `city`;
CREATE TABLE IF NOT EXISTS `city` (
  `ID` int NOT NULL,
  `CITY` varchar(100) DEFAULT NULL,
  `DISTRICT_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CITY_DISTRICT` (`DISTRICT_ID`),
  CONSTRAINT `FK_CITY_DISTRICT` FOREIGN KEY (`DISTRICT_ID`) REFERENCES `disctrict` (`ID`)
);

-- Dumping data for table ino_event_app_original.city: ~0 rows (approximately)
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
/*!40000 ALTER TABLE `city` ENABLE KEYS */;

-- Dumping structure for table ino_event_app_original.country
DROP TABLE IF EXISTS `country`;
CREATE TABLE IF NOT EXISTS `country` (
  `ID` int NOT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
);

-- Dumping data for table ino_event_app_original.country: ~0 rows (approximately)
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
/*!40000 ALTER TABLE `country` ENABLE KEYS */;

-- Dumping structure for table ino_event_app_original.disctrict
DROP TABLE IF EXISTS `disctrict`;
CREATE TABLE IF NOT EXISTS `disctrict` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL DEFAULT '',
  `STATE_ID` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `FK_DISTRICT_STATE` (`STATE_ID`),
  CONSTRAINT `FK_DISTRICT_STATE` FOREIGN KEY (`STATE_ID`) REFERENCES `state` (`ID`)
);

-- Dumping structure for table ino_event_app_original.role
DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `ID` int NOT NULL,
  `NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
);

-- Dumping data for table ino_event_app_original.role: ~4 rows (approximately)
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`ID`, `NAME`) VALUES
	(1, 'COUNTRY_CCORDINATOR'),
	(2, 'STATE_COORDINATOR'),
	(3, 'ZONAL_COORDINATOR'),
	(4, 'DISTRICT_COORDINATOR');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

-- Dumping structure for table ino_event_app_original.state
DROP TABLE IF EXISTS `state`;
CREATE TABLE IF NOT EXISTS `state` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL DEFAULT '',
  `ZONE_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_STATE_ZONE` (`ZONE_ID`),
  CONSTRAINT `FK_STATE_ZONE` FOREIGN KEY (`ZONE_ID`) REFERENCES `zone` (`ID`)
);

-- Dumping structure for table ino_event_app_original.status
DROP TABLE IF EXISTS `status`;
CREATE TABLE IF NOT EXISTS `status` (
  `ID` int NOT NULL,
  `NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
);

-- Dumping data for table ino_event_app_original.status: ~4 rows (approximately)
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` (`ID`, `NAME`) VALUES
	(1, 'PENDING_VERIFICATION'),
	(2, 'VERIFIED'),
	(3, 'ACTIVE'),
	(4, 'DELETED');
/*!40000 ALTER TABLE `status` ENABLE KEYS */;

-- Dumping structure for table ino_event_app_original.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `ID` int NOT NULL,
  `EMAIL` varchar(200) NOT NULL,
  `TOKEN` varchar(200) NOT NULL,
  `FIRST_NAME` varchar(200) NOT NULL,
  `MIDDLE_NAME` varchar(200) NOT NULL,
  `LAST_NAME` varchar(200) NOT NULL,
  `DOB` timestamp NOT NULL,
  `ADDRESS` varchar(500) NOT NULL,
  `PINCODE` varchar(500) NOT NULL,
  `CITY_ID` int NOT NULL,
  `STATUS` int NOT NULL,
  `ROLE` int NOT NULL,
  `CREATED_ON` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATED_ON` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FK_USER_ROLE` (`ROLE`),
  KEY `FK_USER_STATUS` (`STATUS`),
  KEY `FK_USER_CITY` (`CITY_ID`),
  CONSTRAINT `FK_USER_CITY` FOREIGN KEY (`CITY_ID`) REFERENCES `city` (`ID`)
);

-- Dumping data for table ino_event_app_original.user: ~0 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table ino_event_app_original.zone
DROP TABLE IF EXISTS `zone`;
CREATE TABLE IF NOT EXISTS `zone` (
  `ID` int NOT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `COUNTRY_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ZONE_COUNTRY` (`COUNTRY_ID`),
  CONSTRAINT `FK_ZONE_COUNTRY` FOREIGN KEY (`COUNTRY_ID`) REFERENCES `country` (`ID`)
);

-- Dumping data for table ino_event_app_original.zone: ~0 rows (approximately)
/*!40000 ALTER TABLE `zone` DISABLE KEYS */;
/*!40000 ALTER TABLE `zone` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

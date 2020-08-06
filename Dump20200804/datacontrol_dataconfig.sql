-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: datacontrol
-- ------------------------------------------------------
-- Server version	8.0.11

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
-- Table structure for table `dataconfig`
--

DROP TABLE IF EXISTS `dataconfig`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `dataconfig` (
  `ID` varchar(17) NOT NULL,
  `filename` varchar(100) DEFAULT NULL,
  `serversrc` varchar(100) DEFAULT NULL,
  `portserver` int(11) DEFAULT NULL,
  `usernamesrc` varchar(50) DEFAULT NULL,
  `passwordsrc` varchar(50) DEFAULT NULL,
  `remotePath` varchar(100) DEFAULT NULL,
  `localdes` varchar(50) DEFAULT NULL,
  `serverdb` varchar(100) DEFAULT NULL,
  `usernamedb` varchar(50) DEFAULT NULL,
  `passwordsdb` varchar(50) DEFAULT NULL,
  `db_target` varchar(45) DEFAULT NULL,
  `table_target` varchar(45) DEFAULT NULL,
  `temm_target` varchar(45) DEFAULT NULL,
  `db_config` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dataconfig`
--

LOCK TABLES `dataconfig` WRITE;
/*!40000 ALTER TABLE `dataconfig` DISABLE KEYS */;
INSERT INTO `dataconfig` VALUES ('1','sinhvien','drive.ecepvn.org',2227,'guest_access','123456','/volume1/ECEP/song.nguyen/DW_2020/data','C:\\\\Users\\\\Tuong Tu\\\\Desktop\\\\copy','jdbc:mysql://localhost/datacontrol','root','123456','sinhvien','stagging','temp','datacontrol');
/*!40000 ALTER TABLE `dataconfig` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-04 22:48:12

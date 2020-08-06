-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: sinhvien
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
-- Table structure for table `datawarehouse`
--

DROP TABLE IF EXISTS `datawarehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `datawarehouse` (
  `STT` varchar(50) DEFAULT NULL,
  `Mã SV` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Họ lót` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Tên` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Ngày sinh` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Mã Lớp` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Tên Lớp` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ĐT liên lạc` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Email` varchar(31) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Quê quán` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Ghi chú` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`Mã SV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datawarehouse`
--

LOCK TABLES `datawarehouse` WRITE;
/*!40000 ALTER TABLE `datawarehouse` DISABLE KEYS */;
INSERT INTO `datawarehouse` VALUES ('1','1210225','Nguyễn Thiên','Nam','1994-11-05','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Đăk Lăk',NULL),('2','1210229','Phan Trần Bảo','Tuấn','1994-04-08','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Cần Thơ',NULL),('39','1210384','Nguyễn Thị Minh','Hiền','1994-05-17','DH37DC001','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('40','1210390','Lê Văn','Lập','1990-01-11','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Long An',NULL),('41','1210407','Nguyễn Ngọc','Tân','1994-03-28','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Tiền Giang',NULL),('42','1211583','Nguyễn Đức','Huy','1991-10-01','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Vĩnh Long',NULL),('43','1211600','Võ Nguyễn Hạnh','Uyên','1994-10-16','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('44','1310021','Kon Sa Ha','Nai','1992-02-20','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('3','1310415','Trần Duy','Bảo','1995-10-27','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('4','1310429','Nguyễn Minh','Hội','1995-01-01','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Đồng Nai',NULL),('5','1310433','Bùi Trần Thiên','Hoan','1988-04-23','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Quảng Ngãi',NULL),('6','1310442','Huỳnh Lê','Khang','1995-10-08','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Cần Thơ',NULL),('7','1310443','Phan Minh Anh','Khoa','1995-01-10','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('8','1310449','Điệp Văn','Lâm','1995-08-01','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Đồng Nai',NULL),('9','1310450','Hồ Ngọc','Linh','1995-01-02','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Cần Thơ',NULL),('10','1310451','Đặng Hải','Long','1994-04-27','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('11','1310452','Hoàng Cao','Lộc','1995-10-23','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('12','1310458','Phan Bảo','Luân','1995-09-08','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Tây Ninh',NULL),('13','1310462','Trần Văn','Nam','1995-02-07','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('14','1310471','Nguyễn Thị Kim','Nga','1995-09-03','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Thừa Thiên Huế',NULL),('15','1310474','Bùi','Phát','1995-11-06','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Thái Bình',NULL),('16','1310477','Tou Tiang Sam','Pô','1995-05-05','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Tây Ninh',NULL),('17','1310480','Trương Việt','Quang','1995-08-27','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Cần Thơ',NULL),('18','1310487','Phạm Trường','Sơn','1994-04-10','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Quảng Ngãi',NULL),('19','1310503','Nguyễn Đình','Trọng','1994-02-19','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('20','1310504','Mai Văn','Tiến','1994-04-03','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Tiền Giang',NULL),('21','1310505','Phan Nguyễn Nhựt','Trường','1995-12-25','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('22','1310507','Nguyễn Ngọc','Thuận','1995-09-10','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Tp.Hồ Chí Minh',NULL),('23','1310510','Bùi Đình','Thuận','1995-07-30','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('24','1310514','Nguyễn Tiến','Thiện','1995-11-08','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Phú Yên',NULL),('25','1310515','Phạm Trung','Vĩ','1995-05-24','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Lâm Đồng',NULL),('26','1310517','Lê Trường','Vinh','1993-07-02','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Phú Yên',NULL),('27','1310521','La Triều','Vỹ','1995-10-30','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('45','1310896','Văn Công Tuấn','Anh','1995-02-06','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Tiền Giang',NULL),('46','1310900','K\'','Brên','1993-06-10','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Đồng Nai',NULL),('47','1310903','Nguyễn Thành','Công','1995-10-08','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Khánh Hòa',NULL),('48','1310907','Nguyễn Thị Mỹ','Dung','1995-07-16','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Quảng Ngãi',NULL),('49','1310910','Trần Đình','Đạt','1995-05-10','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Khánh Hòa',NULL),('50','1310914','Trần Văn','Đức','1995-08-16','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Gia Lai',NULL),('51','1310915','Huỳnh Thị Lâm','Đa','1995-03-08','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Quảng Ngãi',NULL),('52','1310926','Nguyễn Văn','Hùng','1994-04-15','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Hà Tĩnh',NULL),('53','1310927','Trịnh ÁNh','Hằng','1994-05-10','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Phú Yên',NULL),('54','1310947','Đặng Thị Kim','Hương','1995-06-25','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Quảng Ngãi',NULL),('55','1310953','Phan Văn','Hùng','1995-03-23','DH37DC002','Công nghệ sinh học','911507894','dovanc@gmail.com.vn','Quảng Bình',NULL),('28','1312714','Phan Văn','Cường','1994-04-20','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Gia Lai',NULL),('29','1312715','Lãnh Hoàng','Duy','1990-02-28','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('30','1312718','Nguyễn Văn','Đời','1994-02-20','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('31','1312723','Lê Trọng','Khánh','1993-02-17','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Bến Tre',NULL),('32','1312724','Lý Anh','Khoa','1995-11-26','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Đồng Nai',NULL),('33','1312726','Đỗ Phi','Long','1995-12-30','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Quảng Nam',NULL),('34','1312728','Cao Hữu Quốc','Nguyên','1995-04-03','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL),('35','1312730','Hồ Ngọc','Phước','1993-03-03','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Bến Tre',NULL),('36','1312735','Hồ Trọng','Tín','1989-01-29','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Gia Lai',NULL),('37','1312736','Lê Thanh','Tùng','1994-06-04','DH37DC001','Công nghệ kỹ thuật điện tử, truyền thông','911507894','dovanc@gmail.com.vn','Bình Dương',NULL),('38','1312861','Đỗ Khánh','Hưng','1995-05-10','DH37DC001','Công nghệ sau thu hoạch','911507894','dovanc@gmail.com.vn','TP. Hồ Chí Minh',NULL);
/*!40000 ALTER TABLE `datawarehouse` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-04 22:48:15

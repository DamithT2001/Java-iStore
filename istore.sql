-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: istore
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `product_Id` varchar(220) COLLATE utf8mb4_general_ci NOT NULL,
  `product` varchar(120) COLLATE utf8mb4_general_ci NOT NULL,
  `Category` varchar(120) COLLATE utf8mb4_general_ci NOT NULL,
  `Price` decimal(10,0) NOT NULL,
  PRIMARY KEY (`product_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES ('iST/P/002','Airpods pro','Airpods',249),('iST/P/003','i Phone 14 512','iPhone',899),('iST/P/004','Apple watch SE','Apple Watch',249),('iST/P/005','Apple watch Ultra','Apple Watch',649),('iST/P/006','Apple Pencil','Accessories',79),('iST/P/007','Apple watch S9','Apple Watch',399),('iST/P/008','Airpods pro 2','Airpods',249),('iST/P/009','i Phone 14 256','iPhone',799),('iST/P/011','Airpods 3rd gen','Airpods',169),('iST/P/012','Airpods Max Gold','Airpods',549),('iST/P/013','Homepod Mini','TV & Home',99),('iST/P/014','Apple TV 4K 128','TV & Home',149),('iST/P/015','Magsafe Charger','Accessories',59),('iST/P/016','i Pad pro','iPad',799),('iST/P/017','i Pad Air','iPad',599),('iST/P/018','i Pad Mini','iPad',499),('iST/P/019','i Phone 13 Pro 256','iPhone',799),('iST/P/020','i Phone 12 Pro 512','iPhone',689),('iST/P/021','Sports Loop Pink 45','Apple Watch',49),('iST/P/022','Milanese Loop Gold','Apple Watch',99),('iST/P/023','Magic Keyboard white','Accessories',249),('iST/P/024','Apple Pencil 2nd gen','Accessories',129),('iST/P/025','Homepod Midnight','TV & Home',299),('iST/P/026','Airpods Max Green','Airpods',549),('iST/P/027','Studio Display','TV & Home',1599),('iST/P/028','Magic Trackpad','Accessories',149),('iST/P/030','i Phone 13 128','iPhone',544);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `u_id` varchar(120) COLLATE utf8mb4_general_ci NOT NULL,
  `name` varchar(127) COLLATE utf8mb4_general_ci NOT NULL,
  `userName` varchar(127) COLLATE utf8mb4_general_ci NOT NULL,
  `userType` varchar(127) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(127) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('iST/USR/001','Admin','admin','Manager','admin1234'),('iST/USR/002','User','cashier','Cashier','cashier1234'),('iST/USR/003','testUser','user','Manager','user1234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-14 20:04:50

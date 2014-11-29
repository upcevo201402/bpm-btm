CREATE DATABASE  IF NOT EXISTS `reservadb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `reservadb`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: reservadb
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_categoria`
--

DROP TABLE IF EXISTS `tb_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `NombreCategoria` varchar(150) DEFAULT NULL,
  `Activo` tinyint(1) NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_categoria`
--

LOCK TABLES `tb_categoria` WRITE;
/*!40000 ALTER TABLE `tb_categoria` DISABLE KEYS */;
INSERT INTO `tb_categoria` VALUES (1,'CHOCOLATE',1),(2,'CAFE',1),(3,'JUGO',1),(4,'POSTRE',1),(5,'FONDO',1);
/*!40000 ALTER TABLE `tb_categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_conductor`
--

DROP TABLE IF EXISTS `tb_conductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_conductor` (
  `idPersona` int(11) NOT NULL,
  `NumeroLicencia` int(11) DEFAULT NULL,
  `Vencimiento` datetime DEFAULT NULL,
  PRIMARY KEY (`idPersona`),
  CONSTRAINT `fk_tb_Conductor_tb_Persona1` FOREIGN KEY (`idPersona`) REFERENCES `tb_persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_conductor`
--

LOCK TABLES `tb_conductor` WRITE;
/*!40000 ALTER TABLE `tb_conductor` DISABLE KEYS */;
INSERT INTO `tb_conductor` VALUES (1,123456789,'2015-10-12 00:00:00'),(4,987654321,'2016-12-01 00:00:00'),(10,123456789,'2014-07-03 05:42:00'),(11,123456789,'2014-07-03 05:44:53'),(12,123456789,'2014-07-03 20:10:06'),(13,123456789,'2014-07-03 23:38:40'),(14,123456789,'2014-07-03 23:41:23'),(15,123456789,'2014-07-04 03:03:52'),(16,123456789,'2014-07-04 03:11:29'),(17,123456789,'2014-07-04 03:19:43'),(18,123456789,'2014-07-04 12:42:03');
/*!40000 ALTER TABLE `tb_conductor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_detallereserva`
--

DROP TABLE IF EXISTS `tb_detallereserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_detallereserva` (
  `idRestaurante` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `FechaMenu` datetime NOT NULL,
  `idReserva` int(11) NOT NULL,
  `CantidadProducto` int(11) DEFAULT NULL,
  `PrecioMenu` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idRestaurante`,`idProducto`,`FechaMenu`,`idReserva`),
  KEY `fk_tb_Menu_has_tb_reservaComida_tb_reservaComida1_idx` (`idReserva`),
  KEY `fk_tb_Menu_has_tb_reservaComida_tb_Menu1_idx` (`idRestaurante`,`idProducto`,`FechaMenu`),
  CONSTRAINT `fk_tb_Menu_has_tb_reservaComida_tb_Menu1` FOREIGN KEY (`idRestaurante`, `idProducto`, `FechaMenu`) REFERENCES `tb_menu` (`idRestaurante`, `idProducto`, `FechaMenu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_Menu_has_tb_reservaComida_tb_reservaComida1` FOREIGN KEY (`idReserva`) REFERENCES `tb_reservacomida` (`idReserva`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_detallereserva`
--

LOCK TABLES `tb_detallereserva` WRITE;
/*!40000 ALTER TABLE `tb_detallereserva` DISABLE KEYS */;
INSERT INTO `tb_detallereserva` VALUES (1,1,'2014-09-01 00:00:00',5,1,10.00),(2,2,'2014-10-02 00:00:00',6,2,10.00),(3,2,'2014-05-02 00:00:00',7,2,10.00),(4,2,'2014-10-21 00:00:00',8,2,10.00),(5,3,'2014-02-08 00:00:00',9,2,20.00);
/*!40000 ALTER TABLE `tb_detallereserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_menu`
--

DROP TABLE IF EXISTS `tb_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_menu` (
  `idRestaurante` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `FechaMenu` datetime NOT NULL,
  `Combo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idRestaurante`,`idProducto`,`FechaMenu`),
  KEY `fk_tb_restaurante_has_tb_Producto_tb_Producto1_idx` (`idProducto`),
  KEY `fk_tb_restaurante_has_tb_Producto_tb_restaurante1_idx` (`idRestaurante`),
  CONSTRAINT `fk_tb_restaurante_has_tb_Producto_tb_Producto1` FOREIGN KEY (`idProducto`) REFERENCES `tb_producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_restaurante_has_tb_Producto_tb_restaurante1` FOREIGN KEY (`idRestaurante`) REFERENCES `tb_restaurante` (`idRestaurante`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_menu`
--

LOCK TABLES `tb_menu` WRITE;
/*!40000 ALTER TABLE `tb_menu` DISABLE KEYS */;
INSERT INTO `tb_menu` VALUES (1,1,'2014-09-01 00:00:00','Sublime-Sublime'),(2,2,'2014-10-02 00:00:00','Sublime-Pabellon'),(3,2,'2014-05-02 00:00:00','Del Valle Fresa-Sublime'),(4,2,'2014-10-21 00:00:00','CHEESECAKE-Pabellon'),(5,3,'2014-02-08 00:00:00','FRICA NARANJA-Samba');
/*!40000 ALTER TABLE `tb_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_origendestino`
--

DROP TABLE IF EXISTS `tb_origendestino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_origendestino` (
  `idSede` int(11) NOT NULL,
  `idPersona` int(11) NOT NULL,
  `idVehiculo` int(11) NOT NULL,
  `FechaViaje` datetime NOT NULL,
  `SedeOrigen` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idSede`,`idPersona`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_Sede_has_tb_Viaje_tb_Viaje1_idx` (`idPersona`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_Sede_has_tb_Viaje_tb_Sede1_idx` (`idSede`),
  CONSTRAINT `fk_tb_Sede_has_tb_Viaje_tb_Sede1` FOREIGN KEY (`idSede`) REFERENCES `tb_sede` (`idSede`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_Sede_has_tb_Viaje_tb_Viaje1` FOREIGN KEY (`idPersona`, `idVehiculo`, `FechaViaje`) REFERENCES `tb_viaje` (`idPersona`, `idVehiculo`, `FechaViaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_origendestino`
--

LOCK TABLES `tb_origendestino` WRITE;
/*!40000 ALTER TABLE `tb_origendestino` DISABLE KEYS */;
INSERT INTO `tb_origendestino` VALUES (1,1,1,'2010-10-10 00:00:00',1),(1,1,1,'2010-10-10 10:10:10',0),(1,1,2,'2012-12-12 00:00:00',1),(1,4,3,'2012-05-05 00:00:00',1),(2,4,3,'2010-10-10 00:00:00',1);
/*!40000 ALTER TABLE `tb_origendestino` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_persona`
--

DROP TABLE IF EXISTS `tb_persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_persona` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(120) DEFAULT NULL,
  `Telefono` int(11) DEFAULT NULL,
  `Domicilio` varchar(250) DEFAULT NULL,
  `Activo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_persona`
--

LOCK TABLES `tb_persona` WRITE;
/*!40000 ALTER TABLE `tb_persona` DISABLE KEYS */;
INSERT INTO `tb_persona` VALUES (1,'Jose',123456,'San Luis',1),(2,'Maria',123456,'Molina',1),(3,'Pedro',123456,'Monterrico',1),(4,'Luis',654321,'Av. Arequipa',1),(6,'Miguel',123456,'SAN MIGUEL',1),(7,'Miguel',123456,'SAN MIGUEL',1),(8,'Miguel',123456,'SAN MIGUEL',1),(9,'Miguel',123456,'SAN MIGUEL',1),(10,'Miguel',123456,'SAN MIGUEL',1),(11,'Miguel',123456,'SAN MIGUEL',1),(12,'Miguel',123456,'SAN MIGUEL',1),(13,'Miguel',123456,'SAN MIGUEL',1),(14,'Miguel',123456,'SAN MIGUEL',1),(15,'Miguel',123456,'SAN MIGUEL',1),(16,'Miguel',123456,'SAN MIGUEL',1),(17,'Miguel',123456,'SAN MIGUEL',1),(18,'Miguel',123456,'SAN MIGUEL',1);
/*!40000 ALTER TABLE `tb_persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_producto`
--

DROP TABLE IF EXISTS `tb_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `idCategoria` int(11) NOT NULL,
  `NombreProducto` varchar(150) DEFAULT NULL,
  `PrecioProducto` decimal(18,2) DEFAULT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `Activo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idProducto`),
  KEY `fk_tb_Producto_tb_Categoria1_idx` (`idCategoria`),
  CONSTRAINT `fk_tb_Producto_tb_Categoria1` FOREIGN KEY (`idCategoria`) REFERENCES `tb_categoria` (`idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_producto`
--

LOCK TABLES `tb_producto` WRITE;
/*!40000 ALTER TABLE `tb_producto` DISABLE KEYS */;
INSERT INTO `tb_producto` VALUES (1,1,'SAMBA',10.00,'CHOCOSAMBA',1),(2,1,'SUBLIME',5.00,'CHOCOLATE',1),(3,3,'FRICA NARANJA',10.00,'JUGO',1),(4,3,'DEL VALLE FRESA',5.00,'POSTRE',1),(5,4,'CHEESECAKE',5.00,'POSTRE',1),(6,5,'PABELLON',21.50,'POSTRE',1);
/*!40000 ALTER TABLE `tb_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_reserva`
--

DROP TABLE IF EXISTS `tb_reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_reserva` (
  `idReserva` int(11) NOT NULL AUTO_INCREMENT,
  `_idUsuario` int(11) NOT NULL,
  `FechaRegistro` datetime DEFAULT NULL,
  `Activo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idReserva`),
  KEY `fk_tb_Reserva_tb_usuario1_idx` (`_idUsuario`),
  CONSTRAINT `fk_tb_Reserva_tb_usuario1` FOREIGN KEY (`_idUsuario`) REFERENCES `tb_usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_reserva`
--

LOCK TABLES `tb_reserva` WRITE;
/*!40000 ALTER TABLE `tb_reserva` DISABLE KEYS */;
INSERT INTO `tb_reserva` VALUES (1,2,'2010-10-10 00:00:00',1),(2,2,'2011-12-12 00:00:00',1),(3,3,'2014-11-11 00:00:00',1),(4,2,'2011-12-13 00:00:00',1),(5,2,'2011-12-13 00:00:00',1),(6,2,'2014-11-11 00:00:00',1),(7,2,'2011-12-12 00:00:00',1),(8,3,'2014-11-11 00:00:00',1),(9,3,'2013-12-12 00:00:00',1);
/*!40000 ALTER TABLE `tb_reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_reservabus`
--

DROP TABLE IF EXISTS `tb_reservabus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_reservabus` (
  `idReserva` int(11) NOT NULL,
  `idPersona` int(11) NOT NULL,
  `idVehiculo` int(11) NOT NULL,
  `FechaViaje` datetime NOT NULL,
  PRIMARY KEY (`idReserva`,`idPersona`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_ReservaBus_tb_Viaje1_idx` (`idPersona`,`idVehiculo`,`FechaViaje`),
  CONSTRAINT `fk_tb_reservaBus_tb_reserva1` FOREIGN KEY (`idReserva`) REFERENCES `tb_reserva` (`idReserva`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_ReservaBus_tb_Viaje1` FOREIGN KEY (`idPersona`, `idVehiculo`, `FechaViaje`) REFERENCES `tb_viaje` (`idPersona`, `idVehiculo`, `FechaViaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_reservabus`
--

LOCK TABLES `tb_reservabus` WRITE;
/*!40000 ALTER TABLE `tb_reservabus` DISABLE KEYS */;
INSERT INTO `tb_reservabus` VALUES (1,1,1,'2010-10-10 00:00:00'),(2,1,1,'2010-10-10 10:10:10'),(3,1,2,'2012-12-12 00:00:00'),(4,4,3,'2010-10-10 00:00:00');
/*!40000 ALTER TABLE `tb_reservabus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_reservacomida`
--

DROP TABLE IF EXISTS `tb_reservacomida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_reservacomida` (
  `idReserva` int(11) NOT NULL,
  `precioTotal` decimal(18,2) DEFAULT NULL,
  `FechaReserva` datetime DEFAULT NULL,
  PRIMARY KEY (`idReserva`),
  KEY `fk_tb_reservaComida_tb_reserva1_idx` (`idReserva`),
  CONSTRAINT `fk_tb_reservaComida_tb_reserva1` FOREIGN KEY (`idReserva`) REFERENCES `tb_reserva` (`idReserva`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_reservacomida`
--

LOCK TABLES `tb_reservacomida` WRITE;
/*!40000 ALTER TABLE `tb_reservacomida` DISABLE KEYS */;
INSERT INTO `tb_reservacomida` VALUES (5,10.00,'2014-09-12 00:00:00'),(6,10.00,'2014-02-10 00:00:00'),(7,10.00,'2014-09-20 00:00:00'),(8,10.00,'2014-03-23 00:00:00'),(9,10.00,'2014-01-30 00:00:00');
/*!40000 ALTER TABLE `tb_reservacomida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_restaurante`
--

DROP TABLE IF EXISTS `tb_restaurante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_restaurante` (
  `idRestaurante` int(11) NOT NULL AUTO_INCREMENT,
  `idSede` int(11) NOT NULL,
  `NombreRestaurante` varchar(150) DEFAULT NULL,
  `Ruc` varchar(40) DEFAULT NULL,
  `NumeroMesas` int(11) DEFAULT NULL,
  `Aforo` int(11) DEFAULT NULL,
  `Activo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idRestaurante`),
  KEY `fk_tb_restaurante_tb_sede1_idx` (`idSede`),
  CONSTRAINT `fk_tb_restaurante_tb_sede1` FOREIGN KEY (`idSede`) REFERENCES `tb_sede` (`idSede`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_restaurante`
--

LOCK TABLES `tb_restaurante` WRITE;
/*!40000 ALTER TABLE `tb_restaurante` DISABLE KEYS */;
INSERT INTO `tb_restaurante` VALUES (1,1,'PANES','12345789',10,10,1),(2,1,'COMIDAS','987654321',15,25,1),(3,2,'CALIENTES','963852741',25,30,1),(4,1,'SALCHICHA','741825963',10,10,1),(5,2,'CHIFA','852741963',25,25,1);
/*!40000 ALTER TABLE `tb_restaurante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sede`
--

DROP TABLE IF EXISTS `tb_sede`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_sede` (
  `idSede` int(11) NOT NULL AUTO_INCREMENT,
  `NombreSede` varchar(95) DEFAULT NULL,
  `DireccionSede` varchar(250) DEFAULT NULL,
  `Activo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idSede`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sede`
--

LOCK TABLES `tb_sede` WRITE;
/*!40000 ALTER TABLE `tb_sede` DISABLE KEYS */;
INSERT INTO `tb_sede` VALUES (1,'MONTERRICO','MONTERRICO 10',1),(2,'SALAVERRY','SALAVERRY 10',1),(3,'VILLA','SN',1);
/*!40000 ALTER TABLE `tb_sede` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_usuario` (
  `idUsuario` int(11) NOT NULL,
  `NombreUsuario` varchar(65) DEFAULT NULL,
  `Password` varchar(30) DEFAULT NULL,
  `Privilegio` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`idUsuario`),
  CONSTRAINT `fk_tb_usuario_tb_Persona1` FOREIGN KEY (`idUsuario`) REFERENCES `tb_persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
INSERT INTO `tb_usuario` VALUES (2,'U90','1234',0),(3,'U100','1234',1);
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_vehiculo`
--

DROP TABLE IF EXISTS `tb_vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_vehiculo` (
  `idVehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `Placa` varchar(6) NOT NULL,
  `NumeroAsientos` int(11) DEFAULT NULL,
  `Marca` varchar(95) DEFAULT NULL,
  `Modelo` int(11) DEFAULT NULL,
  `Activo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idVehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_vehiculo`
--

LOCK TABLES `tb_vehiculo` WRITE;
/*!40000 ALTER TABLE `tb_vehiculo` DISABLE KEYS */;
INSERT INTO `tb_vehiculo` VALUES (1,'PC1234',20,'TOYOTA',2010,1),(2,'PC9876',35,'FORD',2010,1),(3,'PC2365',24,'CHEVROLET',2014,1);
/*!40000 ALTER TABLE `tb_vehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_viaje`
--

DROP TABLE IF EXISTS `tb_viaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_viaje` (
  `idPersona` int(11) NOT NULL,
  `idVehiculo` int(11) NOT NULL,
  `FechaViaje` datetime NOT NULL,
  PRIMARY KEY (`idPersona`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_Conductor_has_tb_Vehiculo_tb_Vehiculo1_idx` (`idVehiculo`),
  KEY `fk_tb_Conductor_has_tb_Vehiculo_tb_Conductor1_idx` (`idPersona`),
  CONSTRAINT `fk_tb_Conductor_has_tb_Vehiculo_tb_Conductor1` FOREIGN KEY (`idPersona`) REFERENCES `tb_conductor` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_Conductor_has_tb_Vehiculo_tb_Vehiculo1` FOREIGN KEY (`idVehiculo`) REFERENCES `tb_vehiculo` (`idVehiculo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_viaje`
--

LOCK TABLES `tb_viaje` WRITE;
/*!40000 ALTER TABLE `tb_viaje` DISABLE KEYS */;
INSERT INTO `tb_viaje` VALUES (1,1,'2010-10-10 00:00:00'),(1,1,'2010-10-10 10:10:10'),(1,2,'2012-12-12 00:00:00'),(4,3,'2010-10-10 00:00:00'),(4,3,'2012-05-05 00:00:00');
/*!40000 ALTER TABLE `tb_viaje` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-05  0:29:41

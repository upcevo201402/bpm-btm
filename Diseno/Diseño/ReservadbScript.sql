CREATE DATABASE  IF NOT EXISTS `reservadb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `reservadb`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: reservadb
-- ------------------------------------------------------
-- Server version	5.6.19-log

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_conductor`
--

DROP TABLE IF EXISTS `tb_conductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_conductor` (
  `idConductor` int(11) NOT NULL,
  `NumeroLicencia` int(11) DEFAULT NULL,
  `Vencimiento` datetime DEFAULT NULL,
  PRIMARY KEY (`idConductor`),
  CONSTRAINT `fk_tb_Conductor_tb_Persona1` FOREIGN KEY (`idConductor`) REFERENCES `tb_persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
  CONSTRAINT `fk_tb_restaurante_has_tb_Producto_tb_restaurante1` FOREIGN KEY (`idRestaurante`) REFERENCES `tb_restaurante` (`idRestaurante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_restaurante_has_tb_Producto_tb_Producto1` FOREIGN KEY (`idProducto`) REFERENCES `tb_producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_origendestino`
--

DROP TABLE IF EXISTS `tb_origendestino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_origendestino` (
  `idSede` int(11) NOT NULL,
  `idConductor` int(11) NOT NULL,
  `idVehiculo` int(11) NOT NULL,
  `FechaViaje` datetime NOT NULL,
  `SedeOrigen` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idSede`,`idConductor`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_Sede_has_tb_Viaje_tb_Viaje1_idx` (`idConductor`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_Sede_has_tb_Viaje_tb_Sede1_idx` (`idSede`),
  CONSTRAINT `fk_tb_Sede_has_tb_Viaje_tb_Sede1` FOREIGN KEY (`idSede`) REFERENCES `tb_sede` (`idSede`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_Sede_has_tb_Viaje_tb_Viaje1` FOREIGN KEY (`idConductor`, `idVehiculo`, `FechaViaje`) REFERENCES `tb_viaje` (`idConductor`, `idVehiculo`, `FechaViaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_reservabus`
--

DROP TABLE IF EXISTS `tb_reservabus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_reservabus` (
  `idReserva` int(11) NOT NULL,
  `idConductor` int(11) NOT NULL,
  `idVehiculo` int(11) NOT NULL,
  `FechaViaje` datetime NOT NULL,
  PRIMARY KEY (`idReserva`,`idConductor`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_ReservaBus_tb_Viaje1_idx` (`idConductor`,`idVehiculo`,`FechaViaje`),
  CONSTRAINT `fk_tb_reservaBus_tb_reserva1` FOREIGN KEY (`idReserva`) REFERENCES `tb_reserva` (`idReserva`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_ReservaBus_tb_Viaje1` FOREIGN KEY (`idConductor`, `idVehiculo`, `FechaViaje`) REFERENCES `tb_viaje` (`idConductor`, `idVehiculo`, `FechaViaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_viaje`
--

DROP TABLE IF EXISTS `tb_viaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_viaje` (
  `idConductor` int(11) NOT NULL,
  `idVehiculo` int(11) NOT NULL,
  `FechaViaje` datetime NOT NULL,
  PRIMARY KEY (`idConductor`,`idVehiculo`,`FechaViaje`),
  KEY `fk_tb_Conductor_has_tb_Vehiculo_tb_Vehiculo1_idx` (`idVehiculo`),
  KEY `fk_tb_Conductor_has_tb_Vehiculo_tb_Conductor1_idx` (`idConductor`),
  CONSTRAINT `fk_tb_Conductor_has_tb_Vehiculo_tb_Conductor1` FOREIGN KEY (`idConductor`) REFERENCES `tb_conductor` (`idConductor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_Conductor_has_tb_Vehiculo_tb_Vehiculo1` FOREIGN KEY (`idVehiculo`) REFERENCES `tb_vehiculo` (`idVehiculo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-02 23:27:58

-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: rota
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_t45qja1wnv0hu1cdw6vqjljgy` (`email`),
  UNIQUE KEY `UK_mtj01s2onxljf2lntddqdsgqx` (`login`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'jdiegomarquesr@gmail.com','diego','José Diego Marques Ramos','$2a$10$2gUZhmxQPZURD742DxGQ8OfqW/DY2Tv6/9Y9Oq2qFZtz1eE0thbFS'),(2,NULL,'admin','diego marques','$2a$10$oLqhJwg09LCEHQLmMSXkUeZWvk/BgSwYadvcNpxhVMG4DxX0TgGBC');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupo`
--

DROP TABLE IF EXISTS `grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grupo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `secao_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmdrh3u1p89ywwgy3xms9kbjro` (`secao_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupo`
--

LOCK TABLES `grupo` WRITE;
/*!40000 ALTER TABLE `grupo` DISABLE KEYS */;
INSERT INTO `grupo` VALUES (1,'000001','Massas',1),(2,'000002','Molhos',1),(3,'000002','Frutas',2),(4,'000003','Verduras',2),(5,'000004','Grãos',2),(6,'000005','Higiene',3),(7,'000005','Limpeza Residencial',3);
/*!40000 ALTER TABLE `grupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfis`
--

DROP TABLE IF EXISTS `perfis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfis` (
  `funcionario_id` bigint(20) NOT NULL,
  `perfis` int(11) DEFAULT NULL,
  KEY `FKd8dug2uwop8mbx49hh7ym47co` (`funcionario_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfis`
--

LOCK TABLES `perfis` WRITE;
/*!40000 ALTER TABLE `perfis` DISABLE KEYS */;
/*!40000 ALTER TABLE `perfis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preco`
--

DROP TABLE IF EXISTS `preco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `preco` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `preco` double DEFAULT NULL,
  `produt_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKt5rpaw4s84rdiqhnun0ybxix6` (`produt_id`)
) ENGINE=MyISAM AUTO_INCREMENT=60 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preco`
--

LOCK TABLES `preco` WRITE;
/*!40000 ALTER TABLE `preco` DISABLE KEYS */;
INSERT INTO `preco` VALUES (1,13.5,NULL),(2,13,1),(3,13.5,NULL),(4,13.99,NULL),(5,13.99,1),(6,8.43,2),(7,8.67,2),(8,8.88,2),(9,8.99,2),(10,8.99,3),(11,9.49,3),(12,9.89,3),(13,3.99,4),(14,4.29,4),(15,4.49,4),(16,4.69,4),(17,4.99,4),(18,6.99,5),(19,8.99,6),(20,9.99,6),(21,9.09,7),(22,9.19,7),(23,9.29,7),(24,9,8),(25,9.03,8),(26,14.03,9),(27,16.33,9),(28,19.33,9),(29,19.33,9),(30,23.33,10),(31,25.33,10),(32,8.99,11),(33,9.99,11),(34,3.99,11),(35,4.99,11),(36,4.99,12),(37,8.99,13),(38,9.99,13),(39,2.99,14),(40,3.99,15),(41,5.99,16),(42,5.4,16),(43,5.4,17),(44,5.4,19),(45,5,19),(46,1.09,20),(47,1.19,20),(48,1.19,21),(49,1.39,21),(50,21.39,22),(51,24.39,23),(52,16,24),(53,7.16,25),(54,7.88,25),(55,7.88,26),(56,5.88,27),(57,6.88,27),(58,6.88,28),(59,6.88,29);
/*!40000 ALTER TABLE `preco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sku` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `sub_grupo_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKl1x46wf97qurc5ukx65lth997` (`sub_grupo_id`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'000001','Massa Semola Capitao',1),(2,'000002','Massa Espaguete Capitao',2),(3,'000002','Massa Espaguete Sicilia',2),(4,'200002','Molho Tomate Suricato',3),(5,'209002','Molho Tomate Salsa e Pimenta',3),(6,'209302','Polpa de Tomate Sicilia',4),(7,'000999','Maca verde kg',5),(8,'000959','Maca vermelha kg',5),(9,'007659','Morango kg',6),(10,'027659','Framboesa kg',6),(11,'027609','Laranja kg',7),(12,'027603','Limao kg',7),(13,'029903','Tangerina kg',7),(14,'026663','Alface und',8),(15,'026697','Manjericao pct',8),(16,'036697','Feijao Preto kg',9),(17,'876567','Feijao Branco kg',9),(18,'876527','Milho verde kg',10),(19,'871527','Milho pipoca kg',10),(20,'873327','Sabonete',11),(21,'873227','Sabonete even un',11),(22,'873227','Shampoo guaxelo un',12),(23,'873227','Shampoo canguti un',12),(24,'873227','sabao dureza',13),(25,'873227','sabao limpeza',13),(26,'873227','sabao legal',13),(27,'873227','Agua dragao',14),(28,'873227','Agua cobra',14),(29,'873227','Agua macaco',14);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secao`
--

DROP TABLE IF EXISTS `secao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `secao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secao`
--

LOCK TABLES `secao` WRITE;
/*!40000 ALTER TABLE `secao` DISABLE KEYS */;
INSERT INTO `secao` VALUES (1,'000001','Mercearia'),(2,'000002','Hortifruti'),(3,'000003','Higiene e Limpeza');
/*!40000 ALTER TABLE `secao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_grupo`
--

DROP TABLE IF EXISTS `sub_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sub_grupo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `grupo_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKrwhr5hpesv1tc4kuwcr22os89` (`grupo_id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_grupo`
--

LOCK TABLES `sub_grupo` WRITE;
/*!40000 ALTER TABLE `sub_grupo` DISABLE KEYS */;
INSERT INTO `sub_grupo` VALUES (1,'000001','Massa Semola',1),(2,'000002','Massa Espaguete',1),(3,'000003','Molhos Prontos',2),(4,'000003','Molhos Crus',2),(5,'000004','Macas',3),(6,'000004','Frutas Vermelhas',3),(7,'000014','Frutas Citricas',3),(8,'000010','Folhagens',4),(9,'020010','Feijoes',5),(10,'020310','Milhos',5),(11,'021310','Sabonetes',6),(12,'121310','Shampoo',6),(13,'100310','Saboes',5),(14,'100313','Agua Sanitaria',5);
/*!40000 ALTER TABLE `sub_grupo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-04 20:47:13

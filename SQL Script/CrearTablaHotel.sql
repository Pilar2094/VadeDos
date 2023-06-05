CREATE TABLE `hoteles` (
  `idhotel` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `categoria` tinyint(1) DEFAULT NULL,
  `precio` int NOT NULL,
  `disponibilidad` tinyint(1) NOT NULL,
  PRIMARY KEY (`idhotel`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
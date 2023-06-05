CREATE TABLE `reservas` (
  `idreserva` int NOT NULL AUTO_INCREMENT,
  `nombrecliente` varchar(100) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `idhotel` int DEFAULT NULL,
  `idvuelo` int DEFAULT NULL,
  PRIMARY KEY (`idreserva`),
  KEY `idhotel_idx` (`idhotel`),
  KEY `idvuelo_idx` (`idvuelo`),
  CONSTRAINT `idhotel` FOREIGN KEY (`idhotel`) REFERENCES `hoteles` (`idhotel`),
  CONSTRAINT `idvuelo` FOREIGN KEY (`idvuelo`) REFERENCES `vuelos` (`idvuelo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
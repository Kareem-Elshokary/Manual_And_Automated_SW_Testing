CREATE DATABASE  IF NOT EXISTS `librarymanagementsystem` 
USE `librarymanagementsystem`;
-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: librarymanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.41












--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;


CREATE TABLE `books` (
  `BookID` int NOT NULL AUTO_INCREMENT,
  `BookName` varchar(50) DEFAULT NULL,
  `AuthorName` varchar(50) DEFAULT NULL,
  `BookDescription` text,
  `CopiesAvailable` int DEFAULT NULL,
  PRIMARY KEY (`BookID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `books`
--



INSERT INTO `books` VALUES (1,'The Great Gatsby','F. Scott Fitzgerald','Fiction',5),(2,'To Kill a Mockingbird','Harper Lee','Fiction',3),(3,'1984','George Orwell','Dystopian',4),(4,'Moby Dick','Herman Melville','Adventure',2),(5,'The Catcher in the Rye','J.D. Salinger','Fiction',3);



--
-- Table structure for table `borrowed_books`
--

DROP TABLE IF EXISTS `borrowed_books`;


CREATE TABLE `borrowed_books` (
  `BorrowID` int NOT NULL AUTO_INCREMENT,
  `UserID` int DEFAULT NULL,
  `BookID` int DEFAULT NULL,
  `BorrowDate` date DEFAULT NULL,
  `ReturnDate` date DEFAULT NULL,
  PRIMARY KEY (`BorrowID`),
  KEY `UserID` (`UserID`),
  KEY `BookID` (`BookID`),
  CONSTRAINT `borrowed_books_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `users` (`UserID`),
  CONSTRAINT `borrowed_books_ibfk_2` FOREIGN KEY (`BookID`) REFERENCES `books` (`BookID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `borrowed_books`
--



INSERT INTO `borrowed_books` VALUES (1,1,2,'2024-01-10','2024-01-25'),(2,2,1,'2024-02-01',NULL),(3,3,3,'2024-02-05',NULL),(4,4,5,'2024-02-02','2024-02-15'),(5,5,4,'2024-02-07',NULL);



--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;


CREATE TABLE `users` (
  `UserID` int NOT NULL AUTO_INCREMENT,
  `UserName` varchar(50) DEFAULT NULL,
  `UserEmail` varchar(50) DEFAULT NULL,
  `MembershipeDATE` date DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `users`
--



INSERT INTO `users` VALUES (1,'Alice Johnson','alice@example.com','2023-01-15'),(2,'Bob Smith','bob@example.com','2022-06-20'),(3,'Charlie Brown','charlie@example.com','2021-11-05'),(4,'David Lee','david@example.com','2023-03-10'),(5,'Emma Wilson','emma@example.com','2022-09-25');












-- Dump completed on 2025-02-08 22:07:16

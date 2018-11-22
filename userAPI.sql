-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 21, 2018 at 12:49 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- Schema userAPI
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `userAPI` DEFAULT CHARACTER SET latin1 ;
USE `userAPI` ;

--
-- Database: `userAPI`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(6) NOT NULL,
  `first_name` varchar(32) NOT NULL,
  `surname` varchar(32) NOT NULL,
  `street_address` varchar(64) NOT NULL,
  `city` varchar(32) NOT NULL,
  `post_code` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `first_name`, `surname`, `street_address`, `city`, `post_code`) VALUES
(1, 'Emmie', 'Jones', '82 Grey Street', 'PLANTATIONS', 4701),
(3, 'Kenneth', 'White', '67 Passage Avenue', 'THURSDAY ISLAND', 4875),
(4, 'Jim', 'Evans', '98 Daly Terrace', 'CARABOODA', 6033),
(5, 'Robert', 'Rodriguez', '97 Bresnahans Lane', 'FITZROY FALLS', 2577),
(6, 'Kathy', 'Ellington', '20 Fergusson Street', 'COOLANESS', 2470),
(7, 'Paul', 'Clark', '52 Edgewater Close', 'NUMBAA', 2540),
(8, 'Thomas', 'Orcutt', '63 Fergusson Street', 'BABYL CREEK', 2470),
(9, 'Scarlet', 'Curtis', '55 Avondale Drive', 'ALBION PARK RAIL', 2527),
(10, 'Jeff', 'Spellman', '28 Creek Street', 'WEIR RIVER', 4406),
(11, 'Barbara', 'Bloggs', '14 Frencham Street', 'WANTAGONG', 2644),
(12, 'Audrey', 'Cook', '84 Brown Street', 'ROSEVILLE CHASE', 2069),
(13, 'Michael', 'Roof', '6 Ronald Crescent', 'TELINA', 4680),
(14, 'Alicia', 'Wilson', '55 Hodgson St', 'LESLIE', 4370),
(15, 'Milagros', 'Myers', '50 McGregor Street', 'BROKEN HILL', 2880),
(16, 'James', 'Jones', '98 Chapel Close', '	KANIMBLA', 4870),
(17, 'Charles', 'Colquitt', '34 Watson Street', 'ECHUCA VILLAGE', 3564),
(18, 'Garry', 'Fuller', '58 Villeneuve Street', 'HARRIETVILLE', 3741),
(19, 'Dena', 'Riley', '67 Walpole Avenue', 'BALLANGEICH', 3279),
(20, 'Ryan', 'Norton', '62 Grayson Street', 'BOORGA', 2652),
(21, 'Vicki', 'Lafrance', '33 Queen Street', 'AVALON', 2107),
(22, 'Erasmo', 'Barnes', '16 Faunce Crescent', 'SPRINGDALE', 2666),
(23, 'Ronald', 'Ballou', '22 Sale-Heyfield Road', 'BELLVIEW', 3945),
(24, 'David', 'Hurlbert', '40 Arthur Street', 'STUART TOWN', 2820),
(25, 'Robert', 'Massaro', '30 Railway Avenue', 'CORNELIA CREEK', 3622),
(26, 'Rosemary', 'Chavez', '6 Ridge Road', 'SOUTH ISIS', 4660),
(27, 'Jermaine', 'Sheets', '36 Mendooran Road', 'ANGLE PARK', 2830),
(28, 'Julie', 'Jones', '46 Faunce Crescent', 'WEETHALLE', 2669),
(29, 'Michael', 'Estes', '79 Henry Moss Court', 'WINDSOR', 5501),
(30, 'Thomas', 'Pena', '14 Wallum Court', 'EVIRON', 2484),
(31, 'Vickey', 'White', '7 Sunset Drive', 'CHORREGON', 4730);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

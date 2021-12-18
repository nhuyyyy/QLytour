-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 28, 2020 at 10:10 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qltour`
--

-- --------------------------------------------------------

--
-- Table structure for table `chiphi`
--

CREATE TABLE `chiphi` (
  `machiphi` int(5) NOT NULL,
  `malcp` int(5) NOT NULL,
  `madoan` int(5) NOT NULL,
  `giatien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chitietdoan`
--

CREATE TABLE `chitietdoan` (
  `madoan` int(5) NOT NULL,
  `makhach` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chitiettour`
--

CREATE TABLE `chitiettour` (
  `id` int(11) NOT NULL,
  `matour` int(11) NOT NULL,
  `madd` int(5) NOT NULL,
  `thutu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `chitiettour`
--

INSERT INTO `chitiettour` (`id`, `matour`, `madd`, `thutu`) VALUES
(1, 1, 1, 1),
(2, 1, 2, 2),
(3, 2, 1, 1),
(4, 2, 3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `diadiem`
--

CREATE TABLE `diadiem` (
  `madd` int(5) NOT NULL,
  `tendd` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diadiem`
--

INSERT INTO `diadiem` (`madd`, `tendd`) VALUES
(1, 'Saigon'),
(2, 'Vũng Tàu'),
(3, 'Châu Đốc');

-- --------------------------------------------------------

--
-- Table structure for table `doan`
--

CREATE TABLE `doan` (
  `madoan` int(5) NOT NULL,
  `matour` int(5) NOT NULL,
  `ngaybd` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `ngaykt` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `giatour`
--

CREATE TABLE `giatour` (
  `magia` int(5) NOT NULL,
  `matour` int(5) NOT NULL,
  `giatien` double NOT NULL,
  `tgbd` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tgkt` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `khach`
--

CREATE TABLE `khach` (
  `makhach` int(5) NOT NULL,
  `tenkh` varchar(100) NOT NULL,
  `ngaysinh` date NOT NULL,
  `cmnd` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `loaichiphi`
--

CREATE TABLE `loaichiphi` (
  `malcp` int(5) NOT NULL,
  `tenlcp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `loaitour`
--

CREATE TABLE `loaitour` (
  `maloaitour` int(5) NOT NULL,
  `tenloaitour` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `loaitour`
--

INSERT INTO `loaitour` (`maloaitour`, `tenloaitour`) VALUES
(1, 'Du Lịch'),
(2, 'Trekking');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` int(5) NOT NULL,
  `tennv` varchar(100) NOT NULL,
  `ngaysinh` date NOT NULL,
  `cmnd` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvientrongdoan`
--

CREATE TABLE `nhanvientrongdoan` (
  `madoan` int(5) NOT NULL,
  `manv` int(5) NOT NULL,
  `nhiemvu` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tour`
--

CREATE TABLE `tour` (
  `matour` int(5) NOT NULL,
  `maloaitour` int(5) NOT NULL,
  `tentour` varchar(100) NOT NULL,
  `Tong` float NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tour`
--

INSERT INTO `tour` (`matour`, `maloaitour`, `tentour`, `Tong`) VALUES
(1, 1, 'Tour 1', 100000),
(2, 2, 'Tour 2', 200000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chiphi`
--
ALTER TABLE `chiphi`
  ADD PRIMARY KEY (`machiphi`),
  ADD KEY `fk-maloaichiphi` (`malcp`),
  ADD KEY `fk-madoan` (`madoan`);

--
-- Indexes for table `chitietdoan`
--
ALTER TABLE `chitietdoan`
  ADD PRIMARY KEY (`madoan`,`makhach`);

--
-- Indexes for table `chitiettour`
--
ALTER TABLE `chitiettour`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_MaTour` (`matour`),
  ADD KEY `FK_MaDiaDiem` (`madd`);

--
-- Indexes for table `diadiem`
--
ALTER TABLE `diadiem`
  ADD PRIMARY KEY (`madd`);

--
-- Indexes for table `doan`
--
ALTER TABLE `doan`
  ADD PRIMARY KEY (`madoan`),
  ADD KEY `fk-matour-cttour` (`matour`);

--
-- Indexes for table `giatour`
--
ALTER TABLE `giatour`
  ADD PRIMARY KEY (`magia`),
  ADD KEY `matour` (`matour`);

--
-- Indexes for table `khach`
--
ALTER TABLE `khach`
  ADD PRIMARY KEY (`makhach`);

--
-- Indexes for table `loaichiphi`
--
ALTER TABLE `loaichiphi`
  ADD PRIMARY KEY (`malcp`);

--
-- Indexes for table `loaitour`
--
ALTER TABLE `loaitour`
  ADD PRIMARY KEY (`maloaitour`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manv`);

--
-- Indexes for table `nhanvientrongdoan`
--
ALTER TABLE `nhanvientrongdoan`
  ADD KEY `fk-madoan-ctnv` (`madoan`),
  ADD KEY `fk-manv` (`manv`);

--
-- Indexes for table `tour`
--
ALTER TABLE `tour`
  ADD PRIMARY KEY (`matour`),
  ADD KEY `maloaitour` (`maloaitour`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chiphi`
--
ALTER TABLE `chiphi`
  MODIFY `machiphi` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `chitiettour`
--
ALTER TABLE `chitiettour`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `diadiem`
--
ALTER TABLE `diadiem`
  MODIFY `madd` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `doan`
--
ALTER TABLE `doan`
  MODIFY `madoan` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `giatour`
--
ALTER TABLE `giatour`
  MODIFY `magia` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `khach`
--
ALTER TABLE `khach`
  MODIFY `makhach` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `loaichiphi`
--
ALTER TABLE `loaichiphi`
  MODIFY `malcp` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `loaitour`
--
ALTER TABLE `loaitour`
  MODIFY `maloaitour` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `manv` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tour`
--
ALTER TABLE `tour`
  MODIFY `matour` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chiphi`
--
ALTER TABLE `chiphi`
  ADD CONSTRAINT `fk-madoan` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`),
  ADD CONSTRAINT `fk-maloaichiphi` FOREIGN KEY (`malcp`) REFERENCES `loaichiphi` (`malcp`);

--
-- Constraints for table `chitiettour`
--
ALTER TABLE `chitiettour`
  ADD CONSTRAINT `FK_MaDiaDiem` FOREIGN KEY (`madd`) REFERENCES `diadiem` (`madd`),
  ADD CONSTRAINT `FK_MaTour` FOREIGN KEY (`matour`) REFERENCES `tour` (`matour`);

--
-- Constraints for table `doan`
--
ALTER TABLE `doan`
  ADD CONSTRAINT `fk-matour-cttour` FOREIGN KEY (`matour`) REFERENCES `tour` (`matour`);

--
-- Constraints for table `giatour`
--
ALTER TABLE `giatour`
  ADD CONSTRAINT `fk-matour` FOREIGN KEY (`matour`) REFERENCES `tour` (`matour`);

--
-- Constraints for table `nhanvientrongdoan`
--
ALTER TABLE `nhanvientrongdoan`
  ADD CONSTRAINT `fk-madoan-ctnv` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`),
  ADD CONSTRAINT `fk-manv` FOREIGN KEY (`manv`) REFERENCES `nhanvien` (`manv`);

--
-- Constraints for table `tour`
--
ALTER TABLE `tour`
  ADD CONSTRAINT `fk-maloaitour` FOREIGN KEY (`maloaitour`) REFERENCES `loaitour` (`maloaitour`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 21, 2021 lúc 04:05 PM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qltour`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chiphi`
--

CREATE TABLE `chiphi` (
  `machiphi` int(5) NOT NULL,
  `malcp` int(5) NOT NULL,
  `madoan` int(5) NOT NULL,
  `giatien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chiphi`
--

INSERT INTO `chiphi` (`machiphi`, `malcp`, `madoan`, `giatien`) VALUES
(1, 1, 1, 300000),
(2, 2, 1, 2000000),
(3, 4, 1, 1000000),
(4, 1, 2, 4000000),
(5, 2, 2, 2000000),
(6, 1, 3, 2000000),
(7, 2, 3, 1000000),
(8, 3, 3, 700000),
(9, 4, 3, 800000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietdoan`
--

CREATE TABLE `chitietdoan` (
  `madoan` int(5) NOT NULL,
  `makhach` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chitietdoan`
--

INSERT INTO `chitietdoan` (`madoan`, `makhach`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 5),
(2, 6),
(3, 7);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiettour`
--

CREATE TABLE `chitiettour` (
  `id` int(11) NOT NULL,
  `matour` int(11) NOT NULL,
  `madd` int(5) NOT NULL,
  `thutu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chitiettour`
--

INSERT INTO `chitiettour` (`id`, `matour`, `madd`, `thutu`) VALUES
(1, 5, 1, 1),
(2, 5, 1, 2),
(3, 5, 3, 3),
(4, 5, 2, 4),
(5, 5, 3, 5),
(6, 1, 1, 1),
(7, 1, 2, 2),
(8, 1, 1, 3),
(9, 1, 4, 4),
(10, 4, 1, 1),
(11, 4, 2, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diadiem`
--

CREATE TABLE `diadiem` (
  `madd` int(5) NOT NULL,
  `tendd` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `diadiem`
--

INSERT INTO `diadiem` (`madd`, `tendd`) VALUES
(1, 'Nhà Thờ Đức Bà,SG'),
(2, 'Mũi Nghinh Phong,Vũng Tàu'),
(3, 'Nhà Mồ Bà Chúc , An Giang'),
(4, 'Vivaland,Phan Thiết'),
(5, 'Suối nước nóng -Lagi- Bình Thuận'),
(6, 'Lạng Sơn'),
(7, 'Thái Bình'),
(8, 'Đại Nam - Xứ sở thần tiên'),
(9, 'Gốm sứ Minh Long, Bình Dương'),
(10, 'Thanh Hóa'),
(11, 'Sunworld Fansipan Legend-SaPa'),
(12, 'Thung lũng hoa hồng Sapa-Sapa'),
(13, 'Nhà thờ đá Sapa -SaPa'),
(14, 'Thác Bản Dốc ,Cao Bằng'),
(15, 'Động Ngườm Ngao ,Cao Bằng'),
(16, 'Trường Đua Đại Nam,Bình Dương'),
(17, 'Thành Nhà Mạc,Lạng Sơn'),
(18, 'Thành Cổ ,Lạng Sơn'),
(19, 'Biển Long Hải, Vũng Tàu'),
(20, 'Miếu bà chùa Xứ ở Núi Sam, Châu Đốc,An Giang'),
(21, 'Khu  di chỉ óc eo,An Giang'),
(22, 'Căn cứ quân sự Ô Tà Sóc'),
(23, 'Hải Đăng , Vũng Tàu'),
(24, 'Khu Đồi Con Heo ,Vũng Tàu'),
(25, 'Dinh Độc Lập,Saigon'),
(26, 'Chợ Bến Thành,Sài Gòn'),
(27, 'CocobeachLagi- Bình Thuận'),
(28, 'Bản Cát Cát -Sapa');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `doan`
--

CREATE TABLE `doan` (
  `madoan` int(5) NOT NULL,
  `matour` int(5) NOT NULL,
  `ngaybd` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `ngaykt` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `doan`
--

INSERT INTO `doan` (`madoan`, `matour`, `ngaybd`, `ngaykt`) VALUES
(1, 1, '2021-11-30 17:00:00', '2021-12-03 17:00:00'),
(2, 1, '2021-12-01 09:59:49', '2021-12-03 17:00:00'),
(3, 2, '2021-12-21 12:35:56', '2021-12-10 17:00:00'),
(4, 2, '2021-12-21 12:35:59', '2021-12-08 17:00:00'),
(5, 1, '2021-12-05 13:56:42', '2021-12-08 13:56:42'),
(6, 1, '2021-12-05 13:56:42', '2021-12-08 13:56:42');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giatour`
--

CREATE TABLE `giatour` (
  `magia` int(5) NOT NULL,
  `matour` int(5) NOT NULL,
  `giatien` double NOT NULL,
  `tgbd` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `tgkt` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `giatour`
--

INSERT INTO `giatour` (`magia`, `matour`, `giatien`, `tgbd`, `tgkt`) VALUES
(1, 1, 301231, '2021-12-21 13:51:38', '2021-12-01 17:00:00'),
(2, 1, 21474, '2021-12-21 13:51:52', '2021-12-04 17:00:00'),
(3, 1, 1111111, '2021-12-21 13:52:18', '2021-12-06 17:00:00'),
(4, 2, 5000000, '2021-12-21 13:51:15', '2021-12-21 17:00:00'),
(5, 2, 500000, '2021-12-21 13:52:35', '2021-12-24 17:00:00'),
(6, 2, 500000, '2021-12-21 13:52:43', '2021-12-30 17:00:00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khach`
--

CREATE TABLE `khach` (
  `makhach` int(5) NOT NULL,
  `tenkh` varchar(100) NOT NULL,
  `ngaysinh` date NOT NULL,
  `cmnd` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `khach`
--

INSERT INTO `khach` (`makhach`, `tenkh`, `ngaysinh`, `cmnd`) VALUES
(1, 'Nguyễn Văn An', '2000-12-07', 327647283),
(2, 'Nguyễn Thúy Liễu', '2000-12-08', 136321346),
(3, 'Dương Hoàng Lân', '2000-12-16', 124363324),
(4, 'Trần Dần', '2003-12-12', 144512451),
(5, 'Nguyễn Khánh An', '2000-12-10', 312345896),
(6, 'Dương Ngọc Phương Thanh', '2000-12-20', 125489123);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaichiphi`
--

CREATE TABLE `loaichiphi` (
  `malcp` int(5) NOT NULL,
  `tenlcp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `loaichiphi`
--

INSERT INTO `loaichiphi` (`malcp`, `tenlcp`) VALUES
(1, 'Xăng'),
(2, 'Khách Sạn'),
(3, 'Tham Quan'),
(4, 'Khác');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaitour`
--

CREATE TABLE `loaitour` (
  `maloaitour` int(5) NOT NULL,
  `tenloaitour` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `loaitour`
--

INSERT INTO `loaitour` (`maloaitour`, `tenloaitour`) VALUES
(1, 'Du Lịch Nghỉ Dưỡng'),
(2, 'Du Lịch Sinh Thái , Khám Phá'),
(3, 'Du Lịch Lịch Sử'),
(4, 'Du Lịch Ẩm Thực'),
(5, 'Teambuilding'),
(6, 'Du Lịch Văn Hoá'),
(7, 'Du Lịch Xanh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` int(5) NOT NULL,
  `tennv` varchar(100) NOT NULL,
  `ngaysinh` date NOT NULL,
  `cmnd` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`manv`, `tennv`, `ngaysinh`, `cmnd`) VALUES
(1, 'Nguyễn Thị Thu', '2000-12-27', 124102340),
(2, 'Hoàng Ngọc Long', '2000-12-09', 200092012),
(3, 'Dương Hưng Long', '2000-12-07', 1111111112),
(4, 'Nguyễn Thu Hồng', '2000-12-18', 777777776),
(5, 'Dương Hưng Long', '2000-12-07', 1123111111),
(6, 'Hoàng Ngọc Long', '2000-12-09', 200092032),
(7, 'Dương Hưng Long', '2000-12-07', 1111111156);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvientrongdoan`
--

CREATE TABLE `nhanvientrongdoan` (
  `madoan` int(5) NOT NULL,
  `manv` int(5) NOT NULL,
  `nhiemvu` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `nhanvientrongdoan`
--

INSERT INTO `nhanvientrongdoan` (`madoan`, `manv`, `nhiemvu`) VALUES
(1, 1, 'Tài Xế'),
(1, 2, 'Hướng Dẫn Viên'),
(2, 3, 'Tài Xế'),
(2, 4, 'Hướng Dẫn Viên'),
(3, 5, 'Tài Xế'),
(3, 6, 'Hướng Dẫn Viên');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour`
--

CREATE TABLE `tour` (
  `matour` int(5) NOT NULL,
  `maloaitour` int(5) NOT NULL,
  `tentour` varchar(100) NOT NULL,
  `Tong` float NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tour`
--

INSERT INTO `tour` (`matour`, `maloaitour`, `tentour`, `Tong`) VALUES
(1, 2, 'Sài Gòn - Đà Lạt', 54500000),
(2, 2, 'Sài Gòn - Phan Thiết', 25000000),
(3, 3, 'TPHCM - Cần Giờ', 300000),
(4, 2, 'TPHCM - Bình Thuận', 0),
(5, 2, 'TPHCM - Nha Trang', 0),
(6, 5, 'TPHCM - Miền Tây', 0),
(7, 7, 'Bò Cạp Vàng', 0),
(8, 3, 'TPHCM - Phố Cổ', 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chiphi`
--
ALTER TABLE `chiphi`
  ADD PRIMARY KEY (`machiphi`),
  ADD KEY `fk-maloaichiphi` (`malcp`),
  ADD KEY `fk-madoan` (`madoan`);

--
-- Chỉ mục cho bảng `chitietdoan`
--
ALTER TABLE `chitietdoan`
  ADD PRIMARY KEY (`madoan`,`makhach`);

--
-- Chỉ mục cho bảng `chitiettour`
--
ALTER TABLE `chitiettour`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_MaTour` (`matour`),
  ADD KEY `FK_MaDiaDiem` (`madd`);

--
-- Chỉ mục cho bảng `diadiem`
--
ALTER TABLE `diadiem`
  ADD PRIMARY KEY (`madd`);

--
-- Chỉ mục cho bảng `doan`
--
ALTER TABLE `doan`
  ADD PRIMARY KEY (`madoan`),
  ADD KEY `fk-matour-cttour` (`matour`);

--
-- Chỉ mục cho bảng `giatour`
--
ALTER TABLE `giatour`
  ADD PRIMARY KEY (`magia`),
  ADD KEY `matour` (`matour`);

--
-- Chỉ mục cho bảng `khach`
--
ALTER TABLE `khach`
  ADD PRIMARY KEY (`makhach`);

--
-- Chỉ mục cho bảng `loaichiphi`
--
ALTER TABLE `loaichiphi`
  ADD PRIMARY KEY (`malcp`);

--
-- Chỉ mục cho bảng `loaitour`
--
ALTER TABLE `loaitour`
  ADD PRIMARY KEY (`maloaitour`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manv`);

--
-- Chỉ mục cho bảng `nhanvientrongdoan`
--
ALTER TABLE `nhanvientrongdoan`
  ADD KEY `fk-madoan-ctnv` (`madoan`),
  ADD KEY `fk-manv` (`manv`);

--
-- Chỉ mục cho bảng `tour`
--
ALTER TABLE `tour`
  ADD PRIMARY KEY (`matour`),
  ADD KEY `maloaitour` (`maloaitour`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chiphi`
--
ALTER TABLE `chiphi`
  MODIFY `machiphi` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `chitiettour`
--
ALTER TABLE `chitiettour`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT cho bảng `diadiem`
--
ALTER TABLE `diadiem`
  MODIFY `madd` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT cho bảng `doan`
--
ALTER TABLE `doan`
  MODIFY `madoan` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `giatour`
--
ALTER TABLE `giatour`
  MODIFY `magia` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT cho bảng `khach`
--
ALTER TABLE `khach`
  MODIFY `makhach` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `loaichiphi`
--
ALTER TABLE `loaichiphi`
  MODIFY `malcp` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `loaitour`
--
ALTER TABLE `loaitour`
  MODIFY `maloaitour` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `manv` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `tour`
--
ALTER TABLE `tour`
  MODIFY `matour` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chiphi`
--
ALTER TABLE `chiphi`
  ADD CONSTRAINT `fk-madoan` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`),
  ADD CONSTRAINT `fk-maloaichiphi` FOREIGN KEY (`malcp`) REFERENCES `loaichiphi` (`malcp`);

--
-- Các ràng buộc cho bảng `chitiettour`
--
ALTER TABLE `chitiettour`
  ADD CONSTRAINT `FK_MaDiaDiem` FOREIGN KEY (`madd`) REFERENCES `diadiem` (`madd`),
  ADD CONSTRAINT `FK_MaTour` FOREIGN KEY (`matour`) REFERENCES `tour` (`matour`);

--
-- Các ràng buộc cho bảng `doan`
--
ALTER TABLE `doan`
  ADD CONSTRAINT `fk-matour-cttour` FOREIGN KEY (`matour`) REFERENCES `tour` (`matour`);

--
-- Các ràng buộc cho bảng `giatour`
--
ALTER TABLE `giatour`
  ADD CONSTRAINT `fk-matour` FOREIGN KEY (`matour`) REFERENCES `tour` (`matour`);

--
-- Các ràng buộc cho bảng `nhanvientrongdoan`
--
ALTER TABLE `nhanvientrongdoan`
  ADD CONSTRAINT `fk-madoan-ctnv` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`),
  ADD CONSTRAINT `fk-manv` FOREIGN KEY (`manv`) REFERENCES `nhanvien` (`manv`);

--
-- Các ràng buộc cho bảng `tour`
--
ALTER TABLE `tour`
  ADD CONSTRAINT `fk-maloaitour` FOREIGN KEY (`maloaitour`) REFERENCES `loaitour` (`maloaitour`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

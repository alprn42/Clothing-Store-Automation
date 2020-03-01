-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 26 Şub 2020, 10:21:51
-- Sunucu sürümü: 10.1.38-MariaDB
-- PHP Sürümü: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `storeautomation`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bill`
--

CREATE TABLE `bill` (
  `BillID` int(11) NOT NULL,
  `SalesID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `bill`
--

INSERT INTO `bill` (`BillID`, `SalesID`) VALUES
(1, 2),
(2, 3),
(3, 4),
(4, 5),
(5, 5),
(6, 5),
(7, 5),
(8, 6),
(9, 7);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `brand`
--

CREATE TABLE `brand` (
  `BrandID` int(11) NOT NULL,
  `BrandName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `brand`
--

INSERT INTO `brand` (`BrandID`, `BrandName`) VALUES
(1, 'calvin clein'),
(2, 'asd');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `category`
--

CREATE TABLE `category` (
  `CategoryID` int(20) NOT NULL,
  `CategoryNameID` int(11) NOT NULL,
  `SizeID` int(11) NOT NULL,
  `BrandID` int(11) NOT NULL,
  `PatternID` int(11) NOT NULL,
  `ColorID` int(11) NOT NULL,
  `TypeID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `category`
--

INSERT INTO `category` (`CategoryID`, `CategoryNameID`, `SizeID`, `BrandID`, `PatternID`, `ColorID`, `TypeID`) VALUES
(1, 5, 2, 2, 1, 2, 3);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `categoryname`
--

CREATE TABLE `categoryname` (
  `CategoryNameID` int(11) NOT NULL,
  `CategoryNames` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `categoryname`
--

INSERT INTO `categoryname` (`CategoryNameID`, `CategoryNames`) VALUES
(5, 'aaa');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `color`
--

CREATE TABLE `color` (
  `ColorID` int(11) NOT NULL,
  `ColorCode` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `color`
--

INSERT INTO `color` (`ColorID`, `ColorCode`) VALUES
(1, 'blue'),
(2, '2');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `customer`
--

CREATE TABLE `customer` (
  `CustomerID` int(11) NOT NULL,
  `CustomerName` varchar(20) NOT NULL,
  `CustomerSurname` varchar(20) NOT NULL,
  `CustomerPhoneNum` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `department`
--

CREATE TABLE `department` (
  `DepartmentID` int(11) NOT NULL,
  `DepartmentName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `department`
--

INSERT INTO `department` (`DepartmentID`, `DepartmentName`) VALUES
(1, 'HUMAN RESOURCES');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `exchange`
--

CREATE TABLE `exchange` (
  `ExchangeID` int(11) NOT NULL,
  `ExchangeNumber` int(20) NOT NULL,
  `ExchangeDate` date NOT NULL,
  `ExchangeExplanation` varchar(300) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `CustomerID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `pattern`
--

CREATE TABLE `pattern` (
  `PatternID` int(11) NOT NULL,
  `PatternName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `pattern`
--

INSERT INTO `pattern` (`PatternID`, `PatternName`) VALUES
(1, 'symetrical'),
(2, 'symetrical'),
(3, 'symetrical'),
(4, 'symetrical'),
(5, 'zsdz');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personnel`
--

CREATE TABLE `personnel` (
  `PersonnelID` int(11) NOT NULL,
  `PersonnelName` varchar(20) NOT NULL,
  `PersonnelSurname` varchar(20) NOT NULL,
  `PersonnelPhoneNum` int(15) NOT NULL,
  `PersonnelAddress` varchar(200) NOT NULL,
  `EntryDate` date DEFAULT NULL,
  `Salary` int(20) NOT NULL,
  `DepartmentID` int(11) NOT NULL,
  `PositionID` int(11) NOT NULL,
  `StoreID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `personnel`
--

INSERT INTO `personnel` (`PersonnelID`, `PersonnelName`, `PersonnelSurname`, `PersonnelPhoneNum`, `PersonnelAddress`, `EntryDate`, `Salary`, `DepartmentID`, `PositionID`, `StoreID`) VALUES
(2, 'melik', 'bozkurt', 1234, 'sivas', '2019-05-08', 15000, 1, 1, 1),
(3, 'yasin enes', 'deliak', 1234, 'kayseri', '2019-05-01', 15000, 1, 1, 1),
(5, 'alperen', 'çınar', 1234, 'konya', '2019-05-02', 15000, 1, 1, 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `position`
--

CREATE TABLE `position` (
  `PositionID` int(11) NOT NULL,
  `PositionName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `position`
--

INSERT INTO `position` (`PositionID`, `PositionName`) VALUES
(1, 'Cashier');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `product`
--

CREATE TABLE `product` (
  `ProductID` int(11) NOT NULL,
  `ProductName` varchar(20) NOT NULL,
  `ProductPrice` int(20) NOT NULL,
  `CategoryID` int(11) NOT NULL,
  `Barcode` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `product`
--

INSERT INTO `product` (`ProductID`, `ProductName`, `ProductPrice`, `CategoryID`, `Barcode`) VALUES
(11, 'blt', 50, 1, 55555);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `returnn`
--

CREATE TABLE `returnn` (
  `ReturnID` int(11) NOT NULL,
  `ReturnNumber` int(20) NOT NULL,
  `ReturnDate` date NOT NULL,
  `ReturnExplanation` varchar(300) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `CustomerID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sales`
--

CREATE TABLE `sales` (
  `SalesID` int(11) NOT NULL,
  `SalesNumber` int(20) NOT NULL,
  `SalesDate` varchar(30) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `StoreID` int(11) NOT NULL,
  `PersonnelID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `sales`
--

INSERT INTO `sales` (`SalesID`, `SalesNumber`, `SalesDate`, `ProductID`, `StoreID`, `PersonnelID`) VALUES
(7, 50, 'Mon May 27 15:31:09 EET 2019', 11, 1, 3);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `size`
--

CREATE TABLE `size` (
  `SizeID` int(11) NOT NULL,
  `SizeName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `size`
--

INSERT INTO `size` (`SizeID`, `SizeName`) VALUES
(1, 'small'),
(2, 'asd');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `stock`
--

CREATE TABLE `stock` (
  `StockID` int(11) NOT NULL,
  `StockNumber` int(20) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `StoreID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `stock`
--

INSERT INTO `stock` (`StockID`, `StockNumber`, `ProductID`, `StoreID`) VALUES
(7, 60, 11, 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `store`
--

CREATE TABLE `store` (
  `StoreID` int(11) NOT NULL,
  `BranchName` varchar(30) NOT NULL,
  `StorePhoneNumber` int(15) NOT NULL,
  `StoreAddress` varchar(200) NOT NULL,
  `City` varchar(20) NOT NULL,
  `DepartmentID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `store`
--

INSERT INTO `store` (`StoreID`, `BranchName`, `StorePhoneNumber`, `StoreAddress`, `City`, `DepartmentID`) VALUES
(1, 'SIVAS', 1234, 'HBK', 'SIVAS', 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `type`
--

CREATE TABLE `type` (
  `TypeID` int(11) NOT NULL,
  `TypeName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `type`
--

INSERT INTO `type` (`TypeID`, `TypeName`) VALUES
(1, 'jean'),
(2, 'jean'),
(3, 'asdasd');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `user`
--

CREATE TABLE `user` (
  `UserID` int(11) NOT NULL,
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Authorization` varchar(20) NOT NULL,
  `PersonnelID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `user`
--

INSERT INTO `user` (`UserID`, `UserName`, `Password`, `Authorization`, `PersonnelID`) VALUES
(3, 'melik', '123', '1', 2),
(8, 'alperen', '123', '1', 5),
(9, 'yas', '123', '2', 3);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`BillID`);

--
-- Tablo için indeksler `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`BrandID`);

--
-- Tablo için indeksler `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`CategoryID`),
  ADD KEY `BrandID` (`BrandID`),
  ADD KEY `CategoryNameID` (`CategoryNameID`),
  ADD KEY `SizeID` (`SizeID`),
  ADD KEY `PatternID` (`PatternID`),
  ADD KEY `ColorID` (`ColorID`),
  ADD KEY `TypeID` (`TypeID`);

--
-- Tablo için indeksler `categoryname`
--
ALTER TABLE `categoryname`
  ADD PRIMARY KEY (`CategoryNameID`);

--
-- Tablo için indeksler `color`
--
ALTER TABLE `color`
  ADD PRIMARY KEY (`ColorID`);

--
-- Tablo için indeksler `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Tablo için indeksler `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DepartmentID`);

--
-- Tablo için indeksler `exchange`
--
ALTER TABLE `exchange`
  ADD PRIMARY KEY (`ExchangeID`),
  ADD KEY `ProductID` (`ProductID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Tablo için indeksler `pattern`
--
ALTER TABLE `pattern`
  ADD PRIMARY KEY (`PatternID`);

--
-- Tablo için indeksler `personnel`
--
ALTER TABLE `personnel`
  ADD PRIMARY KEY (`PersonnelID`),
  ADD KEY `DepartmentID` (`DepartmentID`),
  ADD KEY `PositionID` (`PositionID`),
  ADD KEY `StoreID` (`StoreID`);

--
-- Tablo için indeksler `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`PositionID`);

--
-- Tablo için indeksler `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`);

--
-- Tablo için indeksler `returnn`
--
ALTER TABLE `returnn`
  ADD PRIMARY KEY (`ReturnID`),
  ADD KEY `ProductID` (`ProductID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Tablo için indeksler `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`SalesID`),
  ADD KEY `ProductID` (`ProductID`),
  ADD KEY `StoreID` (`StoreID`),
  ADD KEY `PersonnelID` (`PersonnelID`);

--
-- Tablo için indeksler `size`
--
ALTER TABLE `size`
  ADD PRIMARY KEY (`SizeID`);

--
-- Tablo için indeksler `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`StockID`),
  ADD KEY `ProductID` (`ProductID`),
  ADD KEY `StoreID` (`StoreID`);

--
-- Tablo için indeksler `store`
--
ALTER TABLE `store`
  ADD PRIMARY KEY (`StoreID`),
  ADD KEY `DepartmentID` (`DepartmentID`);

--
-- Tablo için indeksler `type`
--
ALTER TABLE `type`
  ADD PRIMARY KEY (`TypeID`);

--
-- Tablo için indeksler `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`),
  ADD KEY `PersonnelID` (`PersonnelID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `bill`
--
ALTER TABLE `bill`
  MODIFY `BillID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Tablo için AUTO_INCREMENT değeri `brand`
--
ALTER TABLE `brand`
  MODIFY `BrandID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `category`
--
ALTER TABLE `category`
  MODIFY `CategoryID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `categoryname`
--
ALTER TABLE `categoryname`
  MODIFY `CategoryNameID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `color`
--
ALTER TABLE `color`
  MODIFY `ColorID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `customer`
--
ALTER TABLE `customer`
  MODIFY `CustomerID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `department`
--
ALTER TABLE `department`
  MODIFY `DepartmentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `exchange`
--
ALTER TABLE `exchange`
  MODIFY `ExchangeID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `pattern`
--
ALTER TABLE `pattern`
  MODIFY `PatternID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `personnel`
--
ALTER TABLE `personnel`
  MODIFY `PersonnelID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `position`
--
ALTER TABLE `position`
  MODIFY `PositionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `product`
--
ALTER TABLE `product`
  MODIFY `ProductID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Tablo için AUTO_INCREMENT değeri `returnn`
--
ALTER TABLE `returnn`
  MODIFY `ReturnID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `sales`
--
ALTER TABLE `sales`
  MODIFY `SalesID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Tablo için AUTO_INCREMENT değeri `size`
--
ALTER TABLE `size`
  MODIFY `SizeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `stock`
--
ALTER TABLE `stock`
  MODIFY `StockID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Tablo için AUTO_INCREMENT değeri `store`
--
ALTER TABLE `store`
  MODIFY `StoreID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `type`
--
ALTER TABLE `type`
  MODIFY `TypeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `category`
--
ALTER TABLE `category`
  ADD CONSTRAINT `category_ibfk_1` FOREIGN KEY (`CategoryNameID`) REFERENCES `categoryname` (`CategoryNameID`),
  ADD CONSTRAINT `category_ibfk_2` FOREIGN KEY (`SizeID`) REFERENCES `size` (`SizeID`),
  ADD CONSTRAINT `category_ibfk_3` FOREIGN KEY (`BrandID`) REFERENCES `brand` (`BrandID`),
  ADD CONSTRAINT `category_ibfk_4` FOREIGN KEY (`PatternID`) REFERENCES `pattern` (`PatternID`),
  ADD CONSTRAINT `category_ibfk_5` FOREIGN KEY (`ColorID`) REFERENCES `color` (`ColorID`),
  ADD CONSTRAINT `category_ibfk_6` FOREIGN KEY (`TypeID`) REFERENCES `type` (`TypeID`);

--
-- Tablo kısıtlamaları `exchange`
--
ALTER TABLE `exchange`
  ADD CONSTRAINT `exchange_ibfk_1` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`),
  ADD CONSTRAINT `exchange_ibfk_2` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`);

--
-- Tablo kısıtlamaları `personnel`
--
ALTER TABLE `personnel`
  ADD CONSTRAINT `personnel_ibfk_1` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`),
  ADD CONSTRAINT `personnel_ibfk_2` FOREIGN KEY (`PositionID`) REFERENCES `position` (`PositionID`),
  ADD CONSTRAINT `personnel_ibfk_3` FOREIGN KEY (`StoreID`) REFERENCES `store` (`StoreID`);

--
-- Tablo kısıtlamaları `returnn`
--
ALTER TABLE `returnn`
  ADD CONSTRAINT `returnn_ibfk_1` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`),
  ADD CONSTRAINT `returnn_ibfk_2` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`);

--
-- Tablo kısıtlamaları `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`),
  ADD CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`StoreID`) REFERENCES `store` (`StoreID`),
  ADD CONSTRAINT `sales_ibfk_3` FOREIGN KEY (`PersonnelID`) REFERENCES `personnel` (`PersonnelID`);

--
-- Tablo kısıtlamaları `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`),
  ADD CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`StoreID`) REFERENCES `store` (`StoreID`);

--
-- Tablo kısıtlamaları `store`
--
ALTER TABLE `store`
  ADD CONSTRAINT `store_ibfk_1` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`);

--
-- Tablo kısıtlamaları `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`PersonnelID`) REFERENCES `personnel` (`PersonnelID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

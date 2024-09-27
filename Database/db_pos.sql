-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 27, 2024 at 04:37 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pos`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `order_ID` int(11) NOT NULL,
  `inv_ID` int(11) NOT NULL,
  `prodName` varchar(50) NOT NULL,
  `barCode` varchar(50) NOT NULL,
  `Qty` int(11) NOT NULL,
  `Price` double NOT NULL,
  `totPrice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`order_ID`, `inv_ID`, `prodName`, `barCode`, `Qty`, `Price`, `totPrice`) VALUES
(1, 1, 'kamal', 'prasanna', 5, 100, 500),
(2, 1, 'issoBite', 'ib_001', 2, 30, 60),
(3, 1, 'issoBite', 'ib_001', 5, 30, 150),
(4, 1, 'issoBite', 'ib_001', 5, 30, 150),
(5, 1, 'kamal', 'prasanna', 2, 100, 200),
(6, 1, 'issoBite', 'ib_001', 2, 30, 60),
(7, 1, 'kamal', 'prasanna', 2, 100, 200),
(8, 1, 'issoBite', 'ib_001', 2, 30, 60),
(9, 1, 'kamal', 'prasanna', 2, 100, 200),
(10, 1, 'kamal', 'prasanna', 5, 100, 500),
(11, 1, 'issoBite', 'ib_001', 2, 30, 60),
(12, 1, 'issoBite', 'ib_001', 3, 30, 90),
(13, 1, 'kamal', 'prasanna', 4, 100, 400),
(14, 4, 'kamal', 'prasanna', 1, 100, 100),
(15, 5, 'issoBite', 'ib_001', 5, 30, 150),
(16, 5, 'issoBite', 'ib_001', 5, 30, 150),
(17, 5, 'issoBite', 'ib_001', 5, 30, 150),
(18, 5, 'kamal', 'prasanna', 4, 100, 400),
(19, 5, 'issoBite', 'ib_001', 5, 30, 150),
(20, 5, 'kamal', 'prasanna', 4, 100, 400),
(21, 5, 'kamal', 'prasanna', 4, 100, 400),
(22, 6, 'issoBite', 'ib_001', 7, 30, 210),
(23, 7, 'kamal', 'prasanna', 10, 100, 1000),
(24, 8, 'kamal', 'prasanna', 12, 100, 1200),
(25, 9, 'issoBite', 'ib_001', 20, 30, 600),
(26, 9, 'issoBite', 'ib_001', 20, 30, 600),
(27, 10, 'issoBite', 'ib_001', 2, 30, 60),
(28, 10, 'kamal', '123', 4, 200, 800),
(29, 11, 'kamal', 'prasanna', 3, 100, 300),
(30, 12, 'Sun Crush', '456', 1, 150, 150),
(31, 13, 'Sun Crush', '456', 2, 150, 300),
(32, 13, 'Sun Crush', '456', 1, 150, 150),
(33, 14, 'kamal', 'prasanna', 2, 100, 200),
(34, 15, 'Sun Crush', '456', 2, 150, 300),
(35, 16, 'Sun Crush', '456', 2, 150, 300),
(36, 17, 'issoBite', 'ib_001', 5, 30, 150),
(37, 18, 'Chocolte', '125C', 2, 110, 220),
(38, 19, 'Jelly Fruit', '105JF', 2, 70, 140),
(39, 19, 'Cream Cake', '221CC', 5, 400, 2000),
(40, 19, 'Milk Powder', '125MF', 1, 1200, 1200),
(41, 20, 'Kiri pani', '100KP', 2, 75, 150),
(42, 20, 'Jelly Fruit', '105JF', 1, 70, 70),
(43, 20, 'Cream Cake', '221CC', 3, 400, 1200),
(44, 22, 'Milk Powder', '125MF', 2, 1200, 2400),
(45, 23, 'Jelly Fruit', '105JF', 97, 70, 6790),
(46, 24, 'Milk Powder', '125MF', 2, 1200, 2400),
(47, 25, 'Jelly Fruit', '105JF', 10, 70, 700),
(48, 26, 'Jelly Fruit', '105JF', 40, 70, 2800);

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE `cashier` (
  `cashier_ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `NIC_NO` varchar(20) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`cashier_ID`, `Name`, `NIC_NO`, `userName`, `password`) VALUES
(2, 'darshana', '200016002190', 'darshana123', '2558'),
(3, 'Ruwan', '200016002190', 'Ruwan123', '1447'),
(4, 'Owner', '200016002190', 'Admin', '1234'),
(5, 'Dewmini', '200074103462', 'Dew', 'dewmi123');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cus_ID` int(11) NOT NULL,
  `cus_Name` varchar(50) NOT NULL,
  `tp_No` varchar(15) NOT NULL,
  `nic_No` varchar(20) NOT NULL,
  `h_No` varchar(11) NOT NULL,
  `f_lane` varchar(50) NOT NULL,
  `l_lane` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cus_ID`, `cus_Name`, `tp_No`, `nic_No`, `h_No`, `f_lane`, `l_lane`) VALUES
(9, 'Kamal', '0772563698', '197812546985', '45', 'Vallampitiya', 'Colombo'),
(10, 'Ruwan', '0754569872', '200016523215', '56', 'Dehiwala', 'Colombo'),
(11, 'Kasun', '0741253652', '195625612345', '41', 'Godakubura', 'Kahawatta'),
(12, 'Nuwan', '0741253652', '195625612345', '48', 'Godakubura', 'Kahawatta'),
(13, 'Pasindu', '0741253652', '195625612345', '78', 'Galkissa', 'Colombo');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_ID` int(11) NOT NULL,
  `emp_Name` varchar(50) NOT NULL,
  `tp_No` varchar(10) NOT NULL,
  `NIC` varchar(20) NOT NULL,
  `h_No` varchar(11) NOT NULL,
  `f_Lane` varchar(50) NOT NULL,
  `l_Lane` varchar(50) NOT NULL,
  `position` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_ID`, `emp_Name`, `tp_No`, `NIC`, `h_No`, `f_Lane`, `l_Lane`, `position`) VALUES
(5, 'Nimal', '0451231562', '197820005648', '85', 'Moratuwa', 'galkissa', 'Sales Leader'),
(6, 'Nimal', '0451231562', '197820005648', '85', 'dehiwala', 'galkissa', 'Seler'),
(7, 'Amal', '0781231562', '456978521254', '21', 'Kahawatta', 'Rathnapura', 'Manager'),
(8, 'Ranil', '0787895241', '20071452365', '25', 'Kalutara', 'Colombo', 'Cashier'),
(9, 'Ruwan', '0787895785', '200016002190', '25', 'Modara', 'colombo', 'Cashier'),
(10, 'darshana', '0781441440', '200016002190', '7', 'panawala ', 'Atakalanpanna', 'Cashier'),
(11, 'Owner', '0781441440', '200016002190', '', 'Panawala rd', 'Atakalanpanna', ' '),
(12, 'A.D.Ranasinghe', '0760560329', '200074103462', '201/8', 'Kirimatithenna', 'Balangoda', 'Cashier');

-- --------------------------------------------------------

--
-- Table structure for table `extra`
--

CREATE TABLE `extra` (
  `ex_ID` int(10) NOT NULL,
  `val` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `extra`
--

INSERT INTO `extra` (`ex_ID`, `val`) VALUES
(1, '29');

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `orderID` int(11) NOT NULL,
  `inv_ID` int(11) NOT NULL,
  `prod_Name` varchar(50) NOT NULL,
  `barCode` varchar(50) NOT NULL,
  `Qty` varchar(50) NOT NULL,
  `unit_Price` varchar(50) NOT NULL,
  `Total` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `prod_ID` int(11) NOT NULL,
  `prod_Name` varchar(50) NOT NULL,
  `bar_No` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `Qty` int(11) NOT NULL,
  `sup_ID` int(11) NOT NULL,
  `reOrder` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`prod_ID`, `prod_Name`, `bar_No`, `price`, `Qty`, `sup_ID`, `reOrder`) VALUES
(12, 'Drinking Youget', '100DY', 140, 98, 3, 50),
(13, 'Kiri pani', '100KP', 75, 98, 3, 50),
(14, 'Jelly Fruit', '105JF', 70, 43, 3, 50),
(15, 'Milk Powder', '125MF', 1200, 95, 4, 20),
(16, 'Chocolate Biscute', '201CB', 130, 200, 4, 100),
(17, 'Cream Cake', '221CC', 400, 42, 4, 20),
(18, 'Tikiri Mari', '301CC', 80, 249, 5, 70),
(19, 'Gold Mari', '302GM', 60, 250, 5, 70);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `sale_ID` int(11) NOT NULL,
  `inv_ID` int(11) NOT NULL,
  `cus_ID` int(11) NOT NULL,
  `cus_Name` varchar(50) NOT NULL,
  `tot_Qty` int(11) NOT NULL,
  `tot_Bill` double NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Balace` double NOT NULL,
  `cashierD` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`sale_ID`, `inv_ID`, `cus_ID`, `cus_Name`, `tot_Qty`, `tot_Bill`, `Status`, `Balace`, `cashierD`) VALUES
(1, 0, 4, 'darshana', 7, 560, 'Paid', 40, ''),
(2, 1, 4, 'darshana', 7, 490, 'Paid', 10, ''),
(3, 4, 4, 'darshana', 1, 100, 'Paid', 0, ''),
(4, 6, 4, 'darshana', 7, 210, 'Unpaid', -210, ''),
(5, 9, 4, 'darshana', 20, 600, 'Unpaid', -600, ''),
(6, 10, 5, 'thushara', 6, 860, 'Paid', 140, ''),
(7, 11, 7, 'Dilshan', 3, 300, 'Paid', 0, ''),
(8, 12, 0, 'Customer', 1, 150, 'Unpaid', -150, ''),
(9, 13, 0, 'Customer', 3, 450, 'Unpaid', -450, ''),
(10, 14, 0, 'Customer', 2, 200, 'Unpaid', -200, ''),
(11, 15, 0, 'Customer', 2, 300, 'Unpaid', -300, ''),
(12, 16, 0, 'Customer', 2, 300, 'Unpaid', -300, ''),
(13, 17, 7, 'Dilshan', 5, 150, 'Paid', 0, ''),
(14, 18, 0, 'Customer', 2, 220, 'Unpaid', -220, ''),
(15, 19, 11, 'Kasun', 8, 3340, 'Paid', 1660, ''),
(16, 20, 12, 'Nuwan', 6, 1420, 'Paid', 80, ''),
(17, 21, 0, 'Customer', 0, 0, 'Unpaid', 0, ''),
(18, 22, 10, 'Ruwan', 2, 2400, 'Paid', 0, ''),
(19, 23, 0, 'Customer', 97, 6790, 'Paid', 3210, ''),
(20, 24, 12, 'Nuwan', 2, 2400, 'Paid', 0, ''),
(21, 25, 0, 'Customer', 10, 700, 'Paid', 0, ''),
(22, 26, 0, 'Customer', 40, 2800, 'Paid', 0, '');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `sup_ID` int(11) NOT NULL,
  `com_Name` varchar(50) NOT NULL,
  `tp` varchar(10) NOT NULL,
  `reg_No` varchar(20) NOT NULL,
  `h_No` varchar(11) NOT NULL,
  `f_lane` varchar(50) NOT NULL,
  `l_lane` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`sup_ID`, `com_Name`, `tp`, `reg_No`, `h_No`, `f_lane`, `l_lane`) VALUES
(3, 'Chelo', '0774561235', 'DR/125/Gd', '25', 'Malwatta', 'Godakawela'),
(4, 'Maliban', '0751444402', 'Ml/125/Cb', 'No:75', 'mtLeviniya', 'Dehiwla'),
(5, 'Manchi', '0787452631', 'M/178/Cbl', '2/4', 'Ratmalana', 'Galkissa'),
(6, 'Uswatta', '0787256481', 'Us/158/Cbl', '2', 'Gampaha', 'Colombo'),
(7, 'Raigam', '0745698752', 'Rg/258/C', '4', 'Kaduwela', 'Colombo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`order_ID`);

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
  ADD PRIMARY KEY (`cashier_ID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cus_ID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_ID`);

--
-- Indexes for table `extra`
--
ALTER TABLE `extra`
  ADD PRIMARY KEY (`ex_ID`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`orderID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`prod_ID`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`sale_ID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`sup_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `order_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT for table `cashier`
--
ALTER TABLE `cashier`
  MODIFY `cashier_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cus_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `emp_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `extra`
--
ALTER TABLE `extra`
  MODIFY `ex_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `orderID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `prod_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `sale_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `sup_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

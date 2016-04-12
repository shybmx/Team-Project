-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2016 at 09:28 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `garits`
--

-- --------------------------------------------------------

--
-- Table structure for table `cardpayment`
--

CREATE TABLE IF NOT EXISTS `cardpayment` (
`CardPaymentID` int(11) NOT NULL,
  `CustomerName` varchar(20) DEFAULT NULL,
  `CardOwnerName` varchar(30) DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  `CardNumber` int(16) DEFAULT NULL,
  `ExpiryDate` varchar(5) DEFAULT NULL,
  `SortCode` int(6) NOT NULL,
  `AccountNumber` int(8) NOT NULL,
  `SecuirtyNumber` int(3) DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL,
  `PaymentTime` time DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `cardpayment`
--

INSERT INTO `cardpayment` (`CardPaymentID`, `CustomerName`, `CardOwnerName`, `Amount`, `CardNumber`, `ExpiryDate`, `SortCode`, `AccountNumber`, `SecuirtyNumber`, `PaymentDate`, `PaymentTime`) VALUES
(1, 'Abdul', 'AG', 2578.88, 123456731, '10/18', 263712, 252836232, 462, NULL, NULL),
(2, 'William Gates', 'Bill Gates', 626.75, 456312732, '12/27', 213527, 2762351, 463, NULL, NULL),
(3, 'Shahzad', 'Shahzad', 96.43, 23456789, '03/18', 234372, 23214, 123, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `cashpayment`
--

CREATE TABLE IF NOT EXISTS `cashpayment` (
`CashPaymentID` int(11) NOT NULL,
  `CustomerName` varchar(30) DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  `PaymentTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `PaymentDate` date DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `cashpayment`
--

INSERT INTO `cashpayment` (`CashPaymentID`, `CustomerName`, `Amount`, `PaymentTime`, `PaymentDate`) VALUES
(1, 'Shahzad', 56.06, '2016-04-30 09:44:20', NULL),
(2, 'sam', 175.58, '2016-04-30 09:59:10', NULL),
(3, 'Jack', 327.75, '2016-04-08 13:11:53', NULL),
(4, 'Jack Varta', 414, '2016-04-30 13:52:37', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `chequepayment`
--

CREATE TABLE IF NOT EXISTS `chequepayment` (
`ChequePaymentID` int(11) NOT NULL,
  `CustomerName` varchar(30) DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  `ChequeDate` date DEFAULT NULL,
  `PayToName` varchar(30) DEFAULT NULL,
  `ChequeName` varchar(30) NOT NULL,
  `Memo` varchar(30) DEFAULT NULL,
  `HasPaid` int(1) DEFAULT NULL,
  `PaiedDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
`CustomerID` int(11) NOT NULL,
  `JoinDate` timestamp NULL DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `PostCode` varchar(10) DEFAULT NULL,
  `TelephoneNumber` varchar(11) DEFAULT NULL,
  `EMail` varchar(30) DEFAULT NULL,
  `CustomerType` varchar(20) NOT NULL,
  `DiscountType` varchar(15) NOT NULL,
  `Discount` int(3) DEFAULT NULL,
  `Spent` float NOT NULL DEFAULT '0',
  `Status` varchar(20) NOT NULL DEFAULT 'Clear'
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`CustomerID`, `JoinDate`, `name`, `address`, `PostCode`, `TelephoneNumber`, `EMail`, `CustomerType`, `DiscountType`, `Discount`, `Spent`, `Status`) VALUES
(1, NULL, 'Jack Varta', 'Transco Gas Supplies,  Methane Buildings,  Sulphur Lane,  Stenchville,  Bucks', 'HP19 2MT', '0494683725', 'jack@tansco.com', 'Non-Account', 'Fixed', NULL, 414, 'Clear'),
(5, NULL, 'Shahzad', '20 door', 'FE2', '9287654', 'shay@something.com', 'Non-Account', 'Flexible', NULL, 0, 'Due'),
(6, NULL, 'Bob', '2134e', 'weqa', 'sd', 'as', 'Account', 'Fixed', NULL, 0, 'Due'),
(7, NULL, 'Bob', '2134e', 'weqa', 'sd', 'as', 'Account', 'Fixed', NULL, 0, 'Due'),
(8, NULL, 'Bob', 'bob address', 'EEF21', '234567', 'some@e.com', 'Non-Account', ' ', NULL, 0, 'Clear'),
(9, NULL, 'Jack', 'qwefg', '2123', 'qw', 'qwed', 'Non-Account', 'Flexible', NULL, 0, 'Due'),
(10, NULL, 'sam', 'ads', 'ads', 'ads', 'axds', 'Account', 'Fixed', NULL, 0, 'Due'),
(11, NULL, 'TIm', 'sdf', 'fd', 'sfd', 'fs', 'Account', 'Fixed', NULL, 0, 'Due');

-- --------------------------------------------------------

--
-- Table structure for table `job completed`
--

CREATE TABLE IF NOT EXISTS `job completed` (
  `Job_Number` int(11) NOT NULL,
  `Description` varchar(30) NOT NULL,
  `Part No` varchar(30) NOT NULL,
  `Unit Cost` float NOT NULL,
  `Qty` int(11) NOT NULL,
  `Total Price` float NOT NULL,
  `Labour Rate` float NOT NULL,
  `Duration` float NOT NULL,
  `VAT` float NOT NULL,
  `Grand Total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `job completed`
--

INSERT INTO `job completed` (`Job_Number`, `Description`, `Part No`, `Unit Cost`, `Qty`, `Total Price`, `Labour Rate`, `Duration`, `VAT`, `Grand Total`) VALUES
(1, ' Random', 'R1245', 25, 5, 125, 105, 4, 81.75, 626.75),
(3, ' Random', 'R1245', 25, 3, 75, 105, 2, 129, 989),
(3, ' Random', 'R1245', 25, 23, 575, 105, 2, 129, 989),
(5, ' Random', 'R1245', 25, 2, 50, 105, 2, 39, 299),
(4, ' Tyre, heavy tread', 'Teyw2e', 45, 1, 45, 105, 3, 54, 414),
(7, ' Random', 'R1245', 25, 3, 75, 105, 2, 42.75, 327.75),
(8, ' Random', 'R1245', 25, 2, 50, 105, 1, 23.25, 178.25),
(6, ' PARTNEW', 'PARTNEW', 1.68, 2, 3.36, 105, 2, 32, 245.364);

-- --------------------------------------------------------

--
-- Table structure for table `jobs`
--

CREATE TABLE IF NOT EXISTS `jobs` (
`Job ID` int(11) NOT NULL,
  `Job Name` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `jobs`
--

INSERT INTO `jobs` (`Job ID`, `Job Name`) VALUES
(1, 'Replace exhaust '),
(2, 'Strip head and replace worn valves '),
(3, 'Replace grommet seats');

-- --------------------------------------------------------

--
-- Table structure for table `jobsheets`
--

CREATE TABLE IF NOT EXISTS `jobsheets` (
`Job_Number` int(11) NOT NULL,
  `Customer` varchar(20) DEFAULT NULL,
  `VehicleRegNumber` varchar(7) DEFAULT NULL,
  `Make` varchar(20) DEFAULT NULL,
  `EstimatedTime` time(6) DEFAULT NULL,
  `DateBookedIn` date DEFAULT NULL,
  `Model` varchar(30) NOT NULL,
  `TelephoneNumber` varchar(11) DEFAULT NULL,
  `Status` varchar(32) NOT NULL DEFAULT 'Pending',
  `TypeOfJob` varchar(30) NOT NULL,
  `HasPaid` varchar(3) NOT NULL DEFAULT 'No',
  `Reminder count` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `jobsheets`
--

INSERT INTO `jobsheets` (`Job_Number`, `Customer`, `VehicleRegNumber`, `Make`, `EstimatedTime`, `DateBookedIn`, `Model`, `TelephoneNumber`, `Status`, `TypeOfJob`, `HasPaid`, `Reminder count`) VALUES
(1, 'William Gates', 'A21OLE', 'Rolls Royce ', '03:45:00.000000', '2016-04-07', 'Convertible Silver Shadow ', '0666666666', 'Complete', 'Repairs', 'Yes', 4),
(2, 'William Gates', 'A21OLE', 'Rolls Royce ', '02:30:00.000000', '2016-04-08', 'Convertible Silver Shadow ', '0666666666', 'Pending', 'Annual service', 'No', 1),
(3, 'John Doherty', 'G135PUB', 'Fjord', '02:30:00.000000', '2016-04-08', 'Estate', '07070070707', 'Complete', 'Annual service', 'No', 1),
(4, 'Jack Varta', 'V424BHN', 'Fjord', '02:30:00.000000', '2016-04-08', 'Transit Van 2008', '0494683725', 'Complete', 'MOT', 'Yes', 2),
(5, 'Shahzad', 'ADWR', 'DESs', '02:30:00.000000', '2016-08-04', 'sdwe', '9287654', 'Complete', 'Annual service', 'No', 1),
(6, 'Bob', 'FERGWED', '12wds', '02:30:00.000000', '2016-04-08', 'asde', 'sd', 'Complete', 'Annual service', 'No', 4),
(7, 'Jack', 'wsdf', 'wasd', '02:30:00.000000', '2016-04-30', 'qw', 'qw', 'Complete', 'MOT', 'Yes', 1),
(8, 'sam', 'ERDADW', 'ads', '02:30:00.000000', '2016-04-30', 'sadf', 'ads', 'Complete', 'MOT', 'Yes', 0),
(9, 'sam', 'ERDADW', 'ads', '02:30:00.000000', '2016-04-08', 'sadf', 'ads', 'Pending', 'MOT', 'No', 1),
(10, 'Jack', 'wsdf', 'wasd', '02:30:00.000000', '2016-04-03', 'qw', 'qw', 'Pending', 'MOT', 'No', 1),
(11, 'TIm', 'fdx', 'df', '02:30:00.000000', '2016-04-08', 'fdx', 'sfd', 'Pending', 'MOT', 'No', 1);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `Username` varchar(11) NOT NULL DEFAULT '',
  `Loginpassword` varchar(20) NOT NULL DEFAULT '',
  `Name` varchar(20) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `PostCode` varchar(7) DEFAULT NULL,
  `Telephone` varchar(11) DEFAULT NULL,
  `EMail` varchar(25) DEFAULT NULL,
  `Position` varchar(12) DEFAULT NULL,
  `LabourRate` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Loginpassword`, `Name`, `Address`, `PostCode`, `Telephone`, `EMail`, `Position`, `LabourRate`) VALUES
('Anthony', 'melodyman', 'Anthony Wild', 'Wild road', 'EC1REW', '07846372748', 'ant@garits.com', 'Mechanic', 108),
('any', 'any', 'any', 'any', 'EC1WE', '03648264732', 'any@something.com', 'Admin', 0),
('Gavin', 'londonweight', 'Gavin Ross', 'mark nutt lane', 'EC1HQW', '07582364752', 'gavin@garits.com', 'Mechanic', 105),
('Glynne', 'gnasher', 'Glynne Lancaster', 'Garits place', 'EC15GD', '07936183614', 'glynne@garits.com', 'Franchisee', 0),
('Penelope', 'PinkMobile', 'Penelope Carr', 'Penelope lane', 'EC1VE', '07923648362', 'Penelope@garits.com', 'Receptionist', 0),
('Sunny', 'Attitude', 'Sunny Evans', 'Sun Lane', 'EC11WQ', '07923628162', 'sunny@garits.com', 'ForePerson', 125),
('SYSDBA', 'masterkey', 'Administrator Role', 'Rainbow road', 'EC13RE', '0798362735', 'admin@garits.com', 'Admin', 0);

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE IF NOT EXISTS `order` (
`Order ID` int(11) NOT NULL,
  `Total Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `part order`
--

CREATE TABLE IF NOT EXISTS `part order` (
  `Order No` varchar(7) NOT NULL,
  `Description` varchar(30) NOT NULL,
  `Qty` int(11) NOT NULL,
  `Price` float NOT NULL,
  `Supplier` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Order ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `part order`
--

INSERT INTO `part order` (`Order No`, `Description`, `Qty`, `Price`, `Supplier`, `Date`, `Order ID`) VALUES
('12345X', 'Random', 2, 50, 'Fjord', '2016-04-07', 12346),
('1', 'Paint, Arrogant Red', 20, 1200, 'Halfords', '2016-04-08', 123);

-- --------------------------------------------------------

--
-- Table structure for table `parts`
--

CREATE TABLE IF NOT EXISTS `parts` (
  `PartNo` varchar(20) NOT NULL DEFAULT '',
  `PartName` varchar(50) DEFAULT NULL,
  `Supplier` varchar(30) DEFAULT NULL,
  `VehicleType` varchar(30) DEFAULT NULL,
  `Years` varchar(10) DEFAULT NULL,
  `UnitCost` float DEFAULT NULL,
  `Quantity` int(10) DEFAULT NULL,
  `Delivery` int(11) NOT NULL DEFAULT '0',
  `Threshold` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parts`
--

INSERT INTO `parts` (`PartNo`, `PartName`, `Supplier`, `VehicleType`, `Years`, `UnitCost`, `Quantity`, `Delivery`, `Threshold`) VALUES
('AF9910XF', 'Air Filter ', 'Halfords', 'All', '2003-2005', 15, 15, 0, 10),
('D836DHW', 'Distributor Cap', 'Fjord', 'All', '2005-2016', 35, 10, 0, 5),
('DHW62K', 'Spark Leads', 'Halfords', 'All', '2005-2016', 12.5, 13, 0, 10),
('DJ27HDI', 'Paint, Arrogant Red', 'Halfords', 'All', '2005-2016', 60, 3, 0, 1),
('EH462KD', 'Engine Mounts, set', 'Fjord', 'All', '2005-2016', 15, 6, 0, 4),
('EHJ36A', 'Exhaust, complete box', 'Fjord', 'Estate', '2005-2016', 200, 3, 0, 2),
('FELLALOL', 'Spark Plugs, each', 'Halfords', 'All', '20015-2016', 1.5, -20, 0, 20),
('H161LM', 'Interior Bulb', 'Fjord', 'Rolls Royce', '2007-2015', 118, 2, 0, 1),
('MOR1187J', 'Motor Oil', 'Fjord', 'All', '2002-2006', 25, 30, 0, 25),
('OF1108JX', 'Oil Filter ', 'Fjord', 'All', '2007-2016', 10, 16, 0, 15),
('PARTNEW', 'PARTNEW', 'Jims', 'Honda', '2005-2016', 1.68, 10, 0, 1),
('R1245', 'Random', 'Fjord', 'All', '2016-202', 25, 151, 0, 21),
('Teyw2e', 'Tyre, heavy tread', 'Fjord', 'Transit Van', '2005-2016', 45, 8, 0, 6);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
`PaymentID` int(11) NOT NULL,
  `PaymentType` varchar(20) DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  `CustomerName` varchar(30) DEFAULT NULL,
  `PaymentTime` time(6) DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PaymentID`, `PaymentType`, `Amount`, `CustomerName`, `PaymentTime`, `PaymentDate`) VALUES
(1, 'Card Payment', 2578.88, 'Abdul', NULL, NULL),
(2, 'Cash Payment', 626.75, 'William Gates', NULL, NULL),
(3, 'Card Payment', 96.43, 'Shahzad', NULL, NULL),
(4, 'Cash Payment', 56.06, 'Shahzad', NULL, NULL),
(5, 'Cash Payment', 175.58, 'sam', NULL, NULL),
(6, 'Cash Payment', 327.75, 'Jack', NULL, NULL),
(7, 'Cash Payment', 414, 'Jack Varta', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `spare reports`
--

CREATE TABLE IF NOT EXISTS `spare reports` (
  `PartNo` varchar(20) NOT NULL DEFAULT '',
  `PartName` varchar(50) DEFAULT NULL,
  `Supplier` varchar(30) DEFAULT NULL,
  `VehicleType` varchar(30) DEFAULT NULL,
  `Years` varchar(10) DEFAULT NULL,
  `UnitCost` float DEFAULT NULL,
  `Quantity` int(10) DEFAULT NULL,
  `Delivery` int(11) NOT NULL,
  `Threshold` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `standard jobs`
--

CREATE TABLE IF NOT EXISTS `standard jobs` (
  `TypeOfJob` varchar(30) NOT NULL,
  `Discount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `standard jobs`
--

INSERT INTO `standard jobs` (`TypeOfJob`, `Discount`) VALUES
('Annual service', 2.5),
('MOT', 4),
('Repairs', 3.5);

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE IF NOT EXISTS `suppliers` (
  `Supplier` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`Supplier`) VALUES
('Fjord'),
('Halfords'),
('Jims2');

-- --------------------------------------------------------

--
-- Table structure for table `system config`
--

CREATE TABLE IF NOT EXISTS `system config` (
  `Variables` varchar(30) NOT NULL,
  `Value` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `system config`
--

INSERT INTO `system config` (`Variables`, `Value`) VALUES
('Fixed Discount', 1.5),
('Mark up for parts', 30),
('VAT', 15);

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE IF NOT EXISTS `task` (
  `Job_Number` int(11) NOT NULL,
  `Task` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`Job_Number`, `Task`) VALUES
(1, 'Replace exhaust'),
(1, 'Strip head and replace worn valves'),
(1, 'Replace exhaust'),
(3, 'Replace exhaust'),
(4, 'Replace grommet seal'),
(5, 'Replace exhaust'),
(6, 'Break repair'),
(7, 'Replace exhaust'),
(8, 'Strip head and replace worn valves'),
(7, 'Replace exhaust'),
(7, 'Strip head and replace worn valves'),
(10, 'Replace exhaust'),
(11, 'Strip head and replace worn valves');

-- --------------------------------------------------------

--
-- Table structure for table `temp part order`
--

CREATE TABLE IF NOT EXISTS `temp part order` (
  `Order No` varchar(50) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `Qty` int(11) NOT NULL,
  `Price` float NOT NULL,
  `Supplier` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Order ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `temp parts`
--

CREATE TABLE IF NOT EXISTS `temp parts` (
  `Job_Number` int(11) NOT NULL,
  `Description` varchar(30) NOT NULL,
  `Part No` varchar(30) NOT NULL,
  `Unit Cost` float NOT NULL,
  `Qty` int(11) NOT NULL,
  `Total Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE IF NOT EXISTS `vehicle` (
  `CustomerID` int(11) NOT NULL,
  `CustomerName` varchar(20) DEFAULT NULL,
  `regNum` varchar(7) DEFAULT NULL,
  `Make` varchar(20) DEFAULT NULL,
  `Model` varchar(30) DEFAULT NULL,
  `EngSerial` varchar(11) DEFAULT NULL,
  `ChassieNumber` varchar(10) DEFAULT NULL,
  `Colour` varchar(50) DEFAULT NULL,
  `MOT Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`CustomerID`, `CustomerName`, `regNum`, `Make`, `Model`, `EngSerial`, `ChassieNumber`, `Colour`, `MOT Date`) VALUES
(1, 'Jack Varta', 'A878CPG', 'Fjord', 'Transit Van 2006', 'ER2HT', 'CHST263', 'White', '2016-04-07'),
(1, 'Jack Varta', 'C399DWR', 'Fjord', 'Transit Van 2007', 'EH272H', 'DH276D', 'Green', '2016-11-04'),
(1, 'Jack Varta', 'F333GHT', 'Fjord', 'Transit Van 2008', 'DHWE73', 'FH7wd', 'Red', '2016-03-11'),
(1, 'Jack Varta', 'V424BHN', 'Fjord', 'Transit Van 2008', 'DJHW36', 'DFDHJW2', 'White', '2016-10-23'),
(5, 'Shahzad', 'ADWR', 'DESs', 'sdwe', '123', 'q3', 'Green', '2016-04-08'),
(6, 'Bob', 'FERGWED', '12wds', 'asde', 'wda', 'ad', 'qw', '2016-08-04'),
(6, 'Bob', '2373fsa', 'Hona', 'wa', 'as', 'sa', 'red', '2016-04-08'),
(9, 'Jack', 'wsdf', 'wasd', 'qw', 'w', 'wd', 'wd', '2016-08-04'),
(10, 'sam', 'ERDADW', 'ads', 'sadf', 'wasdsad', 'sd', 'red', '2016-04-30'),
(11, 'TIm', 'fdx', 'df', 'fdx', 'df', 'dfx', 'df', '2016-04-08');

-- --------------------------------------------------------

--
-- Table structure for table `work done`
--

CREATE TABLE IF NOT EXISTS `work done` (
  `Job_Number` int(11) NOT NULL,
  `work done` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `work done`
--

INSERT INTO `work done` (`Job_Number`, `work done`) VALUES
(1, 'Strip head and replace worn valves '),
(1, 'Replace exhaust '),
(3, 'Replace exhaust '),
(5, 'Strip head and replace worn valves '),
(4, 'Strip head and replace worn valves '),
(4, 'Replace grommet seats'),
(7, 'Replace grommet seats'),
(8, 'Replace grommet seats'),
(6, 'Strip head and replace worn valves ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cardpayment`
--
ALTER TABLE `cardpayment`
 ADD PRIMARY KEY (`CardPaymentID`);

--
-- Indexes for table `cashpayment`
--
ALTER TABLE `cashpayment`
 ADD PRIMARY KEY (`CashPaymentID`);

--
-- Indexes for table `chequepayment`
--
ALTER TABLE `chequepayment`
 ADD PRIMARY KEY (`ChequePaymentID`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
 ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `jobs`
--
ALTER TABLE `jobs`
 ADD PRIMARY KEY (`Job ID`);

--
-- Indexes for table `jobsheets`
--
ALTER TABLE `jobsheets`
 ADD PRIMARY KEY (`Job_Number`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
 ADD PRIMARY KEY (`Order ID`);

--
-- Indexes for table `parts`
--
ALTER TABLE `parts`
 ADD PRIMARY KEY (`PartNo`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
 ADD PRIMARY KEY (`PaymentID`);

--
-- Indexes for table `spare reports`
--
ALTER TABLE `spare reports`
 ADD PRIMARY KEY (`PartNo`);

--
-- Indexes for table `standard jobs`
--
ALTER TABLE `standard jobs`
 ADD PRIMARY KEY (`TypeOfJob`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
 ADD PRIMARY KEY (`Supplier`);

--
-- Indexes for table `system config`
--
ALTER TABLE `system config`
 ADD PRIMARY KEY (`Variables`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cardpayment`
--
ALTER TABLE `cardpayment`
MODIFY `CardPaymentID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `cashpayment`
--
ALTER TABLE `cashpayment`
MODIFY `CashPaymentID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `chequepayment`
--
ALTER TABLE `chequepayment`
MODIFY `ChequePaymentID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
MODIFY `CustomerID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `jobs`
--
ALTER TABLE `jobs`
MODIFY `Job ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `jobsheets`
--
ALTER TABLE `jobsheets`
MODIFY `Job_Number` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
MODIFY `Order ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
MODIFY `PaymentID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

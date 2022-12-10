-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Dec 10, 2022 at 11:27 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `carrentalmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `emp_id` int(11) UNSIGNED NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `date` datetime NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`emp_id`, `name`, `gender`, `phone`, `email`, `address`, `date`, `username`, `password`) VALUES
(1, 'Brian Saitabau', 'M', '0987654321', 'briansaitabau29@gmail.com', 'BS', '2022-11-15 10:55:55', 'admin1', 'admin1'),
(2, 'Antony Luttah', 'M', '0987654321', 'antony@gmail.com', 'AL 123', '2022-11-17 08:50:59', 'admin2', 'admin2'),
(3, 'Reagan', 'M', '0987654321', 'reagan@gmail.com', '123', '2022-11-22 09:55:06', 'admin3', 'admin3'),
(4, 'patrick', 'M', '0791387178', 'patrickgilbert021@gmail.com', '123', '2022-12-01 13:22:12', 'gee', '1234'),
(5, 'cliford', 'M', '0795280033', 'clifordandala@gmail.com', '597', '2022-12-01 13:26:36', 'senior', '1234'),
(6, 'admin4', 'M', '0791387178', 'patrickgilbert021@gmail.com', '123', '2022-12-01 13:29:02', 'gee', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `car_id` int(11) UNSIGNED NOT NULL,
  `brand` varchar(20) NOT NULL,
  `make` varchar(20) NOT NULL,
  `color` varchar(10) NOT NULL,
  `passengers` int(2) NOT NULL,
  `date` datetime NOT NULL,
  `rental-price` varchar(10) NOT NULL,
  `isPresent` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`car_id`, `brand`, `make`, `color`, `passengers`, `date`, `rental-price`, `isPresent`) VALUES
(1, 'Ford', 'Ford1', 'White', 10, '2022-11-11 23:25:59', '12000', 0),
(2, 'Toyota', 'Hilux', 'White', 5, '2022-11-11 23:27:49', '20000', 0),
(3, 'Mercedes Benz', 'Compressor', 'Grey', 8, '2022-11-11 23:32:31', '50000', 0),
(4, 'Ford', 'Double Cabin', 'Black', 12, '2022-11-11 23:35:58', '30000', 1),
(5, 'Toyota', 'Filder', 'Blue', 5, '2022-11-11 23:36:58', '5000', 0),
(6, 'Chevrolet', 'Chevy', 'Pink', 10, '2022-11-11 23:42:20', '12000', 1),
(7, 'Nissan', 'Matatu', 'Yellow', 14, '2022-11-11 23:56:48', '10000', 1),
(8, 'Jaguar', 'Fly', 'Green', 5, '2022-11-12 02:53:44', '12000', 1),
(9, 'Lamboghini', 'Aventordor', 'Green', 5, '2022-11-12 18:35:40', '12000', 1),
(10, 'Lamboghini', 'Urus', 'Blue', 5, '2022-11-13 05:19:54', '14000', 0),
(11, 'Nissan', 'Double Cabin', 'Black', 4, '2022-11-14 11:34:25', '10000', 0),
(12, 'Toyota', 'Prado', 'Grey', 5, '2022-11-14 11:35:13', '15000', 1),
(13, 'Mercedes', 'Prado', 'Blue', 5, '2022-11-14 19:29:14', '20000', 1),
(14, 'Nissan', 'Prado', 'Red', 10, '2022-11-14 20:01:21', '15000', 1),
(15, 'Tesla', 'Tesla 3', 'White', 2, '2022-11-14 20:48:28', '5000', 0),
(16, 'BMW', 'BMW1', 'Red', 4, '2022-11-14 20:49:30', '12000', 0),
(17, 'Mercedes', 'Jeep', 'White', 4, '2022-11-15 10:36:46', '20000', 0),
(18, 'Toyota', 'Xclusive', 'White', 6, '2022-11-16 08:18:14', '24000', 0),
(19, 'Mercedes', 'Compressor', 'Grey', 20, '2022-11-20 00:00:00', '20000', 1),
(20, 'Mercedes', 'GLEN', 'White', 4, '2022-11-17 08:40:44', '12000', 0),
(21, 'Hp', 'Elitebook', 'Grey', 1, '2022-11-22 09:44:57', '30000', 1),
(22, 'toyota', 'probox', 'blue', 14, '2022-11-22 11:28:47', '45000', 0),
(23, 'Subaru', 'forester', 'Black', 4, '2022-12-01 13:08:27', '40000', 1),
(24, 'Gihub Original', 'Git', 'Grey', 123, '2022-12-10 13:18:52', '15000', 0);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cust_id` int(11) UNSIGNED NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cust_id`, `name`, `gender`, `phone`, `email`, `address`, `date`) VALUES
(1, 'Peter Sitoya', 'M', '098765432', 'petersitoya@gmail.com', 'KJO', '2022-11-11 23:01:49'),
(2, 'Erick Lung\'atso', 'M', '0987654321', 'erickl@gmail.com', 'Mago', '2022-11-11 23:03:39'),
(3, 'Joan Akinyi', 'F', '0987654321', 'joanakinyi@gmail.com', 'BGA', '2022-11-11 23:05:22'),
(4, 'Morgan Freeman', 'M', '0987654321', 'morganfreeman@gmail.com', 'NY', '2022-11-12 02:52:46'),
(5, 'Zinirah Jaffar', 'F', '0987654321', 'zinirah@gmail.com', 'zin', '2022-11-12 18:35:06'),
(6, 'Brian Saitabau', 'M', '0987654321', 'briansaitabau29@gmail.com', '1234', '2022-11-13 05:34:23'),
(7, 'Antony Luttah', 'M', '0745172000', 'antony2000@gmail.com', 'antony1274', '2022-11-14 11:27:45'),
(8, 'Mark Wekesa', 'M', '0987654321', 'markwekesa@gmail.com', 'mark 123', '2022-11-14 20:50:04'),
(9, 'Cliford Buhuru', 'M', '0987654321', 'clifordbuhuru@gmail.com', 'CB', '2022-11-15 10:36:06'),
(10, 'Wycliffe Ambesta', 'M', '0987654321', 'wiki@gmail.com', 'WA 50', '2022-11-16 08:17:03'),
(11, 'Glen Austin', 'M', '0987654321', 'glenaustin@gmail.com', 'GA 123', '2022-11-17 08:40:17'),
(12, 'Gilbert ', 'M', '0987654321', 'gilbert@gmail.com', '123', '2022-11-22 09:44:22'),
(13, 'joyline', 'F', '0712345678', 'jwatoya@student.kafuco.ke', '12345', '2022-11-22 11:26:18'),
(14, 'Anne', 'F', '115832326', 'ochiengjoan9@gmail', '444', '2022-12-01 13:04:25'),
(15, 'Github', 'M', '0987654321', 'github@gmail.com', '1234', '2022-12-10 13:18:25');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_id` int(11) UNSIGNED NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `date` datetime NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `name`, `gender`, `phone`, `email`, `address`, `date`, `username`, `password`) VALUES
(1, 'Antony Luttah', 'M', '0759636663', 'antonyluttah@gmail.com', 'KKM', '2022-11-22 09:53:24', 'antony', '1234'),
(5, 'Joan Akinyi', 'F', '0987654321', 'joanakinyi@gmail.com', 'JA', '2022-11-15 09:27:57', 'joan', '1234'),
(7, 'Brian Saitabau', 'M', '0987654321', 'briansaitabau29@gmail.com', '123', '2022-11-22 09:41:50', 'brian', '1234'),
(8, 'Reagan', 'M', '0987654321', 'reagan@gmail.com', '123', '2022-11-22 09:51:48', 'reagan', '1234'),
(9, 'Cliford', 'M', '0987654321', 'cliford@gmail.com', '123', '2022-11-22 09:52:17', 'cliford', '1234'),
(10, 'Gilbert', 'M', '0987654321', 'gilbert@gmail.com', '123', '2022-11-22 09:52:42', 'gilbert', '1234'),
(11, 'rodah', 'F', '0798379836', 'rnabifwo@student.kafuco.ac.ke', 'sdfg', '2022-11-22 11:23:48', 'rodah', '1234'),
(12, 'Maxwell', 'M', '0987654321', 'maxwell@gmail.com', '123', '2022-11-23 13:36:54', 'max', 'max'),
(13, 'Patrick', 'M', '0791387178', 'patrickgilbert021@gmail.com', '123', '2022-12-01 13:20:36', 'gee', '1234'),
(14, 'Patrick', 'M', '0791387178', 'patrickgilbert021@gmail.com', '123', '2022-12-01 13:24:10', 'gee', '1234'),
(15, 'John', 'M', '1234567', 'john', '3456', '2022-12-01 13:47:47', 'John', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `rentals`
--

CREATE TABLE `rentals` (
  `rental_id` int(11) UNSIGNED NOT NULL,
  `cust_id` int(11) UNSIGNED NOT NULL,
  `car_id` int(11) UNSIGNED NOT NULL,
  `car_name` varchar(30) NOT NULL,
  `date_of_rent` date NOT NULL,
  `expected_return_date` date NOT NULL,
  `return_date` date DEFAULT NULL,
  `is_returned` tinyint(1) NOT NULL,
  `overdue` int(11) DEFAULT NULL,
  `fine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rentals`
--

INSERT INTO `rentals` (`rental_id`, `cust_id`, `car_id`, `car_name`, `date_of_rent`, `expected_return_date`, `return_date`, `is_returned`, `overdue`, `fine`) VALUES
(6, 6, 8, 'Jaguar Fly Green', '2022-11-15', '2022-11-01', '2022-12-08', 1, 0, 0),
(7, 6, 11, 'Nissan Double Cabin Black', '2022-11-15', '2022-11-01', '2022-11-15', 1, 14, 70000),
(8, 6, 1, 'Ford Ford1 White', '2022-11-15', '2022-11-22', '2022-12-01', 1, 8, 40000),
(9, 6, 4, 'Ford Double Cabin Black', '2022-11-15', '2022-11-22', '2022-12-08', 1, 0, 0),
(10, 6, 12, 'Toyota Prado Grey', '2022-11-15', '2022-11-22', '2022-12-08', 1, 0, 0),
(11, 1, 10, 'Lamboghini Urus Blue', '2022-11-15', '2022-11-16', '2022-11-15', 1, 0, 0),
(12, 1, 1, 'Ford Ford1 White', '2022-11-15', '2022-11-16', '2022-12-01', 1, 8, 40000),
(13, 9, 17, 'Mercedes Jeep White', '2022-11-15', '2022-11-23', NULL, 0, NULL, NULL),
(14, 9, 2, 'Toyota Hilux White', '2022-11-15', '2022-11-23', NULL, 0, NULL, NULL),
(15, 9, 5, 'Toyota Filder Blue', '2022-11-15', '2022-11-23', NULL, 0, NULL, NULL),
(16, 9, 10, 'Lamboghini Urus Blue', '2022-11-15', '2022-11-23', NULL, 0, NULL, NULL),
(17, 10, 18, 'Toyota Xclusive White', '2022-11-16', '2022-11-30', '2022-12-08', 1, 15, 75000),
(18, 10, 11, 'Nissan Double Cabin Black', '2022-11-16', '2022-11-30', NULL, 0, NULL, NULL),
(19, 11, 19, 'Mercedes Compressor Grey', '2022-11-17', '2022-11-25', '2022-12-08', 1, 0, 0),
(20, 11, 20, 'Mercedes GLEN White', '2022-11-17', '2022-11-25', '2022-11-17', 1, 0, 0),
(21, 11, 13, 'Mercedes Prado Blue', '2022-11-17', '2022-11-25', '2022-12-08', 1, 0, 0),
(22, 11, 9, 'Lamboghini Aventordor Green', '2022-11-17', '2022-11-25', '2022-12-08', 1, 0, 0),
(23, 1, 1, 'Ford Ford1 White', '2022-11-21', '2022-11-23', '2022-12-01', 1, 8, 40000),
(24, 1, 13, 'Mercedes Prado Blue', '2022-11-21', '2022-11-23', '2022-12-08', 1, 0, 0),
(25, 1, 18, 'Toyota Xclusive White', '2022-11-21', '2022-11-23', '2022-12-08', 1, 15, 75000),
(26, 12, 20, 'Mercedes GLEN White', '2022-11-22', '2022-11-23', NULL, 0, NULL, NULL),
(27, 12, 21, 'Hp Elitebook Grey', '2022-11-22', '2022-11-23', '2022-12-08', 1, 0, 0),
(28, 12, 12, 'Toyota Prado Grey', '2022-11-22', '2022-11-23', '2022-12-08', 1, 0, 0),
(29, 13, 22, 'toyota probox blue', '2022-12-01', '2022-12-30', NULL, 0, NULL, NULL),
(30, 14, 23, 'Subaru forester Black', '2022-12-01', '2022-12-03', '2022-12-08', 1, 0, 0),
(31, 1, 3, 'Mercedes Benz Compressor Grey', '2022-12-01', '2022-12-30', '2022-12-08', 1, 0, 0),
(32, 1, 1, 'Ford Ford1 White', '2022-12-08', '2022-12-22', NULL, 0, NULL, NULL),
(33, 1, 12, 'Toyota Prado Grey', '2022-12-08', '2022-12-22', '2022-12-08', 1, 0, 0),
(34, 1, 19, 'Mercedes Compressor Grey', '2022-12-08', '2022-12-22', '2022-12-08', 1, 0, 0),
(35, 1, 4, 'Ford Double Cabin Black', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(36, 1, 14, 'Nissan Prado Red', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(37, 1, 6, 'Chevrolet Chevy Pink', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(38, 1, 6, 'Chevrolet Chevy Pink', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(39, 1, 6, 'Chevrolet Chevy Pink', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(40, 1, 21, 'Hp Elitebook Grey', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(41, 1, 7, 'Nissan Matatu Yellow', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(42, 1, 8, 'Jaguar Fly Green', '2022-12-08', '2022-12-23', '2022-12-08', 1, 0, 0),
(43, 1, 9, 'Lamboghini Aventordor Green', '2022-12-08', '2022-12-10', '2022-12-08', 1, 0, 0),
(44, 1, 13, 'Mercedes Prado Blue', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(45, 1, 15, 'Tesla Tesla 3 White', '2022-12-08', '2022-12-16', '2022-12-08', 1, 0, 0),
(46, 1, 16, 'BMW BMW1 Red', '2022-12-08', '2022-12-30', '2022-12-08', 1, 0, 0),
(47, 1, 23, 'Subaru forester Black', '2022-12-08', '2022-12-22', '2022-12-08', 1, 0, 0),
(48, 6, 3, 'Mercedes Benz Compressor Grey', '2022-12-08', '2022-12-30', NULL, 0, NULL, NULL),
(49, 6, 15, 'Tesla Tesla 3 White', '2022-12-08', '2022-12-30', NULL, 0, NULL, NULL),
(50, 6, 18, 'Toyota Xclusive White', '2022-12-08', '2022-12-30', NULL, 0, NULL, NULL),
(51, 15, 24, 'Gihub Original Git Grey', '2022-12-10', '2022-12-28', NULL, 0, NULL, NULL),
(52, 15, 16, 'BMW BMW1 Red', '2022-12-10', '2022-12-28', NULL, 0, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`car_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cust_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indexes for table `rentals`
--
ALTER TABLE `rentals`
  ADD PRIMARY KEY (`rental_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `emp_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `car`
--
ALTER TABLE `car`
  MODIFY `car_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cust_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `emp_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `rentals`
--
ALTER TABLE `rentals`
  MODIFY `rental_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

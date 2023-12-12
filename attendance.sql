-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2023 at 07:57 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `attendance`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `srno` varchar(20) NOT NULL,
  `atnd` varchar(20) NOT NULL,
  `date` varchar(20) NOT NULL,
  `time` varchar(50) NOT NULL,
  `user` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`srno`, `atnd`, `date`, `time`, `user`) VALUES
('1', 'present', '2023-12-01', '0:29:37', '1'),
('2', 'absent', '2023-12-01', '0:29:42', '1');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `user` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `qualification` varchar(30) NOT NULL,
  `post` varchar(40) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`user`, `password`, `name`, `dob`, `qualification`, `post`, `address`, `contact`, `email`) VALUES
('1', '123456', 'mohit', '10-02-2004', 'bca', 'student', 'mmb', '9411525452', 'mohit@9415'),
('2', '1234546789', 'rahul', '10-12-1952', 'bba', 'student', 'lucknow', '+919845621828', 'rahul@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `srno` int(255) NOT NULL,
  `sname` varchar(255) NOT NULL,
  `scourse` varchar(255) NOT NULL,
  `sem` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`srno`, `sname`, `scourse`, `sem`, `address`, `contact`, `email`) VALUES
(1, 'mohit', 'bca', '6', 'mmb sitapur', '9415284162', 'mohit@gmail.com'),
(2, 'shiv', 'bca', '6', 'adil nagar', '8182870762', 'sv@gmail.com'),
(3, 'rahul', 'b.tech', '5', 'behta,lucknow', '6388839394', 'rahul@gmail.com'),
(4, 'william', 'mba', '1', 'sitapur', '6307861554', 'william@gmail.com'),
(5, 'satyvan', 'bba', '6', 'house num-32 adilnagar lucknkw', '+9135529652526', 'saty@gmail.com'),
(6, 'lili', 'mba', '6', 'siddharthanagar', '+91987456321', 'kili@gmail.com'),
(7, 'marry', 'B.A.', '2', 'unan', '+91654896321', 'marry@gmail.com'),
(8, 'hobbs', 'b.sc', '4', 'england', '+9158454623', 'hobbs@gmail.com'),
(9, 'alexandar', 'm.tech', '6', 'rome', '+91956225412', 'alexander@gmail.com'),
(10, 'juli', 'm.a.', '8', 'romaniya', '+91854128542', 'juli@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`user`);

--
-- Indexes for table `student_info`
--
ALTER TABLE `student_info`
  ADD PRIMARY KEY (`srno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

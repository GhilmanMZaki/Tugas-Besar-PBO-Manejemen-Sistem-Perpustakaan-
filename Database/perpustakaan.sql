-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2022 at 08:55 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `ISBN` char(13) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `penulis` varchar(30) NOT NULL,
  `jenis_buku` varchar(30) NOT NULL,
  `jml_halaman` int(10) NOT NULL,
  `stock` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`ISBN`, `judul`, `penulis`, `jenis_buku`, `jml_halaman`, `stock`) VALUES
('0987098712345', 'How to peek mid in Haven', 'Akbar ', 'Tutorial', 1234, 10),
('1234123412321', 'Belajar mengaji', 'Elita', 'Pelajaran', 123, 14),
('1234412343', 'How to buy Huawei', 'Boss', 'Tutorial', 1234, 14),
('1234567890123', 'Belajar PBO', 'Ghilman', 'Pelajaran', 132, 5);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id_member` char(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `umur` int(30) NOT NULL,
  `jabatan` varchar(30) NOT NULL,
  `tgl_bergabung` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id_member`, `nama`, `gender`, `umur`, `jabatan`, `tgl_bergabung`) VALUES
('1301194004', 'Akbar Maulino', 'Pria', 20, 'Mahasiswa', '25 Jan, 2022'),
('1301194127', 'Elita', 'Wanita', 20, 'Mahasiswa', '2 Jan, 2022'),
('1301194217', 'Ghilman', 'Pria', 20, 'Mahasiswa', '6 Jan, 2022');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `ISBN` char(13) NOT NULL,
  `id_member` char(10) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tgl_peminjaman` varchar(30) NOT NULL,
  `tgl_pengembalian` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `ISBN`, `id_member`, `judul`, `nama`, `tgl_peminjaman`, `tgl_pengembalian`, `status`) VALUES
(1, '1234567890123', '1301194217', 'Belajar PBO', 'Ghilman', '1 Jan, 2022', '27 Jan, 2022', 'Finish'),
(3, '0987098712345', '1301194004', 'How to peek mid in Haven', 'Akbar Maulino', '2 Jan, 2022', '26 Jan, 2022', 'Finish'),
(4, '0987098712345', '1301194127', 'How to peek mid in Haven', 'Elita', '5 Jan, 2022', '28 Jan, 2022', 'Finish'),
(5, '1234123412321', '1301194217', 'Belajar mengaji', 'Ghilman', '4 Jan, 2022', '26 Jan, 2022', 'Finish');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`ISBN`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

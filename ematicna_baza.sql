-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2020 at 12:07 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ematicna_baza`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `admin_ime` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `lozinka` varchar(255) COLLATE utf16_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `admin_ime`, `lozinka`) VALUES
(1, 'test admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `korisnik`
--

CREATE TABLE `korisnik` (
  `id` int(11) NOT NULL,
  `korisnicko_ime` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `lozinka` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `tip_korisnika` varchar(255) COLLATE utf16_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `korisnik`
--

INSERT INTO `korisnik` (`id`, `korisnicko_ime`, `lozinka`, `tip_korisnika`) VALUES
(1, 'test korisnik', '1234', 'Ravnatelj ');

-- --------------------------------------------------------

--
-- Table structure for table `maticna_knjiga`
--

CREATE TABLE `maticna_knjiga` (
  `id` int(11) NOT NULL,
  `broj_maticne` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `maticna_knjiga`
--

INSERT INTO `maticna_knjiga` (`id`, `broj_maticne`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `maticni_podaci_1`
--

CREATE TABLE `maticni_podaci_1` (
  `id` int(11) NOT NULL,
  `iducenik` int(11) NOT NULL,
  `jezik1` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `jezik1o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `likovnakultura` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `glazbenakultura` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `jezik2` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `jezik2o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `jezik3` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `jezik3o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `matematika` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `priroda` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `biologija` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `kemija` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `fizika` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `povijest` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `geografija` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `tehnickakultura` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `tjelesni` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet1` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet1o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet2` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet2o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet3` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet3o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet4` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `predmet4o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `izborni1` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `izborni1o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `izborni2` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `izborni2o` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `izborni3` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `izborni3o` varchar(255) COLLATE utf16_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `maticni_podaci_1`
--

INSERT INTO `maticni_podaci_1` (`id`, `iducenik`, `jezik1`, `jezik1o`, `likovnakultura`, `glazbenakultura`, `jezik2`, `jezik2o`, `jezik3`, `jezik3o`, `matematika`, `priroda`, `biologija`, `kemija`, `fizika`, `povijest`, `geografija`, `tehnickakultura`, `tjelesni`, `predmet1`, `predmet1o`, `predmet2`, `predmet2o`, `predmet3`, `predmet3o`, `predmet4`, `predmet4o`, `izborni1`, `izborni1o`, `izborni2`, `izborni2o`, `izborni3`, `izborni3o`) VALUES
(5, 1237, 'Hrvatski jezik ', '2', '4', '5', 'Engleski jezik', '2', ' ', ' ', '5', '4', '2', '2', '4', '3', '3', '2', '5', 'Poslovna informatika ', '5', '', ' ', '', ' ', '', ' ', 'Informatika ', '5', ' ', ' ', ' ', ' ');

-- --------------------------------------------------------

--
-- Table structure for table `maticni_podaci_2`
--

CREATE TABLE `maticni_podaci_2` (
  `id` int(11) NOT NULL,
  `iducenik` int(11) NOT NULL,
  `zavrsio` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `kojiput` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `vladanje` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `uspjeh` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `opravdani` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `neopravdani` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `aktivnost1` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `aktivnost2` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `aktivnost3` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `godina1` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `godina2` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `urbroj` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `mjesto` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `nadnevak` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `razrednik` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `ravnatelj` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `napomena` varchar(255) COLLATE utf16_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `maticni_podaci_2`
--

INSERT INTO `maticni_podaci_2` (`id`, `iducenik`, `zavrsio`, `kojiput`, `vladanje`, `uspjeh`, `opravdani`, `neopravdani`, `aktivnost1`, `aktivnost2`, `aktivnost3`, `godina1`, `godina2`, `urbroj`, `mjesto`, `nadnevak`, `razrednik`, `ravnatelj`, `napomena`) VALUES
(5, 1237, 'sedmi (VII.)', 'prvi', 'uzorno', 'Dobrim (3)', '65', '7', 'Stolni tenis ', 'Nogomet ', ' ', '\02\00', '\02\01', '111/21', 'Mostar', '21.06.2021.', '\0M\0a\0r\0i\0o\0 \0M\0a\0r\0i\0n', 'Ivo Ivic', 'proba');

-- --------------------------------------------------------

--
-- Table structure for table `razred`
--

CREATE TABLE `razred` (
  `id` int(11) NOT NULL,
  `broj_razreda` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `tip_razreda` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `ucitelj` varchar(255) COLLATE utf16_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `razred`
--

INSERT INTO `razred` (`id`, `broj_razreda`, `tip_razreda`, `ucitelj`) VALUES
(2, '7', '', 'Mario Marin');

-- --------------------------------------------------------

--
-- Table structure for table `skolska_godina`
--

CREATE TABLE `skolska_godina` (
  `id` int(11) NOT NULL,
  `godina1` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `godina2` varchar(255) COLLATE utf16_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `skolska_godina`
--

INSERT INTO `skolska_godina` (`id`, `godina1`, `godina2`) VALUES
(1, '20', '21');

-- --------------------------------------------------------

--
-- Table structure for table `ucenik`
--

CREATE TABLE `ucenik` (
  `id` int(11) NOT NULL,
  `iducenik` int(20) NOT NULL,
  `maticna_knjiga` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL,
  `maticni_broj` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `ime` text COLLATE utf16_croatian_ci NOT NULL,
  `prezime` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `jmbg` varchar(225) COLLATE utf16_croatian_ci NOT NULL,
  `spol` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `roditelj` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `datum_rodjenja` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `mjesto_rodjenja` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `opcina_rodjenja` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `drzava_rodjenja` text COLLATE utf16_croatian_ci NOT NULL,
  `drzavljanstvo` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `nacionalnost` varchar(255) COLLATE utf16_croatian_ci NOT NULL,
  `godina_prvog_razreda` varchar(255) COLLATE utf16_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_croatian_ci;

--
-- Dumping data for table `ucenik`
--

INSERT INTO `ucenik` (`id`, `iducenik`, `maticna_knjiga`, `maticni_broj`, `ime`, `prezime`, `jmbg`, `spol`, `roditelj`, `datum_rodjenja`, `mjesto_rodjenja`, `opcina_rodjenja`, `drzava_rodjenja`, `drzavljanstvo`, `nacionalnost`, `godina_prvog_razreda`) VALUES
(1, 12, '\01', '2', 'ime_test', 'prezime_test', '1234567890', 'M', 'mama i tata ', '01.01.2001.', 'Vinkovci', 'Vinkovci ', 'Republika Hrvatska', 'BiH', 'Hrvat ', '2008.'),
(2, 123, '1', '\02\03', '\0D\0a\0r\0i\0o', '\0S\0r\0n\0a', '\01\02\03\04\05\06\07\08\09\00\01\02\03', '\0M', 'ANICA i IVO', '\02\01\0.\01\02\0.\02\00\00\06\0.', '\0S\0l\0a\0v\0o\0n\0s\0k\0i\0 \0B\0r\0o\0d', '\0S\0l\0a\0v\0o\0n\0s\0k\0i\0 \0B\0r\0o\0d', '\0R\0e\0p\0u\0b\0l\0i\0k\0a\0 \0H\0r\0v\0a\0t\0s\0k\0a', '\0B\0i\0H', '\0H\0r\0v\0a\0t', '\02\00\01\03\0.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `korisnik`
--
ALTER TABLE `korisnik`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `maticna_knjiga`
--
ALTER TABLE `maticna_knjiga`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `maticni_podaci_1`
--
ALTER TABLE `maticni_podaci_1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `maticni_podaci_2`
--
ALTER TABLE `maticni_podaci_2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `razred`
--
ALTER TABLE `razred`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skolska_godina`
--
ALTER TABLE `skolska_godina`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ucenik`
--
ALTER TABLE `ucenik`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `korisnik`
--
ALTER TABLE `korisnik`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `maticna_knjiga`
--
ALTER TABLE `maticna_knjiga`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `maticni_podaci_1`
--
ALTER TABLE `maticni_podaci_1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `maticni_podaci_2`
--
ALTER TABLE `maticni_podaci_2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `razred`
--
ALTER TABLE `razred`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `skolska_godina`
--
ALTER TABLE `skolska_godina`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `ucenik`
--
ALTER TABLE `ucenik`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

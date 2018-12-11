-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Dez-2018 às 13:13
-- Versão do servidor: 10.1.35-MariaDB
-- versão do PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `caixaeletronico`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `contas`
--

CREATE TABLE `contas` (
  `idconta` int(11) NOT NULL,
  `numconta` varchar(45) DEFAULT NULL,
  `saldodispconta` decimal(6,2) DEFAULT NULL,
  `saldototalconta` decimal(6,2) DEFAULT NULL,
  `senhaconta` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `contas`
--

INSERT INTO `contas` (`idconta`, `numconta`, `saldodispconta`, `saldototalconta`, `senhaconta`) VALUES
(2, '01', '174.80', '1174.80', 'newchave'),
(3, '295221', '39.00', '1039.00', 'root');

-- --------------------------------------------------------

--
-- Estrutura da tabela `deposita`
--

CREATE TABLE `deposita` (
  `iddeposita` int(11) NOT NULL,
  `valordeposita` decimal(6,2) DEFAULT NULL,
  `numcontadeposita` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `deposita`
--

INSERT INTO `deposita` (`iddeposita`, `valordeposita`, `numcontadeposita`) VALUES
(1, '20.00', '295221'),
(2, '10.00', '295221');

-- --------------------------------------------------------

--
-- Estrutura da tabela `saque`
--

CREATE TABLE `saque` (
  `idsaque` int(11) NOT NULL,
  `valorsaque` decimal(6,2) DEFAULT NULL,
  `numcontasaque` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `saque`
--

INSERT INTO `saque` (`idsaque`, `valorsaque`, `numcontasaque`) VALUES
(2, '25.20', '2'),
(4, '5.00', '295221'),
(7, '1.00', '295221'),
(8, '2.00', '295221');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contas`
--
ALTER TABLE `contas`
  ADD PRIMARY KEY (`idconta`);

--
-- Indexes for table `deposita`
--
ALTER TABLE `deposita`
  ADD PRIMARY KEY (`iddeposita`);

--
-- Indexes for table `saque`
--
ALTER TABLE `saque`
  ADD PRIMARY KEY (`idsaque`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contas`
--
ALTER TABLE `contas`
  MODIFY `idconta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `deposita`
--
ALTER TABLE `deposita`
  MODIFY `iddeposita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `saque`
--
ALTER TABLE `saque`
  MODIFY `idsaque` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

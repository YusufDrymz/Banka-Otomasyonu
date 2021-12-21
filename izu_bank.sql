-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 21 Ara 2021, 14:21:04
-- Sunucu sürümü: 10.4.22-MariaDB
-- PHP Sürümü: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `izu_bank`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `kullanici_id` int(11) NOT NULL,
  `ad_soyad` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `tc_no` varchar(11) COLLATE utf8mb4_turkish_ci NOT NULL,
  `tel_no` varchar(11) COLLATE utf8mb4_turkish_ci NOT NULL,
  `guvenlik_sorusu` varchar(75) COLLATE utf8mb4_turkish_ci NOT NULL,
  `guvenlik_cevap` varchar(75) COLLATE utf8mb4_turkish_ci NOT NULL,
  `musteri_no` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `sifre` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`kullanici_id`, `ad_soyad`, `tc_no`, `tel_no`, `guvenlik_sorusu`, `guvenlik_cevap`, `musteri_no`, `sifre`) VALUES
(10, 'Yusuf Erkan', '11111111111', '03334444444', 'Evcil Hayvanınızın Adı Nedir?', 'rosa', '1', '2'),
(11, 'Erkan Dariyemez', '22222222222', '05555555555', 'Evcil Hayvanınızın Adı Nedir?', 'leo', '3215031', '6798'),
(12, 'dadss', '23213313213', '31231212312', 'Evcil Hayvanınızın Adı Nedir?', 'can', '6629022', '1020');

--
-- Tetikleyiciler `kullanicilar`
--
DELIMITER $$
CREATE TRIGGER `bakiye_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanici_bakiye(kullanici_id, bakiye, musteri_no) VALUES(NEW.kullanici_id,0,NEW.musteri_no)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `bakiye_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanici_bakiye
WHERE kullanici_id=OLD.kullanici_id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanici_faturalar(kullanici_id,elektrik,su,dogalgaz,internet)
VALUES(
	NEW.kullanici_id,
    35 + RAND() * 465,
    35 + RAND() * 465,
    35 + RAND() * 465,
    35 + RAND() * 465
)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanici_faturalar
WHERE kullanici_id=OLD.kullanici_id
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_bakiye`
--

CREATE TABLE `kullanici_bakiye` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `bakiye` decimal(10,2) NOT NULL,
  `musteri_no` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanici_bakiye`
--

INSERT INTO `kullanici_bakiye` (`id`, `kullanici_id`, `bakiye`, `musteri_no`) VALUES
(4, 10, '57778.00', '1'),
(5, 11, '20100.00', '3215031'),
(6, 12, '0.43', '6629022');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_faturalar`
--

CREATE TABLE `kullanici_faturalar` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `elektrik` decimal(10,2) NOT NULL,
  `su` decimal(10,2) NOT NULL,
  `dogalgaz` decimal(10,2) NOT NULL,
  `internet` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanici_faturalar`
--

INSERT INTO `kullanici_faturalar` (`id`, `kullanici_id`, `elektrik`, `su`, `dogalgaz`, `internet`) VALUES
(2, 10, '0.00', '0.00', '0.00', '0.00'),
(3, 11, '276.41', '127.47', '238.10', '308.10'),
(4, 12, '203.64', '482.05', '369.34', '0.00');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`kullanici_id`),
  ADD UNIQUE KEY `tc_no` (`tc_no`),
  ADD UNIQUE KEY `muster_no` (`musteri_no`);

--
-- Tablo için indeksler `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kuyllanici_id` (`kullanici_id`),
  ADD UNIQUE KEY `musteri_no` (`musteri_no`);

--
-- Tablo için indeksler `kullanici_faturalar`
--
ALTER TABLE `kullanici_faturalar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kullanici_id` (`kullanici_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `kullanici_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici_faturalar`
--
ALTER TABLE `kullanici_faturalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

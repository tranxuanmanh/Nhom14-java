CREATE TABLE `tv` (
  `ID` int(100) NOT NULL PRIMARY KEY,
  `Name` varchar(100) NOT NULL,
  `Price` double NOT NULL,
  `Total` double NOT NULL,
  `Brand` varchar(100) NOT NULL,
  `Size` float NOT NULL,
  `Weight` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `tv` (`ID`, `Name`, `Price`, `Total`, `Brand`, `Size`, `Weight`) VALUES
(1, 'Tivi Sony New9', 44000000, 56, 'Sony', 70, 15),
(2, 'Tivi Sony Pro 4k', 20000000, 10, 'Sony', 124, 60),
(3, 'Tivi Samsung OLED 1355', 20000000, 19, 'Samsung', 66, 12),
(4, 'Tivi LG VNK8', 12000000, 12, 'LG', 44, 11),
(5, 'Tivi LG VES13', 23000000, 13, 'LG', 50, 11),
(6, 'Tivi Tosiba ULK8', 25000000, 16, 'Tosiba', 60, 11);



CREATE TABLE `user` (
  `id` int(11) NOT NULL PRIMARY KEY,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'manh2003', 'manh2003'),
(2, 'sang2003', 'sang2003'),
(3, 'minh2003', 'minh2003'),
(4, 'van2003', 'van2003');







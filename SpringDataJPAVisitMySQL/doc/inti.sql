CREATE TABLE `USER` (
                        `id` int(11) NOT NULL auto_increment,
                        `name` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
                        `age` int NOT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
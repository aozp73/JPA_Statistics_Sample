INSERT INTO connection_data_tb(id, role, cnt, year_val, month_val)
VALUES
    (1, 'Player', 13, '2022', '01'),
    (2, 'Player', 19, '2022', '02'),
    (3, 'Player', 25, '2022', '03'),
    (4, 'Player', 20, '2022', '04'),
    (5, 'Player', 31, '2022', '05'),
    (6, 'Player', 26, '2022', '06'),
    (7, 'Player', 31, '2022', '07'),
    (8, 'Player', 27, '2022', '08'),
    (9, 'Player', 38, '2022', '09'),
    (10, 'Player', 17, '2022', '10'),
    -- 
    (11, 'Player', 19, '2022', '11'),
    (12, 'Player', 25, '2022', '12'),
    (13, 'Player', 20, '2023', '01'),
    (14, 'Player', 31, '2023', '02'),
    (15, 'Player', 26, '2023', '03'),
    (16, 'Player', 35, '2023', '04'),
    -- 
    (17, 'Player', 29, '2023', '05'),

    (18, 'Company', 10, '2022', '01'),
    (19, 'Company', 14, '2022', '02'),
    (20, 'Company', 12, '2022', '03'),
    (21, 'Company', 16, '2022', '04'),
    (22, 'Company', 18, '2022', '05'),
    (23, 'Company', 24, '2022', '06'),
    (24, 'Company', 25, '2022', '07'),
    (25, 'Company', 21, '2022', '08'),
    (26, 'Company', 30, '2022', '09'),
    (27, 'Company', 25, '2022', '10'),
    -- 
    (28, 'Company', 14, '2022', '11'),
    (29, 'Company', 12, '2022', '12'),
    (30, 'Company', 16, '2023', '01'),
    (31, 'Company', 18, '2023', '02'),
    (32, 'Company', 24, '2023', '03'),
    (33, 'Company', 25, '2023', '04'),
    -- 
    (34, 'Company', 27, '2023', '05');


INSERT INTO stadium_tb(id, name)
VALUES
    (1, '경기장1'), (2, '경기장2'), (3, '경기장3'), (4, '경기장4'), (5, '경기장5'),
    (6, '경기장6'), (7, '경기장7'), (8, '경기장8'), (9, '경기장9'), (10, '경기장10'),
    (11, '경기장11'), (12, '경기장12'), (13, '경기장13'), (14, '경기장14'), (15, '경기장15'),
    (16, '경기장16'), (17, '경기장17'), (18, '경기장18'), (19, '경기장19'), (20, '경기장20');


INSERT INTO view_data_tb(id, stadium_id, cnt, year_val, month_val)
VALUES
    (1,  1, 9, '2022', '11'),  (2,  2, 11, '2022', '11'),  (3,  3, 31, '2022', '11'),  (4,  4, 16, '2022', '11'),  (5,  5, 10, '2022', '11'),
    (6,  1, 31, '2022', '12'),  (7,  2, 64, '2022', '12'),  (8,  3, 22, '2022', '12'),  (9,  4, 41, '2022', '12'),  (10, 5, 23, '2022', '12'),
    (11, 1, 96, '2023', '01'),  (12, 2, 16, '2023', '01'),  (13, 3, 26, '2023', '01'),  (14, 4, 26, '2023', '01'),  (15, 5, 17, '2023', '01'),
    (16, 1, 19, '2023', '02'),  (17, 2, 96, '2023', '02'),  (18, 3, 54, '2023', '02'),  (19, 4, 21, '2023', '02'),  (20, 5, 25, '2023', '02'),
    (21, 1, 17, '2023', '03'),  (22, 2, 7, '2023', '03'),  (23, 3, 96, '2023', '03'),  (24, 4, 62, '2023', '03'),  (25, 5, 84, '2023', '03'),
    (26, 1, 25, '2023', '04'),  (27, 2, 27, '2023', '04'),  (28, 3, 87, '2023', '04'),  (29, 4, 96, '2023', '04'),  (30, 5, 23, '2023', '04'),
    (31, 1, 36, '2023', '05'),  (32, 2, 31, '2023', '05'),  (33, 3, 46, '2023', '05'),  (34, 4, 31, '2023', '05'),  (35, 5, 52, '2023', '05'),

    (36, 6, 27, '2022', '11'),  (37, 7, 37, '2022', '11'),  (38, 8, 26, '2022', '11'),  (39, 9, 10, '2022', '11'),  (40, 10, 10, '2022', '11'), 
    (41, 6, 48, '2022', '12'),  (42, 7, 17, '2022', '12'),  (43, 8, 47, '2022', '12'),  (44, 9, 10, '2022', '12'),  (45, 10, 10, '2022', '12'),
    (46, 6, 26, '2022', '01'),  (47, 7, 46, '2023', '01'),  (48, 8, 26, '2023', '01'),  (49, 9, 10, '2023', '01'),  (50, 10, 10, '2023', '01'), 
    (51, 6, 4, '2023', '02'),  (52, 7, 11, '2023', '02'),  (53, 8, 68, '2023', '02'),  (54, 9, 10, '2023', '02'),  (55, 10, 10, '2023', '02'), 
    (56, 6, 29, '2023', '03'),  (57, 7, 85, '2023', '03'),  (58, 8, 36, '2023', '03'),  (59, 9, 10, '2023', '03'),  (60, 10, 10, '2023', '03'), 
    (61, 6, 47, '2023', '04'),  (62, 7, 18, '2023', '04'),  (63, 8, 25, '2023', '04'),  (64, 9, 10, '2023', '04'),  (65, 10, 10, '2023', '04'), 
    (66, 6, 91, '2023', '05'),  (67, 7, 16, '2023', '11'),  (68, 8, 80, '2023', '11'),  (69, 9, 10, '2023', '11'),  (70, 10, 10, '2023', '11'),
    
    (71,  11, 96, '2022', '11'),  (72,  12, 17, '2022', '11'),  (73,  13, 10, '2022', '11'),  (74,  14, 10, '2022', '11'),  (75,  15, 10, '2022', '11'),
    (76,  11, 39, '2022', '12'),  (77,  12, 96, '2022', '12'),  (78,  13, 10, '2022', '12'),  (79,  14, 10, '2022', '12'),  (80,  15, 10, '2022', '12'),
    (81,  11, 20, '2023', '01'),  (82,  12, 64, '2023', '01'),  (83,  13, 10, '2023', '01'),  (84,  14, 10, '2023', '01'),  (85,  15, 10, '2023', '01'),
    (86,  11, 17, '2023', '02'),  (87,  12, 55, '2023', '02'),  (88,  13, 10, '2023', '02'),  (89,  14, 10, '2023', '02'),  (90,  15, 10, '2023', '02'),
    (91,  11, 26, '2023', '03'),  (92,  12, 31, '2023', '03'),  (93,  13, 10, '2023', '03'),  (94,  14, 10, '2023', '03'),  (95,  15, 10, '2023', '03'),
    (96,  11, 29, '2023', '04'),  (97,  12, 27, '2023', '04'),  (98,  13, 10, '2023', '04'),  (99,  14, 10, '2023', '04'),  (100, 15, 10, '2023', '04'),
    (101, 11, 66, '2023', '05'),  (102, 12, 19, '2023', '05'),  (103, 13, 10, '2023', '05'),  (104, 14, 10, '2023', '05'),  (105, 15, 10, '2023', '05');
   
DELETE FROM Employee WHERE EMP_ID IS NOT NULL;

DELETE FROM SeatingChart WHERE FLOOR_SEAT_SEQ > 0;

INSERT INTO SeatingChart (FLOOR_NO, SEAT_NO) VALUES
(1, 'A1'), (2, 'A2'), (3, 'A3'),
(4, 'B1'), (4, 'B2');


DELETE FROM Employee;

INSERT INTO Employee (EMP_ID, NAME, EMAIL, FLOOR_SEAT_SEQ) VALUES
('A0001', '黃昭瑋', 'jeffery@gmail.com', 1),
('A0002', 'Dennis', 'jeffery87@gmail.com', NULL),
('A0003', 'aaa', 'jeffery@gmail.com', NULL),
('A0004', 'bbb', 'jeffery@gmail.com', NULL),
('A0005', 'ccc', 'jeffery@gmail.com', NULL),
('A0006', 'ddd', 'jeffery87@gmail.com', NULL);
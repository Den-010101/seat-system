DROP PROCEDURE IF EXISTS get_all_seats_with_employee;
DELIMITER $$

CREATE PROCEDURE get_all_seats_with_employee()
BEGIN
    SELECT 
        s.FLOOR_SEAT_SEQ,
        s.FLOOR_NO,
        s.SEAT_NO,
        e.EMP_ID,
        e.NAME
    FROM SeatingChart s
    LEFT JOIN Employee e
        ON s.FLOOR_SEAT_SEQ = e.FLOOR_SEAT_SEQ;
END$$

DELIMITER ;
DROP PROCEDURE IF EXISTS assign_seat;
DELIMITER $$

CREATE PROCEDURE assign_seat(
    IN p_emp_id CHAR(5),
    IN p_floor_seat_seq INT
)
BEGIN
    
    UPDATE Employee
    SET FLOOR_SEAT_SEQ = NULL
    WHERE FLOOR_SEAT_SEQ = p_floor_seat_seq;

    
    UPDATE Employee
    SET FLOOR_SEAT_SEQ = NULL
    WHERE EMP_ID = p_emp_id;

    
    UPDATE Employee
    SET FLOOR_SEAT_SEQ = p_floor_seat_seq
    WHERE EMP_ID = p_emp_id;
END$$

DELIMITER ;

DELIMITER $$
DROP PROCEDURE IF EXISTS clear_seat;
CREATE PROCEDURE clear_seat(IN p_floor_seat_seq INT)
BEGIN
    UPDATE Employee
    SET FLOOR_SEAT_SEQ = NULL
    WHERE FLOOR_SEAT_SEQ = p_floor_seat_seq;
END$$

DELIMITER ;






package com.seat.employee_seat_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class SeatingChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer floorSeatSeq;

    private Integer floorNo;

    private Integer seatNo;
}

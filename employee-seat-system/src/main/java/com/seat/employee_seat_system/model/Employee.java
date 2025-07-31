package com.seat.employee_seat_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    private String empId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "floorSeatSeq")
    private SeatingChart seat;

}

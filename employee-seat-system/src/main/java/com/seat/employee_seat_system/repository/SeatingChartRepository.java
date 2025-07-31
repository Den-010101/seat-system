package com.seat.employee_seat_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seat.employee_seat_system.model.SeatingChart;

public interface SeatingChartRepository extends JpaRepository<SeatingChart, Integer> {
}

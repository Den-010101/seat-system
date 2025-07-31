package com.seat.employee_seat_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seat.employee_seat_system.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}

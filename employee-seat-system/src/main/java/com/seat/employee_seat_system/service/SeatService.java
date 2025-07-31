package com.seat.employee_seat_system.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

@Service
public class SeatService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getAllSeats() {
        return jdbcTemplate.queryForList("CALL get_all_seats_with_employee()");
    }

    public void assignSeat(String empId, int floorSeatSeq) {
        jdbcTemplate.update("CALL assign_seat(?, ?)", empId, floorSeatSeq);
    }

    public void clearSeat(int floorSeatSeq) {
        jdbcTemplate.update("CALL clear_seat(?)", floorSeatSeq);
    }

    public List<Map<String, Object>> getAllEmployees() {
        String sql = "SELECT EMP_ID, NAME FROM Employee";
        return jdbcTemplate.queryForList(sql);
    }
}

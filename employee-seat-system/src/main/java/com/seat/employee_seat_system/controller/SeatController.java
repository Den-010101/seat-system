package com.seat.employee_seat_system.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seat.employee_seat_system.service.SeatService;

@RestController
@RequestMapping("/api/seats")
@CrossOrigin
public class SeatController {

    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping
    public List<Map<String, Object>> getAllSeats() {
        return seatService.getAllSeats();
    }

    @PostMapping("/assign")
    public void assignSeat(@RequestParam String empId, @RequestParam int seatId) {
        seatService.assignSeat(empId, seatId);
    }

    @DeleteMapping("/{seatId}")
    public void clearSeat(@PathVariable int seatId) {
        seatService.clearSeat(seatId);
    }

    @GetMapping("/employees")
    public List<Map<String, Object>> getAllEmployees() {
        return seatService.getAllEmployees();
    }
}

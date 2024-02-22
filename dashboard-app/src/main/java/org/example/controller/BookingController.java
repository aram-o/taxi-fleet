package org.example.controller;

import org.example.model.BookingCount;
import org.example.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/count")
    public List<BookingCount> getPassengerBookingCount() {
        return dashboardService.getPassengerBookingCount();
    }
}

package org.example.service.impl;

import org.example.model.BookingCount;
import org.example.repository.BookingRepository;
import org.example.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<BookingCount> getPassengerBookingCount() {
        return bookingRepository.countByPassengerEmail();
    }
}

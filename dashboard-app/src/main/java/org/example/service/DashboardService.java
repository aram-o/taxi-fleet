package org.example.service;

import org.example.model.BookingCount;
import java.util.List;

public interface DashboardService {
    List<BookingCount> getPassengerBookingCount();
}

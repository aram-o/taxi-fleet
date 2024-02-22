package org.example.taxifleet.service;

import org.example.taxifleet.entity.Booking;
import org.example.taxifleet.entity.Taxi;

public interface BookingService {
    Booking book(String passengerEmail, Long taxiId);
}

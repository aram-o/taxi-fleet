package org.example.taxifleet.service;

import org.example.taxifleet.entity.Booking;

public interface NotificationService {
    void sendNotification(Booking booking);
}

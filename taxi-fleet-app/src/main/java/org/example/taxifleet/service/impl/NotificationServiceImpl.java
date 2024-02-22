package org.example.taxifleet.service.impl;

import org.example.taxifleet.entity.Booking;
import org.example.taxifleet.service.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(Booking booking) {
//        TODO send notification to all taxis.
    }
}

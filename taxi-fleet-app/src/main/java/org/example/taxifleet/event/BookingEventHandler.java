package org.example.taxifleet.event;

import org.example.taxifleet.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BookingEventHandler {
    @Autowired
    private NotificationService notificationService;
    @EventListener
    public void handleBookingEvent(BookingEvent bookingEvent) {
        notificationService.sendNotification(bookingEvent.getBooking());
    }
}

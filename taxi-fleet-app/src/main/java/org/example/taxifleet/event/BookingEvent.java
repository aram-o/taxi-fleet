package org.example.taxifleet.event;

import lombok.Getter;
import org.example.taxifleet.entity.Booking;
import org.springframework.context.ApplicationEvent;

@Getter
public class BookingEvent  extends ApplicationEvent {

    private Booking booking;
    public BookingEvent(Booking booking) {
        super(booking);
        this.booking=booking;
    }
}

package org.example.taxifleet.service.impl;

import jakarta.transaction.Transactional;
import org.example.taxifleet.event.BookingEvent;
import org.example.taxifleet.entity.Booking;
import org.example.taxifleet.entity.Taxi;
import org.example.taxifleet.entity.TaxiStateType;
import org.example.taxifleet.repository.BookingRepository;
import org.example.taxifleet.repository.TaxiRepository;
import org.example.taxifleet.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private TaxiRepository taxiRepository;
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    @Override
    public Booking book(String passengerEmail, Long taxiId) {
        Taxi taxi = taxiRepository.findOneByIdAndState(taxiId, TaxiStateType.AVAILABLE).orElseThrow(() -> new IllegalArgumentException("Invalid taxi ID"));

        Booking booking = new Booking();
        booking.setTaxiId(taxiId);
        booking.setPassengerEmail(passengerEmail);
        Booking savedBooking = bookingRepository.save(booking);

        taxi.setState(TaxiStateType.BOOKED);
        Taxi savedTaxi = taxiRepository.save(taxi);

        applicationEventPublisher.publishEvent(new BookingEvent(booking));
        return savedBooking;
    }
}

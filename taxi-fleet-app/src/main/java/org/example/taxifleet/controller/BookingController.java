package org.example.taxifleet.controller;

import org.example.taxifleet.dto.BookingDto;
import org.example.taxifleet.dto.BookingRequestDto;
import org.example.taxifleet.entity.Booking;
import org.example.taxifleet.mapper.BookingMapper;
import org.example.taxifleet.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private BookingMapper bookingMapper;

    @PostMapping
    public BookingDto book(@RequestBody BookingRequestDto bookingRequestDto) {
        Booking book = bookingService.book(bookingRequestDto.passengerEmail(), bookingRequestDto.taxiId());
        return bookingMapper.toDto(book);
    }
}

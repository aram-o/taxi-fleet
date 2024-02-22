package org.example.taxifleet.dto;

public record BookingDto(
        Long id,
        Long taxiId,
        String passengerEmail
) {
}

package org.example.taxifleet.dto;

import org.example.taxifleet.entity.TaxiStateType;

public record BookingRequestDto(
        Long taxiId,
        String passengerEmail
) {
}

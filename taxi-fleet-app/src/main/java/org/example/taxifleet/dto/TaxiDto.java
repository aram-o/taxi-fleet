package org.example.taxifleet.dto;

import org.example.taxifleet.entity.TaxiStateType;

public record TaxiDto(
        Long id,
        String name,
        TaxiStateType state,
        String location
) {
}

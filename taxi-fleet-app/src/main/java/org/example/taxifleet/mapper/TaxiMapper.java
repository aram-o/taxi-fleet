package org.example.taxifleet.mapper;

import org.example.taxifleet.dto.TaxiDto;
import org.example.taxifleet.entity.Taxi;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaxiMapper {
    TaxiDto toDto(Taxi taxi);
    List<TaxiDto> toDto(Iterable<Taxi> taxis);
    Taxi toEntity(TaxiDto taxiDto);
}

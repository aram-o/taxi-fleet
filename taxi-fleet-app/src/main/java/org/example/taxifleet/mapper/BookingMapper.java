package org.example.taxifleet.mapper;

import org.example.taxifleet.dto.BookingDto;
import org.example.taxifleet.entity.Booking;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    BookingDto toDto(Booking booking);
    List<BookingDto> toDto(Iterable<Booking> bookings);
    Booking toEntity(BookingDto bookingDto);
}

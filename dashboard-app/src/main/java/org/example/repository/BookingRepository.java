package org.example.repository;

import org.example.entity.Booking;
import org.example.model.BookingCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query("SELECT new org.example.model.BookingCount(COUNT(id) AS count, passengerEmail AS email) FROM Booking GROUP BY passengerEmail")
    List<BookingCount> countByPassengerEmail();
}

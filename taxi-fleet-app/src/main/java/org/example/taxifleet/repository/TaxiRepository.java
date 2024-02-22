package org.example.taxifleet.repository;

import org.example.taxifleet.entity.Taxi;
import org.example.taxifleet.entity.TaxiStateType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Long> {
    Optional<Taxi> findOneByIdAndState(Long id, TaxiStateType stateType);
}

package org.example.taxifleet.service;

import org.example.taxifleet.entity.Taxi;
import org.example.taxifleet.entity.TaxiStateType;
import java.util.List;

public interface TaxiService {
    List<Taxi> getAllTaxis();

    Taxi create(Taxi taxi);

    Taxi updateTaxiState(Long taxiId, TaxiStateType stateType);
}

package org.example.taxifleet.service.impl;

import org.example.taxifleet.entity.Taxi;
import org.example.taxifleet.entity.TaxiStateType;
import org.example.taxifleet.repository.TaxiRepository;
import org.example.taxifleet.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaxiServiceImpl implements TaxiService {
    @Autowired
    private TaxiRepository taxiRepository;

    @Override
    public List<Taxi> getAllTaxis() {
        return taxiRepository.findAll();
    }

    @Override
    public Taxi create(Taxi taxi) {
        return taxiRepository.save(taxi);
    }

    @Override
    public Taxi updateTaxiState(Long taxiId, TaxiStateType state) {
        Taxi taxi = taxiRepository.findById(taxiId).orElseThrow(() -> new IllegalArgumentException("Invalid taxi ID"));
        taxi.setState(state);
        Taxi savedTaxi = taxiRepository.save(taxi);
        return savedTaxi;
    }
}

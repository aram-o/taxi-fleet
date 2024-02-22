package org.example.taxifleet.controller;

import org.example.taxifleet.dto.TaxiDto;
import org.example.taxifleet.entity.Taxi;
import org.example.taxifleet.entity.TaxiStateType;
import org.example.taxifleet.mapper.TaxiMapper;
import org.example.taxifleet.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/taxis")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;
    @Autowired
    private TaxiMapper taxiMapper;

    @GetMapping
    public List<TaxiDto> getAllTaxis() {
        return taxiMapper.toDto(taxiService.getAllTaxis());
    }

    @PostMapping
    public TaxiDto create(@RequestBody TaxiDto taxiDto) {
        Taxi taxi = taxiMapper.toEntity(taxiDto);
        Taxi savedTaxi = taxiService.create(taxi);
        return taxiMapper.toDto(savedTaxi);
    }

    @PutMapping("/state/{taxiId}/{stateType}")
    public TaxiDto update(@PathVariable("taxiId") Long taxiId, @PathVariable("stateType") TaxiStateType stateType) {
        Taxi savedTaxi = taxiService.updateTaxiState(taxiId, stateType);
        return taxiMapper.toDto(savedTaxi);
    }
}

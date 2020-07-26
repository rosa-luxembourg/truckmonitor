package com.vw.truckmonitor.api.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.truckmonitor.api.domain.repository.TruckRepository;
import com.vw.truckmonitor.api.web.view.TruckView;

@RestController
@RequestMapping("/api/trucks")
public class TruckController {

    private final TruckRepository truckRepository;

    @Autowired
    public TruckController(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    @GetMapping()
    public List<TruckView> getTrucks() {
        return truckRepository.findAll().stream()
                .map(t -> new TruckView(t.getId(), t.getLicensePlate()))
                .collect(Collectors.toList());
    }

    // TODO: add missing relevant endpoints: get truck details, add truck, delete truck, update
    // truck...
}

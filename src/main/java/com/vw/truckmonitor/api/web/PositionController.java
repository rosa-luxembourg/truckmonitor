package com.vw.truckmonitor.api.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.truckmonitor.api.domain.persistent.Position;
import com.vw.truckmonitor.api.domain.repository.PositionRepository;

@RestController
@RequestMapping("/api/trucks/{truckId}/positions")
public class PositionController {

    private final PositionRepository positionRepository;

    @Autowired
    public PositionController(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @GetMapping()
    public Collection<Position> getLastPositions(@PathVariable(value = "truckId") long truckId) {
        return positionRepository.findLastPositionsByTruckNative(truckId);
        // return lastTruckPositions.stream()
        // .map(pos -> new PositionView(pos.getLocation(), pos.getCreatedOn()))
        // .collect(toList());
    }

    // TODO: add missing relevant endpoints: add position, delete position...
}

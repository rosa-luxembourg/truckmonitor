package com.vw.truckmonitor.api.domain.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vw.truckmonitor.api.domain.persistent.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {

    @Query(value = "SELECT * FROM Position p WHERE p.truck_id = ?1 LIMIT 10", nativeQuery = true)
    Collection<Position> findLastPositionsByTruckNative(Long truck_id);
}

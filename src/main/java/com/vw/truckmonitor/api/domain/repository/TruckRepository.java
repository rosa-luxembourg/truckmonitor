package com.vw.truckmonitor.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vw.truckmonitor.api.domain.persistent.Truck;

public interface TruckRepository extends JpaRepository<Truck, Long> {

}

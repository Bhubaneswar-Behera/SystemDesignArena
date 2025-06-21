package com.lld.parking.lot.management.system.strategies;

import com.lld.parking.lot.management.system.models.ParkingLot;
import com.lld.parking.lot.management.system.models.ParkingSpot;
import com.lld.parking.lot.management.system.models.Vehicle;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot assignParkingSpot(ParkingLot parkingLot, Vehicle vehicle);
}

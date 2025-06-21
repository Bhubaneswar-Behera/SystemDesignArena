package com.lld.parking.lot.management.system.strategies;

import com.lld.parking.lot.management.system.models.ParkingLot;
import com.lld.parking.lot.management.system.models.ParkingSpot;
import com.lld.parking.lot.management.system.models.Vehicle;

public class NearestSpotAssignmentStrategy implements ParkingSpotAssignmentStrategy {
    @Override
    public ParkingSpot assignParkingSpot(ParkingLot parkingLot, Vehicle vehicle) {
        return new ParkingSpot();
    }
}

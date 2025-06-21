package com.lld.parking.lot.management.system.factories;

import com.lld.parking.lot.management.system.models.ParkingSpotStrategyType;
import com.lld.parking.lot.management.system.strategies.NearestSpotAssignmentStrategy;
import com.lld.parking.lot.management.system.strategies.ParkingSpotAssignmentStrategy;

public class ParkingSpotAssignmentStrategyFactory {
    public static ParkingSpotAssignmentStrategy getParkingLotStrategy(ParkingSpotStrategyType
                                                                              parkingSpotStrategyType) {
        if (parkingSpotStrategyType.equals(ParkingSpotStrategyType.NEAREST)) {
            return new NearestSpotAssignmentStrategy();
        }
        return null;
    }
}

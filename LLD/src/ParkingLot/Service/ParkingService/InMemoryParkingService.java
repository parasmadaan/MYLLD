package ParkingLot.Service.ParkingService;

import ParkingLot.Models.*;
import ParkingLot.Service.ParkingService.ParkingService;

public class InMemoryParkingService implements ParkingService {
    @Override
    public Slot park(Vehicle vehicle) {
        return null;
    }

    @Override
    public Slot unpark(Vehicle vehicle) {
        return null;
    }

    @Override
    public boolean isParkingSlotAvailable(ParkingLot parkingLot, SlotType slotType) {
        for(Level level:parkingLot.getLevels()){
            if(level.isSlotAvailableOnLevel(slotType.name())){
                return true;
            }
        }
        return false;
    }
}

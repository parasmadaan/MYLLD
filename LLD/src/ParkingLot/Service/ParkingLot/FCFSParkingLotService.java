package ParkingLot.Service.ParkingLot;

import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.Slot;
import ParkingLot.Models.SlotType;
import ParkingLot.Models.Vehicle;
import ParkingLot.Service.ParkingService.ParkingService;

public class FCFSParkingLotService implements ParkingLotService {

    ParkingLot parkingLot;
    ParkingService parkingService;
    @Override
    public boolean isParkingLotFull(SlotType slotType) {
        return parkingService.isParkingSlotAvailable(parkingLot,slotType);
    }

    @Override
    public Slot park(Vehicle vehicle) {
        return parkingService.park(vehicle);
    }

    @Override
    public Slot unpark(Vehicle vehicle) {
        return parkingService.park(vehicle);
    }
}

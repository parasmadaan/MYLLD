package ParkingLot.Service.ParkingService;

import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.Slot;
import ParkingLot.Models.SlotType;
import ParkingLot.Models.Vehicle;

public interface ParkingService {

    public Slot park(Vehicle vehicle);

    public Slot unpark(Vehicle vehicle);

    public boolean isParkingSlotAvailable( ParkingLot parkingLot,SlotType SlotType);
}

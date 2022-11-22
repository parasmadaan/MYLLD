package ParkingLot.Service.ParkingLot;

import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.Slot;
import ParkingLot.Models.SlotType;
import ParkingLot.Models.Vehicle;

public interface ParkingLotService {

    boolean isParkingLotFull(SlotType SlotType);

    Slot park(Vehicle vehicle);

    Slot unpark(Vehicle vehicle);
}

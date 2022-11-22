package ParkingLot.Service;

import ParkingLot.Models.Slot;
import ParkingLot.Models.Vehicle;

public interface TicketingService {

    public void issueTicket(Vehicle vehicle, Slot Slot);


}

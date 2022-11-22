package ParkingLot.Models;

import java.util.Date;

public class Ticket {
    String ticketID;
    String slotID;
    Entrance entrance;
    Double pricePerHour;
    Date issuedAt;
    Date vacatedAt;
    String vehicleRegistrationNo;
}

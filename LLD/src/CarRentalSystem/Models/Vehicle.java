package CarRentalSystem.Models;


import CarRentalSystem.ENUMS.VehicleFuelType;
import CarRentalSystem.ENUMS.VehicleStatus;
import CarRentalSystem.ENUMS.VehicleType;

import java.awt.*;

public class Vehicle {
    String VehicleId;
    String EngineNo;
    String chassisNo;
    VehicleType vehicleType;
    Color VehicleColor;
    double kmDriven;
    VehicleFuelType vehicleFuelType;
    VehicleStatus vehicleStatus;

}

package ParkingLot.Models;

public class Slot {
    private int slotId;
    private SlotType slotType;
    private Vehicle vehicle;
    private boolean isAvailable;


    public Slot(int slotId,SlotType slotType){
        this.slotId = slotId;
        this.slotType = slotType;
        this.isAvailable = true;
    }

    public boolean isSlotAvailable() {
        return this.isAvailable;
    }
    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }
    public void unparkVehicle(){
        this.vehicle = null;
        this.isAvailable = true;
    }
}

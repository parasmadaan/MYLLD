package ParkingLot.Models;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Level {
    int levelNo;
    Map<String, Map<String,Slot>> parkingSlots;

    public Level(int levelNo, Map<String, Map<String, Slot>> parkingSlots) {
        this.levelNo = levelNo;
        this.parkingSlots = parkingSlots;
    }


    public boolean isSlotAvailableOnLevel(String slotType){
        boolean isSlotAvailable = false;
        for(Map.Entry<String,Slot> slots : parkingSlots.get(slotType).entrySet()){
            if(slots.getValue().isSlotAvailable()){
                return true;
            }
        }
        return isSlotAvailable;
    }

    public Slot getAvailableSlot(String slotType){
        boolean isSlotAvailable = false;
        Map<String,Slot> availableSlots = parkingSlots.get(slotType).entrySet().stream().filter(slot->slot.getValue().isSlotAvailable()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        return availableSlots.forEach(slot->{});
    }
}

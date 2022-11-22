package ParkingLot.Models;

import java.util.List;

public class ParkingLot {

    private List<Level> levels;

    private List<Entrance> entrances;

    private List<Exit> exits;
    private String ParkingLotName;

    private String Address;

    public ParkingLot(List<Level> levels, String parkingLotName) {
        this.levels = levels;
        ParkingLotName = parkingLotName;
    }


    public List<Level> getLevels() {
        return levels;
    }
}

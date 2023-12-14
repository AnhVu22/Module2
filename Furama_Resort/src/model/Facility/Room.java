package model.Facility;

import java.util.ArrayList;

public class Room extends Facility {
    public static ArrayList<Room> roomArrayList = new ArrayList<>();
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceType,
                double usableArea, double rentCost,
                int maxAmountGuest, String rentalType, String freeService) {
        super(id, serviceType, usableArea, rentCost, maxAmountGuest, rentalType);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", id='" + id + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", rentalType='" + rentalType + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maxAmountGuest=" + maxAmountGuest +
                "freeService='" + freeService + '\'' +
                '}';
    }
}

package model.Facility;

import java.util.ArrayList;

public class Room extends Facility {
    public static ArrayList<Room> roomArrayList = new ArrayList<>();
    private String freeService;

    public Room() {
    }
    public Room(String id, String serviceType, double usableArea, double rentCost, int amountGuests, String rentalType, String freeService) {
        super(id, serviceType, usableArea, rentCost, amountGuests, rentalType);
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", id='" + id + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", amountGuests=" + amountGuests +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}

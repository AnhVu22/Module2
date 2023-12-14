package model.Facility;

import java.util.ArrayList;

public class House extends Facility {
    public static ArrayList<House> houseArrayList = new ArrayList<>();
    private String roomStandard;
    private int floors;
    private String otherExclusive;

    public House() {
    }

    public House(String roomStandard, int floors, String otherExclusive) {
        this.roomStandard = roomStandard;
        this.floors = floors;
        this.otherExclusive = otherExclusive;
    }

    public House(String id, String serviceType, double usableArea, double rentCost, int amountGuests, String rentalType, String roomStandard, int floors, String otherExclusive) {
        super(id, serviceType, usableArea, rentCost, amountGuests, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
        this.otherExclusive = otherExclusive;
    }

    @Override
    public String showInfo () {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                ", otherExclusive='" + otherExclusive + '\'' +
                ", id='" + id + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", amountGuests=" + amountGuests +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}

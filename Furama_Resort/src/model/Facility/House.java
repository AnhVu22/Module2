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

    public House(String id, String serviceType,
                 double usableArea, double rentCost,
                 int maxAmountGuest, String rentalType,
                 String roomStandard, int floors, String otherExclusive) {
        super(id, serviceType, usableArea, rentCost, maxAmountGuest, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
        this.otherExclusive = otherExclusive;
    }

    @Override
    public String toString() {
        return "House{" +
                ", id='" + id + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", rentalType='" + rentalType + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maxAmountGuest=" + maxAmountGuest +
                "roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                ", otherExclusive='" + otherExclusive + '\'' +
                '}';
    }
}

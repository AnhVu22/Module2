package model.Facility;

import java.util.ArrayList;

public class Villa extends Facility {
    public static ArrayList<Villa> villaArrayList = new ArrayList<>();
    private String roomStandard;
    private double poolSize;
    private int floors;
    private String otherExclusives;

    public Villa() {
    }

    public Villa(String roomStandard, double poolSize, int floors, String otherExclusives) {
        this.roomStandard = roomStandard;
        this.poolSize = poolSize;
        this.floors = floors;
        this.otherExclusives = otherExclusives;
    }

    public Villa(String id, String serviceType, double usableArea, double rentCost, int amountGuests, String rentalType, String roomStandard, double poolSize, int floors, String otherExclusives) {
        super(id, serviceType, usableArea, rentCost, amountGuests, rentalType);
        this.roomStandard = roomStandard;
        this.poolSize = poolSize;
        this.floors = floors;
        this.otherExclusives = otherExclusives;
    }

    @Override
    public String showInfo() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolSize=" + poolSize +
                ", floors=" + floors +
                ", otherExclusives='" + otherExclusives + '\'' +
                ", id='" + id + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", amountGuests=" + amountGuests +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}

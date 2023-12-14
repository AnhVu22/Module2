package model.Facility;

public abstract class Facility {
    protected String id;
    protected String serviceType;
    protected double usableArea;
    protected double rentCost;
    protected int amountGuests;
    protected String rentalType;
    public abstract String showInfo();

    public Facility() {
    }

    public Facility(String id, String serviceType, double usableArea, double rentCost, int amountGuests, String rentalType) {
        this.id = id;
        this.serviceType = serviceType;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.amountGuests = amountGuests;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getAmountGuests() {
        return amountGuests;
    }

    public void setAmountGuests(int amountGuests) {
        this.amountGuests = amountGuests;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}

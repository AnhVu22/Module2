package services.impl;

import model.Facility.Facility;
import services.IFacilityService;

import java.util.List;

public class FacilityService implements IFacilityService {
    private List<Facility> facilities;

    public FacilityService() {
    }

    public FacilityService(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    @Override
    public void addFacility(Facility facility) {

    }

    @Override
    public void displayFacilities() {

    }

    @Override
    public void displayInfo() {

    }
}

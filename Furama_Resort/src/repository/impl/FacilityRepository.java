package repository.impl;

import model.Facility.Facility;
import repository.IFacilityRepository;

import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    private List<Facility> facilities;

    public FacilityRepository() {
    }

    public FacilityRepository(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    @Override
    public void add(Facility item) {

    }

    @Override
    public void displayAll() {

    }
}

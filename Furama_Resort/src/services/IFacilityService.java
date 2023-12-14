package services;

import model.Facility.Facility;

public interface IFacilityService extends Service {
    void addFacility(Facility facility);
    void displayFacilities();
}

package services;

import model.Booking;

public interface IBookingService extends Service{
    @Override
    default void displayInfo() {
    }

    @Override
    default void addNew() {
    }

    @Override
    default void edit() {
    }

    @Override
    default void delete() {
    }

}


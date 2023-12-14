package services;

import model.Booking;

public interface IBookingService extends Service{
    void addBooking(Booking booking);
    void displayBookings();
}

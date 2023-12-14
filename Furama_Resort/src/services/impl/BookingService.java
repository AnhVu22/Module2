package services.impl;

import model.Booking;
import services.IBookingService;

import java.util.List;

public class BookingService implements IBookingService {
    private List<Booking> bookings;

    public BookingService() {
    }

    public BookingService(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public void addBooking(Booking booking) {

    }

    @Override
    public void displayBookings() {

    }

    @Override
    public void displayInfo() {

    }
}

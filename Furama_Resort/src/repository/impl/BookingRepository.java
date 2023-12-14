package repository.impl;

import model.Booking;
import repository.IBookingRepository;

import java.util.List;

public class BookingRepository implements IBookingRepository {
    private List<Booking> bookings;

    public BookingRepository() {
    }

    public BookingRepository(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public void add(Booking item) {
        
    }

    @Override
    public void displayAll() {

    }
}

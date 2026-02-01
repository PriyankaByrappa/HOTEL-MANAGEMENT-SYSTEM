package ui;
import entity.Booking;
import java.util.*;
public interface IBooking {

	void addBooking(Booking book);
	List<Booking> getAllBookings();
	Booking getBookingById(int id);
}

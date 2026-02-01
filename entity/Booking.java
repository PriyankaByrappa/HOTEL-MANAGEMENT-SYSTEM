package entity;

public class Booking {
	private int BookingId;
	private Customer customer;//association
	private Room room; // association
	private int Days;
	private String CheckInDate;
	private boolean isActive;
	public Booking(int bookingId, Customer customer, Room room, int days, String checkInDate, boolean isActive) {
		BookingId = bookingId;
		this.customer = customer;
		this.room = room;
		Days = days;
		CheckInDate = checkInDate;
		this.isActive = isActive;
	}
	public int getBookingId() {
		return BookingId;
	}
	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getDays() {
		return Days;
	}
	public void setDays(int days) {
		Days = days;
	}
	public String getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(String checkInDate) {
		CheckInDate = checkInDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}

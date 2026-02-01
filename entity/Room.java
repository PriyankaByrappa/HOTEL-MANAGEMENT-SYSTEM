package entity;

public class Room {
	private int RoomNumber;
	private String RoomType;
	private double PriceperDay;
	private boolean isBooked;
	public Room(int roomNumber, String roomType, double priceperDay, boolean isBooked) {
		RoomNumber = roomNumber;
		RoomType = roomType;
		PriceperDay = priceperDay;
		this.isBooked = isBooked;
	}
	public int getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public double getPriceperDay() {
		return PriceperDay;
	}
	public void setPriceperDay(double priceperDay) {
		PriceperDay = priceperDay;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void bookRoom() {
		this.isBooked = true;
	}
	public void freeRoom()
	{
		this.isBooked=false;
	}
	
	
}

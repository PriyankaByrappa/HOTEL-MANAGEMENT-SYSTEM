package ui;
import entity.Room;
import java.util.*;
public interface IRoom {
	void addRoom(Room room);
	List<Room> getAllRooms();
	Room getRoomByNumber(int id);
	
}

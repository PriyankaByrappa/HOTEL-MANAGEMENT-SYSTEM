package repository;
import entity.Room;
import ui.IRoom;
import java.util.*;
public class ListRoom implements IRoom {
	private List<Room> rom=new ArrayList<>();
	@Override
	public void addRoom(Room room)
	{
		rom.add(room);
	}
	@Override
	public Room getRoomByNumber(int id)
	{
		for(Room room:rom)
		{
			if(room.getRoomNumber()==id)
			{
				return room;
			}
		}
		return null;
	}
	@Override
	public List<Room> getAllRooms()
	{
		return rom;
	}

}

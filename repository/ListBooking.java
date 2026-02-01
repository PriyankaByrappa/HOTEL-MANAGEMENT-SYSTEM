package repository;
import entity.Booking;
import ui.IBooking;
import java.util.*;
public class ListBooking implements IBooking{
	private List<Booking> books=new ArrayList<>();
	@Override
	public void addBooking(Booking book)
	{
		books.add(book);
	}
	@Override
	public Booking getBookingById(int id)
	{
		for(Booking book:books)
		{
			if(book.getBookingId()==id)
			{
				return book;
			}
		}
		return null;
	}
	@Override
	public List<Booking> getAllBookings()
	{
		return  books;
	}

}

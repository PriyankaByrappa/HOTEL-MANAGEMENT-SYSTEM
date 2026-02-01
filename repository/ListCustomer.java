package repository;
import entity.Customer;
import ui.ICustomer;
import java.util.*;
public class ListCustomer implements ICustomer {
	private List<Customer> cus=new ArrayList<>();
	@Override
	public void addCustomers(Customer customer)
	{
		cus.add(customer);
	}
	@Override
	public Customer getCustomerById(int id)
	{
		for(Customer customer:cus)
		{
			if(customer.getCustomerId()==id)
			{
				return customer;
			}
		}
		return null;
	}
	@Override 
	public List<Customer> getAllCustomers()
	{
		return cus;
	}
}

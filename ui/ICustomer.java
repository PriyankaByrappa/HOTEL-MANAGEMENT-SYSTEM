package ui;
import entity.Customer;
import java.util.*;
public interface ICustomer {
	void addCustomers(Customer customer);
	List<Customer> getAllCustomers();
	Customer getCustomerById(int id);
}

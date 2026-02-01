package ui;
import java.util.*;
import entity.Billing;
public interface IBilling {

	void addBilling(Billing bill);
	List<Billing> getAllBillings();
	Billing getBillingById(int id);
	
}

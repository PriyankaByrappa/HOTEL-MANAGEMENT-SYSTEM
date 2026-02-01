package repository;
import entity.Billing;
import ui.IBilling;
import java.util.*;
public class ListBilling implements IBilling {
	private List<Billing> bills=new ArrayList<>();
	@Override
	public void addBilling(Billing bill)
	{
		bills.add(bill);
	}
	@Override
	public Billing getBillingById(int id)
	{
		for(Billing bill:bills)
		{
			if(bill.getBillId()==id)
			{
				return bill;
			}
		}
		return null;
	}
	@Override
	public List<Billing> getAllBillings()
	{
		return bills;
	}
}

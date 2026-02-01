package entity;

public class Customer {
	private int CustomerId;
	private String Name;
	private long PhoneNumber;
	private String IdProof;
	public Customer(int customerId, String name, long phoneNumber, String idProof) {
		CustomerId = customerId;
		Name = name;
		PhoneNumber = phoneNumber;
		IdProof = idProof;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getIdProof() {
		return IdProof;
	}
	public void setIdProof(String idProof) {
		IdProof = idProof;
	}
	
	

}

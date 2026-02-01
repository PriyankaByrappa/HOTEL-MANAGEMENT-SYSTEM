package entity;

public class Billing {
	private int BillId;
	private Booking booking;
	private double tax;
	private double TotalAmount;
	private double BaseAmount;
	private boolean isPaid;
	public Billing(int billId, Booking booking, double tax, double totalAmount, double baseAmount, boolean isPaid) {
		BillId = billId;
		this.booking = booking;
		this.tax = tax;
		TotalAmount = totalAmount;
		BaseAmount = baseAmount;
		this.isPaid = isPaid;
	}
	public int getBillId() {
		return BillId;
	}
	public void setBillId(int billId) {
		BillId = billId;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public double getBaseAmount() {
		return BaseAmount;
	}
	public void setBaseAmount(double baseAmount) {
		BaseAmount = baseAmount;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
}

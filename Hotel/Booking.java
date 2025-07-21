package Hotel;

public class Booking {
	private String customerName;
	private int roomNumber;
	private int nightstay;
	private int totalAmount;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getNightstay() {
		return nightstay;
	}
	public void setNightstay(int nightstay) {
		this.nightstay = nightstay;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Booking(String customerName, int roomNumber, int nightstay, int totalAmount) {
		super();
		this.customerName = customerName;
		this.roomNumber = roomNumber;
		this.nightstay = nightstay;
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return  "Booking for  " +  customerName  + " Room  " + roomNumber + " for  " +
	nightstay + 	" nights - Rs  " + totalAmount;
		
	}
//	public static void main (String [] args) {
//		Booking b = new Booking("amna" ,101, 2 , 96);
//		System.out.println(b);
//	}

}

package Hotel;

public class Room {
	private int roomNumber;
	private String category;
	private int price;
	private boolean isBooked;
	
	public Room(int roomNumber, String category,int price, boolean isBooked) {
		this.roomNumber = roomNumber;
		this.category = category;
		this.price = price;
		this.isBooked = isBooked;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	
         @Override
           public String toString(){
	              return "Room" + roomNumber + " (" + category + ") - Rs. "

			+ price + "/night - " + (isBooked ? "Booked" : "Availble");
}




//    public static void main(String[] args) {
//        Room r = new Room(101, "Deluxe", 5000, false);
//        System.out.println(r); // should print nicely using toString()
//    }

}

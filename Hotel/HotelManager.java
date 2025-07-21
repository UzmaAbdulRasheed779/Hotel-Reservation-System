package Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


import java.util.ArrayList;

public class HotelManager {
	private ArrayList<Room> rooms = new ArrayList<>();
	private ArrayList<Booking> book = new ArrayList<>();

	////method to add the new room
	public void addRoom(Room room) {
		rooms.add(room);
		}
	//////check room available
	public void available() {
		System.out.println("check available room");
		for(Room room : rooms) {
			if(!room.isBooked()) {
				System.out.println(room);
			}
		}
	}
	
	public void bookRoom(String customerName,int roomNumber,int nightStay) {
		Room room = findRoom(roomNumber);
		if(room != null && !room.isBooked()) {
			int totalAmount = room.getPrice() *nightStay;
			room.setBooked(true);
			
			Booking booking = new Booking(customerName,roomNumber, nightStay,totalAmount);
	        book.add(booking);
	        System.out.println("Booking sucessful "  + booking );
		}else {
			System.out.println("Room is already booked");
		}
		
	}
	
	  // Cancel a booking
	
	public void cancelBooking(String customerName, int roomNumber) {
		Booking remove = null;
		for(Booking booking :book) {
			if(booking.getCustomerName().equalsIgnoreCase(customerName)
					&& booking.getRoomNumber() == roomNumber) {
				remove = booking;
				break;
			}
		}
		if(remove!=null) {
			book.remove(remove);
			Room room = findRoom(roomNumber);
			if(room !=null) {
				room.setBooked(false);
			}
			System.out.println("Booking canceled for " + customerName + "Room " + roomNumber );
		}else {
			System.out.println("Booking not found for cancellation");
		}
	}
	
	
	///////////Show all bookings
	public void showBooking() {
		System.out.println("All bookings ");
		for(Booking booking : book) {
			System.out.println(booking);
		}
	}

	///////Find room by number
	private Room findRoom(int roomNumber) {
		for(Room room : rooms) {
			if(room.getRoomNumber() == roomNumber) {
				return room;
			}
		} 
		return null;
	}
  
	
	//////////main class 
	public static void main(String [] args) {
		HotelManager manager = new HotelManager();
		
		manager.addRoom(new Room(101, "standard" , 3000, false));
		manager.addRoom(new Room(102, "deluxe" , 4000, false));
		manager.addRoom(new Room(103, "suite" , 5000, false));
		 
		manager.available();
		manager.bookRoom("amna" , 102 ,2);
		manager.cancelBooking("amna", 102);
		manager.showBooking();
	}


}


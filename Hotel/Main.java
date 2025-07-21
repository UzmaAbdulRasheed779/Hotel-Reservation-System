package Hotel;

import java.awt.GridLayout;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame{
	 
		   private HotelManager manager;

		    public Main() {
		        manager = new HotelManager();

		        // Sample rooms added
		        manager.addRoom(new Room( 101, "Standard", 3000, false));
		        manager.addRoom(new Room( 102, "Deluxe", 4000, false));
		        manager.addRoom(new Room( 103, "Suite", 5000, false));

		        // GUI Setup
		        setTitle(" Hotel Booking System");
		        setSize(500, 400);
		        setDefaultCloseOperation(EXIT_ON_CLOSE);
		        setLocationRelativeTo(null);
		        setLayout(new GridLayout(5, 1, 10, 10));

		        // Buttons
		        JButton viewRoomsBtn = new JButton("View Available Rooms");
		        JButton bookRoomBtn = new JButton("Book a Room");
		        JButton cancelBookingBtn = new JButton("Cancel Booking");
		        JButton showBookingsBtn = new JButton("Show All Bookings");
		        JButton exitBtn = new JButton("Exit");

		        // Add actions
		        viewRoomsBtn.addActionListener(e -> manager.available());

		        bookRoomBtn.addActionListener(e -> {
		            String name = JOptionPane.showInputDialog(this, "Enter Customer Name:");
		            String roomNumStr = JOptionPane.showInputDialog(this, "Enter Room Number:");
		            String nightsStr = JOptionPane.showInputDialog(this, "Enter Number of Nights:");

		            if (name != null && roomNumStr != null && nightsStr != null) {
		                try {
		                    int roomNum = Integer.parseInt(roomNumStr);
		                    int nights = Integer.parseInt(nightsStr);
		                    manager.bookRoom(name, roomNum, nights);
		                } catch (NumberFormatException ex) {
		                    JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
		                }
		            }
		        });

		        cancelBookingBtn.addActionListener(e -> {
		            String name = JOptionPane.showInputDialog(this, "Enter Customer Name:");
		            String roomNumStr = JOptionPane.showInputDialog(this, "Enter Room Number:");
		            if (name != null && roomNumStr != null) {
		                try {
		                    int roomNum = Integer.parseInt(roomNumStr);
		                    manager.cancelBooking(name, roomNum);
		                } catch (NumberFormatException ex) {
		                    JOptionPane.showMessageDialog(this, "Invalid Room Number.");
		                }
		            }
		        });
		       
		        showBookingsBtn.addActionListener(e -> manager.showBooking());

		        exitBtn.addActionListener(e -> System.exit(0));

		        // Add buttons to frame
		        add(viewRoomsBtn);
		        add(bookRoomBtn);
		        add(cancelBookingBtn);
		        add(showBookingsBtn);
		        add(exitBtn);

		        setVisible(true);
		    }

		    public static void main(String[] args) {
		        new Main();
		    }

}

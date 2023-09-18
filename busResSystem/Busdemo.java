package busResSystem;
import java.util.Scanner;
import java.util.ArrayList;
public class Busdemo {
public static void main(String args[]) {
	ArrayList<Bus> buses = new ArrayList<>();
	ArrayList<Booking> bookings	 = new ArrayList<>();
	buses.add(new Bus(1,true,2));
	buses.add(new Bus(2,false,1));
	buses.add(new Bus(3,false,3));
	buses.add(new Bus(4,true,4));
	for(Bus b:buses) {
		b.businfo();
	}
	int useropt =1;
	Scanner sc = new Scanner(System.in);
	while(useropt==1) {
		System.out.println("Enter 1 to Book and 2 to exit");
		useropt = sc.nextInt();
		if(useropt==1) {
			Booking booking = new Booking();
			if(booking.isAvailable(buses,bookings)) {
				bookings.add(booking);
				System.out.println("Your Booking is Confirmed");
			}else {
				System.out.println("Sorry! Bus is full.Try another Bus or Date");
			}
		}
	}
	
		
}
}

package busResSystem;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
   String passengername;
   int busno;
   Date date;
   Booking(){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the passenger name:");
	  passengername=sc.nextLine();
	  System.out.println("Enter the Bus Number:");
	  busno=sc.nextInt();
	  System.out.println("Enter the date in this format dd-MM-yyyy");
	  String dateinput = sc.next();
	  SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
	  try {
		date =dateformat.parse(dateinput);
	} catch (ParseException e) {
		System.out.println("please enter the date in above mentioned pattern");
	}  
   }
   public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> bookings) {
	   int capacity=0;
	   for(Bus bus:buses) {
		   if(bus.getbusno()==busno) {
			   capacity=bus.getcapacity();
		   }
	   }
	   int booked=0;
	   for(Booking b:bookings) {
		   if(b.busno==busno && b.date.equals(date)) {
			   booked++;
		   }
	   }
	  return booked<capacity?true:false;
   }
}

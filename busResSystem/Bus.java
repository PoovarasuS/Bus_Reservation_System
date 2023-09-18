package busResSystem;

public class Bus {
   private int busno;
    private boolean ac;
    private int capacity; 
     Bus(int no,boolean ac,int cap){
    	 this.busno=no;
    	 this.ac=ac;
    	 this.capacity=cap;
     }
     public int getcapacity() {
    	 return capacity;
     }
     public void setcapacity(int cap) {
    	 capacity=cap;
     }
     public boolean isAc() {
    	 return ac;
     }
     public void setac(boolean ac) {
    	 this.ac=ac;
     }
     public int getbusno() {
    	 return busno;
     }
     public void businfo()
     {
    	 System.out.println("Busno:"+busno+" AC:"+ac+" Capacity:"+capacity);
     }
}

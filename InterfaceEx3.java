//calculator
 interface Machine
{   
public void start();
public void stop();


}

class Car implements Machine{
    
public void start(){
   
    System.out.println("Starting Car ..");
}
public void stop(){
    
    System.out.println("Stopping Car");
}

}

public class InterfaceEx3{
    public static void main(String[] args) {
	Machine mac = new Car();
	mac.start();
	mac.stop();
	paint(new Car());
	}
	public static void paint( Machine m) {
	m.stop();
	
	System.out.println("Painting ....");
	m.start();
	
}
}
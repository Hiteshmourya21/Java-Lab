
 class automobile
{   public void start(){
    System.out.println("Engine starts running");
}
public void stop(){
    System.out.println("Engine stop running");
}
public void seating(){}
}

class car extends automobile{
    public void No_of_tyres(){
        System.out.println("Tehre are 4 tyres");
    }
    public void fuel(){
        System.out.println("petrol");
    }
    public void fuel(String f){
        System.out.println("Also run on"+f);
    }
    public void seating(){
        System.out.println("4 Seater");
    }
}
class Bike extends automobile{
    public void No_of_tyres(){
        System.out.println("Tehre are 2 tyres");
    }
    public void fuel(){
        System.out.println("petrol");
    }
    public void seating(){
        System.out.println("2 Seater");
    }
}
public class InterfaceEx{
    public static void main(String[] args) {
		automobile a = new automobile();
		car c = new car();
		Bike b = new Bike();
		a.start();
		
		b.No_of_tyres();
		b.fuel();
		b.seating();
		
		c.No_of_tyres();
		c.fuel();
		c.fuel("Diesel");
		c.seating();
		a.stop();
	}
}

public class Gen1
{
	public static void main(String[] args) {
	    call c = new call();
	    c.<String,Integer>GM("Hitesh",20);
	    //c.GM(20);
	    //c.<Boolean>GM(true);
	}
}

class call{
    public <T,V> void GM(T d1,V d2){
        System.out.println("Generic Method : ");
        System.out.println("Data passed in : "+d1);
        System.out.println("Data passed in : "+d2);
    }
}

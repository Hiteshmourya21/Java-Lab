
public class Gen2
{
	public static void main(String[] args) {
	    call c = new call();
	    c.<String>GM("Hitesh");
	    c.<Integer>GM(20);
	    c.<Boolean>GM(true);
	}
}

class call{
    public <T> void GM(T data){
        System.out.println("Generic Method : ");
        System.out.println("Data passed in : "+data);
    }
}


public class ThrowEx4
{
    static int method(int n,int m) throws ArithmeticException
    {   int div = n/m;
        return div;
    }
	public static void main(String[] args) {
	    try{
	        System.out.println(method(40,0));
	    }
	    catch(ArithmeticException e){
	        System.out.println("\ncannot divide by 0");
	    }
		System.out.println("hitesh");
	}
}

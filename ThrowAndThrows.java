
public class ThrowAndThrows
{
    static void method(int n) throws ArithmeticException
    {
        System.out.println("Inside method");
        throw new ArithmeticException("Exception");
    }
	public static void main(String[] args) {
	    try{
	        method();
	    }
	    catch(ArithmeticException e){
	        System.out.println("Caugth in main() method");
	    }
		
	}
}

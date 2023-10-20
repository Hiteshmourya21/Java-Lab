
public class ThrowEx3
{   
    public static void checkAge(int n) throws ArithmeticException
    {
    if(n<=18){
        throw new ArithmeticException("Access Denied - You must be 18");
    }
    else{
        System.out.println("Access granted - You are old enough");
    }
}
	public static void main(String[] args) {
		checkAge(7);
		System.out.println("Hitesh");
	}
}

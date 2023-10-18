import java.util.Scanner;

public class ArithmeticExceptionEx
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter Valur of n");
	    int n = s.nextInt();
		try{
		    int dividebyzero = 5/n;
		    System.out.println("Rest of code in try bloack");
		    
		}
		catch(ArithmeticException e){
		    System.out.println("Arithmetic Exception =>"+e.getMessage());
		}
	}
}

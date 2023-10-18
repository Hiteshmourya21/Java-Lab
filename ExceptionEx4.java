import java.util.Scanner;

public class ExceptionEx4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Valur of n");
	    int n = sc.nextInt();
	  
		try{
		   int x =10;
		   int z = x/n;
		  
		   System.out.println(z);
		   
		}
		catch(Throwable e){
		    System.out.println("Exception=>"+e.getMessage());
		}
		
	}
}

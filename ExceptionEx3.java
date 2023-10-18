import java.util.Scanner;

public class ExceptionEx3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Valur of n");
	    String s = null;
	    int arr[] = {10,20,30};
		try{
		    int n = sc.nextInt();
		   System.out.println(arr[n]);
		   System.out.println(s.length());
		   
		}
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("ArrayIndexOutOfBoundsException=>"+e.getMessage());
		}
		catch(NullPointerException e){
		    System.out.println("NullPointerException  =>"+e);
		}
	}
}

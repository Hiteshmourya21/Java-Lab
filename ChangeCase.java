
//conver the given String to uppercase from lowercase and vise versa
import java.util.Scanner;
public class ChangeCase
{
	public static void main(String[] args) {
	    //create a string
	   	System.out.println("Enter a String");
	   	Scanner sc = new Scanner(System.in);
	   	String s = sc.nextLine();
	   	System.out.println("Enter choice 0 for Upercase 1 for Lowercase");
	   	int i = sc.nextInt();
	   	switch(i){
	   	    case 0:{
	   	        System.out.println(s.toUpperCase());
	   	        break;
	   	    }
	   	    case 1:{
	   	         System.out.println(s.toLowerCase());
	   	        break;
	   	    }
	   	    default:{
	   	        System.out.println("Invalid Choice");
	   	    }
	   	        
	   	}
	}
}


import java.util.Scanner;
public class AcropolisId
{
	public static void main(String[] args) {
	    //create a string
	   	System.out.println("Enter a name");
	   	Scanner sc = new Scanner(System.in);
	   	String n = sc.nextLine();
	  
	   	System.out.println("Enter a Enroll no. last three digit");
	   	int enroll = sc.nextInt();
	   	String e = String.valueOf(enroll);
	   	
	   	System.out.println("Enter a year of admission");
	   	int year = sc.nextInt();
	   	String y = String.valueOf(year);
	   	
	   	String id1 = y.concat(e);
	   	String id = n.concat(id1) ;
	   	System.out.println("ID :" +id + "@acropolis.in");
	   	
	}
}

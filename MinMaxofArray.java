//WAP to Minimum and maximum of given in array;
import java.util.Arrays;

public class MinMAxofArray
{
	public static void main(String[] args) {
	    
	int a[] = {5,7,6,1,3,5,7,8,9,10} ;
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Minimum = "+a[0]);
		System.out.println("Maximum = "+a[a.length-1]);
	}
}

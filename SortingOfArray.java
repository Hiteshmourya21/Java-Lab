//WAP to sort the givenint and string array
import java.util.Arrays;

public class SortingOfArray
{
	public static void main(String[] args) {
	    
	int a[] = {5,7,6,1,3,5,7,8,9,10} ;
	String s[] = {"dog","cat","lion","tiger","mouse"};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}
}

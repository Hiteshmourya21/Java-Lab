//WAP to count the even and odd no. in array
import java.util.Arrays;

public class EvenOddCountInArray
{
	public static void main(String[] args) {
	   int ec=0;
	   int oc=0;
	int a[] = {1,2,3,4,5,6,7,8,9,10} ;
		for(int i:a){
		    if(i%2==0){
		        ec++;
		    }
		    else{
		        oc++;
		    }
		}
		
		System.out.println("Even count = "+ec);
		System.out.println("Odd count = "+oc);
	}
}
 
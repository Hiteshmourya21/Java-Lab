//WAP to calculate the sum and average of all the value in array


public class SumOfArray
{
	public static void main(String[] args) {
	    
		int arr[] = {1,2,3,4,5,6,7,8,9,10} ;
    int sum =0;
    double avg;
		for(int i:arr){
		    sum +=i;
		}
		System.out.println("Sum = "+ sum);
		avg = sum/arr.length;
		System.out.println("Average = "+ avg);
	}
}

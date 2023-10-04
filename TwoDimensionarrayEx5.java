import java.util.Scanner;
import java.util.Arrays;
public class TwoDimensionarrayEx5{

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter row of array : ");
	    int n = sc.nextInt();
	   System.out.println("Enter column of array : ");
	    int m = sc.nextInt();
	    int[][] arr=new int[n][m];
	     System.out.println("Enter elements : ");
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr[i].length;j++){
		    arr[i][j]= i+j;
	    }
	    }
	    System.out.println("Your Array is ");
	    System.out.println(Arrays.deepToString(arr));
	    
	}
}

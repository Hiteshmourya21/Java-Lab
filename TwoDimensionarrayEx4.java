import java.util.Scanner;
public class TwoDimensionarrayEx4{

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
	    System.out.print("Your Array is ");
	     for(int i=0;i<arr.length;i++){
	          System.out.print("\n");
	        for(int j=0;j<arr[i].length;j++){
		    System.out.print(arr[i][j]+" ");
	    }
	    }
	}
}

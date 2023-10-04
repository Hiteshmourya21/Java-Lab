import java.util.Scanner;
public class TwoDimensionarrayEx2{

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter row of array : ");
	    int n = sc.nextInt();
	     System.out.println("Enter column of array : ");
	    int m = sc.nextInt();
	    int[][] arr=new int[n][m];
	     System.out.println("Enter elements : ");
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
		    arr[i][j]= sc.nextInt();
	    }
	    }
	    System.out.print("Your Array is ");
	      for(int i=0;i<n;i++){
	          System.out.print("\n");
	        for(int j=0;j<m;j++){
		   System.out.print(arr[i][j]+" ");
	    }
	    }
	}
}

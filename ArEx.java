
//WAP to initialize the array and display it  

import java.util.Scanner;
public class ArrayInitialize
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int arr[] = new int[10] ;
		for(int i=0;i<arr.length;i++){
		    System.out.println("Enter an integer : ");
		    arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]);
		}
	}
}

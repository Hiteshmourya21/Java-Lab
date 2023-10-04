import java.util.Scanner;
public class linearsearchEx{
public  int linearsearch(int[]arr,int key){
    for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
        return i;
    }
}
return -1;
}
	public static void main(String[] args) {
	    linearsearchEx o = new linearsearchEx();
	    Scanner sc =new Scanner(System.in);
	    int[] arr=new int[10];
	    for(int i=0;i<arr.length;i++){
		    System.out.println("Enter an integer : ");
		    arr[i]= sc.nextInt();
	    }
	    System.out.println("Enter the integer you want to search");
	    int key =sc.nextInt();;
		System.out.println(key+" is found at index :" + o.linearsearch(arr,key) );
	}
}

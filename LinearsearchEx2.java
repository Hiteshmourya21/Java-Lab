import java.util.Scanner;
public class LinearsearchEx2{
public  int linearsearch(int[]arr,int key){
    for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
        return i;
    }
}
return -1;
}
	public static void main(String[] args) {
	    LinearsearchEx2 o = new LinearsearchEx2();
	    Scanner sc =new Scanner(System.in);
	    int[] arr=new int[5];
	     System.out.println("Enter elements : ");
	    for(int i=0;i<arr.length;i++){
		    arr[i]= sc.nextInt();
	    }
	    System.out.println("Enter the integer you want to search");
	    int key =sc.nextInt();
	    int c = o.linearsearch(arr,key);
	    if(c==-1){
	        System.out.println(" Not Found " );
	    }
	    else{
	         System.out.println(key+" is found at index :" + c );
	    }
		
	}
}

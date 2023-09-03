// /Demonstrate the use Scanner class for taking Input /Output from user
import java.util.Scanner;
public class Scannerclass {
    static int x;
    public static void set(){ //setter
        System.out.print("Enter any number: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        x=n;
    }
    public static void get(){ //Getter
        System.out.println("The no. entered by the user is "+x);
    }
    public static void main(String[] args) {
        Scannerclass.set();
        Scannerclass.get();
    }
}

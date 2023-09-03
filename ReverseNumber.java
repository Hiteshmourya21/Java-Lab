import java.util.Scanner;

public class ReverseNumber {
     public static void main(String[] args) {
    Scanner r=new Scanner(System.in);
    System.out.print("Enter any number: ");
    int num=r.nextInt();
    int rev=0,rem;
    while(num!=0){
        rem=num%10;
        num/=10;
        rev=rev*10+rem;
        }
        System.out.print("The reversal of number is  "+rev);
    }
}

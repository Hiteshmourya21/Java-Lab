///Write a program in java to Print an Integer entered by an user
import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        
        int userInteger = scanner.nextInt();
        
        System.out.println("You entered: " + userInteger);
        scanner.close();
    }
}

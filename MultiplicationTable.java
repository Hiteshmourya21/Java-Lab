//Write  a program in java to Generate Multiplication Table using for loop

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for the multiplication table
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prompt the user to enter the range for the table
        System.out.print("Enter the range (e.g., 1 to 10): ");
        int range = scanner.nextInt();

        // Generate and display the multiplication table
        System.out.println("Multiplication Table for " + number + " from 1 to " + range + ":");
        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}

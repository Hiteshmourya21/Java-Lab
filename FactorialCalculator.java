//Write  a program in java to Find Factorial of a number using for loop

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; 

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }
}

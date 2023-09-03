//Write a program in java to Check whether an alphabet is vowel or consonant using if..else statement
import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet: ");
        char input = scanner.next().charAt(0);


        char lowercaseInput = Character.toLowerCase(input);

        if (lowercaseInput == 'a' || lowercaseInput == 'e' || lowercaseInput == 'i' || lowercaseInput == 'o' || lowercaseInput == 'u') {
            System.out.println(input + " is a vowel.");
        } else {
            System.out.println(input + " is a consonant.");
        }


        scanner.close();
    }
}

package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
        public static void main(String[] args) {
            int firstNumber = 0, secondNumber = 0;

            // Step 2: Repeat until correct input
            Scanner scanner = new Scanner(System.in);
            boolean validInput = false;

            do {
                try {
                    System.out.print("Enter the first number: ");
                    firstNumber = scanner.nextInt();

                    System.out.print("Enter the second number: ");
                    secondNumber = scanner.nextInt();

                    // End the loop if input is correct
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: You must enter an integer. Please try again.\n");
                    scanner.nextLine(); // Discard the invalid input line
                }
            } while (!validInput);

            int sum = firstNumber + secondNumber;
            System.out.println("The sum of the two numbers is: " + sum);

            scanner.close();
        }
}

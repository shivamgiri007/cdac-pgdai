package Submissions.Day_4_Exception_handling.interface_submissions;
import java.util.Scanner;
import java.util.InputMismatchException;
//Q 8 Implement a Java program to read an integer from the user and calculate its square root. 
//Handle the InputMismatchException if the user enters a non-integer value.



public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        
        while (true) {
            System.out.print("Please enter an integer to calculate its square root: ");
            try {
                number = scanner.nextInt(); // Attempt to read an integer
                if (number < 0) {
                    System.out.println("Cannot calculate the square root of a negative number.");
                } else {
                    double squareRoot = Math.sqrt(number); // Calculate square root
                    System.out.printf("The square root of %d is %.2f%n", number, squareRoot);
                }
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        scanner.close(); // Close the scanner
    }
}

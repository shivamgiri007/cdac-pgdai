package Submissions.Day_4_Exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;
//Q 9 Write a Java program to read an integer array from the user and calculate the average of its elements. 
//Handle the InputMismatchException if the user enters a non-integer value.

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        // Read the size of the array
        while (true) {
            System.out.print("Enter the size of the array: ");
            try {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Size must be a positive integer. Please try again.");
                } else {
                    break; // Exit the loop if size is valid
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        int[] numbers = new int[size];

        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Enter element " + (i + 1) + ": ");
                try {
                    numbers[i] = scanner.nextInt(); // Read an integer
                    break; // Exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Clear the invalid input
                }
            }
        }

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / size;

        // Display the average
        System.out.printf("The average of the array elements is: %.2f%n", average);

        scanner.close(); // Close the scanner
    }
}

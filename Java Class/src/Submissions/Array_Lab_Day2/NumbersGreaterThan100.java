package Submissions.Array_Lab_Day2;
import java.util.Scanner;

public class NumbersGreaterThan100 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array of integers
        int[] numbers = new int[5];
        
        // Take input from the user
        System.out.println("Please enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Count and print numbers greater than 100
        int count = 0;
        System.out.println("Numbers greater than 100:");
        for (int number : numbers) {
            if (number > 100) {
                System.out.println(number);
                count++;
            }
        }
        
        // Print the count of numbers greater than 100
        System.out.println("Total count of numbers greater than 100: " + count);
        
        // Close the scanner
        scanner.close();
    }

}

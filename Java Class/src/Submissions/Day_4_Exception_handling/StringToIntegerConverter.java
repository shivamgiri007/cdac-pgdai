package Submissions.Day_4_Exception_handling;
import java.util.Scanner;

public class StringToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Read a string from the user
        System.out.print("Enter a string to convert to an integer: ");
        input = scanner.nextLine();

        try {
            // Attempt to convert the string to an integer
            int number = Integer.parseInt(input);
            System.out.println("The converted integer is: " + number);
        } catch (NumberFormatException e) {
            // Handle the case where the string cannot be converted
            System.out.println("Error: The input '" + input + "' is not a valid integer.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}

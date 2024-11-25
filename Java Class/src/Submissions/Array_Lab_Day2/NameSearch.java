package Submissions.Array_Lab_Day2;
import java.util.Scanner;

public class NameSearch {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store 7 names
        String[] names = new String[7];
        
        // Ask the user to input 7 names
        System.out.println("Please enter 7 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        
        // Ask the user for the name to search
        System.out.print("Enter the name you want to search for: ");
        String searchName = scanner.nextLine();
        
        // Search for the name in the array
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                found = true;
                break; // Exit the loop if the name is found
            }
        }
        
        // Output the result
        if (found) {
            System.out.println("The name '" + searchName + "' was found in the list.");
        } else {
            System.out.println("The name '" + searchName + "' was not found in the list.");
        }
        
        // Close the scanner
        scanner.close();
    }

}

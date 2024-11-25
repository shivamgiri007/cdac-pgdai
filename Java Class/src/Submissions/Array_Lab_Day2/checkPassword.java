package Submissions.Array_Lab_Day2;
import java.util.Scanner;
public class checkPassword {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "123";
        String userInput;
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.print("Enter your password: ");
            userInput = scanner.nextLine();

            if (userInput.equals(correctPassword)) {
                System.out.println("allowed access");
                break; // Exit the loop if the password is correct
            } else {
                attempts++;
                System.out.println("Incorrect password. You have " + (maxAttempts - attempts) + " attempts left.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("card blocked");
        }

        // Close the scanner
        scanner.close();
    }

}

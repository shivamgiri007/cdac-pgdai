package Submissions.Array_Lab_Day2;

//9 wap to check a given number is armstrong or not

import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        // Calculate the sum of the digits raised to the power of numberOfDigits
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, numberOfDigits); // Raise to the power and add to sum
            number /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number to check
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        // Check and display result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}

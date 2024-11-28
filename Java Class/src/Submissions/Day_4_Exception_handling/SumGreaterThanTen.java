package Submissions.Day_4_Exception_handling;
//Custom exception for numbers less than 10
import java.util.Scanner;
//Q 5   Write a program to check all the three number entered by command line argument are greater than 10 , 
//then print sum of those numbers . 
//If any number is less then 10 then throw user defined exception “MyException” which print message number iis lesser then 10 
//Custom exception for numbers less than 10
class MyException extends Exception {
 public MyException(String message) {
     super(message);
 }
}

//Main class
public class SumGreaterThanTen {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int sum = 0;

     try {
         // Prompt the user to enter three numbers
         System.out.print("Enter the first number: ");
         int number1 = scanner.nextInt();
         checkNumber(number1);

         System.out.print("Enter the second number: ");
         int number2 = scanner.nextInt();
         checkNumber(number2);

         System.out.print("Enter the third number: ");
         int number3 = scanner.nextInt();
         checkNumber(number3);

         // Calculate the sum if all numbers are valid
         sum = number1 + number2 + number3;
         System.out.println("The sum of the numbers is: " + sum);

     } catch (MyException e) {
         // Handle the custom exception
         System.out.println(e.getMessage());
     } catch (Exception e) {
         // Handle any other exceptions (e.g., input mismatch)
         System.out.println("Please enter valid integers.");
     } finally {
         scanner.close(); // Close the scanner
     }
 }

 // Method to check if the number is less than 10
 private static void checkNumber(int number) throws MyException {
     if (number < 10) {
         throw new MyException("Number " + number + " is lesser than 10.");
     }
 }
}

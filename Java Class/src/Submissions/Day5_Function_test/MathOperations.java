package Submissions.Day5_Function_test;
import java.util.Scanner;
//Q 1) create a class three methods
//a) void cube(int a)
//b) void square (int b)
//c) void greater(int a,int b,int c)
//
//create another class having main method
//display menu
//  1) cube
//  2) square
//  3) greater
//Ask choice from user and based on choice call above methods
//Repeat the menu till choice is not equal to 0
//
//Q 2 create another class having method like
//void greater() --> take 3 input  within function
//void greater(int ,int)
//void greater(int a,int b,int c)
//create main in same class and call all methods
public class MathOperations {
    public void cube(int a) {
        int result = a * a * a;
        System.out.println("Cube of " + a + " is: " + result);
    }
    public void square(int b) {
        int result = b * b;
        System.out.println("Square of " + b + " is: " + result);
    }
    public void greater(int a , int b) {
    	int greatest = a;
        if (b > greatest) {
            greatest = b;
        }
        System.out.println("The greatest number among " + a + " is " + b  + greatest);
    }
    public void greater(int a, int b, int c) {
        int greatest = a;
        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }
        System.out.println("The greatest number among " + a + ", " + b + ", and " + c + " is: " + greatest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();
        int choice;

        do {
            
            System.out.println("Menu:");
            System.out.println("1) Cube");
            System.out.println("2) Square");
            System.out.println("3) Greater of three numbers");
            System.out.println("4) Greater of two numbers");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to calculate its cube: ");
                    int cubeInput = scanner.nextInt();
                    mathOps.cube(cubeInput);
                    break;
                case 2:
                    System.out.print("Enter a number to calculate its square: ");
                    int squareInput = scanner.nextInt();
                    mathOps.square(squareInput);
                    break;
                case 3:
                    System.out.print("Enter three numbers to find the greatest: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    mathOps.greater(a, b, c);
                    break;
                case 4:
                    System.out.print("Enter three numbers to find the greatest: ");
                    int f = scanner.nextInt();
                    int g = scanner.nextInt();
                    mathOps.greater(f,g);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
 
    }
}

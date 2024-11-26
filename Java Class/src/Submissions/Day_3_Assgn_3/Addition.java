package ClassSolutions.Day_3_Assgn_3;
//Q 8  wap to perform addition of two three and fourth integer numbers using functions (use polymorphism)
import java.util.Scanner;

public class Addition {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add four integers
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Addition addition = new Addition();

        // Input for addition of two integers
     // Direct input for addition of two integers
        int num1 = 5;
        int num2 = 10;
        System.out.println("Sum of two numbers: " + addition.add(num1, num2));

        // Direct input for addition of three integers
        int num3 = 1;
        int num4 = 2;
        int num5 = 3;
        System.out.println("Sum of three numbers: " + addition.add(num3, num4, num5));

        // Direct input for addition of four integers
        int num6 = 4;
        int num7 = 5;
        int num8 = 6;
        int num9 = 7;
        System.out.println("Sum of four numbers: " + addition.add(num6, num7, num8, num9));
        scanner.close();
    }
}

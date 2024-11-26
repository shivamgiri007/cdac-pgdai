package ClassSolutions.Day_3_Assgn_3;
import java.text.DecimalFormat;
//Q 9 Write a JAVA program which contains a method square() such that square(3) returns 9,square(0.2) returns 0.04.
public class SquareCalculator {
    // Method to calculate the square of an 

	
    public int square(int number) {
        return number * number;
    }

    // Method to calculate the square of a double
    public double square(double number) { 
        return number * number;
    }

    public static void main(String[] args) {
    	DecimalFormat df2 = new DecimalFormat("#.00");
        SquareCalculator calculator = new SquareCalculator();

        // Testing the square method with an integer
        int intResult = calculator.square(3);
        System.out.println("Square of 3: " + intResult); // Output: 9

        // Testing the square method with a double
        double doubleResult = calculator.square(0.2);
        System.out.println("Square of 0.2: " + df2.format(doubleResult)); // Output: 0.04
    }
}

package Day_7_Lambda_Functions_and_its_types;

import java.util.function.Predicate;

//Q 1  Write a Java program that uses a Predicate to check if a given number is even or odd.
//Create a Predicate<Integer> to test whether a number is even.
//Use the test() method of Predicate to check if a number is even or odd and print the result.
//Input: 6
//Output: "6 is even"

public class predicate_lambda {
	public static void main(String[] args) {
		Predicate<Integer> checkOddEven = (a) -> a%2==0;
		if(checkOddEven.test(5)) {
			System.out.println("The number is positive number");
		}
		else {
			System.out.println("number is negative number");
		}
	}
}

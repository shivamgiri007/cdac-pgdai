package Day_7_Lambda_Functions_and_its_types;

import java.util.function.Predicate;

//Q 5 Write a Java program that uses a Predicate to check if a given number is prime. Create a Predicate<Integer> 
//that returns true if the number is prime, otherwise false. Use the test() method to check whether a number is prime. 
//Example Input/Output: Input: 7 Output: "7 is prime" Input: 10 Output: "10 is not prime"
public class predicate_prime {
	public static void main(String[] args) {
		Predicate<Integer> checkPrime = number -> {
            if (number <= 1) return false; // 0 and 1 are not prime numbers
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // Found a divisor, not prime
                }
            }
            return true; // No divisors found, it is prime
        };
        int testNumber = 29; // Change this number to test other values
        if (checkPrime.test(testNumber)) {
            System.out.println(testNumber + " is a prime number.");
        } else {
            System.out.println(testNumber + " is not a prime number.");
        }
	}
}

package Submissions.Assign_1;

public class Question_1 {
//	1) Write a function that checks whether a given number is prime. 
//	Use a loop to test for factors, and return true or false based on the result.
public static void main(String[] args) {

	int a = 5;
	boolean isPrime=true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {		
		System.out.println("Number is prime.");
	}
	else {
		System.out.println("Number is not prime.");
	}
}
}

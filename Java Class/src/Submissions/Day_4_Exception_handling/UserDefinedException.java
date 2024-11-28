package Submissions.Day_4_Exception_handling;
import java.lang.Math;
import java.util.Scanner;
public class UserDefinedException {
	class negativeException extends Exception{
		negativeException(){
			System.out.println("n and p shoud not be negative.");
		}
	}
	class divideByZero extends Exception{
		divideByZero(){
			System.out.println("n and p should not be zero");
		}
	}
	class myCalculator {
		long power(int a , int b ) {
			long c =(long)Math.pow(a,b);
			return(c);
		}
		
	}
	class power{
		void powerFunction(int a , int b) {
			System.out.println(java.lang.Math.pow(a, b));
		}
	}
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of inputs you want to give :");
			int size = sc.nextInt();
			UserDefinedException u = new UserDefinedException();
			power p = u.new power();
			for(int i=0;i<size;i++) {
				System.out.println("Enter the value of a :");
				int a = sc.nextInt();
				System.out.println("Enter the value of b :");
				int b = sc.nextInt();
				if(a<0 || b<0) {
					throw u.new negativeException();
				}
				else if(a==0 ||b ==0 ) {
					throw u.new divideByZero();
				}
				else {
					p.powerFunction(a,b);
				}
			}
		}
		catch(Exception e) {
			System.out.println("Report : " + e);
		}
	}
}

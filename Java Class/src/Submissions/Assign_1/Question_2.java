package Submissions.Assign_1;
import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
//		2 ) Write a function that takes a student's score as an argument and returns a letter grade based on the following scale:
//	90-100: A
//	80-89: B
//	70-79: C
//	60-69: D
//	Below 60: F
//	Use if-else statements to determine the grade.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Score of the student :");
		int a = sc.nextInt();
		if(a>=90 || a<=100) {
			System.out.println("Grade A");
		}
		else if(a>=80 || a<=89) {
			System.out.println("Grade b");
		}
		else if(a>=70 || a<=79) {
			System.out.println("Grade C");
		}
		else if(a>=60 || a<=69) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();
	}

}

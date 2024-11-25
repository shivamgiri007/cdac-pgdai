package Submissions.Assign_1;
import java.util.Scanner;
public class Question_3_Sum_of_numbers_in_number {
	int sumOfInt(int a) {
		int sum = 0;
		while(a>0) {
			sum+=a%10;
			a=a/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multiple numeric number here :");
		int a = sc.nextInt();
		Question_3_Sum_of_numbers_in_number s = new Question_3_Sum_of_numbers_in_number();
		System.out.println(s.sumOfInt(a));
	}
}

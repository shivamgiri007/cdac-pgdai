package Submissions.Assign_1;
import java.util.Scanner;
public class Multiplication_table_1to10 {
	void multiplicationTable(int a) {
		for(int i=1;i<=10;i++) {
			System.out.println(a*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be table :");
		int a = sc.nextInt();
		sc.close();
		Multiplication_table_1to10 m = new Multiplication_table_1to10();
		m.multiplicationTable(a);
		
	}
}

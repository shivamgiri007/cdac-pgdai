package Submissions.Assign_1;

import java.util.Scanner;

public class EvenOddSum {
	void evenSumOddSum(int[] arr) {
		int evenSum = 0;
		int oddSum = 0;
		for(int x : arr) {
			if(x%2==0) {
				evenSum+=x;
			}
			else {
				oddSum+=x;
			}
		}
		System.out.println("Even Sum = " + evenSum + " odd Sum = " + oddSum );
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array here :");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		EvenOddSum e = new EvenOddSum();
		e.evenSumOddSum(arr);
		sc.close();
	}
}

package Submissions.Array_Lab_Day2;

//1 wap to take 10 numbers in an array and print count of even and odd number in given array.

public class SumOfEvenOdd {
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
		int[] arr = {2,7,6,3,5,9};
		SumOfEvenOdd e = new SumOfEvenOdd();
		e.evenSumOddSum(arr);
	}
}

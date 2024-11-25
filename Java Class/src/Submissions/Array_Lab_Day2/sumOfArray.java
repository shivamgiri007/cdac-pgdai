package Submissions.Array_Lab_Day2;
//2 WAP to define two array a and b of size 5  .Add both array elements and store them to third array .


public class sumOfArray {
	void getSum(int[] arr1 , int[] arr2 ) {
		int[] sumOfArray = new int[arr1.length];
		for(int i =0;i<arr1.length;i++) {
			sumOfArray[i] = arr1[i] + arr2[i];
		}
		for(int x : sumOfArray) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {2,7,6,3,5,9};
		int[] arr2 = {5,7,2,9,6,3};
		sumOfArray e = new sumOfArray();
		e.getSum(arr1 , arr2);
	}
}

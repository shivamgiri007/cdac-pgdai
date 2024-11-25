package Submissions.Assign_1;
import java.util.Scanner;
public class max_min_in_array {
	void minMax(int[] arr) {
		int min =arr[0];
		int max = arr[0];
		for(int x:arr) {
			if(x>max) {
				max = x;
			}
			if(x<min) {
				min = x;
			}
		}
		System.out.println("Max : " + max + " Min : " + min);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array here :");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		
		max_min_in_array m = new max_min_in_array();
		m.minMax(arr);
		
		sc.close();
	}
}

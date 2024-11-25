package Submissions.Array_Lab_Day2;
import java.util.Scanner;
import java.util.Arrays;

//8 Write a program to search element in array using (linear search and binary search) 

public class linearBirarySearch {
	 public static int linearSearch(int[] array, int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; // Return the index if found
	            }
	        }
	        return -1; // Return -1 if not found
	    }

	    // Binary Search Method
	    public static int binarySearch(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            // Check if target is present at mid
	            if (array[mid] == target) {
	                return mid; // Return the index if found
	            }

	            // If target is greater, ignore left half
	            if (array[mid] < target) {
	                left = mid + 1;
	            } 
	            // If target is smaller, ignore right half
	            else {
	                right = mid - 1;
	            }
	        }
	        return -1; // Return -1 if not found
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];

	        // Input array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Input target element to search
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        // Linear Search
	        int linearResult = linearSearch(array, target);
	        if (linearResult != -1) {
	            System.out.println("Element found at index (Linear Search): " + linearResult);
	        } else {
	            System.out.println("Element not found (Linear Search).");
	        }

	        // Sort the array for Binary Search
	        Arrays.sort(array);
	        System.out.println("Sorted array for Binary Search: " + Arrays.toString(array));

	        // Binary Search
	        int binaryResult = binarySearch(array, target);
	        if (binaryResult != -1) {
	            System.out.println("Element found at index (Binary Search): " + binaryResult);
	        } else {
	            System.out.println("Element not found (Binary Search).");
	        }

	        // Close the scanner
	        scanner.close();
	    }
}

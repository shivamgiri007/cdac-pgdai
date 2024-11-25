package Submissions.Array_Lab_Day2;

public class AddAndFilter {
	void updatedNumbers(int[] numbers) {
		int[] updatedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            updatedNumbers[i] = numbers[i] + 10;
        }
        System.out.println("Numbers smaller than 50 after adding 10:");
        for (int num : updatedNumbers) {
            if (num < 50) {
                System.out.println(num);
            }
        }
	}
	public static void main(String[] args) {
        int[] numbers = {20, 35, 45, 50, 60, 70, 80};
        AddAndFilter a = new AddAndFilter();
        a.updatedNumbers(numbers);
    }

}

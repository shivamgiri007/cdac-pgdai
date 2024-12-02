package Submissions.Day_6_Collectioss_and_GetterSetter;

public class commandLineInput {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }
        String firstArgument = args[0];
        String secondArgument = args[1];
        System.out.println(firstArgument + " technology " + secondArgument);
    }
}

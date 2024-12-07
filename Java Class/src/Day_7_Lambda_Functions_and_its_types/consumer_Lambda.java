package Day_7_Lambda_Functions_and_its_types;
import java.util.*;
import java.util.function.Consumer;
//Q  2  Write a Java program that uses a Consumer to print the name of a student in uppercase.
//Create a Consumer<String> to print the name of a student in uppercase.
//Accept a student name and print it in uppercase.
//Input: "John Doe"
//Output: "JOHN DOE"
public class consumer_Lambda {
	public static void main(String[] args) {
		Consumer<String> changeCase = (s) -> System.out.println("Uppaer case of given string is : " + s.toUpperCase() );;
		changeCase.accept("this is lowercase string passed");
		
	}
}

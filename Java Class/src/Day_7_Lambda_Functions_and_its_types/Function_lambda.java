package Day_7_Lambda_Functions_and_its_types;

import java.util.function.Function;

//Q 4  
//Create a Function<Double, Double> that converts a temperature from Celsius to Fahrenheit using the formula:
//Fahrenheit = (Celsius * 9/5) + 32
//Accept a Celsius temperature and print the equivalent Fahrenheit temperature.
//Input: 25.0
//Output: "25.0 Celsius is equal to 77.0 Fahrenheit"import java.util.function.Function*;

public class Function_lambda {
	public static void main(String[] args) {
		Function <Double, Double> degreeToFarenheight = Celcius -> ((Celcius * (9/5)) + 32);
		double tempInDegree = 33;
		System.out.println("The Conversion of Degree to Farenheight is :" + degreeToFarenheight.apply(tempInDegree));
	}

}

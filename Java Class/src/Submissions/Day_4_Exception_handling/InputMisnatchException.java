package Submissions.Day_4_Exception_handling;
//Q 1	Take two integers  and  as input, you have to compute  x/y . If   x and  y  are not  integers or if  is zero , 
//exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

import java.util.*;
public class InputMisnatchException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a/b);			
		}
		catch(Exception e){
			System.out.println("Report : " + e );
		}
	}
}

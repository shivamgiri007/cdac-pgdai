package Submissions.Array_Lab_Day2;

//Q 10 Rajan  went to a movie with his friends in a multiplex theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices :
//
//Rs.100/pizza
//Rs.20/puffs
//Rs.10/cooldrink
//Generate a bill for What Rajan  has bought.
//
//
//Sample Input 1:
//
//Enter the no of pizzas bought:10
//Enter the no of puffs bought:12
//Enter the no of cool drinks bought:5
//
//Sample Output 1:
//
//Bill Details
//No of pizzas:10
//No of puffs:12
//No of cooldrinks:5
//Total price=1290

import java.util.Scanner;

public class BillGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prices of items
        final int pizzaPrice = 100;
        final int puffPrice = 20;
        final int coolDrinkPrice = 10;

        // Input quantities
        System.out.print("Enter the no of pizzas bought: ");
        int numberOfPizzas = scanner.nextInt();

        System.out.print("Enter the no of puffs bought: ");
        int numberOfPuffs = scanner.nextInt();

        System.out.print("Enter the no of cool drinks bought: ");
        int numberOfCoolDrinks = scanner.nextInt();

        // Calculate total price
        int totalPrice = (numberOfPizzas * pizzaPrice) + (numberOfPuffs * puffPrice) + (numberOfCoolDrinks * coolDrinkPrice);

        // Display bill details
        System.out.println("\nBill Details");
        System.out.println("No of pizzas: " + numberOfPizzas + " * " + pizzaPrice);
        System.out.println("No of puffs: " + numberOfPuffs + " * " + puffPrice);
        System.out.println("No of cooldrinks: " + numberOfCoolDrinks + " * " + coolDrinkPrice);
        System.out.println("Total price = Rs." + totalPrice);

        // Close the scanner
        scanner.close();
    }
}

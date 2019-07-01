package co.grandcircus;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		final double BURGER_PRICE = 2.50;
		final double SODA_PRICE = 1.25;
		final double SALES_TAX = .07;
		int userSelection;
		double burgerOrder = 0;
		double sodaOrder = 0;
		double subTotal;
		double orderTotal;
		
		do {
			System.out.println("1. Burger");
			System.out.println("2. Soda");
			System.out.println("3. Exit");
			System.out.println("Select an option: ");
			
			userSelection = scnr.nextInt();
			
			switch (userSelection) {
			case 1:
				burgerOrder = burgerOrder + 1;
				break;
			case 2:
				sodaOrder = sodaOrder + 1;
				break;
			case 3:
				break;
			default:
				System.out.println("Sorry I didn't understand, let's try again.");
				break;
			}
			
			//System.out.println("\nBurger Order Count: " + burgerOrder);
			//System.out.println("\nSoda Order Count: " + sodaOrder);
			
			
		} while (userSelection != 3);
		
		
		subTotal = ((sodaOrder * SODA_PRICE) + (burgerOrder * BURGER_PRICE));
		System.out.println("Subtotal: $" + subTotal);
		
		orderTotal = ((subTotal * SALES_TAX) + subTotal);
		System.out.println("Total: $" + orderTotal);
		
		
		System.out.print("Burgers: ");
		burgerAsterisk(burgerOrder);
		
		
		System.out.print("\nSodas: ");
		sodaAsterisk(sodaOrder);
		
		
	}
	
	
	public static void burgerAsterisk(double burgerOrder) {
		
		for (double i = 1; i <= burgerOrder; ++i) {
			System.out.print("*");
		}
		
	}
	
public static void sodaAsterisk(double sodaOrder) {
		
		for (double i = 1; i <= sodaOrder; ++i) {
			System.out.print("*");
		}
		
	}

}

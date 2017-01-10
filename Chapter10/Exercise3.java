import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cents, dollars, quarters, dimes, nickels, pennies;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter an amount of change:");
		cents = scan.nextInt();
		
		dollars = cents / 100;
		cents = cents % 100;
		System.out.println("Dollars: " + dollars);
		
		quarters = cents / 25;
		cents = cents % 25;
		System.out.println("Quarters: " + quarters);
		
		dimes = cents / 10;
		cents = cents % 10;
		System.out.println("Dimes: " + dimes);
		
		nickels = cents / 5;
		cents = cents % 5;
		System.out.println("Nickels: " + nickels);
		
		System.out.println("Pennies: " + cents);
	}

}

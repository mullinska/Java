import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cents, dollars;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter an amount in cents:");
		cents = scan.nextInt();
		
		dollars = cents / 100;
		System.out.println("Dollars: " + dollars);
		System.out.println("Leftover cents: " + (cents % 100));
	}

}

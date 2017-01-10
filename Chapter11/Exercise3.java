import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter a double:");
		number = scan.nextDouble();
		
		double log = Math.log(number) / Math.log(2);
		System.out.println("Log base 2 of " + number + " is: " + log);
	}

}

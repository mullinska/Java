import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter an x value:");
		x = scan.nextDouble();
		
		System.out.println("Enter a y value:");
		y = scan.nextDouble();
		
		double harmonicMean = 2 / (1/x + 1/y);
		System.out.println("Harmonic mean: " + harmonicMean);
		System.out.println("Arithmetic mean: " + ((x + y) / 2));
	}

}

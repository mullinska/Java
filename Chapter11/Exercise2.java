import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double time, distance;
		final double g = 32.174;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter an amount of time:");
		time = scan.nextDouble();
		
		distance = 0.5 * g * time * time;
		System.out.println("Distance: " + distance);
	}

}

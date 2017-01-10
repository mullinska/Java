import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int volts, resistance;
		double amps;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter a voltage:");
		volts = scan.nextInt();
		
		System.out.println("Enter a resistance:");
		resistance = scan.nextInt();
		
		amps = (volts + 0.0) / resistance;
		System.out.println("Amps: " + amps);
	}

}

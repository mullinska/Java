import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double centsPerKilowattHour, kilowattHoursPerYear;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter cost per kilowatt-hour in cents:");
		centsPerKilowattHour = scan.nextDouble();
		
		System.out.println("Enter kilowatt-hours used per year:");
		kilowattHoursPerYear = scan.nextDouble();
		
		double cost = kilowattHoursPerYear * centsPerKilowattHour;
		System.out.println("Cost: " + (cost / 100));
	}

}

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter a radius:");
		radius = scan.nextInt();
		
		area = radius * radius * Math.PI;
		System.out.println("Area: " + area);
	}

}

import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nItems;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter the number of items:");
		nItems = scan.nextInt();
		double avgsqrsum = 0;
		double avgsum = 0;
		
		for (int i = 0; i < nItems; i++) {
			int number = scan.nextInt();
			avgsum += number;
			avgsqrsum += number * number;
		}
		avgsum = avgsum / nItems;
		
		double sd = Math.sqrt(avgsqrsum/nItems-avgsum*avgsum);
		
		System.out.println(sd);
	}

}

import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nItems;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter the number of items:");
		nItems = scan.nextInt();
		int sum = 0;
		
		for (int i = 0; i < nItems; i++) {
			sum += scan.nextInt();
		}
		
		System.out.println(sum);
	}

}

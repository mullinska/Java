import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nItems;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter the number of items:");
		nItems = scan.nextInt();
		double sum = 0;
		
		for (int i = 0; i < nItems; i++) {
			sum += 1.0/(i+1);
		}
		
		System.out.println(sum);
	}

}

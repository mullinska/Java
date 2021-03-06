import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter number of rounds:");
		int rounds = scan.nextInt();
		
		int p1wins = 0;
		int p2wins = 0;
		while (rounds > 0) {
			double p1guess;
			double p2guess;
			if (rounds % 2 == 0) {
				System.out.println("Player1's turn, pick a number:");
				p1guess = scan.nextDouble();
				System.out.println("Player2's turn, pick a number:");
				p2guess = scan.nextDouble();
			} else {
				System.out.println("Player2's turn, pick a number:");
				p2guess = scan.nextDouble();
				System.out.println("Player1's turn, pick a number:");
				p1guess = scan.nextDouble();
			}
			double number = Math.sqrt(Math.random() * 99 + 1);
			
			if (Math.abs(number - p1guess) > Math.abs(p2guess)) {
				System.out.println("Player2 wins! Number was: " + number);
				p2wins++;
			} else {
				System.out.println("Player1 wins! Number was: " + number);
				p1wins++;
			}
			
			rounds--;
		}
		System.out.println(p1wins + " P1 wins, " + p2wins + " P2 wins.");
	}

}

import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int games = 10;
		int wins = 0;
		int losses = 0;
		while (games > 0) {
			int number = (int) (Math.random() * 10);
			Scanner scan = new Scanner( System.in );
			
			int counter = 3;
			while (counter > 0) {
				int guess = scan.nextInt();
				if (guess > number + 1 || guess < number - 1) {
					System.out.println("Cold");
				} else {
					System.out.println("Hot");
				}
				if (guess == number) {
					counter = 0;
					wins++;
				} else if (counter < 2) {
					losses++;
				}
				counter--;
			}
			games--;
		}
		System.out.println(wins + " wins, " + losses + " losses");
	}

}

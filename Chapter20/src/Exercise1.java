import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int) (Math.random() * 10);
		Scanner scan = new Scanner( System.in );
		
		int counter = 3;
		while (counter > 0) {
			int guess = scan.nextInt();
			if (guess == number) {
				counter = 0;
				System.out.println("You done did it!");
			} else if (counter < 2) {
				System.out.println("Git guud son! Number was:" + number);
			}
			counter--;
		}
	}

}

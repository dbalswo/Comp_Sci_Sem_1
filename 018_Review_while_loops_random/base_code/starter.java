import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int num = rand.nextInt(1000) + 1;
		
		System.out.print("Guess the number I'm thinking of! (hint: between 1-1000): ");
		int guess = sc.nextInt();
			
		while(true) {
			System.out.print("Try again! ");
			guess = sc.nextInt();
			if (guess == num) {
				System.out.print("Good job you won!");
				break;
			}
		}



		
	}
}

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = rand.nextInt(1000)+1;
		
		System.out.print("Guess the number I am thinking of! I am thinking of a number from 1-1000 : ");
		int guess = sc.nextInt();
		
		if (num == guess) {
			System.out.println("You are 0 numbers greater than or less than the number");
		} else if (num > guess) {
			System.out.println("Your number is less than the number");
		} else if (num < guess) {
			System.out.println("Your number is greater than the number");
		}
	}
}

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		
		System.out.print("Would you like to be a wizard, warrior, or rogue? Please enter here: ");
		String input = sc.nextLine();
		
		if (input.equals("wizard")) {
			System.out.print(input);
		} else if (input.equals("warrior")) {
			System.out.print(input);
		} else if (input.equals("rogue")) {
			System.out.print(input);
		} else {
			System.out.print("You input was incorrect. Try again.");
		}
		
	}
}

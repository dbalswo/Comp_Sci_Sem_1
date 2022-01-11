import java.util.Random;
import java.util.Scanner;

class starter {
	public static int roll() {
		Random rand = new Random();
		int result;
		int num1 = rand.nextInt(10) + 1;
		int num2 = rand.nextInt(10) + 1;
		int num3 = rand.nextInt(10) + 1;
		System.out.println("Your roles are: ");
		System.out.println(" ");
		System.out.println("_______________________");
		System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " | ");
		System.out.println("_______________________");
		System.out.println(" ");
		if(num1 == num2 || num1 == num3 || num2 == num3) {
			result = 1;
		} else if(num1 == num2 && num2 == num3) {
			result = 2;
		} else {
			result = 0;
		}
		return result;
	}
	
	public static int gamble(int money) {
		Scanner sc = new Scanner(System.in);
		int wager = 0;
		while(true) {
			System.out.print("You have $" + money + " How much would you like to wager? ");
			wager = sc.nextInt();
			if(wager <= money) {
				System.out.println("Great! Let's play!!!");
				break;
			} else if (money == 0) {
				System.out.println("You're out of money... better luck next time!");
				break;
			}
		}
		int num = roll();
		if(num == 0) {
			money -= wager;
			System.out.println("Didn't win this time, better luck next time!");
			System.out.println("You now have $" + money);
		} else if(num == 1) {
			money += wager;
			System.out.println("You won! You're wager has now been doubled!");
			System.out.println("You now have $" + money);
		} else if(num == 2) {
			money += wager * 2;
			System.out.println("You won! You're wager has now been tripled!");
			System.out.println("You now have $" + money);
		}
		return money;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		
		System.out.println(" ");
		int money = 100;
		while(true) {
			System.out.print("Would you like to play slots? (Yes/yes/Y/y) : ");
			String input1 = sc.nextLine();
			if(input1.equals("Yes") || input1.equals("yes") || input1.equals("Y") || input1.equals("y")) {
				money = gamble(money);
				if(money == 0) {
					break;
				}
			} else if(input1.equals("No") || input1.equals("no") || input1.equals("N") || input1.equals("n")) {
				break;
			}
		}
	}
	
	
	
}
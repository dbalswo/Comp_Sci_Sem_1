import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Please enter name: ");
			String name = sc.nextLine();
		
		System.out.print("Please enter your title (Ex: Monke Slayer): ");
			String title = sc.nextLine();
		
		System.out.print("Would you like to be a wizard, warrior, or rogue? Please enter here: ");
		String input = sc.nextLine();
		
		if (input.equals("wizard") || input.equals("Wizard")) {
			System.out.print("You've chosen the Wizard! Excelsior!");
		} else if (input.equals("warrior") || input.equals("Warrior")) {
			System.out.print("You've chosen the Warrior! For honor!");
		} else if (input.equals("rogue") || input.equals("Rogue")) {
			System.out.print("You've chosen the Rogue! How cunning!");
		} else {
			System.out.print("You input was incorrect. Try again.");
		}
		
		System.out.println(" ");
		
		System.out.print("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma.If you have leftovers it will be spent as strength.");
		
		System.out.println(" ");
		
		int sp = 25;
		
		System.out.print("Strength (1-10): ");
		int str = sc.nextInt();
		if (str > 10) {
			while(true) {
				System.out.print("Please enter a smaller value for strength: ");
					str = sc.nextInt();
				if (str <= 10) {
					break;
				}
			}
		}
		
		
		
		System.out.println("You have " + (sp -= str) + " left to spend");
		
		System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		if (dex > 10) {
			while(true) {
				System.out.print("Please enter a smaller value for dexterity: ");
					dex = sc.nextInt();
				if (dex <= 10) {
					break;
				}
			}
		}
		
		
		
		System.out.println("You have " + (sp -= dex) + " left to spend");
		
		System.out.print("Intelligence (1-10): ");
		int intel = sc.nextInt();
		if (intel > 10) {
			while(true) {
				System.out.print("Please enter a smaller value for intelligence: ");
					intel = sc.nextInt();
				if (intel <= 10) {
					break;
				}
			}
		}
		
		
		if (sp > 0) {
			System.out.println("You have " + (sp -= intel) + " left to spend");
		}
		
		System.out.print("Constitution (1-10): ");
		int cons = sc.nextInt();
		if (sp == 0) {
			cons -= cons;
		}
		
		if (cons > 10) {
			while(true) {
				System.out.print("Please enter a smaller value for constitution: ");
					cons = sc.nextInt();
				if (cons < 10) {
					break;
				}
			}
		}
		
		
		if (sp > 0) {
			System.out.println("You have " + (sp -= cons) + " left to spend");
		}
		
		System.out.print("Charisma (1-10): ");
		int cha = sc.nextInt();
		if (sp == 0) {
			cha -= cha;
		}
		if (cha > 10) {
			while(true) {
				System.out.print("Please enter a smaller value for charisma: ");
					cha = sc.nextInt();
				if (cha < 10) {
					break;
				}
			}
		}
		
		if(sp > 0) {
			System.out.println("You still have " + (sp -= cha) + " left to spend");
			str += sp;
		}
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + " the " + title + " of CVHS");
		System.out.println("You're a " + input + " with the following stats!");
		System.out.println("Strength - " + str);
		System.out.println("Dexterity - " + dex);
		System.out.println("Intelligence - " + intel);
		System.out.println("Constitution - " + cons);
		System.out.println("Charisma - " + cha);
		
		
		System.out.println(" ");
		System.out.println("Good luck on your quest " + name);
	}
}
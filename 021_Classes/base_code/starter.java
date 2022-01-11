import java.util.Scanner;
import java.util.Random;

class character {
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	
	public character() {
		role = "Warrior";
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		constitution = 5;
		charisma = 5;
	}
	
	public character(String a, int b, int c, int d, int e, int f) {
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
	}
}

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		character test = new character();
		System.out.print(test.strength);
		
		



		
	}
}

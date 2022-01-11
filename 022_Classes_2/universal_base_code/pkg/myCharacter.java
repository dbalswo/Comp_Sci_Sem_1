package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	
	public myCharacter() {
		role = "Warrior";
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		constitution = 5;
		charisma = 5;
	}
	
	public myCharacter(String a, int b, int c, int d, int e, int f) {
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
	}
}

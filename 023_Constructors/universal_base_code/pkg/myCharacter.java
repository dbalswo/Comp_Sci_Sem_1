package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	
	public myCharacter() {
		role = "No role";
	}
	
	public myCharacter(String a) {
		role = a;
		if (role.equals("wizard") || role.equals("Wizard")) {
			System.out.print("You've chosen the Wizard! Excelsior! ");
		} else if (role.equals("warrior") || role.equals("Warrior")) {
			System.out.print("You've chosen the Warrior! For honor! ");
		} else if (role.equals("rogue") || role.equals("Rogue")) {
			System.out.print("You've chosen the Rogue! How cunning! ");
		} else {
			System.out.print("No role");
		}
	}
}

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int str;
	public int dex;
	public int intel;
	public int cons;
	public int cha;
	public myCharacter() {
		role = "No role";
	}
		
	public void setRole(String a) {
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
		
		return;
		
	}
	
	public int setStrength(int a) {
		str = a;
		return str;
	}
	
	public int setDexterity(int a) {
		dex = a;
		return dex;
	}
	
	public int setIntelligence(int a) {
		intel = a;
		return intel;
	}
	
	public int setConstitution(int a) {
		cons = a;
		return cons;
	}
	
	public int setCharisma(int a) {
		cha = a;
		return cha;
	}
	
	public boolean setAll(String a, int b, int c, int d, int e, int f) {
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
		
		str = b;
		dex = c;
		intel = d;
		cons = e;
		cha = f;
		
		if(role == a && str == b && dex == c && intel == d && cons == e && cha == f) {
			return true;
		}
		return false;
		
	}
	
}


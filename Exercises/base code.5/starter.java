import pkg.*;
import java.util.Random;
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dog monke = new Dog("Monke", 420);
		Dog donke = new Dog("Donke", "Poodle");
		boolean bool = monke.isSleeping();
		boolean bool2 = donke.isSleeping();
		if(bool == true) {
			System.out.println("Monke is sleeping.");
		} 
		else {
			monke.bark();
		}
		if(bool2 == true && bool == false) {
			System.out.println("Donke is sleeping.");
			donke.bark();
		}
		if(bool2 == false && bool == false) {
			donke.bark();
		}
		
	}
}
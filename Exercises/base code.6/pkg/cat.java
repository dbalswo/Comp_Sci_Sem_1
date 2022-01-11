package pkg;
import java.util.Random;
import java.util.Scanner;

public class cat {
	String name = new String();
	
	public cat() {
		name = "Garfield";
	}
	
	public cat(String input) {
		name = input;
	}
	
	public void meow() {
		System.out.println("The cat's name is " + name + ". " + name + " meows");
		return;
	}
}
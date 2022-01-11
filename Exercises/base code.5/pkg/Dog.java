package pkg;
import java.util.Random;
import java.util.Scanner;

public class Dog {
	String name = new String();
	int age;
	String breed = new String();
	Random rand = new Random();
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String input) {
		name = input;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String input1, String input2) {
		name = input1;
		age = 1;
		breed = input2;
	}
	
	public Dog(String input1, int input2) {
		name = input1;
		age = input2;
		breed = "dog dog";
	}
	
	public void setName(String input) {
		String name = input;
		return;
	}
	
	public void setAge(int input) {
		int age = input;
		return;
	}
	
	public void setBreed(String input) {
		String breed = input;
		return;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		if(rand.nextInt(2) == 1) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public void bark() {
		System.out.println(name + " barks!");
	}
}
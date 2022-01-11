import java.util.Random;
import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num1) {
		int num2 = num1;
		int counter = num1;
		while(true) {
			num1 -= 1;
			if (num1 == 0) {
				break;
			}
			if(num2 % num1 != 0) {
				counter -= 1;
			}
		}
		if(counter == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void printPrime(int input) {
		while(true) {
			if (checkPrime(input) == true) {
				System.out.println(input);
			}
			input = input - 1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		if(checkPrime(number) == true) {
			System.out.println("This number is prime");
		} else {
			System.out.println("This number is even");
		}
		printPrime(number);
		
		
	}
}
import java.util.Random;
import java.util.Scanner;

class starter {
	public static int multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number you would like to be multiplied: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter another number: ");
		int num2 = sc.nextInt();
		int num3 = num1 * num2;
		return num3;
	}

	public static void checker(int num4) {
		if(num4 % 3 == 0) {
			System.out.println("This number is divisible by 3");
		} else {
			System.out.println("This number is not divisible by 3");
		}
	}
	public static void main(String args[]) {
		checker(multiply());
	}
}
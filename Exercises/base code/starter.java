import java.util.Random;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		int num2 = num + 5;
		while(num < num2) {
			System.out.println(num);
			num += 1;
		}
	}
}
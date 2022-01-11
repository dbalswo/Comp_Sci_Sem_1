import java.util.Random;
import java.util.Scanner;

class starter {
	public static int factorial(int num) {
		int num1 = num;
		while(true) {
			num -= 1;
			num1 *= num;
			if(num == 1) {
				break;
			}
		}
		return num1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int num = sc.nextInt();
		System.out.print(factorial(num));
		// int num = 25;
		// while(true) {
		// 	System.out.println(num);
		// 	num -= 1;
		// 	if(num == 4) {
		// 		break;
		// 	}
		// }
		
	}
}
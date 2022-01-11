import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int num1, int num2) {
			int num3 = 1;
			int num4 = 1;
			int num5 = num1;
			while(true) {
				num1 = num1 * num5;
				num3 = num3 + 1;
				if(num3 == num2) {
					break;
				}
			}
	
		return num1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a base number: ");
		int input1 = sc.nextInt();
		System.out.print("Please enter an exponent: ");
		int input2 = sc.nextInt();
		System.out.print("Your number is ");
		System.out.print(pow(input1, input2));
		



		
	}
}

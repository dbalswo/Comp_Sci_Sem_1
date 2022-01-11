import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		
		System.out.print("Please enter another number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Please enter a third number: ");
		int num2 = sc.nextInt();
		
		if ( (num > num1) && (num > num2) ) {
			System.out.println(num + " is the largest number!");
		}
		if ( (num1 > num) && (num1 > num2) ) {
			System.out.println(num1 + " is the largest number!");
		}
		if ( (num2 > num) && (num2 > num) ) {
			System.out.println(num2 + " is the largest number!");
		}
		
		if ( (num < num1) && (num < num2) ) {
			System.out.println(num + " is the smallest number!");
		}
		if ( (num1 < num) && (num1 < num2) ) {
			System.out.println(num1 + " is the smallest number!");
		}
		if ( (num2 < num) && (num2 < num) ) {
			System.out.println(num2 + " is the smallest number!");
		}
	}
}

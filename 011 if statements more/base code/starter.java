import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		
		System.out.print("Please enter another number: ");
		int num1 = sc.nextInt();
		
		if ((num != num1) || (num == num1)) {
			System.out.println("Hello world!");
		}
	}
}

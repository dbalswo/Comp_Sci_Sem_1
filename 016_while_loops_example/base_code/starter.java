import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a name: ");
		String name = sc.nextLine();
		
		System.out.print("How many times would you like to repeat this name: ");
		int repeat = sc.nextInt();
		
		int num = 0;
		
		while(true) {
			System.out.print(name);
			if(num == repeat - 1) {
				break;
			}
			num = num + 1;
		}
		



		
	}
}

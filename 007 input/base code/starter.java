import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("please enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Please enter your age:");
		int age = sc.nextInt();
		
		System.out.print("Please enter your birthday month(1-12): ");
		int month = sc.nextInt();
		
		System.out.print("Please enter your birthday date(1-31): ");
		int date = sc.nextInt();
		
		System.out.print("Please enter your birthyear: ");
		int year = sc.nextInt();
		
		System.out.print("How much is a buck fitty?(answer as a decimal): ");
		double ans = sc.nextDouble();
		
		System.out.println("Hi " + name);
		System.out.println("You are " + age + " years old ");
		System.out.println("You were born on " + month + "/" + date + "/" + year);
		System.out.print("A buck fitty is $1.50 and you said, " + ans);
	}
}

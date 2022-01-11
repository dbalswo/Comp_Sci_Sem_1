import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double num1 = Math.max(13-6*11, 30 % 7 * (-2));
		double num2 = Math.sqrt(3*8+31%7);
		double num3 = Math.pow(37/3, 35%21);
		double num5 = Math.pow(2,14%3);
		double num6 = Math.sqrt(2*6);
		double num4 = Math.max(num5,num6);
		
		System.out.println("a. " + num1);
		System.out.println("b. " + num2);
		System.out.println("c. " + num3);
		System.out.println("d. " + num4);
		
		System.out.print("Please enter a number: ");
		double x = sc.nextDouble();
		System.out.print("Please enter a nunber: ");
		double y = sc.nextDouble();
		double num7 = Math.max(x,y);
		double num8 = Math.sqrt(y);
		double num9 = Math.pow(x,y);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		
		

	}
}

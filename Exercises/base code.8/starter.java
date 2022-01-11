import java.util.Random;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] arr = new int[20];
		int counter = 0;
		while(true) {
			int num = rand.nextInt(10)+1;
			if(counter == arr.length) {
				break;
			}
			arr[counter] = num;
			counter += 1;
		}
		counter = 0;
		int num2 = rand.nextInt(10)+1;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == num2) {
				System.out.println(i);
				counter += 1;
				
			}
		}
		System.out.println("There are " + counter + " amount of " + num2);
		counter = 0;
		for(int i=0; i < arr.length-1; i++) {
			counter = i + 1;
			if(arr[i] == arr[counter]) {
				System.out.println("The numbers are located on indexes: ");
				System.out.println(i);
				System.out.println(counter);
				System.out.print("The consecutive numebr is ");
				System.out.println(arr[i]);
			}
		}
		
	}
}
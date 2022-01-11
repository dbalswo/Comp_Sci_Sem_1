import java.util.Random;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] array = new int[20];
		int[] array2 = new int[20];
		int counter = 0;
		int counter2 = 19;
		
		while(true) {
			int num2 = rand.nextInt(50)+1;
			if(counter == 20) {
				break;
			}
			array[counter] = num2;
			counter += 1;
			array2[counter2] = num2;
			counter2 -= 1;
		}
		
		counter = 0;
		System.out.println("Array 1:");
		while(counter < 20) {
			System.out.println(array[counter]);
			counter += 1;
		}
		
		counter = 0;
		System.out.println("Array 2:");
		
		while(counter < 20) {
			System.out.println(array2[counter]);
			counter += 1;
		}
	}
}
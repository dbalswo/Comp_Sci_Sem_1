import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] BTS = new int[1001];
		Random rand = new Random();
		int count = 0;
		int dog = 0;
		while(true) {
			count ++;
			int num = rand.nextInt(1000);
			BTS[count] = num;
			if(count == 999) {
				break;
			}
		}
		while(true) {
			System.out.println(BTS[dog]);
			dog += 1;
			if(dog == 999) {
				break;
			}
		}
			

		
	}
}

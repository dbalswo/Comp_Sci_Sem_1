import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int num = rand.nextInt(150)+51;
		int x = num;
		int counter = 0;
		int min = 1000;
		int max = -1000;
		int[] array = new int[x];
		
		//Length of array
		
		System.out.println(array.length);
		
		//Setting the values of the array
		
		while(true) {
			int num2 = rand.nextInt(100)+1;
			if(counter == array.length) {
				break;
			}
			array[counter] = num2;
			counter += 1;
		}
		
		
		//Minimum number in the array
		
		counter = 0;
		
		while(counter < array.length) {
			if(array[counter] < min) {
				min = array[counter];
			}
			counter += 1;
			
		}
		System.out.println(min);
		
		//Maximum number in the array
		
		counter = 0;
		while(counter < array.length) {
			if(array[counter] > max) {
				max = array[counter];
			}
			counter += 1;
		}
		System.out.println(max);
		
		//Average of the numbers in the array
		
		counter = 0;
		int total = 0;
		
		while(counter < array.length) {
			total += array[counter];
			counter += 1;
		}
		System.out.println(total/array.length);


	}
}

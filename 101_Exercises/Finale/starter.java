import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode(int[] arr) {
		int counter = 0;
		int min = 1000;
		int max = -1000;
		int index_of_mode = 0;
		int[] new_array = new int[arr.length];
		//Checks each number in the array
		for(int i = 0; i < arr.length-1; i++) {
			int check = arr[i];
			//Checks for if there are reoccuring numbers
			for(int k = i+1; k < arr.length-1; k++) {
				//Stores the numbers that a certain number reoccured into a new array
				if(check == arr[k]) {
					counter ++;
					new_array[i] = counter;
				}
			}
		}
		//Checks for the number that occured the most
		counter = 0;
		while(counter < new_array.length) {
			if(new_array[counter] > max) {
				max = new_array[counter];
			}
			counter += 1;
			if(max == new_array[counter]) {
				index_of_mode = counter;
			}
		}
		
		//Checks for if that number is the actual mode or if there is another number with the same amount
		for(int i = 0; i < new_array.length-1; i++){
			int num = i;
			for(int k = i +1; k < new_array.length-1; k++){
				if(new_array[i] != new_array[k]) {
					return arr[index_of_mode];
				}
				else {
					return -1;
				}
			}
		}
		
	}
	public static int getMedian(int[] arr) {
		
	}
	public static void main(String args[]) {

		
	}
}

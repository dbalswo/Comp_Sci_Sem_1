import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	//Array Elements
	public static void toStringArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//Array Average
	public static double getArrayAverage(int[] arr) {
		int counter = 0;
		double total = 0;
		while(counter < arr.length) {
			total += arr[counter];
			counter += 1;
		}
		total = total/arr.length;
		return total;
	}
	
	//Array Maximum
	public static int getArrayMax(int[] arr) {
		int counter = 0;
		int max = -1000;
		while(counter < arr.length) {
			if(arr[counter] > max) {
				max = arr[counter];
			}
			counter += 1;
		}
		return max;
	}
	
	//Array Minimum
	public static int getArrayMin(int[] arr) {
		int counter = 0;
		int min = 1000;
		while(counter < arr.length) {
			if(arr[counter] < min) {
				min = arr[counter];
			}
			counter += 1;
		}
		return min;
	}
	
	public static void main(String args[]) {
		Random rand = new Random();
		int counter = 0;
		int[] arr = new int[100];
		while(true) {
			int num2 = rand.nextInt(100)+1;
			if(counter == arr.length) {
				break;
			}
			arr[counter] = num2;
			counter += 1;
		}
		System.out.println("These are the Elements!");
		toStringArray(arr);
		
		System.out.println(" ");
		System.out.println("This is the average!");
		System.out.println(getArrayAverage(arr));
		
		System.out.println("This is the Maximum!");
		System.out.println(getArrayMax(arr));
		
		System.out.println("This is the Minimum!");
		System.out.println(getArrayMin(arr));


		
	}
}

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a phrase: ");
		String phrase = sc.nextLine();
		System.out.println("You said, " + "\'" + phrase + "\'");
		
		String reverse = "";
		int previous_i = phrase.length();
		
		//1. For loop that loops from end to start searching for a space
		for(int i = phrase.length()-1; i > 0; i--) {
			/*2. Once you find a space, that is the start index of substring, 
			and the end index is where the last space was (or if you just started the loop, its the end of the string)*/
			
			if(phrase.substring(i, i+1).equals(" ")) {
				//3. Add the string to the string you are building (that started empty)
				
				reverse += phrase.substring(i+1, previous_i);
				reverse += " ";
				previous_i = i;
			}
		}
		reverse += phrase.substring(0, previous_i);
		System.out.println("\b" + reverse);

		
		
		// String s = "";
		// String str[] = phrase.split(" ");
		// for(int i = str.length-1; i>=0; i--) {
		// 	s += str[i] + " ";
		// }
		// System.out.println("After reverse: " + s);
		
	}
		
}

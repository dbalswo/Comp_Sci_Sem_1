import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii test = new Ascii();
		Ascii Frog = new Ascii("Frog", "Frogge", 3);
		Ascii jam = new Ascii("Other");
		Ascii obama = new Ascii("Cactus", "Obama");
		Ascii monke = new Ascii("Dog", 3);
		test.printArt();
		jam.setAscii("╭∩╮(Ο_Ο)╭∩╮");
		jam.printArt();
		obama.printArt();
		monke.printArt();
		Frog.printArt();
		
		
		
		


		
	}
}

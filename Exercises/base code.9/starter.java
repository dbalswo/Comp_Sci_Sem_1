import java.util.Random;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] Turkey = new String[13];
		Turkey[0] = "                 .--.          ";
		Turkey[1] = " {\\            /  q {\\       ";
		Turkey[2] = "{  `\\          \\  [-[-`";
		Turkey[3] = "{ `-{ `\\         \\  \\)";
		Turkey[4] = "{-_{'.' \\  .__---_.\\  \\";
		Turkey[5] = "{-_{','  \\/        -.)  \\";
		Turkey[6] = "{-_{ ' {     ; '_=-.     |";
		Turkey[7] = " {-_{.' { `.  ;-=-.'     |";
		Turkey[8] = "  {._.{.;      *_=_.     /";
		Turkey[9] = "   {_.-' `' .__ . __ ---";
		Turkey[10] = "            | | |";
		Turkey[11] = "            | | |";
		Turkey[12] = "          .-= - -== .";
		for(int i = 0; i < Turkey.length; i++) {
			System.out.println(Turkey[i]);
		}
	}
}

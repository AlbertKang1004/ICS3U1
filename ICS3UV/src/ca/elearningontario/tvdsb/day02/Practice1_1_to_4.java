package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;

/*
 * 1. Change the c = new Console(); line to change the width and height of the Console.
 * 2. Change the title.
 * 3. Change the font size.
 * 4. Display numbers such as integers and floating points (decimals) on the Console.
 */

public class Practice1_1_to_4 {
	
	static Console c = new Console(500, 500, 15, "MyConsole");
	// Console([Width], [Height], [Font size], [Console name]);
	// Width = 500, Height = 500, Font size = 15, Console name = "MyConsole"
	
	public static void main(String[] args) {
		
		c.print("This is an example\n");
		c.println(1234, 10); // prints an integer
		c.println(56.78, 10); // prints a real number with decimal points
	}

}

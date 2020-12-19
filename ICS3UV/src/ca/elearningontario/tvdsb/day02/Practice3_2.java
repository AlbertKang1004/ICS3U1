package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;
import java.awt.*;
// Print out a maze by i) selecting a different background color 
// ii) using setCursor() and print() to print spaces around the Console.

public class Practice3_2 {

	static Console c = new Console(295, 280, 20, "Maze");
	
	public static void main(String[] args) {
		
		c.setBackgroundColor(Color.BLACK);
		c.setCursor(1, 0);
		c.print("XXXXXXXXXXXXXXXXXXXX");
		
		c.setCursor(3, 4);
		c.print("XXXXXXXXXXXXXXXXXXXX");
		
		c.setCursor(5, 0);
		c.print("XXXXXXXXXXXXXXXXXXXX");
		
		c.setCursor(7, 4);
		c.print("XXXXXXXXXXXXXXXXXXXX");
		
		c.setCursor(9, 0);
		c.print("XXXXXXXXXXXXXXXXXXXX");
	}

}

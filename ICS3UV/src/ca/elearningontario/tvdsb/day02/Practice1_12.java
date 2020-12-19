package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;

// Create a program that calculates the center of the Console at run time, and displays a simple message there.
// If the size of the Console is changed in the source code, 
// the program should correctly re-calculate the center of the Console the next time it is run. 
// That is, you shouldn't have to modify your setCursor() line if you decide to change the Console size.

public class Practice1_12 {

	static Console c = new Console(1000, 1000);
	
	public static void main(String[] args) {
		
		int centerX = (c.getNumColumns()) / 2; 
		int centerY = (c.getNumRows()) / 2;
		
		System.out.println(centerX);
		System.out.println(centerY);
		
		c.setCursor(centerY, centerX);
		c.println("* <- This is the center of the console."); // * indicates center
		
		c.setCursor(c.getNumRows(), 0);
		c.println("The co-ordinates of the point is: x = " + centerX + " / y = " + centerY);
	}

}

package ca.elearningontario.tvdsb.day02;

import hsa_ufa.Console;

// What happens if you setCursor() to a location that is not on the Console?
// Try big numbers, and negative numbers.

public class Practice1_9 {
	
	static Console c = new Console(200, 200, 15, "Practice9");

	public static void main(String[] args) {
		
		c.print("First"); // prints the text
		
		c.setCursor(300, 300); // max 200, 200
		c.print("Second"); // doesn't show up
		
		c.setCursor(-100, -100); // min 0, 0
		c.print("Third"); // doesn't show up
	}
}

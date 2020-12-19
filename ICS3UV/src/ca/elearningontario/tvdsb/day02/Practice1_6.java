package ca.elearningontario.tvdsb.day02;

import hsa_ufa.Console;

// Display a really long line of text on a very small Console. 
// What happens if the line of text is too long to be displayed on 1 line? 
// What happens if the text is too big to fit in the window at all?

public class Practice1_6 {

	static Console c = new Console(200, 200, 50, "Practice6");
	
	public static void main(String[] args) {
		
		c.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		// If the text is too long, it uses another line to print the text
		// If the text is too big, only the ending part of the text is shown
	}

}

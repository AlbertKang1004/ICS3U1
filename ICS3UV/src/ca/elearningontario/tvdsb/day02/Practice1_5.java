package ca.elearningontario.tvdsb.day02;

import hsa_ufa.Console;

// Are there any size limits (width/height, title, font size) with the hsa_ufa Console?

public class Practice1_5 {
	
	static Console c = new Console(10000, 10000, 1000, "MyConsole");
	// width, height, and font size of the console is unlimited
	// Depending on the monitor, the value that exceeds the resolution of the monitor will be cut out.
	
	public static void main(String[] args) {
		
		c.print("This is an example\n");
	}

}

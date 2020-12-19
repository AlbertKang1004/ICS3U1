package ca.elearningontario.tvdsb.day02;

import hsa_ufa.Console;

public class Practice1_7 {

	static Console c = new Console(500, 500, 15, "Practice7");
	
	public static void main(String[] args) {
		
		c.print("Return\rcharacter\r"); // \r --> Return character
		// \r does not work inside the console
		
		c.print("New\nline\n"); // \n --> New line
		
		// c.print("\tTab"); // \t --> Tab
		// \t causes an error
		
		c.println("Backspace\b"); // \b --> Backspace
		
		c.println("Quotation \"marks\""); // \" or \' --> Quotation marks
		
		c.println("Backslash \\"); // \\ --> Backslash
	}

}

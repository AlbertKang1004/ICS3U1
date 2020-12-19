package ca.elearningontario.tvdsb.day02;

import hsa_ufa.Console;

// How many rows and columns on the default Console 
// (if you create it without adjusting the size)?

public class Practice1_10 {

	static Console c = new Console("Practice10");
	
	public static void main(String[] args) {
		
		c.print("This console has ");
		c.print(c.getNumRows());
		c.print(" rows. \n");
		
		c.print("This console has ");
		c.print(c.getNumColumns());
		c.print(" Columns. \n");
		
		//ANSWER: 32 ROWS / 92 COLUMNS
	}

}

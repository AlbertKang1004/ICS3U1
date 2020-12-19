package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;

// Use the fillOval() method to create a bulls-eye pattern.

public class Practice2_2 {

	static Console c = new Console();
	
	public static void main(String[] args) {
		
		c.drawOval(220, 150, 200, 200); // First circle
		c.drawOval(245, 175, 150, 150); // Second circle
		c.drawOval(270, 200, 100, 100); // Third circle
		c.fillOval(295, 225, 50, 50); // Bulls-eye
	}

}

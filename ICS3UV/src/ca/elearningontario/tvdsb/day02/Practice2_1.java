package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;

// Draw a house using the drawRect() and drawLine() methods.

public class Practice2_1 {

	static Console c = new Console();
	
	public static void main(String[] args) {
		
		c.fillRect(220, 220, 200, 200); // Body part
		
		c.drawLine(220, 220, 320, 90); // Roof part
		c.drawLine(420, 220, 320, 90); // Roof part
	}

}

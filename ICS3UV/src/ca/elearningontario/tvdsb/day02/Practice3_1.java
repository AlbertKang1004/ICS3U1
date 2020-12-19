package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;
import java.awt.*;
// Try to print out a "RAINBOW".

public class Practice3_1 {

	static Console c = new Console(500, 500, 30, "Rainbow Text");
	
	public static void main(String[] args) {
		
		c.setColor(Color.RED);
		c.print("R");
		
		c.setColor(Color.ORANGE);
		c.print("A");
		
		c.setColor(Color.YELLOW);
		c.print("I");
		
		c.setColor(Color.GREEN);
		c.print("N");
		
		c.setColor(Color.CYAN);
		c.print("B");
		
		c.setColor(Color.BLUE);
		c.print("O");
		
		c.setColor(Color.MAGENTA);
		c.print("W");
	}

}
// BLACK BLUE CYAN DARK_GRAY GRAY GREEN LIGHT_GRAY MAGENTA ORANGE PINK RED WHITE YELLOW	
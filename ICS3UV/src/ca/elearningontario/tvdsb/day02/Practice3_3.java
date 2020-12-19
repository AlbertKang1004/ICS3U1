package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;
import java.awt.*;

// Use a custom color with alpha channel to draw 
// some partially transparent text on the screen.

public class Practice3_3 {

	static Console c = new Console(300, 300, 20);
	
	public static void main(String[] args) {
		
		c.setColor(new Color(0, 255, 0, 127));
		c.print("Transparent Green");
	}

}
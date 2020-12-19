package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;
import java.awt.*;

// Use the fillArc() method to create a rainbow pattern
// (you'll probably need a white fillOval() in the middle).

public class Practice2_3 {

	static Console c = new Console();
	
	public static void main(String[] args) {
		
		c.setColor(new Color(255, 0, 0));
		c.fillArc(125, 150, 400, 400, 180, -180); // Red
		
		c.setColor(new Color(255, 127, 0));
		c.fillArc(150, 175, 350, 350, 180, -180); // Orange
		
		c.setColor(new Color(255, 255, 0));
		c.fillArc(175, 200, 300, 300, 180, -180); // Yellow
		
		c.setColor(new Color(0, 255, 0));
		c.fillArc(200, 225, 250, 250, 180, -180); // Green
		
		c.setColor(new Color(0, 0, 255));
		c.fillArc(225, 250, 200, 200, 180, -180); // Blue
		
		c.setColor(new Color(75, 0, 130));
		c.fillArc(250, 275, 150, 150, 180, -180); // Purple
		
		c.setColor(new Color(143, 0, 255));
		c.fillArc(275, 300, 100, 100, 180, -180); // Violet
		
		c.setColor(new Color(255, 255, 255));
		c.fillArc(300, 325, 50, 50, 180, -180); // Empty
	}

}
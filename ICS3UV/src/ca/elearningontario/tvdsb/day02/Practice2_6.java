package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;
import java.awt.*;

// Draw a Canadian flag pattern that fills the entire console, 
// and scales automatically by using getDrawWidth() and getDrawHeight() 
// if the programmer changes the size of the Console. 
// Maybe start with a simple fillMapleLeaf() that scales automatically, 
// and then try to squeeze it into the middle, 
// leaving space for the red color bars at each side.

public class Practice2_6 {

	static Console c = new Console(1000, 500, "Canadian Flag");
	
	public static void main(String[] args) {
		
		int x = c.getDrawWidth();
		int y = c.getDrawHeight();
		
		System.out.println(x);
		System.out.println(y);
		
		c.setColor(new Color(235, 45, 55)); // Red
		c.fillRect(0, 0, x/4, y);
		c.fillRect(3*x/4, 0, 3*x/4, y);
		c.fillMapleLeaf((x/2)-200, (y/2)-200, 400, 400);
	}

}
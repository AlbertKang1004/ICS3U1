package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;
import java.awt.*;

// Figure out an easier way to draw vertical walls in your maze
// from (2) than just setCursor() and print() for each cell in the vertical wall.

public class Practice3_4 {

	static Console c = new Console(300, 300, 20);
	
	public static void main(String[] args) {
		
		c.setColor(Color.BLACK);
		c.fillRect(0, 0, 20, c.getDrawHeight());
	}

}
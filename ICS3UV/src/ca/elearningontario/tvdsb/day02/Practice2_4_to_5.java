package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;
// import java.awt.*;

// What happens if you draw a shape outside the boundaries of the Console?
// Think large numbers for x and y, or negative numbers.

// What happens if an object is only partially outside the bounds of the Console?

public class Practice2_4_to_5 {

	static Console c = new Console(300, 300);
	
	public static void main(String[] args) {
		
		c.fillRect(400, 400, 200, 200); // Beyond the boundary --> not shown
		c.fillRect(250, 250, 150, 150); // With the boundary --> partly shown
	}

}
package ca.elearningontario.tvdsb.day03;
import java.awt.*;
import hsa_ufa.Console;

// Try different image file formats.

public class Practice3_1 {
	
	static Console c = new Console();

	public static void main(String[] args) {
		
		Image pngImage = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dice.png"));  // .png
		Image jpegImage = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("minions.jpg")); // .jpeg
		
	    c.drawImage(pngImage, 0, 0, 100, 100);
	    c.drawImage(jpegImage, 100, 0, 100, 100);
	}

}

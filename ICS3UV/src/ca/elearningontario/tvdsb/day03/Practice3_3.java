package ca.elearningontario.tvdsb.day03;
import java.awt.*;
import hsa_ufa.Console;

// try to display an animated GIF using c.drawImage().
// Is it animated on the Console?

public class Practice3_3 {

	static Console c = new Console(400, 400);
	
	public static void main(String[] args) {
		
		Image gifImage = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("earth.gif"));
	    c.drawImage(gifImage, 0, 0);  
	}

}

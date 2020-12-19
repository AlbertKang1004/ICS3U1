package ca.elearningontario.tvdsb.day03;
import java.awt.*;
import hsa_ufa.Console;

public class ImageTest {
	
	static Console c = new Console();

	public static void main(String[] args) {
		
		Image image1 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dice.png"));
	    c.drawImage(image1, 0, 0);  
	}

}

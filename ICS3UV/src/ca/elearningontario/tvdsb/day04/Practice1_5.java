package ca.elearningontario.tvdsb.day04;
import hsa_ufa.Console;
import java.awt.*;

// Create movement or other special effects with shapes/images using variables.

public class Practice1_5 {
	
	static Console c = new Console();

	public static void main(String[] args) throws InterruptedException {
		
		c.setColor(new Color(128, 0, 0));
		c.fillRect(50, 250, 50, 50);
		
		for (int i = 0; i < 500; i++) {
			c.clear();
			c.fillRect(50 + i, 250, 50, 50);
			Thread.sleep(20); // 20ms => 0.02 second
		}
	}
}

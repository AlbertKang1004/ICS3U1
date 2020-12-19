package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
import java.awt.*;

// Experiment with bold and italic font styles.
// Try all of "MonoSpaced", "SansSerif" and "Serif" styles.

public class Practice2_1_to_2 {
	
	static Console c = new Console(500, 500);

	public static void main(String[] args) throws InterruptedException {
			
		c.setFont(new Font("MonoSpaced", Font.PLAIN, 30));
		c.drawString("Monospaced Plain", 0, 30);
		
		c.setFont(new Font("MonoSpaced", Font.BOLD, 30));
		c.drawString("Monospaced Bold", 0, 60);
		
		c.setFont(new Font("MonoSpaced", Font.ITALIC, 30));
		c.drawString("Monospaced Italic", 0, 90);
		
		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("Sans-serif Plain", 0, 120);
		
		c.setFont(new Font("SansSerif", Font.BOLD, 30));
		c.drawString("Sans-serif Bold", 0, 150);
		
		c.setFont(new Font("SansSerif", Font.ITALIC, 30));
		c.drawString("Sans-serif Italic", 0, 180);
		
		c.setFont(new Font("Serif", Font.PLAIN, 30));
		c.drawString("Serif Plain", 0, 210);
		
		c.setFont(new Font("Serif", Font.BOLD, 30));
		c.drawString("Serif Bold", 0, 240);
		
		c.setFont(new Font("Serif", Font.ITALIC, 30));
		c.drawString("Serif Italic", 0, 270);
	}

}
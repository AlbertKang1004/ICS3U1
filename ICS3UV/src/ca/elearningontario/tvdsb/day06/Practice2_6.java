package ca.elearningontario.tvdsb.day06;
import hsa_ufa.Console;
import java.awt.*;

public class Practice2_6 {
	
	static Console c = new Console(500, 500);
	
	public static void main(String[] args) {
			
		Color Chess_Black = new Color(0x33,0x33,0x33);
		Color Chess_White = new Color(0xDD,0xDD,0xDD);
		
		c.clear();
		for (int x = 0, y = 0; x <= 500; x += 100) {
			for (y = 0 ; y <= 500; y += 100) {
				c.setColor(Chess_Black);
				c.fillRect(x, y, 50, 50);
				c.setColor(Chess_White);
				c.fillRect(x + 50, y, 50, 50);
				c.setColor(Chess_White);
				c.fillRect(x, y + 50, 50, 50);
				c.setColor(Chess_Black);
				c.fillRect(x + 50, y + 50, 50, 50);
			}
			
			c.setColor(Chess_Black);
			c.fillRect(x, y, 50, 50);
			c.setColor(Chess_White);
			c.fillRect(x + 50, y, 50, 50);
			c.setColor(Chess_White);
			c.fillRect(x, y + 50, 50, 50);
			c.setColor(Chess_Black);
			c.fillRect(x + 50, y + 50, 50, 50);			
		}
	}
}

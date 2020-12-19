package ca.elearningontario.tvdsb.day06;
import hsa_ufa.Console;
import java.awt.*;

public class Practice2_7 {
	
	static Console c = new Console(500, 500);
	
	public static void main(String[] args) {
			
		c.clear();
		for (int x = 0, r = 50, g = 0, b = 100; x <= 500; x += 50, g += 10) {
			c.setColor(new Color(r, g, b));
			c.fillRect(x, 0, 50, 50);	
			for (int y = 0 ; y <= 500; y += 50) {
				c.setColor(new Color(r, g, b));
				c.fillRect(x, y, 50, 50);	
			}
		}
	}
}
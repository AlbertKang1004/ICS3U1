package ca.elearningontario.tvdsb.day06;
import hsa_ufa.Console;
import java.awt.*;

public class Practice2_5 {
	
	static Console c = new Console(450, 450);
	
	public static void main(String[] args) {
			
		c.clear();
		c.setColor(new Color(0, 204, 255));
		
		for (int x = 50; x <= 400; x += 100) {
			c.fillRect(x, 50, 50, 50);
			
			for (int y = 50; y <= 400; y += 100) {
				c.fillRect(x, y, 50, 50);
			}
		}
	}
}

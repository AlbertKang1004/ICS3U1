package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
import java.awt.*;

// Create an "explosion" by drawing a series of 
// ever-larger circles on the Console, possibly in Color.

public class Practice1_4 {
	
	static Console c = new Console(500, 500);

	public static void main(String[] args) throws InterruptedException {
			
		int x = c.getDrawWidth();
		int y = c.getDrawHeight();
		
		c.setColor(Color.ORANGE);
		c.fillOval(x/2-25, y/2-25, 50, 50);
		Thread.sleep(200);
		
		c.fillOval(x/2-50, y/2-50, 100, 100);
		Thread.sleep(200);
		
		c.fillOval(x/2-75, y/2-75, 150, 150);
		Thread.sleep(200);
		
		c.fillOval(x/2-100, y/2-100, 200, 200);
		Thread.sleep(200);
		
		c.fillOval(x/2-125, y/2-125, 250, 250);
		Thread.sleep(200);
		
		c.fillOval(x/2-150, y/2-150, 300, 300);
		Thread.sleep(200);
		
		c.fillOval(x/2-175, y/2-175, 350, 350);
		Thread.sleep(200);
		
		c.fillOval(x/2-200, y/2-200, 400, 400);
		Thread.sleep(200);
	}

}
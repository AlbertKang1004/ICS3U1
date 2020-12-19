package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
import java.awt.*;

// Create an animation using Thread.sleep() and c.drawString().
// Don't go too overboard if you are animating one pixel at a time; 
// your code will grow really large, really quickly.

public class Practice2_3 {
	
	static Console c = new Console(500, 500);

	public static void main(String[] args) throws InterruptedException {
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 20));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 25));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 30));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 35));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 40));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 45));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 50));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 55));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
		
		c.clear();
		c.setFont(new Font("MonoSpace", Font.BOLD, 60));
		c.drawString("Hello, World!", 150, 150);
		Thread.sleep(200);
	}

}
package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
// import java.awt.*;

// Create a "typewriter" effect, where 1 letter is displayed at a time. 
// If you're really keen, add a sound effect as each letter is displayed.

public class Practice1_3 {
	
	static Console c = new Console();

	public static void main(String[] args) throws InterruptedException {
		
		c.clear();
		c.print('t');
		Thread.sleep(500);
		
		c.print('y');
		Thread.sleep(500);
		
		c.print('p');
		Thread.sleep(500);
		
		c.print('e');
		Thread.sleep(500);
		
		c.print('w');
		Thread.sleep(500);
		
		c.print('r');
		Thread.sleep(500);
		
		c.print('i');
		Thread.sleep(500);
		
		c.print('t');
		Thread.sleep(500);
		
		c.print('e');
		Thread.sleep(500);
		
		c.print('r');
	}

}
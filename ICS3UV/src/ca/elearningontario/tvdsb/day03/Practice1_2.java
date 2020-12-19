package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
// import java.awt.*;

// Create a flashing effect.

public class Practice1_2 {
	
	static Console c = new Console();

	public static void main(String[] args) throws InterruptedException {
		
		c.clear();
		c.fillRect(0, 0, c.getDrawWidth(), c.getDrawHeight());
		Thread.sleep(2000);
		c.clear();
		Thread.sleep(100);
		c.fillRect(0, 0, c.getDrawWidth(), c.getDrawHeight());

	}

}
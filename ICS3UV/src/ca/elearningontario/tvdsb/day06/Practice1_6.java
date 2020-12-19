package ca.elearningontario.tvdsb.day06;
import java.awt.*;
import hsa_ufa.Console;

public class Practice1_6 {

	static Console c = new Console(500, 500);
	
	public static void main(String[] args) throws InterruptedException {
		
		c.clear();
		c.setColor(Color.red);
		c.fillRect(400, 50, 50, 50);
		
		c.setColor(Color.blue);
		c.fillRect(50, 400, 50, 50);
		
		for (int redX = 400, blueX = 50; redX >= 50; redX--, blueX++) {
			//c.clear();
			c.setColor(Color.red);
			c.fillRect(redX, 50, 50, 50);
			
			c.setColor(Color.blue);
			c.fillRect(blueX, 400, 50, 50);
			Thread.sleep(10);
		}
	}

}

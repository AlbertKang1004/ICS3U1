package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;
import java.awt.*;

public class Practice1_8 {

	static Console c = new Console(600, 600, 30);

	public static void main(String[] args) throws InterruptedException {
		
		c.enableMouse();

		c.clear();
		c.setColor(Color.GRAY);
		c.fillRect(200, 250, 200, 100);

		c.setColor(Color.WHITE);
		c.setFont(new Font("Avenir", Font.PLAIN, 30));
		c.drawString("Button", 250, 310);

		int counter = 0;
		
		while (true) {
			if (c.getMouseButton(0) && (c.getMouseX() >= 200) && (c.getMouseX() <= 400) && (c.getMouseY() >= 250) && (c.getMouseY() <= 350) && (counter == 0)) {
				c.setColor(Color.BLACK);
				c.println("You clicked a button!");
				counter++;
			}
			Thread.sleep(40);
		}
	}
}

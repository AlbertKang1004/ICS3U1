package ca.elearningontario.tvdsb.day07;

import java.awt.Color;

import hsa_ufa.Console;

public class Practice2_3 {

	static Console c = new Console(800, 500, 30);

	public static void main(String args[]) throws InterruptedException {
		int x1 = 350;
		int y1 = 200;

		c.setColor(Color.BLUE);

		while (true) {

			synchronized (c) {
				c.clear();
				c.fillRect(x1, y1, 100, 100);
				
				c.setColor(Color.black);
				c.fillRect(0, 0, 20, 500);
				c.fillRect(0, 0, 800, 20);
				c.fillRect(0, 480, 800, 20);
				c.fillRect(780, 0, 20, 500);
			}

			Thread.sleep(5);

			if (c.isKeyDown(Console.VK_LEFT)) {
				x1 -= 2;
			}
			if (c.isKeyDown(Console.VK_RIGHT)) {
				x1 += 2;
			}
			if (c.isKeyDown(Console.VK_UP)) {
				y1 -= 2;
			}
			if (c.isKeyDown(Console.VK_DOWN)) {
				y1 += 2;
			}

			if (x1 < 20 || x1 > 680 || y1 < 20 || y1 > 380) {
				c.print("GAME OVER");
				break;
			}
		}
	}
}

package ca.elearningontario.tvdsb.day07;

import java.awt.Color;

import hsa_ufa.Console;

public class Practice2_2 {

	static Console c = new Console(800, 500, 30);

	public static void main(String args[]) throws InterruptedException {
		int x1 = 350;
		int y1 = 200;

		c.setColor(Color.BLUE);

		while (true) {

			synchronized (c) {
				c.clear();
				c.fillRect(x1, y1, 100, 100);
			}

			Thread.sleep(25);

			if (c.isKeyDown(Console.VK_LEFT)) {
				x1 -= 5;
			}
			if (c.isKeyDown(Console.VK_RIGHT)) {
				x1 += 5;
			}
			if (c.isKeyDown(Console.VK_UP)) {
				y1 -= 5;
			}
			if (c.isKeyDown(Console.VK_DOWN)) {
				y1 += 5;
			}

			if (x1 <= 0 || x1 >= 700 || y1 <= 0 || y1 >= 400) {
				c.print("GAME OVER");
				break;
			}
		}
	}
}

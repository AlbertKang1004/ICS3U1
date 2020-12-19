package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;
import java.awt.*;

public class Practice1_5 {

	static Console c = new Console(800, 500, 30);

	public static void main(String[] args) throws InterruptedException {

		int x = 350;
		int y = 200;

		c.setColor(Color.BLUE);
		c.fillRect(x, y, 100, 100);

		while (true) {
			while (c.isKeyDown(Console.VK_UP)) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, y, 100, 100);
					y--;
				}
				Thread.sleep(10);
			}

			while (c.isKeyDown(Console.VK_LEFT)) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, y, 100, 100);
					x--;
				}
				Thread.sleep(10);
			}

			while (c.isKeyDown(Console.VK_DOWN)) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, y, 100, 100);
					y++;
				}
				Thread.sleep(10);
			}

			while (c.isKeyDown(Console.VK_RIGHT)) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, y, 100, 100);
					x++;
				}
				Thread.sleep(10);
			}

			synchronized (c) {
				c.clear();
				c.fillRect(x, y, 100, 100);
			}
		}
	}
}

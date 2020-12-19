package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;
import java.awt.*;

public class Practice1_2 {

	static Console c = new Console(800, 500, 30);

	public static void main(String[] args) throws InterruptedException {

		int x = 350;
		int y = 200;

		c.setColor(Color.BLUE);
		c.fillRect(x, y, 100, 100);

		while (true) {
			while (c.isKeyDown('W')) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, y, 100, 100);
					y--;
				}
				Thread.sleep(10);
			}

			while (c.isKeyDown('A')) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, y, 100, 100);
					x--;
				}
				Thread.sleep(10);
			}

			while (c.isKeyDown('R')) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, y, 100, 100);
					y++;
				}
				Thread.sleep(10);
			}

			while (c.isKeyDown('S')) {
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

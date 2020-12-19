package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;

public class Practice1_7 {

	static Console c = new Console(600, 600);

	public static void main(String[] args) throws InterruptedException {

		c.clear();
		c.enableMouse();
		c.enableMouseWheel();
		int y = 250;

		while (true) {
			if (c.getMouseWheelRotation() < 0) {
				synchronized (c) {
					c.clear();
					c.fillRect(250, y, 100, 100);
					y -= 20;
				}
			}
			Thread.sleep(1);

			if (c.getMouseWheelRotation() > 0) {
				synchronized (c) {
					c.clear();
					c.fillRect(250, y, 100, 100);
					y += 20;
				}

			}
			Thread.sleep(1);
		}

	}

}

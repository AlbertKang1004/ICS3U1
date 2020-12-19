package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;

public class Practice1_6 {

	static Console c = new Console(500, 500);

	public static void main(String[] args) throws InterruptedException {

		c.enableMouse();
		int x = c.getMouseX();
		int y = c.getMouseY();

		while (true) {
			synchronized (c) {
				if (c.getMouseButton(0)) {
					x = c.getMouseX();
					y = c.getMouseY();
					c.fillRect(x - 25, y - 25, 50, 50);
				}
			}
//			Thread.sleep(100);
		}
	}
}

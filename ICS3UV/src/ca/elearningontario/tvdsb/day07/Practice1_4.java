package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;

public class Practice1_4 {

	static Console c = new Console(500, 500, 30);

	public static void main(String[] args) throws InterruptedException {

		c.clear();

		while (true) {
			if (c.isKeyDown(' ')) {
				synchronized (c) {
					c.clear();
					c.println("Space Pressed");
				}
			}
		}
	}
}

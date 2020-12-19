package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;

public class Practice1_3 {

	static Console c = new Console(500, 500, 30);

	public static void main(String[] args) throws InterruptedException {

		c.clear();
		c.println("Click any key to continue...");

		while (true) {
			if (c.getKeyCode() != Console.VK_UNDEFINED) {
				synchronized (c) {
					c.clear();
					c.println("== GAME START ==");
				}
			}
		}
	}
}

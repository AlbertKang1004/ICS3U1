package ca.elearningontario.tvdsb.day06;

import hsa_ufa.Console;

public class Practice3_1 {

	public static void main(String args[]) throws InterruptedException {

		Console c = new Console();

		int x = -300; // 1

		while (true) {

			synchronized (c) {
				c.clear(); // 2

				c.fillRect(x, 100, 300, 300); // 3
			}
			Thread.sleep(10); // 4

			x = x + 1; // 5
			if (x > c.getDrawWidth())
				x = -300;

		}

	}

}
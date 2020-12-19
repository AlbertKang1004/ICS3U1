package ca.elearningontario.tvdsb.day13;

import hsa_ufa.Console;
import java.util.Random;
import java.awt.*;

public class Practice3_2 {

	public static void main(String[] args) throws InterruptedException {

		Random rng = new Random();
		Console c = new Console();
		Color red = new Color(255, 0, 0);
		Color green = new Color(0, 255, 0);
		Color blue = new Color(0, 0, 255);

		final int count = 10;

		int[] x = new int[count];
		int[] y = new int[count];

		for (int i = 0; i < x.length; i++) {
			x[i] = rng.nextInt(c.getDrawWidth());
			y[i] = rng.nextInt(c.getDrawHeight());
		}

		while (true) {

			synchronized (c) {

				c.clear();
				for (int i = 0; i < x.length; i++) {
					if (i % 3 == 0) {
						c.setColor(red);
						c.fillRect(x[i], y[i], 50, 50);
					}
					else if (i % 3 == 1) {
						c.setColor(green);
						c.fillRect(x[i], y[i], 50, 50);
					}
					else if (i % 3 == 2) {
						c.setColor(blue);
						c.fillRect(x[i], y[i], 50, 50);
					}
				}

			}

			Thread.sleep(50);

			for (int i = 0; i < x.length; i++) {
				x[i] += 10;

				if (x[i] > c.getDrawWidth()) {

					x[i] = 0;
					y[i] = rng.nextInt(c.getDrawHeight());

				}
			}

		}

	}

}
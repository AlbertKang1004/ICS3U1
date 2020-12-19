package ca.elearningontario.tvdsb.day13;

import hsa_ufa.Console;
import java.util.Random;

public class Practice3_1 {

	public static void main(String[] args) throws InterruptedException {

		Random rng = new Random();
		Console c = new Console();
		
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
					c.fillRect(x[i], y[i], 50, 50);
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
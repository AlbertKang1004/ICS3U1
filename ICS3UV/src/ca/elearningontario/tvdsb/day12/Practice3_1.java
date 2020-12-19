package ca.elearningontario.tvdsb.day12;

import hsa_ufa.Console;
import java.util.Random;

public class Practice3_1 {

	public static void main(String[] args) throws InterruptedException {

		int[] x = new int[4];
		int[] y = new int[4];
		Random rng = new Random();
		Console c = new Console();

		x[0] = rng.nextInt(c.getDrawWidth());
		y[0] = rng.nextInt(c.getDrawHeight());
		x[1] = rng.nextInt(c.getDrawWidth());
		y[1] = rng.nextInt(c.getDrawHeight());
		x[2] = rng.nextInt(c.getDrawWidth());
		y[2] = rng.nextInt(c.getDrawHeight());
		x[3] = rng.nextInt(c.getDrawWidth());
		y[3] = rng.nextInt(c.getDrawHeight());

		while (true) {

			synchronized (c) {

				c.clear();
				c.fillRect(x[0], y[0], 50, 50);
				c.fillRect(x[1], y[1], 50, 50);
				c.fillRect(x[2], y[2], 50, 50);
				c.fillRect(x[3], y[3], 50, 50);

			}

			Thread.sleep(5);

			x[0] += 1;

			if (x[0] > c.getDrawWidth()) {

				x[0] = 0;
				y[0] = rng.nextInt(c.getDrawHeight());

			}

			x[1] += 1;

			if (x[1] > c.getDrawWidth()) {

				x[1] = 0;
				y[1] = rng.nextInt(c.getDrawHeight());

			}

			x[2] += 1;

			if (x[2] > c.getDrawWidth()) {

				x[2] = 0;
				y[2] = rng.nextInt(c.getDrawHeight());

			}
			
			x[3] += 1;

			if (x[3] > c.getDrawWidth()) {

				x[3] = 0;
				y[3] = rng.nextInt(c.getDrawHeight());

			}

		}

	}

}
package ca.elearningontario.tvdsb.day12;

import hsa_ufa.Console;
import java.util.Random;
import java.awt.*;

public class Practice3_2 {

	static Random rng = new Random();
	static Console c = new Console();
	static final int speed = 3;

	public static void randomColorGenerator(int[] color_RGB) {
		color_RGB[0] = rng.nextInt(255);
		color_RGB[1] = rng.nextInt(255);
		color_RGB[2] = rng.nextInt(255);

		c.setColor(new Color(color_RGB[0], color_RGB[1], color_RGB[2]));
	}

	public static void randomShape(int[] x, int[] y, int n) {
		x[n] += speed;

		if (x[n] > c.getDrawWidth()) {

			x[n] = 0;
			randomColorGenerator(color_RGB);
			y[n] = rng.nextInt(c.getDrawHeight());

		}
	}

	static int[] color_RGB = new int[3];

	public static void main(String[] args) throws InterruptedException {

		final int obj_count = 100;
		final int size = 20;
		

		int[] x = new int[obj_count];
		int[] y = new int[obj_count];

		for (int i = 0; i <= obj_count - 1; i++) {
			x[i] = rng.nextInt(c.getDrawWidth());
		}

		for (int i = 0; i <= obj_count - 1; i++) {
			y[i] = rng.nextInt(c.getDrawHeight());
		}

		while (true) {

			synchronized (c) {

				c.clear();

				for (int j = 0; j <= obj_count - 1; j++) {
					c.fillRect(x[j], y[j], size, size);
				}

			}

			Thread.sleep(speed * 5);

			for (int i = 0; i <= obj_count - 1; i++) {
				randomShape(x, y, i);
			}

		}

	}

}
package ca.elearningontario.tvdsb.day13;

import hsa_ufa.Console;
import java.awt.*;

public class Practice3_4 {

	public static void main(String[] args) throws InterruptedException {

		Console c = new Console();

		Image[] sprite_run = new Image[8];

		for (int i = 0; i < sprite_run.length; i++) {
			sprite_run[i] = Toolkit.getDefaultToolkit()
					.getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (" + (i + 1) + ").png"));
		}

		int frame_counter = 0;

		while (true) {

			for (int x = 0; x < c.getDrawWidth(); x += 10) {
				c.clear();
				synchronized(c) {
				c.drawImage(sprite_run[frame_counter % sprite_run.length], x, 50, 200, 200);
				}

				Thread.sleep(100);

				frame_counter++;
			}

		}

	}

}
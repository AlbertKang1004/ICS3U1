package ca.elearningontario.tvdsb.day06;

import hsa_ufa.Console;
import java.awt.*;

public class Practice3_10 {

	static Console c = new Console(500, 500);

	public static void main(String[] args) throws InterruptedException {

		c.setColor(new Color(204, 153, 255));
		while (true) {
			for (int x = -(c.getDrawWidth()); x <= c.getDrawWidth(); x++) {
				synchronized (c) {
					c.clear();
					c.fillRect(x, 0, c.getDrawWidth(), c.getDrawHeight());
				}
				Thread.sleep(5);
			}
		}
	}

}

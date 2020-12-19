package ca.elearningontario.tvdsb.day05;

import java.awt.*;
import hsa_ufa.Console;

public class Practice3_4 {
	
	static Console c = new Console(500, 500);

	public static void main(String[] args) throws InterruptedException {
		
		int r = 0, g = 0, b = 0;
		
		for (; r <= 255; r++) {
			synchronized (c) {
				c.clear();
				c.setColor(new Color(r, g, b));
				c.fillRect(200, 200, 100, 100);
			}
		Thread.sleep(10);
		System.out.printf("%d, %d, %d\n", r, g, b);
		}
		
		for (; g <= 255; g++) {
			synchronized (c) {
				c.clear();
				c.setColor(new Color(255, g, b));
				c.fillRect(200, 200, 100, 100);
			}
		Thread.sleep(10);
		System.out.printf("%d, %d, %d\n", r, g, b);
		}
		
		for (; b <= 255; b++) {
			synchronized (c) {
				c.clear();
				c.setColor(new Color(255, 255, b));
				c.fillRect(200, 200, 100, 100);
			}
		Thread.sleep(10);
		System.out.printf("%d, %d, %d\n", r, g, b);
		}
		System.err.println("COMPLETE");
	}

}

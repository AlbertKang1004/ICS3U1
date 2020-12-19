package ca.elearningontario.tvdsb.day07;

import java.awt.Color;

import hsa_ufa.Console;

public class Practice2_5 {

	static Console c = new Console(800, 500, 30);

	public static void main(String args[]) throws InterruptedException {
		int x1 = 350;
		int y1 = 200;
		int w1 = 100;
		int h1 = 100;

		int x2 = 200;
		int y2 = 60;
		int w2 = 30;
		int h2 = 230;
		
		int moveSpeed_U = 2;
		int moveSpeed_L = 2;
		int moveSpeed_R = 2;
		int moveSpeed_D = 2;
		
		c.setColor(Color.BLUE);

		while (true) {

			synchronized (c) {
				c.clear();
				c.fillRect(x1, y1, w1, h1);

				c.setColor(Color.black);
				c.fillRect(0, 0, 20, 500);
				c.fillRect(0, 0, 800, 20);
				c.fillRect(0, 480, 800, 20);
				c.fillRect(780, 0, 20, 500);
				
				c.fillRect(x2, y2, w2, h2);
			}

			Thread.sleep(5);

			if (c.isKeyDown(Console.VK_LEFT)) {
				x1 -= moveSpeed_L;
				if (x1 < 20) {
					moveSpeed_L = 0;
				} else {
					moveSpeed_L = 2;
				}
			}
			if (c.isKeyDown(Console.VK_RIGHT)) {
				x1 += moveSpeed_R;
				if (x1 > 680) {
					moveSpeed_R = 0;
				} else {
					moveSpeed_R = 2;
				}
			}
			if (c.isKeyDown(Console.VK_UP)) {
				y1 -= moveSpeed_U;
				if (y1 < 20) {
					moveSpeed_U = 0;
				} else {
					moveSpeed_U = 2;
				}
			}
			if (c.isKeyDown(Console.VK_DOWN)) {
				y1 += moveSpeed_D;
				if (y1 > 380) {
					moveSpeed_D = 0;
				} else {
					moveSpeed_D = 2; 
				}
			}
			// until this part, It works perfectly.

			if (x1 < x2 + w2 && y1 < y2 + h2 && x2 < x1 + w1 && y2 < y1 + h1) {
				if (x1 + w1 > x2) {
					moveSpeed_L = 0;
				} else {
					moveSpeed_L = 2;
				}
				
				if (x2 + w2 > x1) {
					moveSpeed_R = 0;
				} else {
					moveSpeed_R = 2;
				}
				
				if (y1 + h1 > y2) {
					moveSpeed_U = 0;
				} else {
					moveSpeed_U = 2;
				}
				
				if (y2 + h2 > y1) {
					moveSpeed_D = 0;
				} else {
					moveSpeed_D = 2;
				}
				// If collide, Everything stops, unlike my intention.
			}
		}
	}
}
package ca.elearningontario.tvdsb.day06;

import hsa_ufa.Console;

public class Practice3_2 {

	static Console c = new Console(500, 500);
	
	public static void main(String[] args) throws InterruptedException{
		
		int x = -50;
		
		c.clear();
		c.fillOval(x, 100, 300, 300);
		while (true) {
			synchronized (c) {
				c.clear();
				c.fillOval(x, 200, 300, 300);
			}
			x += 5;
			Thread.sleep(10);
		}
	}

}

// Thread.sleep() with Synchronized makes flickering even worse.
// Synchronized sound is basically earrape for me.
// c.getChar() with Synchronized stops the console.

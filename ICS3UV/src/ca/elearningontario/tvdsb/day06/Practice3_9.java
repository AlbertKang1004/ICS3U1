package ca.elearningontario.tvdsb.day06;

import hsa_ufa.Console;
import java.awt.*;

public class Practice3_9 {

	public static Image image(String fileName) throws InterruptedException {
		return Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource(fileName));
	}
	
	static Console c = new Console();
	
	public static void main(String[] args) throws InterruptedException {
		
		Image dice = image("dice.png");
		int width = c.getDrawWidth();
		int height = c.getDrawHeight();
		
		for (int size = 100; size <= 500; size++) {
			synchronized (c) {
				c.clear();
				c.drawImage(dice, (width - size) / 2, (height - size) / 2, size, size);
			}
			Thread.sleep(10);
		}
	}

}

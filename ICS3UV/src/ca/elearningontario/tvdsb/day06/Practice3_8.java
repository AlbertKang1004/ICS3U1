package ca.elearningontario.tvdsb.day06;

import hsa_ufa.Console;
import java.awt.*;

public class Practice3_8 {

	static Console c = new Console();
	
	public static Image image(String fileName) {
		return Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource(fileName));
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Image warningSign = image("warning_sign.png");
		
		
		for (int opacity = 0; opacity <= 255; opacity++) {
			synchronized (c) {
			c.clear();
			c.drawImage(warningSign, 200, 200, 150, 150);
			
			c.setColor(new Color(255, 255, 255, opacity));
			c.fillRect(200, 200, 150, 150);
			}
			Thread.sleep(20);
		}
	}

}

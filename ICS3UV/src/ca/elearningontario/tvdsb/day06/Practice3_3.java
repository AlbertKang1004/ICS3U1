package ca.elearningontario.tvdsb.day06; // may vary

import hsa_ufa.Console;
import java.awt.*;

public class Practice3_3 { // may vary

	static Console c = new Console(800, 480, 30, "News");

	public static void main(String args[]) throws InterruptedException {
		
		Color newsCharacter = new Color(22, 22, 22);
		Image warningSign = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("warning_sign.png"));
		// TODO warning_sign.png file should be located under 'src' folder.
		// TODO Otherwise, the code will not work.
		
		c.clear();
		
		String news = "EMERGENCY_CODE: COVID-19";
		c.setCursor(12, 0);
		c.print(news);

		int screenLength = c.getNumColumns();
		
		for (int a = 0; true; a++) { // a = The start point of the string
			c.clear();
			
			synchronized (c) { // prevent flickering
				c.drawImage(warningSign, (c.getDrawWidth() / 2) - 100, (c.getDrawHeight() / 2) - 100, 200, 200);
			}
			c.setCursor(12, a);
			
			c.setColor(newsCharacter);
			c.print(news);	
			
			if (a + news.length() >= screenLength && news.length() > 0) { 
				// If the string goes off the screen, this code will remove the last character one by one.
				news = news.substring(0, news.length() - 1);
			}
			if (news.length() == 0) {
				// Generates a string again
				news = "EMERGENCY_CODE: COVID-19";
				c.setCursor(12, -news.length());
				a = -news.length();
				
			}
			Thread.sleep(100);
		}
	}
}

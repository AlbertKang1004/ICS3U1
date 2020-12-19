package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;

public class SleepTest {
	
	static Console c = new Console();

	public static void main(String[] args) throws InterruptedException {
		
		c.clear();
		c.drawStar(100, 100, 50, 50);
		Thread.sleep(1000); // 1000ms ==> 1 second
		
		c.clear();
		c.drawStar(110, 100, 50, 50);
		Thread.sleep(1000);
		
		c.clear();
		c.drawStar(120, 100, 50, 50);
		Thread.sleep(1000);
		
		c.clear();
		c.drawStar(130, 100, 50, 50);
		Thread.sleep(1000);
		
		c.clear();
		c.drawStar(140, 100, 50, 50);
		Thread.sleep(1000);
	}

}

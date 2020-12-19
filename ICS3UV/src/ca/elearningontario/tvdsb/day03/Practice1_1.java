package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
// import java.awt.*;

public class Practice1_1 {
	
	static Console c = new Console();

	public static void main(String[] args) throws InterruptedException {
		
		c.clear();
		c.fillRect(0, 100, 50, 50);
		Thread.sleep(500); // 500ms ==> 0.5 second
		
		c.clear();
		c.fillRect(20, 100, 50, 50);
		Thread.sleep(500); // 500ms ==> 0.5 second
		
		c.clear();
		c.fillRect(40, 100, 50, 50);
		Thread.sleep(500); // 500ms ==> 0.5 second
		
		c.clear();
		c.fillRect(60, 100, 50, 50);
		Thread.sleep(500); // 500ms ==> 0.5 second
		
		c.clear();
		c.fillRect(80, 100, 50, 50);
		Thread.sleep(500); // 500ms ==> 0.5 second

	}

}
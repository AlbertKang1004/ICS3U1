package ca.elearningontario.tvdsb.day03;
import java.awt.*;
import hsa_ufa.Console;

// Find or create a sprite sequence and animate it 
// using several c.drawImage() and Thread.sleep() statements.

public class Practice3_4 {

	static Console c = new Console();
	
	public static void main(String[] args) throws InterruptedException {
		
		Image dinoGif1 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (1).png"));
		Image dinoGif2 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (2).png"));
		Image dinoGif3 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (3).png"));
		Image dinoGif4 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (4).png"));
		Image dinoGif5 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (5).png"));
		Image dinoGif6 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (6).png"));
		Image dinoGif7 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (7).png"));
		Image dinoGif8 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (8).png"));
		
		while (true) {
		c.clear();
		
	    c.drawImage(dinoGif1, 0, 0);  
	    Thread.sleep(200);
	    c.clear();
		
	    c.drawImage(dinoGif2, 0, 0);  
	    Thread.sleep(200);
	    c.clear();
		
	    c.drawImage(dinoGif3, 0, 0);  
	    Thread.sleep(200);
	    c.clear();
		
	    c.drawImage(dinoGif4, 0, 0);  
	    Thread.sleep(200);
	    c.clear();
		
	    c.drawImage(dinoGif5, 0, 0);  
	    Thread.sleep(200);
	    c.clear();
		
	    c.drawImage(dinoGif6, 0, 0);  
	    Thread.sleep(200);
	    c.clear();
		
	    c.drawImage(dinoGif7, 0, 0);  
	    Thread.sleep(200);
	    c.clear();
		
	    c.drawImage(dinoGif8, 0, 0);  
	    Thread.sleep(200);
		}
	}

}

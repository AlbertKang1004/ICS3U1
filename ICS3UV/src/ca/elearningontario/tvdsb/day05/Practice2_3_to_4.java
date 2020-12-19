package ca.elearningontario.tvdsb.day05;
import hsa_ufa.Console;
import java.awt.*;

// Experiment with the use of curly braces 
// to use multiple lines of code in an if/else structure.
// Create a program that prompts the user for their favourite colour 
// and then draws a shape on the hsa_ufa Console in that colour.

public class Practice2_3_to_4 {

	static Console c = new Console(600, 600, 15);
	
	public static void main(String[] args) throws InterruptedException {
		
		c.clear();
		c.println("Please enter the RGB value of your colour.");
			
		c.print("R (Red): ");
		short r_value = c.readShort();
		if (r_value > 255 || r_value < 0) {
			c.println("An Error occurred, you entered a wrong value.");
			Thread.sleep(2000);
			c.close();
		}
		
		c.print("G (Green): ");
		short g_value = c.readShort();
		if (g_value > 255 || g_value < 0) {
			c.println("An Error occurred, you entered a wrong value.");
			Thread.sleep(2000);
			c.close();
		}
		
		c.print("B (Blue): ");
		short b_value = c.readShort();
		if (b_value > 255 || b_value < 0) {
			c.println("An Error occurred, you entered a wrong value.");
			Thread.sleep(2000);
			c.close();
		}
		
		c.setColor(new Color(r_value, g_value, b_value));
		c.fillRect(250, 250, 100, 100);
		int colorCode = (r_value * 256 * 256) + (g_value * 256) + b_value;
		
		c.setColor(Color.black);
		c.print("Color code is #");
		c.print(Integer.toHexString(colorCode));
	}
}

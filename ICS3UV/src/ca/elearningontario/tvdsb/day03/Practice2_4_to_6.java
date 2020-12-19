package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
import java.awt.*;

// 4. What happens if you print text that runs past the edge of the Console? 
// 	  Does it wrap-around or just get cut-off?
// 5. What happens if you try to use a negative font size?
//    Try some other font styles.
// 6. Open a word processor on your computer to see which fonts are installed.
//    Try using the font name for the style...does it work?

public class Practice2_4_to_6 {
	
	static Console c = new Console(500, 500);

	public static void main(String[] args) throws InterruptedException {
			
		c.setFont(new Font("MonoSpace", Font.PLAIN, 30));
		c.drawString("TEXTTEXTTEXTTEXTTEXTTEXTTEXTTEXT", 50, 50); // The text goes through the border
		
		c.setFont(new Font("MonoSpace", Font.PLAIN, -30));
		c.drawString("TEXT", 50, 150); // The text flips upside-down
		
		c.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		c.drawString("TEXT", 50, 250); // Fonts installed in PC also works the same
	}

}
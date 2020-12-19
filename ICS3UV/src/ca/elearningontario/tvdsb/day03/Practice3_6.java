package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
import java.applet.*;

// Try to play 2 sounds at once. 
// Do you hear them at the same time or one after the other?

public class Practice3_6 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	      
	      Console c = new Console();
	      
	      AudioClip sound1 = Applet.newAudioClip(c.getClass().getClassLoader().getResource("dimensions.mp3"));
	      
	      sound1.play(); 
	      // mp3 files are not supported
    }
}

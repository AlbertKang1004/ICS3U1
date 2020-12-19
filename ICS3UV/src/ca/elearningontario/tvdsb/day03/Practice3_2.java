package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
import java.applet.*;

// Google search some .wav sound clips. 
// Add them to your project and play them.

public class Practice3_2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	      
	      Console c = new Console();
	      
	      AudioClip sound1 = Applet.newAudioClip(c.getClass().getClassLoader().getResource("alarm_beep.wav"));
	      sound1.play(); // Play sound once 
	      // sound1.loop(); // Play sound "on repeat" 
    }
}

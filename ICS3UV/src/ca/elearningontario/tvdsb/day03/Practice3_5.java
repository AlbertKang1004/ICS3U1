package ca.elearningontario.tvdsb.day03;
import hsa_ufa.Console;
import java.applet.*;

// Try to play 2 sounds at once. 
// Do you hear them at the same time or one after the other?

public class Practice3_5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	      
	      Console c = new Console();
	      
	      AudioClip sound1 = Applet.newAudioClip(c.getClass().getClassLoader().getResource("alarm_beep.wav"));
	      AudioClip sound2 = Applet.newAudioClip(c.getClass().getClassLoader().getResource("applause_y.wav"));
	      
	      sound1.play(); 
	      sound2.play(); 
	      // Both sounds play together
    }
}

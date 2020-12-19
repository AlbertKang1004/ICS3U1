package ca.elearningontario.tvdsb.day13;


import hsa_ufa.Console;
import java.awt.*;

public class Practice3_3 {
   
   public static void main(String[] args) throws InterruptedException {

      Console c = new Console();
      
      Image[] sprite_run = new Image[8];
      Image[] sprite_walk = new Image[10];
      for (int i = 0; i < sprite_run.length; i++) {
          sprite_run[i] = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Run (" + (i + 1) + ").png"));
      }
      
      for (int i = 0; i < sprite_walk.length; i++) {
          sprite_walk[i] = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("dinosaurGif/Walk (" + (i + 1) + ").png"));
      }
      
      int frame_counter = 0;
      
      while (true) {
         
         synchronized (c) {
            
            c.clear();
            
            c.drawImage(sprite_run[frame_counter % sprite_run.length], 100, 50, 200, 200);
            c.drawImage(sprite_walk[frame_counter % sprite_walk.length], 300, 50, 200, 200);
         }
         
         Thread.sleep(100);
         
         frame_counter++;
         
      }
      
   }
   
}
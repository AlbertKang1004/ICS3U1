package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;

public class Practice3_2 {
   
   public static void main(String args[]) throws InterruptedException {
      
      Console c = new Console();
      
      int x = (c.getDrawWidth() - 10) / 2;
      int y = (c.getDrawHeight() - 10) / 2;
      boolean game_on = true; 
      
      do {
         
         synchronized(c) {
            
            c.clear();
            c.fillRect(x, y, 10, 10);
            
         }
         
         Thread.sleep(30);
         
         if (c.isKeyDown(Console.VK_LEFT))
            x -= 5;
         if (c.isKeyDown(Console.VK_RIGHT))
            x += 5;
         if (c.isKeyDown(Console.VK_UP))
             y -= 5;
         if (c.isKeyDown(Console.VK_DOWN))
             y += 5;
         
         if (x < 0) {
            
            c.clear();
            c.println("Success!");
            game_on = false;
            
         }
         
         else if (x >= c.getDrawWidth()) {
            
            c.clear();
            c.println("Fail.");
            game_on = false;
            
         }
         
      } while (game_on);
      
   }
   
}
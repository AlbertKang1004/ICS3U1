package ca.elearningontario.tvdsb.day07;

import hsa_ufa.*;
import java.awt.*;

public class Example2 {

   static Console c = new Console("Collision Demo");

   enum State {
      Mouse_Button_Up, Mouse_Button_Down_Ignore, Mouse_Button_Down
   }

   enum State_X {
      Left, Middle, Right
   }

   enum State_Y {
      Top, Middle, Bottom
   }

   static final int border = 5;
   static final int min_size = 20;

   public static void main(String[] args) throws InterruptedException {

      int x[] = { 100, 200 };
      int y[] = { 100, 200 };
      int w[] = { 50, 50 };
      int h[] = { 50, 50 };

      State state = State.Mouse_Button_Up;
      State_X state_x = State_X.Middle;
      State_Y state_y = State_Y.Middle;

      int target = 0, old_x = 0, old_y = 0, old_w = 0, old_h = 0, old_mouse_x = 0, old_mouse_y = 0;

      c.enableMouse();
      c.enableMouseMotion();
      c.setFont(new Font("Courier", Font.BOLD, 12));

      while (true) {

         synchronized (c) {

            // Change background colour if rectangles 1 & 2 are overlapping
            
            if (x[0] < x[1] + w[1] && y[0] < y[1] + h[1]
                  && x[1] < x[0] + w[0] && y[1] < y[0] + h[0])
               c.setBackgroundColor(Color.RED);
            else
               c.setBackgroundColor(Color.WHITE);

            c.clear();

            // Print statistics about rectangles 1 & 2
            
            c.setColor(Color.BLACK);
            c.drawString("1) x1 < x2 + w2? "
                  + (x[0] < x[1] + w[1] ? "True" : "False"), 10, 20);
            c.drawString("2) y1 < y2 + h2? "
                  + (y[0] < y[1] + h[1] ? "True" : "False"), 10, 35);
            c.drawString("3) x2 < x1 + w1? "
                  + (x[1] < x[0] + w[0] ? "True" : "False"), 10, 50);
            c.drawString("4) y2 < y1 + h1? "
                  + (y[1] < y[0] + h[0] ? "True" : "False"), 10, 65);
            c.drawString("      Collision? "
                        + (x[0] < x[1] + w[1] && y[0] < y[1] + h[1]
                              && x[1] < x[0] + w[0] && y[1] < y[0] + h[0]
                              ? "True" : "False"), 10, 80);

            // Draw rectangles
            
            for (int i = 0; i < x.length; i++) {

               c.setColor(Color.BLACK);
               c.fillRect(x[i], y[i], w[i], border);
               c.fillRect(x[i], y[i], border, h[i]);
               c.fillRect(x[i], y[i] + h[i] - border, w[i], border);
               c.fillRect(x[i] + w[i] - border, y[i], border, h[i]);

               c.setColor(Color.BLUE);
               c.fillRect(x[i] + border, y[i] + border, w[i] - 2 * border, h[i] - 2 * border);
               
               c.setColor(Color.WHITE);
               c.drawString("" + (i + 1), x[i] + border + 10, y[i] + border + 20);

               c.setColor(Color.BLACK);
               c.drawString("x" + (i + 1) + "=" + x[i], 210 + i * 100, 20);
               c.drawString("y" + (i + 1) + "=" + y[i], 210 + i * 100, 35);
               c.drawString("w" + (i + 1) + "=" + w[i], 210 + i * 100, 50);
               c.drawString("h" + (i + 1) + "=" + h[i], 210 + i * 100, 65);

            }

         }

         Thread.sleep(25);

         if (c.getMouseButton(0)) {

            if (state == State.Mouse_Button_Up) {

               state = State.Mouse_Button_Down_Ignore;

               // Check all rectangles to see if the user clicked on one.
               // The search is performed "backward" since the last item
               // draw will be on top.

               for (target = x.length - 1; target >= 0; target--) {

                  // Clicking on the rectangle?
                  
                  if (c.getMouseX() >= x[target]
                        && c.getMouseX() < x[target] + w[target]
                        && c.getMouseY() >= y[target]
                        && c.getMouseY() < y[target] + h[target]) {

                     state = State.Mouse_Button_Down;

                     // Remember values to allow moving/resizing
                     
                     old_x = x[target];
                     old_y = y[target];
                     old_w = w[target];
                     old_h = h[target];
                     old_mouse_x = c.getMouseX();
                     old_mouse_y = c.getMouseY();

                     // Which part of the rectangle did the user click?
                     
                     if (c.getMouseX() < x[target] + border)
                        state_x = State_X.Left;

                     else if (c.getMouseX() >= x[target] + w[target]
                           - border)
                        state_x = State_X.Right;

                     else
                        state_x = State_X.Middle;

                     if (c.getMouseY() < y[target] + border)
                        state_y = State_Y.Top;

                     else if (c.getMouseY() >= y[target] + h[target]
                           - border)
                        state_y = State_Y.Bottom;

                     else
                        state_y = State_Y.Middle;

                     break;

                  }

               }

            }

            else if (state == State.Mouse_Button_Down) {

               // Moving, and re-sizing sides
               
               if (state_x == State_X.Middle && state_y == State_Y.Middle
                     || state_x == State_X.Left)
                  x[target] = old_x + c.getMouseX() - old_mouse_x;

               if (state_x == State_X.Middle && state_y == State_Y.Middle
                     || state_y == State_Y.Top)
                  y[target] = old_y + c.getMouseY() - old_mouse_y;

               // Re-sizing sides & corners
               
               if (state_x == State_X.Left) {

                  w[target] = old_w + old_mouse_x - c.getMouseX();

                  if (w[target] < 2 * border + min_size) {

                     w[target] = 2 * border + min_size;
                     x[target] = old_x + old_w - w[target];

                  }

               }

               else if (state_x == State_X.Right) {

                  w[target] = old_w + c.getMouseX() - old_mouse_x;

                  if (w[target] < 2 * border + min_size)
                     w[target] = 2 * border + min_size;

               }

               if (state_y == State_Y.Top) {

                  h[target] = old_h + old_mouse_y - c.getMouseY();

                  if (h[target] < 2 * border + min_size) {

                     h[target] = 2 * border + min_size;
                     y[target] = old_y + old_h - h[target];

                  }

               }

               else if (state_y == State_Y.Bottom) {

                  h[target] = old_h + c.getMouseY() - old_mouse_y;

                  if (h[target] < 2 * border + min_size)
                     h[target] = 2 * border + min_size;

               }

            }

         }

         else
            state = State.Mouse_Button_Up;

      }

   }

}
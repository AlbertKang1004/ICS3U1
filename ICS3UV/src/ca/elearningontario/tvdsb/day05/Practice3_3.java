package ca.elearningontario.tvdsb.day05;

import java.util.Scanner;

// Find all five instances of redundant code in the program below.

public class Practice3_3 {
   
   public static void main(String args[]) {
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int a = scanner.nextInt();
      System.out.print("Enter another number: ");
      int b = scanner.nextInt();
      
      if (a <= 0)
         System.out.println("Butterscotch");
      
      else if (a <= b)
         System.out.println("Cherry Cheesecake");
      
      else {
         
         switch (a) {
         
         case 0:
            System.out.println("Chocolate");
            break;
         
         case 1:
            System.out.println("Cookie Dough");
            break;
           
         case 2:
            System.out.println("Cotton Candy");
            break;
            
         }
         
         if (b > a)
            System.out.println("Mint Chocolate Chip");
         
         else if (b > 0) {
            
            switch (b) {
            
            case 0:
            case 1:
            case 2:
            
            default:
               System.out.println("Moose Tracks");
            
            }
            
         }
         
         else if (b <= 0)
            System.out.println("Strawberry");
            
         else
            System.out.println("Vanilla");
            
         
      }
      scanner.close();
      
   }
   
}
package ca.elearningontario.tvdsb.day14;

import java.util.Scanner;

public class Example {
   
   public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      Scanner in2 = new Scanner(System.in);
      // Using 2 scanners in order to get 2 values is pointless. A single scanner is enough to receive value from user.
      // Recommendation: 
      // Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a number: "); int num1 = in.nextInt();
      // After the semicolon (;), next line of code is sticked to the previous one.
      // Code like this makes others hard to read it. 
      // Usually semicolon is located at the end of the line to enhance the readability. (except for loop... etc)
      // Recommendation: 
      // System.out.print("Enter a number: ");
      // int num1 = in.nextInt();
      
      System.out.print("Enter another number: "); 
      int numI = in2.nextInt();
      
      // Variables are hard to be differentiated. (num1 / numI) 
      // Also, number 1 and alphabet I is not even related to each other. 
      // Some might think these are the same variable, and add a invalid code.
      // Recommendation: num1 / num2
      
      int sum = num1 + numI;

      for (int i = 0; i < 1; i++) {
    	  // For loop that only loops once. This code confuses other programmers 
    	  // because they might surmise that for loop has a special feature, not just executing a code once.
    	  // Recommendation: Delete the for loop
	      System.out.print("");
	      System.out.print(num1);
	      System.out.print(' ');
	      System.out.print('+');
	      System.out.print(' ');
	      System.out.print(numI);
	      System.out.print(' ');
	      System.out.print('=');
	      System.out.print(' ');
	      System.out.print(sum);
      }
      // No point of separating each character. 
      // Hard to read, occupies more space than using printf() or combining text.
      // Recommendation: 
      // System.out.printf("%d + %d = %d", num1, numI, sum);
      
      in.close();
      in2.close();
   }
   
}
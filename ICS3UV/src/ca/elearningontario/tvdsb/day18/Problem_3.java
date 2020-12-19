// Problem 3: this code does not print the number 2

/*
package ca.elearningontario.tvdsb.day18;

public class Problem_3 {
   
   public static void main(String[] args) {
      
      int[] array = new int[3];
      
      method(array);
      
      System.out.println(array[1]);
      
   }
   
   static void method(int[] a) {
      
      a = new int[3];
      
      a[0] = 1;
      a[1] = 2;
      a[2] = 3;
      
   }
   
}
*/

// Fixed Code
package ca.elearningontario.tvdsb.day18;

public class Problem_3 {
   
   public static void main(String[] args) {
      
      int[] array = new int[3]; // declares array 'array' and creates 3 storage locations in memory
      
      method(array);
      
      System.out.println(array[1]); // now prints 2
      
   }
   
   static void method(int[] a) {
      
      // a = new int[3]; // Creates 3 new storage locations for array y, the original
      // 3 are gathered by the garbage collector and are made available for other purposes.
      
      a[0] = 1;
      a[1] = 2;
      a[2] = 3;
      
      // array inside the method can change the value of array inside main().
      // Thus, code 'a = new int[3]' affects the array in main().
      // to prevent this situation, method method() should not re-define the size of an array.
   }
   
}
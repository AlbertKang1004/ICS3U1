package ca.elearningontario.tvdsb.day15;

public class Example {
   
   public static void main(String[] args) {
      
      int a = 1;
      int[] b = {2, 3};

      // Print out the value of a
      System.out.printf("In main(), a=%d\n", a);
      
      modify_primitive_test(a);
      
      // Print out the value of a
      System.out.printf("In main(), a=%d\n", a);
      
      // Print out all values in b
      System.out.printf("In main(), b.length=%d {", b.length);
      for (int i = 0; i < b.length; i++)
         System.out.printf("%s%d", i > 0 ? ", " : "", b[i]);
      System.out.printf("}\n");
      
      modify_array_element_test(b);
      
      // Print out all values in b
      System.out.printf("In main(), b.length=%d {", b.length);
      for (int i = 0; i < b.length; i++)
         System.out.printf("%s%d", i > 0 ? ", " : "", b[i]);
      System.out.printf("}\n");
      
      modify_reference_test(b);
      
      // Print out all values in b
      System.out.printf("In main(), b.length=%d {", b.length);
      for (int i = 0; i < b.length; i++)
         System.out.printf("%s%d", i > 0 ? ", " : "", b[i]);
      System.out.printf("}\n");
      
   }
   
   static void modify_primitive_test(int x) {
      
      // Print out the value of x
      System.out.printf("In modify_primitive_test(), x=%d\n", x);
      
      x = 4;
      
      // Print out the value of x
      System.out.printf("In modify_primitive_test(), x=%d\n", x);
      
   }
   
   static void modify_array_element_test(int[] y) {
      
      // Print out all values in y
      System.out.printf("In modify_array_element_test(), y.length=%d {", y.length);
      for (int i = 0; i < y.length; i++)
         System.out.printf("%s%d", i > 0 ? ", " : "", y[i]);
      System.out.printf("}\n");
      
      y[0] = 5;
      
      // Print out all values in y
      System.out.printf("In modify_array_element_test(), y.length=%d {", y.length);
      for (int i = 0; i < y.length; i++)
         System.out.printf("%s%d", i > 0 ? ", " : "", y[i]);
      System.out.printf("}\n");
      
   }
   
   static void modify_reference_test(int[] y) {
      
      // Print out all values in y
      System.out.printf("In modify_reference_test(), y.length=%d {", y.length);
      for (int i = 0; i < y.length; i++)
         System.out.printf("%s%d", i > 0 ? ", " : "", y[i]);
      System.out.printf("}\n");
      
      // Create a new array and fill it with some values
      y[0] = 123;
      y = new int[5];
      for (int i = 0; i < y.length; i++)
         y[i] = i;
      
      // Print out all values in y
      System.out.printf("In modify_reference_test(), y.length=%d {", y.length);
      for (int i = 0; i < y.length; i++)
         System.out.printf("%s%d", i > 0 ? ", " : "", y[i]);
      System.out.printf("}\n");
      
   }
   
}

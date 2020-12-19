package ca.elearningontario.tvdsb.day12;

public class Practice1_1 {
	   
	   static int[] a;
	   
	   public static void main(String[] args) {
	      
	      // System.out.println("a[0]=" + a[0]); // nothing in array a[] *RUNTIME ERROR*
	      
	      int[] b = new int [2]; // no declaration *SYNTAX ERROR*
	      b[0] = 123;
	      b = new int[3]; // overrides current array *LOGICAL ERROR*
	      b[1] = 456;
	      b[2] = 789;
	      // System.out.println("b[-1]=" + b[-1]); // cannot access b[-1] *RUNTIME ERROR*
	      System.out.println("b[0]=" + b[0]);
	      System.out.println("b[1]=" + b[1]);
	      System.out.println("b[2]=" + b[2]);
	      // System.out.println("b[3]=" + b[3]); // cannot access b[3] *RUNTIME ERROR*
	      
	      String[] c = new String[10];
	      System.out.println(c[0]); // nothing is inside c[0] *LOGICAL ERROR*
	      
	   }
	   
	}
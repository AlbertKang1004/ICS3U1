//Problem 2: this code does not print the numbers 1, 2, or 3

/*
package ca.elearningontario.tvdsb.day18;

public class Problem_2 {

	static int[] array = {1, 2, 3};

	public static void main(String[] args) {
		
		int array[] = new int[10];
		
		System.out.println(array[1]);

	}

}
*/

// Fixed Code
package ca.elearningontario.tvdsb.day18;

public class Problem_2 {

	static int[] array = {1, 2, 3}; // declaring 'class' variable named array

	public static void main(String[] args) {
		
		// int array[] = new int[10]; // declaring 'local' variable named array
		
		// now this code have two variables sharing the same name
		// in this case, local variable 'array' overrides class variable 'array'.
		// local variable 'array' doesn't use values stored in class variable 'array'. 
		// Instead, it creates new array with 10 spaces.
		
		// System.out.println(array[1]);
		// default value (when no value is assigned for array[i]) of array[i] is 0, so array[1] = 0
		
		int array2[] = new int[10]; // changing name of the local variable can solve this problem.
		System.out.println(array[1]); // prints 2 as we intended
	}

}
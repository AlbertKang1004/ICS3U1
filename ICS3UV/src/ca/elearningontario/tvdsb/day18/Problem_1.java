// Problem 1: this code crashes rather than printing all
// numbers stored in the array.

/*
package ca.elearningontario.tvdsb.day18;

public class Problem_1 {

	public static void main(String[] args) {

		int[] array = {1, 2, 3};
		
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);

	}

}
*/
 
// Fixed Code
package ca.elearningontario.tvdsb.day18;

public class Problem_1 {

	public static void main(String[] args) {

		int[] array = {1, 2, 3}; // Array with a length of 3
		// array[0] = 1
		// array[1] = 2
		// array[2] = 3
		
		System.out.println(array[0]); // Array's first index starts at 0, not 1.
		System.out.println(array[1]); // Therefore, when you are accessing first element, 
		System.out.println(array[2]); // you should start from array[0] instead of array[1]
		// array[3] --> Fourth value of array 'array' = not exist!

	}

}
package ca.elearningontario.tvdsb.day01;

// Test the limits of printf(). Consider the sample code below. 
// What is the largest number you can use in place of 5 without running into problems?
// The smallest? Same questions for the number 10.
// System.out.printf("%5d\n", 10);

public class Practice2_3 {

	public static void main(String[] args) {
		
		System.out.printf("%5d\n", 10); // have 5 spaces to display an integer
		System.out.printf("%5d\n", 12345); // works perfectly
		System.out.printf("%5d\n", 123456); // integer is longer than 5-digit, so the space gets extended
		System.out.printf("%5d\n", 99999); // biggest number that fits in %5d
		
		System.out.printf("%5d\n", -10); // have 5 spaces to display an integer
		System.out.printf("%5d\n", -1234); // works perfectly
		System.out.printf("%5d\n", -12345); // integer is longer than 5-digit when counting the - symbol, so the space gets extended
		System.out.printf("%5d\n", -9999); // smallest number that fits in %5d
		
		// ANSWER : 99999/-9999
	}

}

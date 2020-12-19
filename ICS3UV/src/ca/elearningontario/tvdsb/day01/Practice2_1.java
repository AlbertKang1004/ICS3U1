package ca.elearningontario.tvdsb.day01;

// Experiment with each of the format specifiers on the lesson tab. Make sure you are comfortable with at least %d and %s.

public class Practice2_1 {

	public static void main(String[] args) {

		System.out.printf("%d\n", 123); // prints an integer
		System.out.printf("%5d\n", 456); // prints an integer with a space of 5 (Right-aligned)
		System.out.printf("%8d\n", 789); // prints an integer with a space of 8 (Right-aligned)
		
		System.out.printf("%s\n", "bye"); // prints an integer
		System.out.printf("%5s\n", "bye"); // prints an integer with a space of 5 (Right-aligned)
		System.out.printf("%8s\n", "bye"); // prints an integer with a space of 8 (Right-aligned)
		
		System.out.printf("%f\n", 12.3456); // prints a real number including decimal
		System.out.printf("%.2f\n", 12.3456); // prints a real number including decimal, but for only 2 decimal places
		
		System.out.printf("%10s %-5d\n","Albert", 94); // provides 10 spaces for the string (Right-aligned), and 5 spaces for the integer
		System.out.printf("%%\n"); // prints out a percentage symbol (%)
	}

}

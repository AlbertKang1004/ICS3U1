package ca.elearningontario.tvdsb.day02;
import hsa_ufa.Console;

// Experiment with the fieldWidth parameters. 
// Does it work the same as, e.g., printf("%5d\n", 123);?

public class Practice1_8 {
	
	static Console c = new Console(500, 500, 15, "Practice8");

	public static void main(String[] args) {
		
		/* NOT WORKING
			c.printf("%d\n", 123); // prints an integer
			c.printf("%5d\n", 456); // prints an integer with a space of 5 (Right-aligned)
			c.printf("%8d\n", 789); // prints an integer with a space of 8 (Right-aligned)
		
			c.printf("%s\n", "bye"); // prints an integer
			c.printf("%5s\n", "bye"); // prints an integer with a space of 5 (Right-aligned)
			c.printf("%8s\n", "bye"); // prints an integer with a space of 8 (Right-aligned)
		
			c.printf("%f\n", 12.3456); // prints a real number including decimal
			c.printf("%.2f\n", 12.3456); // prints a real number including decimal, but for only 2 decimal places
		
			c.printf("%10s %-5d\n","Albert", 94); // provides 10 spaces for the string (Right-aligned), and 5 spaces for the integer
			c.printf("%%\n"); // prints out a percentage symbol (%)
		*/
	}

}

package ca.elearningontario.tvdsb.day05;
import java.util.Scanner;

// Write a simple calculator program that takes two numbers as input 
// and adds/subtracts/multiplies/divides them.

public class Practice1_2_to_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int x = scanner.nextInt();
		// If a string was entered, the console shows the error
		
		System.out.print("Enter the second integer: ");
		int y = scanner.nextInt();
		scanner.close();
		
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
	}

}

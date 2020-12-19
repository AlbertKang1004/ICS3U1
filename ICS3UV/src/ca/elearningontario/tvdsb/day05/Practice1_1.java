package ca.elearningontario.tvdsb.day05;
import java.util.Scanner;

// Write a simple keyboard input program that reads input from the keyboard, 
// and prints what the user entered back to the screen.

public class Practice1_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter something : ");
		
		String enteredString = scanner.nextLine();
		scanner.close();
		System.out.println("You entered \"" + enteredString + "\".");
	}

}

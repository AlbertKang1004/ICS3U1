package ca.elearningontario.tvdsb.day05;
import java.util.Scanner;

// Write a program that includes a sequential selection structure combination.

public class Practice3_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 - 10: ");
		short userValue = scanner.nextShort();
		
		switch (userValue) {
		
		case 1: 
			System.out.println(userValue + " is neither prime number nor composite number. ");
			break;
			
		case 4: case 6: case 8: case 9: case 10:
			System.out.println(userValue + " is a composite number.");
			break;
			
		case 2: case 3: case 5: case 7:
			System.out.println(userValue + " is a prime number.");
			break;
			
		default:
			System.out.println("You entered a value outsite 1 to 10!");
			
		scanner.close();
		}
	}

}

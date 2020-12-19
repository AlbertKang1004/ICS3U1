package ca.elearningontario.tvdsb.day05;
import java.util.Scanner;

// Write a program to accept a number from the keyboard between 1 and 12. 
// This will represent the month. 
// Your program should use a switch statement to print out the number of days in the month.

public class Practice2_1 {

	public static void main(String[] args) {
			
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your month: ");
	short month = scanner.nextShort();
	scanner.close();
	
	switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("Month " + month + " has 31 days.");
			break;
			
		case 4: case 6: case 9: case 11: 
			System.out.println("Month " + month + " has 30 days.");
			break;
			
		case 2: 
			System.out.println("Month " + month + " has 28 days (29 days every 4 year).");
			break;
			
		default:
			System.out.println("Are you sure month " + month + " really exists?");
		}
	}
}

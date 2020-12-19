package ca.elearningontario.tvdsb.day05;
import java.util.Scanner;

// Write a program that includes a nested selection structure combination.

public class Practice3_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 = Monday");
		System.out.println("2 = Tuesday");
		System.out.println("3 = Wednesday");
		System.out.println("4 = Thursday");
		System.out.println("5 = Friday");
		System.out.println("6 = Saturday");
		System.out.println("7 = Sunday\n"); 
		
		System.out.print("What day of the week is today? : ");
		int dayOfTheWeek = scanner.nextInt();
		
		System.out.print("Does your school have Cohort system? (answer Yes or No) : ");
		String cohortSchool = scanner.next();
		
		switch (dayOfTheWeek) {
		
		case 1: case 2: case 3: case 4: case 5:
			
			if (cohortSchool.equalsIgnoreCase("Yes")) {
				
				System.out.println("It varies depending on your school.");
				
			} else if (cohortSchool.equalsIgnoreCase("No")) {
				
				System.out.println("You have to attend the school.");
				
			} else {
				
				System.out.println("Wrong Value Entered.");
			}
			break;
			
		case 6:
			
			System.out.println("You don't have to go anywhere today. Enjoy your day!");
			break;
		case 7:
			
			System.out.println("You have to go to the church.");
			break;
		default:
			
			System.out.println("Wrong value entered!");
		}
		scanner.close();
		
	}

}

package ca.elearningontario.tvdsb.day05;

import java.util.Scanner;

public class Lesson5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"You a high school student taking grade 11 computer science. At course selection time (for next year) do you ");
		System.out.println("1. Select grade 12 computer science?");
		System.out.println("2. Select other studies?");
		System.out.print("3. Select a spare? : ");
		byte selection = scanner.nextByte(); // does not need to be 'int' since the value will be 1, 2, or 3
// ===== SWITCH EXAMPLE =====
		switch (selection) {

		case 1:
			System.out.println("You finished your grade 12 computer science!");
			System.out.print("What is your final grade? : ");
			byte selection_1 = scanner.nextByte();
// ===== IF ELSE EXAMPLE =====
			if (selection_1 < 50 && selection_1 > 0) {
				System.out.println("You have to take the course again :( You should have tried harder.");
				System.out.print("Are you willing to take the course one more time? : ");
				String selection_1_1 = scanner.next();

				if (selection_1_1.equalsIgnoreCase("Yes")) {
					System.out.print("Good luck! Try harder and you can do it this time!");
				} else {
					System.out.print("Sad to see you giving up.");
				}

			} else if (selection_1 >= 50 && selection_1 < 100) {
				System.out.println("Glad to see you did it!");
			} else {
				System.out.println("Uhh... You think getting a grade of " + selection_1 + " is really possible?");
			}
			break;

		case 2:
// ===== SEQUENTIAL COMBINATION =====
			System.out.println("What course are you going to take?");
			System.out.println("1. Healthy Active Living Education"); // PPL4O1
			System.out.println("2. Personal Life Management"); // HIP4O1
			System.out.print("3. Photography : "); // AWQ4M1

			byte selection_2_a = scanner.nextByte();

			System.out.println("Are you taking the course in Summer school? (Yes or no) : ");
			String selection_2_b = scanner.next();

			switch (selection_2_a) {

			case 1:
				System.out.println(
						"You are taking a course called \"Healthy Active Living Education\", also known as PPL4O1.");
				break;
			case 2:
				System.out
						.println("You are taking a course called \"Personal Life Management\", also known as HIP4O1.");
				break;
			case 3:
				System.out.println("You are taking a course called \"Photography\", also known as AWQ4M1.");
				break;
			default:
				System.out.println("Please enter the right value.");
			}

			if (selection_2_b.equalsIgnoreCase("Yes")) {
				System.out.println(
						"Keep in mind that summer school might be little harder than the original curriculum.");
			} else if (selection_2_b.equalsIgnoreCase("No")) {
				System.out.println("You are taking the course during the semester? Good Luck.");
			} else {
				System.out.println("Please enter the right value.");
			}
			break;

		case 3:
			System.out.println("What are you doing during the spare time?");
			System.out.println("1. Work to earn tuition fee");
			System.out.println("2. Extra study to reinforce my knowledge");
			System.out.println("3. Travel around the world");
			System.out.print("4. This is my free time and I am going to play games all day! : ");
			byte selection_3 = scanner.nextByte();

			switch (selection_3) {

			case 1:

				System.out.println("Good choice! You will gain priceless experiences from it!");
				System.out.print("Where are you working? : ");
				String workingCompany = scanner.next(); // This variable does not affect the evaluation; just for the
														// information

				System.out.print("How long are you working for? (in hour) : ");
				double workingHour = scanner.nextDouble();

				System.out.print("Great! How about your hourly wage? (in $) : ");
				double hourlyWage = scanner.nextDouble();
				
				System.out.printf("If you work in %s for %.2f hour(s), you earn %.2f$.", workingCompany, workingHour, workingHour * hourlyWage);
				break;
			case 2:
				System.out.println("What subject are you willing to study?");
				System.out.println("1. Math");
				System.out.println("2. Science");
				System.out.print("3. English : ");
				byte selection_3_2 = scanner.nextByte();

				switch (selection_3_2) {
				case 1:
				case 2:
					System.out.println(
							"For both Math and Science, practice is the key. Try to solve as many problems as possible.");
					break;
				case 3:
					System.out.println(
							"For English, seek for the opportunity to speak english casually. You can also learn english by conversating with others.");
					break;
				default:
					System.out.println("So... You studied nothing.");
				}
				break;
			case 3:
// ===== NESTED COMBINATION =====
				System.out.println("Where are you planning to go?");
				System.out.println("1. The other city in Canada");
				System.out.println("2. United States of America");
				System.out.print("3. Europe : ");
				byte selection_3_3 = scanner.nextByte();

				System.out.print("How many days are you spending there? : ");
				int daysTraveling = scanner.nextInt();
				
				switch (selection_3_3) {
				case 1: case 2:
					System.out.println("Have a great time!");
					break;
				case 3:
					if (daysTraveling > 6) {
						System.out.println("Have a great time!");
					} else if (daysTraveling <= 5 && daysTraveling > 0) {
						System.out.println("You can't take a trip to Europe in " + daysTraveling + " days.");
					} else {
						System.out.println("Please enter the right value.");
					}
					break;
				default:
					System.out.println("Please enter the right value.");
				}
				break;
			case 4:
				System.out.println("Remember, you have to set your priority straight.");
				break;
			default:
				System.out.println("Please enter the right value.");
			}
			break;

		default:
			System.out.println("You entered the wrong value!");
		}

		scanner.close();
	}

}

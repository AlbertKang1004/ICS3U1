package ca.elearningontario.tvdsb.day05;
import java.util.Scanner;

// 5. Modify your program in #1 to use an if-else structure instead
// 6. Modify your program in #5 to account for leap years. 
// 	  Years that are evenly divisible by 4 are leap years. 
//    The % operator should come in handy for this one!
// 7. Actually, years that are evenly divisible by 100 are not leap years. 
//	  Modify your code in #6 to account for this.
// 8. One final wrinkle is that years that are evenly divisible by 400 are leap years. 
// 	  Modify your code in #7 accordingly. 

public class Practice2_5_to_8 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your year: ");
		short year = scanner.nextShort();
		
		System.out.print("Enter your month: ");
		short month = scanner.nextShort();
		scanner.close();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { 
			
			System.out.println("Month " + month + " has 31 days.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			
			System.out.println("Month " + month + " has 30 days.");
		} else if (month == 2) {
			
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						
						System.out.println("Month " + month + " has 29 days.");
					} else {
						System.out.println("Month " + month + " has 28 days.");					
					}
				} else {
					System.out.println("Month " + month + " has 29 days.");
				}
			} else {
				System.out.println("Month " + month + " has 28 days.");
			}
		} else {
			
			System.out.println("Are you sure month " + month + " really exists?");
		}
	}
}

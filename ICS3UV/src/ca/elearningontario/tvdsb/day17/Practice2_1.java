package ca.elearningontario.tvdsb.day17;
import java.util.Scanner;

public class Practice2_1 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Create and initialize arrays
		String[] grocery_list = { "Milk", "Eggs", "Rice", "Veal cutlets", "Lettuce" };
		double[] prices = { 3.99, 3.59, 2.45, 8.34, 0.99 };

		System.out.print("Enter your item: ");
		String search_key = scanner.next();
		boolean found = false;

		// Search for the search key, and display the matching elements
		System.out.println("Searching for " + search_key + "...");
		for (int i = 0; i < grocery_list.length; i++)
			if (grocery_list[i].equals(search_key)) {
				System.out.println("Found it! " + grocery_list[i] + " " + prices[i]);
				found = true;
			}

		if (found == false)
			System.out.println("No luck! " + search_key + " wasn't found.");

	}

}
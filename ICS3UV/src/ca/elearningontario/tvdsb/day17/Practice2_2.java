package ca.elearningontario.tvdsb.day17;

import java.util.Scanner;

public class Practice2_2 {

	static Scanner scanner = new Scanner(System.in);

	public static void searchItem(String[] array_s, double[] array_d, String search_key) {
		boolean found = false;

		// Search for the search key, and display the matching elements
		System.out.println("Searching for " + search_key + "...");
		for (int i = 0; i < array_s.length; i++)
			if (array_s[i].equals(search_key)) {
				System.out.println("Found it! " + array_s[i] + " " + array_d[i]);
				found = true;
			}

		if (found == false) {
			System.out.println("No luck! " + search_key + " wasn't found.");
		}
	}

	public static void searchItem(double[] array_d, String[] array_s, double search_key) {
		boolean found = false;

		// Search for the search key, and display the matching elements
		System.out.println("Searching for " + search_key + "...");
		for (int i = 0; i < array_d.length; i++)
			if (array_d[i] == search_key) {
				System.out.println("Found it! " + array_s[i] + " " + array_d[i]);
				found = true;
			}

		if (found == false) {
			System.out.println("No luck! " + search_key + " wasn't found.");
		}
	}

	public static void main(String[] args) {

		// Create and initialize arrays
		String[] grocery_list = { "Milk", "Eggs", "Rice", "Veal cutlets", "Lettuce" };
		double[] prices = { 3.99, 3.59, 2.45, 8.34, 0.99 };

		System.out.println("Enter your search type");
		System.out.println("1 - Name");
		System.out.print("2 - Price: ");
		byte option = scanner.nextByte();

		switch (option) {
		case 1:
			System.out.print("Enter your item: ");
			String search_key_s = scanner.next();
			searchItem(grocery_list, prices, search_key_s);
			break;
		case 2:
			System.out.print("Enter your price: ");
			double search_key_d = scanner.nextDouble();
			searchItem(prices, grocery_list, search_key_d);
			break;
		default: 
			System.out.println("Wrong Value!");
		}

	}

}
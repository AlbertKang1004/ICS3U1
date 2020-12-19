package ca.elearningontario.tvdsb.day17;

import java.util.Scanner;

public class Practice1_2 {

	static Scanner scanner = new Scanner(System.in);

	public static void printArray(String[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}
	}

	public static void addNewItem(String[] array, String data) {
		String new_array[] = new String[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			new_array[i] = array[i];
		}
		array = new_array;
		array[array.length - 1] = data;
		printArray(array);
	}

	public static void main(String[] args) {
		String[] grocery_list = { "Milk", "Eggs", "Rice", "Veal cutlets", "Lettuce" };

		printArray(grocery_list);

		while (true) {
			System.out.print("Enter next value: ");
			String next_value = scanner.next();
			if (next_value == "quit") {
				break;
			} else {
				addNewItem(grocery_list, next_value);
			}
		}
	}

}
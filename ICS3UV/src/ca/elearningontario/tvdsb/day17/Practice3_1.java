package ca.elearningontario.tvdsb.day17;
import java.util.Scanner;

public class Practice3_1 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		String[] grocery_list = { "Milk", "Eggs", "Rice", "Veal cutlets", "Lettuce" };

		System.out.println("Grocery List:");
		for (int i = 0; i < grocery_list.length; i++)
			System.out.println(grocery_list[i]);

		System.out.print("Enter an index between 0 and 4 to delete: ");
		int index = scanner.nextInt();
		grocery_list[index] = grocery_list[grocery_list.length - 1];

		{

			String new_array[] = new String[grocery_list.length - 1];

			for (int i = 0; i < new_array.length; i++)
				new_array[i] = grocery_list[i];

			grocery_list = new_array;

		}

		System.out.println("Grocery List:");
		for (int i = 0; i < grocery_list.length; i++)
			System.out.println(grocery_list[i]);

	}

}
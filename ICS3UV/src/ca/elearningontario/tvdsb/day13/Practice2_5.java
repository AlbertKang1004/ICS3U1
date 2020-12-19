package ca.elearningontario.tvdsb.day13;

import java.util.Scanner;

public class Practice2_5 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void getArrayValue(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter the value of [%d]: ", i);
			array[i] = scanner.nextInt();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter the number of spaces for your array: ");
		int arraySize = scanner.nextInt();
		
		int[] array = new int[arraySize];
		getArrayValue(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Value of array[%d] is %d\n", i, array[i]);
		}
	}

}

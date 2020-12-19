package ca.elearningontario.tvdsb.day16;

import java.util.Scanner;

public class Practice2_3 {

	static Scanner scanner = new Scanner(System.in);

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] creationArray(int size) {
		int[] array = new int[size];
		int n = 0;

		for (int i = 0; i < size; n++) {
			if (isPrime(n) == true) {
				array[i] = n;
				i++;
			}
		}

		return array;
	}

	public static void main(String[] args) {

		System.out.print("Enter the size of an array: ");
		int array_size = scanner.nextInt();
		
		for (int i = 0; i < creationArray(array_size).length; i++) {
			System.out.println(creationArray(array_size)[i]);
		}
		
	}

}

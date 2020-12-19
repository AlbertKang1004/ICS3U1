package ca.elearningontario.tvdsb.day15;

import java.util.Scanner;

public class Practice1_3 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter an integer: ");
		int num = in.nextInt();

		int counter = 0;
		
		for (int a = 1; a < num; a++) {
			if (num % a == 0) {
				counter++;
			}
		}
		
		int[] divisor = new int[counter];
		for (int a = 1, i = 0; a < num; a++) {
			if (num % a == 0) {
				divisor[i] = a;
				i++;
			}
		}
		
		int sum = 0;
		
		for (int j = 0; j < divisor.length; j++) {
			sum += divisor[j];
		}
		
		if (num == sum) {
			System.out.println("Perfect number.");
		} else {
			System.out.println("Not a perfect number.");
		}
	}
}

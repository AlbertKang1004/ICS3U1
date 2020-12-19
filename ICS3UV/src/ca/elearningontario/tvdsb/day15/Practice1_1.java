package ca.elearningontario.tvdsb.day15;

import java.util.Scanner;

public class Practice1_1 {

	static Scanner scanner = new Scanner(System.in);

	public static void triangle(int base, int height) {
		int area = base * height / 2;
		System.out.println("Area of the triangle is " + area);
	}

	public static void main(String[] args) {

		System.out.print("Enter the length of the triangle: ");
		int baseTriangle = scanner.nextInt();

		System.out.print("Enter the height of the triangle: ");
		int heightTriangle = scanner.nextInt();

		triangle(baseTriangle, heightTriangle);
	}

}

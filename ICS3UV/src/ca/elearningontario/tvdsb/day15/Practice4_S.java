package ca.elearningontario.tvdsb.day15;

import java.util.Scanner;

public class Practice4_S {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.print("Enter an integer: ");
		int i = in.nextInt();
		
		for ( ; i > 0; i--) {
			a += b;
			c = a;
			a = b;
			b = c;
			System.out.println(a);
		}

	}

}

package ca.elearningontario.tvdsb.day04;

public class Practice2_3 {

	public static void main(String[] args) {
		
		int a = 0b111000010101; // Binary
		int b = 05554;  	  // Octal
		int c = 3358;	  // Decimal 
		int d = 0xAA1;	  // Hexadecimal
		System.out.printf("%14s | %8s | %8s | %11s \n", "Binary", "Octal", "Decimal", "Hexadecimal");
		System.out.printf("%14s | %8o | %8d | %11x \n", Integer.toString(a, 2), a, a, a);
		System.out.printf("%14s | %8o | %8d | %11x \n", Integer.toString(b, 2), b, b, b);
		System.out.printf("%14s | %8o | %8d | %11x \n", Integer.toString(c, 2), c, c, c);
		System.out.printf("%14s | %8o | %8d | %11x \n", Integer.toString(d, 2), d, d, d);

	}
}

package ca.elearningontario.tvdsb.day04;

// Create code to evaluate a complex calculation 
// using at least one of * / and % and at least one of + and - 
// to experiment with operator precedence.

public class Practice1_4 {

	public static void main(String[] args) {
		
		int a;
		a = 100 * 3 + 10 / 2 % 3 - 1;
		
		// (100 * 3) + (10 / 2) % 3 - 1
		// 300 + (5 % 3) - 1
		// 300 + 2 - 1
		// 301
		
		System.out.print(a);	
	}

}

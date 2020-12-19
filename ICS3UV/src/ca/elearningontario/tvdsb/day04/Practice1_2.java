package ca.elearningontario.tvdsb.day04;

// Include some operators in your program.

public class Practice1_2 {

	public static void main(String[] args) {
		
		double computerPrice = 2300; // 2300$
		double discountPercentage = 0.15; // -15%
		double taxPercentage = 0.13; // 13%
		
		System.out.printf("The original price of the computer is : %.2f$\n", computerPrice);
	
		computerPrice -= computerPrice * discountPercentage;
	    computerPrice += computerPrice * taxPercentage;
		
		System.out.printf("The new price of the computer is : %.2f$\n", computerPrice);
	}

}

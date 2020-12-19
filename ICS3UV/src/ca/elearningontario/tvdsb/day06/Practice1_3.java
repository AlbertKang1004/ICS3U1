package ca.elearningontario.tvdsb.day06;

// Revise your program in #1 to add up all the integers from 1 to 100.

public class Practice1_3 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}

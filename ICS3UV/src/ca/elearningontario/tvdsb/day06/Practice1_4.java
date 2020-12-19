package ca.elearningontario.tvdsb.day06;

// Revise your program in #3 to use a while (true) or do-while (true)
// and a break; to maintain the same functionality.

public class Practice1_4 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		while (true) {
			sum += i;
			i++;
			if (i == 100) {
				sum += i;
				System.out.println(sum);
				break;
			}
		}
	}

}

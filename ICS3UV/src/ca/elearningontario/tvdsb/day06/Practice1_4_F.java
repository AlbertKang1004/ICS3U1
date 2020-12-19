package ca.elearningontario.tvdsb.day06;

public class Practice1_4_F {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; true; i++) {
			sum += i;
			if (i == 100) {
				System.out.println(sum);
				break;
			}
		}

	}

}

package ca.elearningontario.tvdsb.day06;

public class Practice2_4 {

	public static void main(String[] args) {
		
		System.out.printf("%3s", "");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		for (int j = 1; j <= 9; j++) {
			System.out.println("");
			System.out.printf("%3d", j);
			for (int k = 1; k <= 9; k++) {
				System.out.printf("%3d", j * k);
			}
		}
	}
}

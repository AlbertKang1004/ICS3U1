package ca.elearningontario.tvdsb.day13;

public class Practice2_3 {

	static void greaterThan100(int[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 100) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static void main(String[] args) {

		int[] count_test = { 1, 100, 2, 200, 3 };
		
		greaterThan100(count_test);
	}

}

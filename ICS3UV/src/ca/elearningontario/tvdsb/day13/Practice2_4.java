package ca.elearningontario.tvdsb.day13;

public class Practice2_4 {

	public static void greaterThan100(int[] array) {
		int sumOver100 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 100) {
				sumOver100 += array[i];
			}
		}
		System.out.println(sumOver100);
	}

	public static void main(String[] args) {

		int[] count_test = { 1, 100, 2, 200, 3 };
		
		greaterThan100(count_test);
	}

}

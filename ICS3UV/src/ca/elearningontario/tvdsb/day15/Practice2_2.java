package ca.elearningontario.tvdsb.day15;

public class Practice2_2 {

	public static void getMaxValue(int[] array) {

		int maximum = Integer.MIN_VALUE;

		if (array.length == 0) {
			System.out.println("NaN");
		} else {
			for (int i = 0; i < array.length; i++) {
				if (maximum < array[i]) {
					maximum = array[i];
				}
			}
			System.out.println(maximum);
		}
	}

	public static void main(String[] args) {

		int[] array = { 12, 34, 56, 78, 123, 456, 1234 };

		getMaxValue(array);
	}

}

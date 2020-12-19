package ca.elearningontario.tvdsb.day13;

public class Practice2_2 {

	static void maxValue(int[] array) {
		int min = Integer.MIN_VALUE;
		if (array.length == 0) {
			min = 0;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] > min) {
					min = array[i];
				}
			}
		}
		
		System.out.println(min);
	}

	public static void main(String[] args) {

		int[] max_test_1 = new int[0];
		int[] max_test_2 = { 3, 30, 6, 8, 15 };
		int[] max_test_3 = { -5, 15, 25, -2, 0 };
		int[] max_test_4 = { -20, -8, -22, -5, -6 };
		int[] max_test_5 = { -6, -87, -2147483648, -123, -57 };

		maxValue(max_test_1);
		maxValue(max_test_2);
		maxValue(max_test_3);
		maxValue(max_test_4);
		maxValue(max_test_5);
	}

}

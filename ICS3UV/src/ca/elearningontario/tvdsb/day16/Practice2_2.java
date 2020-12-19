package ca.elearningontario.tvdsb.day16;

public class Practice2_2 {
	
	static final int min_int = Integer.MIN_VALUE;
	static final int max_int = Integer.MAX_VALUE;

	public static void main(String[] args) {

		int[] list = { 8, 6, 7, 5, 3, 0, 9 };

		int[] return_2 = calculate_2(list);

		System.out.println("count is " + return_2[0]);
		System.out.println("sum is " + return_2[1]);
		System.out.println("max is " + return_2[2]);
		System.out.println("min is " + return_2[3]);

	}

	static int[] calculate_2(int[] numbers) {

		int[] array = new int[4];
		int max = min_int;
		int min = max_int;

		for (int i = 0; i < numbers.length; i++) {

			array[0]++;
			array[1] += numbers[i];

		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		array[2] = max;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		array[3] = min;
		return array;

	}

}
package ca.elearningontario.tvdsb.day16;

public class Practice2_1 {
	
	static final int max_int = Integer.MIN_VALUE;

	public static void main(String[] args) {

		int[] list = { 8, 6, 7, 5, 3, 0, 9 };

		int[] return_2 = calculate_2(list);

		System.out.println("count is " + return_2[0]);
		System.out.println("sum is " + return_2[1]);
		System.out.println("max is " + return_2[2]);

	}

	static int[] calculate_2(int[] numbers) {

		int[] array = new int[3];
		int a = max_int;

		for (int i = 0; i < numbers.length; i++) {

			array[0]++;
			array[1] += numbers[i];

		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > a) {
				a = numbers[i];
			}
		}
		array[2] = a;
		return array;

	}

}
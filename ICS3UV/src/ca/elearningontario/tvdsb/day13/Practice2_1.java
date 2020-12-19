package ca.elearningontario.tvdsb.day13;

public class Practice2_1 {

	public static void main(String[] args) {

		int[] array = { 4, 5, 3 };

		int average = 0;
		for (int i = 0; i < array.length; i++) {
			average += array[i];
		}

		if (array.length == 0) {
			System.out.println(0);
		} else {
			average /= array.length;
			System.out.println(average);
		}
	}
}

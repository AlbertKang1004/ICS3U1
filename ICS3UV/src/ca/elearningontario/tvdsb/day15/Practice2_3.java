package ca.elearningontario.tvdsb.day15;

public class Practice2_3 {

	public static void reverseArray(int[] array) {
		int[] duplicate_array = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			duplicate_array[i] = array[array.length - 1 - i];
		}

		array = duplicate_array;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

		int[] array = { 5, 3, 65, 1, 6 };

		reverseArray(array);
	}

}

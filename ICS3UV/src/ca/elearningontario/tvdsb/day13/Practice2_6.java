package ca.elearningontario.tvdsb.day13;

public class Practice2_6 {

	public static void reverseArray(int[] array) {
		int[] reversal = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reversal[i] = array[array.length - 1 - i];
		}
		array = reversal;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {

		int[] max_test_2_reverse = { 15, 8, 6, 30, 3 };
		
		reverseArray(max_test_2_reverse);
	}

}

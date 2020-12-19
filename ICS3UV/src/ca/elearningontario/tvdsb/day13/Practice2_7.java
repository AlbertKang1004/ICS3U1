package ca.elearningontario.tvdsb.day13;

public class Practice2_7 {

	public static void addAndMultiply(int[] array1, int[] array2) {
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += (array1[i] * array2[i]);
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		int[] a1 = {1, 3, 5};
		int[] a2 = {2, 4, 6};
		
		addAndMultiply(a1, a2);
	}

}

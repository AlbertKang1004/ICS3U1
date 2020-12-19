package ca.elearningontario.tvdsb.day15;

public class Practice2_1 {
	
	public static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] array = { 3, 4, 5, 6, 7, 8 };
		
		printArray(array);
	}

}

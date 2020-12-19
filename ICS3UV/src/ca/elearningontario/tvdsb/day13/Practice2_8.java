package ca.elearningontario.tvdsb.day13;

public class Practice2_8 {

	public static void distribution(int[] array) {

		int[] scoreGroup = new int[10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 10, k = 0; j <= 100; j += 10, k++) {
				if (j - 9 <= array[i] && array[i] <= j) {
					scoreGroup[k]++;
				}
			}
		}
		
		for (int k = 0; k < scoreGroup.length; k++) {
			System.out.println(scoreGroup[k]);
		}
	}

	public static void main(String[] args) {

		int[] studentMarks = { 23, 5, 82, 79, 57, 13, 47, 51, 25, 88, 66, 17, 33, 70, 50, 79, 96, 44, 29, 31, 24, 90,
				51, 47, 10, 61, 62, 62, 55, 81, 3, 65, 12, 64, 53, 97, 49, 31, 9, 5, 32, 20, 17, 65, 56, 71, 3, 91, 66,
				96, 80, 72, 4, 19, 26, 51, 68, 14, 11, 84, 84, 36, 48, 83, 22, 11, 32, 99, 79, 2, 25, 76, 57, 28, 10,
				38, 76, 58, 65, 98, 33, 60, 45, 84, 9, 85, 47, 29, 30, 55, 84, 51, 54, 71, 18, 1, 39, 27, 12, 82 };

		distribution(studentMarks);
	}

}

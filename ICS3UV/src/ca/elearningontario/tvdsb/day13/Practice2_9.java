package ca.elearningontario.tvdsb.day13;

import java.util.*;

public class Practice2_9 {

	static Scanner scanner = new Scanner(System.in);

	public static void distribution(int[] array) {

		int[] scoreGroup = new int[10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 10, k = 0; j <= 100; j += 10, k++) {
				if (j - 9 <= array[i] && array[i] <= j) {
					scoreGroup[k]++;
				}
			}
		}
		System.out.println("            SCORE DISTRIBUTION              ");
		System.out.println("============================================");
		for (int k = 0; k < scoreGroup.length; k++) {
			System.out.printf("%3d ~ %3d | ", (k * 10) + 1, (k * 10) + 10);
			for (int a = scoreGroup[k]; a > 0; a--) {
//				if ((scoreGroup[k] - a) % 5 == 0) {
//					System.out.print(' ');
//				}
				System.out.print("⬜");
			}
			System.out.printf(" %d", scoreGroup[k]);
			System.out.print("\n");
		}
	}

	static int maxValue(int[] array) {
		int max = Integer.MIN_VALUE;
		if (array.length == 0) {
			max = 0;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
			}
		}

		return max;
	}

	static int minValue(int[] array) {
		int min = Integer.MAX_VALUE;
		if (array.length == 0) {
			min = 0;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}

		return min;
	}

	public static int avgValue(int[] array) {
		int average = 0;
		for (int i = 0; i < array.length; i++) {
			average += array[i];
		}

		if (array.length == 0) {
			return 0;
		} else {
			average /= array.length;
			return average;
		}
	}

	public static void ranking(int[] array) {
		System.out.println("            GRADE IN NUMBERS             ");
		System.out.println("=========================================");
		Arrays.sort(array);
		int[] reversal = new int[array.length]; // temporary array to store items
		for (int i = 0; i < array.length; i++) {
			reversal[array.length - 1 - i] = array[i];
		}
		array = reversal;

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%4d", array[i]);
			if ((i + 1) % 10 == 0 && i != 0) {
				System.out.println("");
			}
		}
	}

	public static void markTemplate(int[] array) {
		distribution(array);

		System.out.printf("\nHighest Mark: %3d\n", maxValue(array));
		System.out.printf("Lowest Mark:  %3d\n", minValue(array));
		System.out.printf("Average Mark: %3d\n\n", avgValue(array));

		ranking(array);
		System.out.print("\n\nWhat's your score? (between 1 and 100): ");
		int userScore = scanner.nextInt();
		System.out.println("");
		getUserRanking(userScore, array);
	}
	
	public static void getUserRanking(int score, int[] array) {
		int ranking = 0;
		for (int i = 0; i < array.length; i++) {
			if (score == array[i]) {
				ranking = array.length - i;
			}
		}

		System.out.println("             YOUR STATUS                 ");
		System.out.println("=========================================");
		if (ranking == 0) {
			System.out.println("You Entered the wrong value!");
		} else {
			if (ranking % 10 == 1 && ranking % 100 != 11)
				System.out.printf("Your Score of %d is ranked %dst. Good job!", score, ranking);
			else if (ranking % 10 == 2 && ranking % 100 != 12)
				System.out.printf("Your Score of %d is ranked %dnd. Good job!", score, ranking);
			else if (ranking % 10 == 3 && ranking % 100 != 13)
				System.out.printf("Your Score of %d is ranked %drd. Good job!", score, ranking);
			else
				System.out.printf("Your Score of %d is ranked %dth. Good job!", score, ranking);

		}
	}

	public static void main(String[] args) {

		int[] studentMarks = { 23, 5, 82, 79, 57, 13, 47, 51, 25, 88, 66, 17, 33, 70, 50, 79, 96, 44, 29, 31, 24, 90,
				51, 47, 10, 61, 62, 62, 55, 81, 3, 65, 12, 64, 53, 97, 49, 31, 9, 5, 32, 20, 17, 65, 56, 71, 3, 91, 66,
				96, 80, 72, 4, 19, 26, 51, 68, 14, 11, 84, 84, 36, 48, 83, 22, 11, 32, 99, 79, 2, 25, 76, 57, 28, 10,
				38, 76, 58, 65, 98, 33, 60, 45, 84, 9, 85, 47, 29, 30, 55, 84, 51, 54, 71, 18, 1, 39, 27, 12, 82 };

//		int[] marks = { 90, 88, 87, 67, 100, 100, 96, 95, 77, 97, 82, 86, 60, 49, 100, 92, 96, 44, 75, 74, 97, 93, 91, 90, 100, 83, 71, 72 };

		markTemplate(studentMarks);
	}

	

}

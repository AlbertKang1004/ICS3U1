package ca.elearningontario.tvdsb.day06;

public class Enrichment {

	public static void main(String[] args) {

		int num = 2;

		while (num < 100000) {

			int i = 2;

			while (i < num) {

				if (num % i == 0)
					break; // Break out of loop if a factor is found

				i = i + 1;

			}

			if (i == num) {
				System.out.println(num + " is a prime number.");
			}

			num = num + 1;

		}

	}

}
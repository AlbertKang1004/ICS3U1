package ca.elearningontario.tvdsb.day12;

public class Practice1_3 {

	public static void main(String[] args) {

		int primeNumber[] = new int[5];
		
		int i = 0;
		for (int n = 1; i <= primeNumber.length - 1; n++) {
			isPrime(n);
			if (isPrime(n) == true) {
				primeNumber[i] = n;
				i++; 
			} 
		}
		
		for (int j = 0; j <= primeNumber.length - 1; j++)
		System.out.printf("primeNumber[%d] = %d \n", j, primeNumber[j]);
		
		int sum = 0;
		for (int a : primeNumber) {
			sum += a;
		}
		System.out.printf("The sum of primeNumber[0] to primeNumber[%d] is %d \n", primeNumber.length - 1, sum);
	}

	public static boolean isPrime(int n) {
		if (n <= 1 || n == 4) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

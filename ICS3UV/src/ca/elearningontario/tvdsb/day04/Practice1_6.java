package ca.elearningontario.tvdsb.day04;

public class Practice1_6 {

	public static void main(String[] args) {
		int firstNum = 4;
		int secondNum = 0;
		
		if (((firstNum - secondNum) % firstNum == 0) && (firstNum != secondNum)) {
			System.out.print("WARNING: ZERO EXCEPTION");
		} else {
			int result = firstNum / secondNum; // 5 / 0
			System.out.print(result);
		}
	}
}

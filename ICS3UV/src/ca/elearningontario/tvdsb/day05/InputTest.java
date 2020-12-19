package ca.elearningontario.tvdsb.day05;
import java.util.Scanner;
// import java.io.*;

public class InputTest {

	public static void main(String[] args) {
		
		String inputText;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		inputText = in.next();
		System.out.println("Your name :" + inputText);
		
		in.close();
	}

}

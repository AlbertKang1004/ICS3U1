package ca.elearningontario.tvdsb.day15;

import hsa_ufa.Console;
import java.awt.*;

public class Practice1_5 {

	static Console console = new Console(700, 500, 20, "Custom");

	public static void locateCursor(int row, int column) {
		console.clear();
		console.setCursor(row, column);
		console.print("* Row: " + row + ", Column: " + column);
	}

	public static void applyColor(int red, int green, int blue) {
		
		Color custom = new Color(red, green, blue);
		console.setColor(custom);
	}
	public static void main(String[] args) {

		console.clear();

		console.print("Enter the row: ");
		int row = console.readInt();

		console.print("Enther the column: ");
		int col = console.readInt();
		
		console.println("Enter the RGB Value.");
		console.print("R (Red): ");
		int r = console.readInt();
		
		console.print("G (Green): ");
		int g = console.readInt();
		
		console.print("B (Blue): ");
		int b = console.readInt();
		

		if (console.getNumRows() < row || console.getNumColumns() < col) {
			console.clear();
			console.setCursor(0, 0);
			console.print("Can't print that!");
		} else if (0 > r || r > 255 || 0 > g || g > 255 || 0 > b || b > 255) {
			console.clear();
			console.setCursor(0, 0);
			console.print("Wrong Color value.");
		} else {
			applyColor(r, g, b);
			locateCursor(row, col);	
		}

	}

}

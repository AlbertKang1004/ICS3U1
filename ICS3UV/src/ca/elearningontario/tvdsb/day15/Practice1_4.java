package ca.elearningontario.tvdsb.day15;

import hsa_ufa.Console;

public class Practice1_4 {

	static Console console = new Console(700, 500, 20, "Custom");

	public static void locateCursor(int row, int column) {
		console.clear();
		console.setCursor(row, column);
		console.print("* Row: " + row + " Column: " + column);
	}

	public static void main(String[] args) {

		console.clear();

		console.print("Enter the row: ");
		int row = console.readInt();

		console.print("Enther the column: ");
		int col = console.readInt();

		if (console.getNumRows() < row || console.getNumColumns() < col) {
			console.clear();
			console.setCursor(0, 0);
			console.print("Can't print that!");
		} else {
			locateCursor(row, col);
		}

	}

}

package ca.elearningontario.tvdsb.day11;

import hsa_ufa.Console;

public class Practice1_5 {

	static Console c = new Console(600, 600, 30, "Press Space");

	static void ifSpaceClicked() {
		boolean clicked = true;
		while (clicked) {
			if (c.getKeyChar() == ' ') {
				c.clear();
				c.print("Hey!");
				clicked = false;
				return;
			}
		}
	}

	public static void main(String args[]) {

		c.clear();
		c.print("Press Space to continue...");
		ifSpaceClicked();
	}

}

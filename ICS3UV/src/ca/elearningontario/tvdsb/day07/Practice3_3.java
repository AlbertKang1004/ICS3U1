package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;

public class Practice3_3 {

	public static void main(String args[]) throws InterruptedException {

		Console c = new Console(800, 500, 30);

		int x = (c.getDrawWidth() - 10) / 2;
		int y = (c.getDrawHeight() - 10) / 2;
		boolean game_on = false;

		do {
			c.clear();
			String startGame = "PRESS ANY KEY TO START";
			c.setCursor(6, 0);
			c.print(startGame);

			int screenLength = c.getNumColumns();

			for (int a = 0; game_on == false; a++) { // a = The start point of the string
				c.clear();
				c.setCursor(6, a);

				c.print(startGame);

				if (a + startGame.length() >= screenLength && startGame.length() > 0) {
					// If the string goes off the screen, this code will remove the last character
					// one by one.
					startGame = startGame.substring(0, startGame.length() - 1);
				}
				if (startGame.length() == 0) {
					// Generates a string again
					startGame = "EMERGENCY_CODE: COVID-19";
					c.setCursor(12, -startGame.length());
					a = -startGame.length();
				}
				Thread.sleep(100);
				if (c.getKeyCode() != Console.VK_UNDEFINED) {
					game_on = true;
				}
			}
		} while (game_on == false);

		do {

			synchronized (c) {

				c.clear();
				c.fillRect(x, y, 10, 10);

			}

			Thread.sleep(30);

			if (c.isKeyDown(Console.VK_LEFT))
				x -= 5;
			if (c.isKeyDown(Console.VK_RIGHT))
				x += 5;
			if (c.isKeyDown(Console.VK_UP))
				y -= 5;
			if (c.isKeyDown(Console.VK_DOWN))
				y += 5;

			if (x < 0) {

				c.clear();
				c.println("Success!");
				game_on = false;

			}

			else if (x >= c.getDrawWidth()) {

				c.clear();
				c.println("Fail.");
				game_on = false;

			}

		} while (game_on);
	}
}

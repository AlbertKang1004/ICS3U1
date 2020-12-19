package ca.elearningontario.tvdsb.day11;

import hsa_ufa.Console;
import java.awt.*;

public class Practice2_5 {

	static void collideDetector(int x, int y, int x_obs, int y_obs, int size, String message)
			throws InterruptedException {
		if ((x < x_obs + size) && (y < y_obs + size) && (x_obs < x + size) && (y_obs < y + size)) {
			c.clear();
			c.setColor(Color.BLACK);
			c.println(message);
			gameScore++;
			Thread.sleep(1000);
			menu();
		}
	}
	
	static int gameScore = 0;

	// Console c is declared this way so it can be used in any method
	static Console c = new Console();

	public static void main(String[] args) throws InterruptedException {

		menu();

	}

	static void menu() throws InterruptedException {

		while (true) {

			synchronized (c) {

				c.clear();
				c.setColor(Color.BLACK);
				c.println("gameScore = " + gameScore);
				c.println("You are BLUE. Touch the GREEN squares but do not touch the RED squares.");
				c.println("Press 1, 2 or 3 to enter level:");
				c.println("1. Easy");
				c.println("2. Medium");
				c.println("3. Hard");

			}

			Thread.sleep(10);

			if (c.isKeyDown('1')) {
				easy();
			}

			else if (c.isKeyDown('2')) {
				medium();
			}

			else if (c.isKeyDown('3')) {
				hard();
			}

		}

	}

	static void easy() throws InterruptedException {

		int x_player = 100;
		int y_player = 100;
		int x_objective = 200;
		int y_objective = 200;
		int size = 50;

		while (true) {

			synchronized (c) {

				c.clear();
				c.setColor(Color.BLUE);
				c.fillRect(x_player, y_player, size, size);
				c.setColor(Color.GREEN);
				c.fillRect(x_objective, y_objective, size, size);

			}

			Thread.sleep(10);

			if (c.isKeyDown(Console.VK_UP)) {
				y_player -= 5;
			} else if (c.isKeyDown(Console.VK_DOWN)) {
				y_player += 5;
			} else if (c.isKeyDown(Console.VK_LEFT)) {
				x_player -= 5;
			} else if (c.isKeyDown(Console.VK_RIGHT)) {
				x_player += 5;
			}

			collideDetector(x_player, y_player, x_objective, y_objective, size, "YOU WIN!");

		}

	}

	static void medium() throws InterruptedException {

		int x_player = 100;
		int y_player = 100;
		int x_objective = 200;
		int y_objective = 200;
		int x_obstacle = 300;
		int y_obstacle = 400;
		int size = 50;

		while (true) {

			synchronized (c) {

				c.clear();
				c.setColor(Color.BLUE);
				c.fillRect(x_player, y_player, size, size);
				c.setColor(Color.GREEN);
				c.fillRect(x_objective, y_objective, size, size);
				c.setColor(Color.RED);
				c.fillRect(x_obstacle, y_obstacle, size, size);

			}

			Thread.sleep(10);

			if (c.isKeyDown(Console.VK_UP)) {
				y_player -= 5;
			} else if (c.isKeyDown(Console.VK_DOWN)) {
				y_player += 5;
			} else if (c.isKeyDown(Console.VK_LEFT)) {
				x_player -= 5;
			} else if (c.isKeyDown(Console.VK_RIGHT)) {
				x_player += 5;
			}

			collideDetector(x_player, y_player, x_objective, y_objective, size, "YOU WIN!");
			collideDetector(x_player, y_player, x_obstacle, y_obstacle, size, "GAME OVER!");

		}

	}

	static void hard() throws InterruptedException {

		int x_player = 100;
		int y_player = 100;
		int x_objective = 200;
		int y_objective = 200;
		int x_obstacle1 = 300;
		int y_obstacle1 = 400;
		int x_obstacle2 = 300;
		int y_obstacle2 = 50;
		int size = 50;

		while (true) {

			synchronized (c) {

				c.clear();
				c.setColor(Color.BLUE);
				c.fillRect(x_player, y_player, size, size);
				c.setColor(Color.GREEN);
				c.fillRect(x_objective, y_objective, size, size);
				c.setColor(Color.RED);
				c.fillRect(x_obstacle1, y_obstacle1, size, size);
				c.fillRect(x_obstacle2, y_obstacle2, size, size);

			}

			Thread.sleep(10);

			if (c.isKeyDown(Console.VK_UP)) {
				y_player -= 5;
			} else if (c.isKeyDown(Console.VK_DOWN)) {
				y_player += 5;
			} else if (c.isKeyDown(Console.VK_LEFT)) {
				x_player -= 5;
			} else if (c.isKeyDown(Console.VK_RIGHT)) {
				x_player += 5;
			}

			collideDetector(x_player, y_player, x_objective, y_objective, size, "YOU WIN!");
			collideDetector(x_player, y_player, x_obstacle1, y_obstacle1, size, "GAME OVER!");
			collideDetector(x_player, y_player, x_obstacle2, y_obstacle2, size, "GAME OVER!");

		}

	}

}
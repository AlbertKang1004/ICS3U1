package ca.elearningontario.tvdsb.day11;

import hsa_ufa.Console;
import java.awt.*;

public class Practice1_2 {

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
				c.println("You are BLUE. Touch the GREEN squares but do not touch the RED squares.");
				c.println("Press 1, 2 or 3 to enter level:");
				c.println("1. Easy");
				c.println("2. Medium");

			}

			Thread.sleep(10);

			if (c.isKeyDown('1')) {
				easy();
			}

			else if (c.isKeyDown('2')) {
				medium();
			}

		}

	}

	static void easy() throws InterruptedException {

		int x_player = 100;
		int y_player = 100;
		int x_objective = 200;
		int y_objective = 200;

		while (true) {

			synchronized (c) {

				c.clear();
				c.setColor(Color.BLUE);
				c.fillRect(x_player, y_player, 50, 50);
				c.setColor(Color.GREEN);
				c.fillRect(x_objective, y_objective, 50, 50);

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

			if ((x_player < x_objective + 50) && (y_player < y_objective + 50) && (x_objective < x_player + 50)
					&& (y_objective < y_player + 50)) {
				c.clear();
				c.setColor(Color.BLACK);
				c.println("WIN!!!");
				Thread.sleep(1000);
				return;
			}

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

			if ((x_player < x_objective + 50) && (y_player < y_objective + 50) && (x_objective < x_player + 50)
					&& (y_objective < y_player + 50)) {
				c.clear();
				c.setColor(Color.BLACK);
				c.println("WIN!!!");
				Thread.sleep(1000);
				return;
			}
			
			if ((x_player < x_obstacle + 50) && (y_player < y_obstacle + 50) && (x_obstacle < x_player + 50)
					&& (y_obstacle < y_player + 50)) {
				c.clear();
				c.setColor(Color.BLACK);
				c.println("GAME OVER!");
				Thread.sleep(1000);
				return;
			}

		}

	}

}
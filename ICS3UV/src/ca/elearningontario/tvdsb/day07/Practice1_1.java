package ca.elearningontario.tvdsb.day07;

import hsa_ufa.Console;

public class Practice1_1 {

	static Console c = new Console(800, 500, 30);

	public static void main(String[] args) {

		while (true) {
			synchronized (c) {
				if (c.isKeyDown('W')) {

					c.clear();
					c.println("Up");
				}

				else if (c.isKeyDown('A')) {

					c.clear();
					c.println("Left");
				}

				else if (c.isKeyDown('R')) {

					c.clear();
					c.println("Down");
				}

				else if (c.isKeyDown('S')) {

					c.clear();
					c.println("Right");
				}

				else {
					c.clear();
				}
			}
		}
	}
}

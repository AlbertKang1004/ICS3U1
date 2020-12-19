package ca.elearningontario.tvdsb.day11;

public class Example {

	public static void main(String[] args) {

		int x = 5;

		{

			int y = 10;

			System.out.printf("x=%d\n", x);
			System.out.printf("y=%d\n", y);

		}

		{

			// int x = 10; // This line generates an error, since the int x; above is
						// still in scope.

			int y = 10; // This works, because the int y; above is not in scope after
						// the closing curly brace } but it is confusing to have two
						// variables named y! See note on x in method() below.

			System.out.printf("x=%d\n", x);
			System.out.printf("y=%d\n", y);

		}

		method();

		System.out.printf("x=%d\n", x); // You might expect this to print x=10 since method()
										// sets x to 10, but it prints x=5 instead. See note
										// on x in method() below

		// System.out.printf("y=%d\n", y); // y is not in scope so this line generates an error

	}

	static void method() {

		// System.out.printf("x=%d\n", x); // x is not in scope so this line generates an error

		int x = 10; // This line is confusing as there is a variable in another method with
					// the same name. Since integer variables x were declared in different
					// methods, there are now two storage locations in memory with the label
					// x attached to them. The interpreter decides which one to access based
					// on which method is currently being executed. This can be very
					// confusing for a programmer! Each x variable is "local" to the curly-
					// braced block of code it is declared in.

		System.out.printf("x=%d\n", x); // This line works since x is in scope here

	}

}
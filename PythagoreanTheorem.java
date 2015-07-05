/*
 * This file is my solution to the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute the Pythagorean theorem:");
		double a = readDouble("a:");
		double b = readDouble("b:");
		double c = Math.sqrt(a*a+b*b);
		println("c = " + c);
	}
}

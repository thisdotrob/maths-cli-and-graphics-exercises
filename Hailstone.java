/*
 * This file is my solution to the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
		int count = 0;
		int value = readInt("Enter a number:");
		int newValue = 0;
		
		while (value != 1) {
			if (value % 2 == 0){
				newValue = value / 2;
				println(value + " is even so I take half: " + newValue);
				value = newValue;
			}
			else {
				newValue = value * 3 + 1;
				println(value + " is odd, so I make 3n + 1: " + newValue);
				value = newValue;
			}
			count++;
		}
		
		println("The process took " + count + " to reach 1");
		
	}
}


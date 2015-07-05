/*
 * This file is my solution to the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0; // Declare and initialise sentinel.
	
	public void run() {
		
		println("This program finds the largest and smallest numbers."); // print welcome message.
			
		double value = readInt(" ? "); // Request initial value from user.
		if (value == 0) println("no values entered"); // print special message if sentinel entered first.
		
		else {
			
			// if sentinel not entered first, assign entered value to both "min" and "max".
			double min = value; 
			double max = value; 
			
			while (true) {
				value = readInt(" ? "); // Request subsequent values from user.
				if(value == SENTINEL) break; // Break if user enters sentinel.
				if(value > max) max = value; // Assign entered value to "max" if higher than those entered previously.
				if(value < min) min = value; // Assign entered value to "min" if lower than those entered previously.
				
			}
			
			// print the smallest and largest numbers entered.
			println("Smallest: " + min);
			println("Largest: " + max);
			
		}	
	
	}
	
}


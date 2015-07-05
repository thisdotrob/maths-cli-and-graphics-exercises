/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		makePyramid();	
	}

	private void makePyramid() {
		
		for (int row = 0; row <= BRICKS_IN_BASE; row++){
			int bricksInRow = BRICKS_IN_BASE - row;
			double rowVertLoc = getHeight() - (row * BRICK_HEIGHT);
			layRowOfBricks(bricksInRow,rowVertLoc);
		}
		
	}
	
	private void layRowOfBricks(int bricksInRow, double vertLoc){
		for (int brickNum = 0; brickNum <= bricksInRow; brickNum++){
			double x = ((getWidth() - (bricksInRow * BRICK_WIDTH) ) / 2.0) + (brickNum * BRICK_WIDTH) ;
			double y = vertLoc;
			add(new GRect(x,y,BRICK_WIDTH,BRICK_HEIGHT));			
		}
	}

}
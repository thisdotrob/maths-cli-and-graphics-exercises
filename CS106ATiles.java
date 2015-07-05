/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends GraphicsProgram {
	
	private static final int TILE_SPACE = 20;	// Amount of space (in pixels) between tiles	
	private static final int TILE_WIDTH = 100;	// Width of a tile
	private static final int TILE_HEIGHT = 50;	// Height of a tile
	
	
	public void run(){
		double y1 = (getHeight() - TILE_SPACE) / 2 - TILE_HEIGHT;	// y position of top tiles
		double y2 = (getHeight() + TILE_SPACE) / 2; 				// y position of bottom tiles
		double x1 = (getWidth()- TILE_SPACE) / 2 - TILE_WIDTH;		// x position of left tiles
		double x2 = (getWidth() + TILE_SPACE) / 2;					// x position of right tiles
		addTile(x1,y1);	// creates top left tile
		addTile(x1,y2);	// creates bottom left tile
		addTile(x2,y1);	// creates top right tile 
		addTile(x2,y2);	// creates bottom right tile
	}
		
	/** creates a tile by adding a GRect and then a centred GLabel */
	private void addTile(double x, double y){
		GRect rect = new GRect(x,y,TILE_WIDTH,TILE_HEIGHT);
		add(rect);
		addLabel(x,y);
	}
	
	/** creates a centred GLabel (based on x,y location of GRect to be centred in) */
	private void addLabel(double x, double y){
		GLabel label = new GLabel("CS106A",x,y);
		x += (TILE_WIDTH - label.getWidth()) / 2 ;
		y += label.getAscent() + (TILE_HEIGHT - label.getAscent()) / 2 ;
		label.setLocation(x,y);
		add(label);		
	}
	
	
}


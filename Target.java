import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	
	/* Draws a red target with radius 72, centred in the window. */
	public void run(){
		double radius = 72;
		double y = getHeight()/2 - radius;
		double x = getWidth()/2 - radius;
		drawTarget(x,y,Color.RED,radius);
	}
	
	/* Method to draw a target at position (x,y), with color given by "color" and 
	 * radius by "radius".
	 */
	private void drawTarget(double x, double y, Color color, double radius){
		drawOuterCircle(x,y,color,radius);
		drawMiddleCircle(x,y,radius);
		drawInnerCircle(x,y,color,radius);
	}
	
	/* Method to draw the outer circle of a target, with colour given by "color" and radius 
	 * by "radius".
	 */
	private void drawOuterCircle(double x, double y, Color color, double radius){
		GOval circle = new GOval(x,y,radius*2,radius*2);
		circle.setColor(color);
		circle.setFilled(true);
		circle.setFillColor(color);
		add(circle);
	}

	
	/* Method to draw the middle circle of a target, with colour set to the canvas background 
	 * colour and radius equal to 65% of the target's total radius.
	 */	
	private void drawMiddleCircle(double x, double y, double radius){
		double ratioToOuterCircle = .65;
		x = x + radius * (1 - ratioToOuterCircle);
		y = y + radius * (1 - ratioToOuterCircle);
		radius = radius * ratioToOuterCircle;
		GOval circle = new GOval(x,y,radius*2,radius*2);
		circle.setColor(getBackground());
		circle.setFilled(true);
		circle.setFillColor(getBackground());
		add(circle);
	}	
		
	
	/* Method to draw the inner circle of a target, with colour given by "color" and radius equal
	 * to 30% of the target's total radius.
	 */	
	private void drawInnerCircle(double x, double y, Color color, double radius){
		double ratioToOuterCircle = .3;
		x = x + radius * (1 - ratioToOuterCircle);
		y = y + radius * (1 - ratioToOuterCircle);
		radius = radius * ratioToOuterCircle;
		GOval circle = new GOval(x,y,radius*2,radius*2);
		circle.setColor(color);
		circle.setFilled(true);
		circle.setFillColor(color);
		add(circle);
	}	
	
	
}

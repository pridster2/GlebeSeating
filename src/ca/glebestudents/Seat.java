package ca.glebestudents;

import javafx.scene.paint.Color;

public class Seat {
	private Color c;
	
	public Seat(Color color) {
		c = color;
	}
	
	public void setColour(Color color) {
		c = color;
	}
	public Color getColor() {
		return c;
	}
}

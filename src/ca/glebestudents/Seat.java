package ca.glebestudents;

import javafx.scene.paint.Color;

public class Seat {
	private Color c;
	//the name of the teacher whose student possesses the seat
	private String teacherName;
	
	public Seat(Color color) {
		c = color;
	}
	
	public void setColour(Color color) {
		c = color;
	}
	public Color getColor() {
		return c;
	}
	public void setTeacher(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacher() {
		return this.teacherName;
	}
}

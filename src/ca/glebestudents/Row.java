package ca.glebestudents;

import javafx.scene.paint.Color;

public class Row {
	//the seats contained within the row
	private Seat [] row;
	//the letter for the identification of the row
	private char letter;
	
	//constructor: takes in the length of the row (number of seats) and the new letter
	public Row(int length, char letter) {
		row = new Seat[length];
		this.letter = letter;
	}
	
	public void setSeatColor(Color color, int seat) {
		row[seat].setColour(color);
	}
	
	public int getLength() {
		return this.row.length;
	}
	
	public char getLetter() {
		return this.letter;
	}
}

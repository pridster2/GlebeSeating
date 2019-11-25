package ca.glebestudents;

public class Row {
	
	Seat [] row;
	
	public Row(int length) {
		row = new Seat[length];
	}
	
	public int getLength() {
		return row.length;
	}
}

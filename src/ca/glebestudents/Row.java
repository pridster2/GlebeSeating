package ca.glebestudents;

public class Row {
	private Seat [] row;
	
	public Row(int length) {
		row = new Seat[length];
	}
	
	public int getLength() {
		return row.length;
	}
}

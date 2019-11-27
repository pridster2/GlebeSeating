/**
 * 
 */
package ca.glebestudents;

import java.util.ArrayList;

/**
 * @author agent
 *
 */
public class Section {
	private static final int MAX_ROWS = 21;
	private ArrayList<Row> sections;

	public Section(){
		sections = new ArrayList<Row>(MAX_ROWS);
	}
	
	public void addRow(Row r) {
		sections.add(r);
	}
	public void removeRow(int index) {
		sections.remove(index);
	}
	public void setSeats(int seats, int index) {
		sections.get(index).
	}
	

}

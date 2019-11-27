/**
 * 
 */
package ca.glebestudents;

import java.util.ArrayList;

import javafx.scene.paint.Color;

/**
 * @author agent
 *
 */
public class Section {
	private static final int MAX_ROWS = 21;
	private ArrayList<Row> sections;
	
	//alignment defines how it will be printed (think centered, aligned to the left, aligned to the right)
	private String alignment;

	public Section(){
		sections = new ArrayList<Row>(MAX_ROWS);
	}
	public void setSeatcolor(Color color, int row, int seat) {
		sections.get(row).setSeatColor(color, seat);
	}
	public void addRow(Row r) {
		sections.add(r);
	}
	public void removeRow(int index) {
		sections.remove(index);
	}
	public void align(String alignment) {
		this.alignment = alignment;
	}

}

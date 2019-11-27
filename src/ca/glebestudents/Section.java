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
	

}

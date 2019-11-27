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
	
	public void addRow(Row r, int index) {
		sections.add(index, r);
	}
	public void removeRow(int index) {
		sections.remove(index);
	}
	

}

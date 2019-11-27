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
	private static final int NumSections = 3;
	private ArrayList<Section> sections;
	private int numRows;
	
	public Section(){
		sections = new ArrayList<Section>(NumSections);
		numRows = 21;
	}
	
	public Section(int numberOfRows){
		sections = new ArrayList<Section>(NumSections);
		numRows = numberOfRows;
	}
	
	

}

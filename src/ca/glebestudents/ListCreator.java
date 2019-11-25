package ca.glebestudents;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListCreator {
	//the list that will contain the initial input and the list that will be randomized and then returned
	ArrayList<Group> orderedList = new ArrayList<>();
	ArrayList<Group> randomList = new ArrayList<>();
	
	public ListCreator(File file) {
		try {
			//create the input stream
			BufferedReader input = new BufferedReader(new FileReader(file));
			String line;
			//loop through the input file
			while ((line = input.readLine()) != null && line.length() != 0) {
				//add groups to the list using the input string for their constructor
				orderedList.add(new Group(line));
			}
			//close the input
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: Specified file not found for reading.");
		} catch (EOFException e) { 
            System.out.println("Error: End of file reached unexpectedly when reading."); 
        } catch (IOException e) {
			System.out.println("Error: Cannot read the specified file.");
		}
	}
	
	public ArrayList<Group> getRandomGrouping() {
		//the random list is initiated as identical to the ordered list
		randomList = orderedList;
		//shuffle the "random list"
		Collections.shuffle(randomList, new Random());
		return randomList;
	}
}
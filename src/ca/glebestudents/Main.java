package ca.glebestudents;

import java.io.File;
import java.util.ArrayList;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	
	//application name to be displayed at the top of the window
	public static final String appName = "Glebe Seating";
	public static final int canvasHeight = 512;
	public static final int canvasWidth = 512;
	
	//the icon to display
	public Image icon = new Image(this.getResource("/images/chair.png"));
	
	//the list of classes, which will be put in a random order
	public ArrayList<Group> classes;
	private ListCreator classRandomizer;
	
	//the file where the classes are stored
	private File dataFile = new File(this.getResource("/file/path/here"));
	
	private Section[] audSections = new Section[3];
	private static Canvas canvas = new Canvas(canvasWidth, canvasHeight);
	private static GraphicsContext graphics = canvas.getGraphicsContext2D();
	

	public static void main(String [] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane p = new Pane();
		p.getChildren().add(canvas);
		Scene s = new Scene(p);
		
		stage.setScene(s);
		stage.setTitle(appName);
		stage.show();
		stage.getIcons().add(icon);
	
	}
	
	private String getResource(String loc) {
		return this.getClass().getResource(loc).toExternalForm();
	}
	
	private void initializeList() {
		//create the new ListCreator with the data file
		classRandomizer = new ListCreator(dataFile);
		//get the random grouping for placement within the auditorium
		classes = classRandomizer.getRandomGrouping();
	}
	
	private void initializeSections() {
		//this method must be hard-coded
		//alignments
		audSections[0].align("RIGHT");
		audSections[1].align("CENTER");
		audSections[2].align("LEFT");
		
		//first section:
		audSections[0].addRow(new Row(10, 'C'));
		audSections[0].addRow(new Row(11, 'D'));
		audSections[0].addRow(new Row(11, 'E'));
		audSections[0].addRow(new Row(12, 'F'));
		audSections[0].addRow(new Row(12, 'G'));
		audSections[0].addRow(new Row(11, 'H'));
		audSections[0].addRow(new Row(11, 'I'));
		audSections[0].addRow(new Row(11, 'J'));
		audSections[0].addRow(new Row(11, 'K'));
		audSections[0].addRow(new Row(10, 'L'));
		audSections[0].addRow(new Row(10, 'M'));
		audSections[0].addRow(new Row(10, 'N'));
		audSections[0].addRow(new Row(10, 'O'));
		audSections[0].addRow(new Row(10, 'P'));
		audSections[0].addRow(new Row(9, 'Q'));
		audSections[0].addRow(new Row(10, 'R'));
		audSections[0].addRow(new Row(10, 'S'));
		audSections[0].addRow(new Row(10, 'T'));
		audSections[0].addRow(new Row(10, 'U'));
		audSections[0].addRow(new Row(3, 'V'));
		audSections[0].addRow(new Row(3, 'W'));
		
		//second section
		audSections[1].addRow(new Row(11, 'C'));
		audSections[1].addRow(new Row(11, 'D'));
		audSections[1].addRow(new Row(12, 'E'));
		audSections[1].addRow(new Row(12, 'F'));
		audSections[1].addRow(new Row(13, 'G'));
		audSections[1].addRow(new Row(13, 'H'));
		audSections[1].addRow(new Row(13, 'I'));
		audSections[1].addRow(new Row(14, 'J'));
		audSections[1].addRow(new Row(14, 'K'));
		audSections[1].addRow(new Row(14, 'L'));
		audSections[1].addRow(new Row(14, 'M'));
		audSections[1].addRow(new Row(14, 'N'));
		audSections[1].addRow(new Row(14, 'O'));
		audSections[1].addRow(new Row(14, 'P'));
		audSections[1].addRow(new Row(14, 'Q'));
		audSections[1].addRow(new Row(14, 'R'));
		audSections[1].addRow(new Row(14, 'S'));
		audSections[1].addRow(new Row(14, 'T'));
		audSections[1].addRow(new Row(14, 'U'));
		audSections[1].addRow(new Row(10, 'V'));
		audSections[1].addRow(new Row(10, 'W'));
		
		//third section
		audSections[2].addRow(new Row(9, 'C'));
		audSections[2].addRow(new Row(10, 'D'));
		audSections[2].addRow(new Row(11, 'E'));
		audSections[2].addRow(new Row(12, 'F'));
		audSections[2].addRow(new Row(12, 'G'));
		audSections[2].addRow(new Row(11, 'H'));
		audSections[2].addRow(new Row(11, 'I'));
		audSections[2].addRow(new Row(11, 'J'));
		audSections[2].addRow(new Row(11, 'K'));
		audSections[2].addRow(new Row(10, 'L'));
		audSections[2].addRow(new Row(10, 'M'));
		audSections[2].addRow(new Row(10, 'N'));
		audSections[2].addRow(new Row(10, 'O'));
		audSections[2].addRow(new Row(10, 'P'));
		audSections[2].addRow(new Row(9, 'Q'));
		audSections[2].addRow(new Row(10, 'R'));
		audSections[2].addRow(new Row(10, 'S'));
		audSections[2].addRow(new Row(10, 'T'));
		audSections[2].addRow(new Row(10, 'U'));
		audSections[2].addRow(new Row(10, 'V'));
		audSections[2].addRow(new Row(10, 'W'));
	}
	
	public static void draw(int x, int y, Seat s) {
		graphics.fillRect(x, y, Seat.width, Seat.height);
	}
}

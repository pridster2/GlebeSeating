package ca.glebestudents;

import java.util.ArrayList;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static final String appName = "Glebe Seating";
	
	//please let me know if this should or shouldn't be stored here
	ArrayList<Section> audSections = new ArrayList<>();
	
	public static void main(String [] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane p = new Pane();
		Scene s = new Scene(p);
		
		stage.setScene(s);
		stage.setTitle(appName);
		stage.show();
		stage.getIcons().add(new Image(this.getResource("/images/chair.png")));
	
	}
	
	private String getResource(String loc) {
		return this.getClass().getResource(loc).toExternalForm();
	}
	
	private void initializeSections() {
		//this section must be hard-coded
	}
}

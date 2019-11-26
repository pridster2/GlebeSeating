package ca.glebestudents;

import javafx.application.*;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static final String appName = "Glebe Seating";
	
	public static void main(String [] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle(appName);
	}
}

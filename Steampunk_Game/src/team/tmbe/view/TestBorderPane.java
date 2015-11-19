package team.tmbe.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestBorderPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("fxml/TestBorderPane.fxml"));

		primaryStage.setTitle("TestBorderPane");
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();

	}

}

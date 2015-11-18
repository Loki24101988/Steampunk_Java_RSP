package team.tmbe.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MasterView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader
                .load(getClass().getResource("fxml/MasterView.fxml"));

        primaryStage.setTitle("FXML Hello World!");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

}

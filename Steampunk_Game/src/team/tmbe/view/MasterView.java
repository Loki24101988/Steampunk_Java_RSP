package team.tmbe.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.MeshView;
import javafx.stage.Stage;

public class MasterView extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/MasterView.fxml"));
        
        primaryStage.setTitle("FXML Hello World!");

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

}

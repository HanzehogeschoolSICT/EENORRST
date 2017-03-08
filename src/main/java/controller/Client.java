package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Starting point of the application, loads and launches javaFX
 */
public class Client extends Application {

    private static final String applicationTitle = "EENORRST";

    public static void main(String [] args){
        launch(args);
    }

    @Override
    /**
     * Starting point of the application, Creates a new window and loads the main view.
     */
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(applicationTitle);
        VBox mainViewLoader = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));

        // Load the file in the scene and display scene.
        Scene scene = new Scene(mainViewLoader);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

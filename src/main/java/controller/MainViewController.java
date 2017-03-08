package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the main selection menu
 */
public class MainViewController {

    @FXML private Button button1;

    @FXML
    public void handleButton1Action(){
        System.out.println("hi");
    }

}

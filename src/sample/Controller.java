package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button CalculateButton;

    @FXML
    void initialize() {
        CalculateButton.setOnAction(event ->
                System.out.println("Calculate total"));
        }

}
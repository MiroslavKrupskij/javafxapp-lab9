package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AppController {

    @FXML
    private Button button;

    @FXML
    public void handleButtonClick() {
        System.out.println("Button clicked!");
    }
}

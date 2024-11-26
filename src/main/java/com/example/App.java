package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        textField.setPromptText("Type your message here:");

        Button printButton = new Button("Print message");
        printButton.setOnAction(e -> {
            String inputText = textField.getText();
            System.out.println("Your message: " + inputText);
        });

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> textField.clear());

        VBox root = new VBox(10);
        root.getChildren().addAll(textField, printButton, clearButton);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Розширене JavaFX-застосування");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

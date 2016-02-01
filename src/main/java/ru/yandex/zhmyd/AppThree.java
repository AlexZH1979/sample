package ru.yandex.zhmyd;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AppThree extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();

        Scene scene = new Scene(root, 500, 500, Color.BLACK);

        Button button = new Button();
        button.setText("Hello");
        button.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        root.getChildren().add(button);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

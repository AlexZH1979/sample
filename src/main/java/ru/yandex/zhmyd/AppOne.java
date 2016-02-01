package ru.yandex.zhmyd;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.AQUA;
import static javafx.scene.paint.Color.TOMATO;

public class AppOne extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 500, 500, AQUA);
        /*
        Rectangle rectangle = new Rectangle(50, 50, 200,250);
        rectangle.setFill(TOMATO);

        group.getChildren().add(rectangle);
        */
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

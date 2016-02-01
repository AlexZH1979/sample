package ru.yandex.zhmyd;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AppTwo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 500, 500, Color.BLACK);

        Rectangle rectangle = new Rectangle(0,0,100,100);
        rectangle.setFill(Color.AQUA);

        group.getChildren().add(rectangle);
        /*
        TranslateTransition translate = new TranslateTransition(Duration.millis(750));
        translate.setToX(390);
        translate.setToY(390);

        FillTransition fill = new FillTransition(Duration.millis(750));
        fill.setToValue(Color.RED);

        RotateTransition rotate = new RotateTransition(Duration.millis(750));
        rotate.setToAngle(360);

        ScaleTransition scale = new ScaleTransition(Duration.millis(750));
        scale.setToX(0.1);
        scale.setToY(0.1);

        ParallelTransition transition = new ParallelTransition(rectangle,
                translate, fill, rotate, scale);


        transition.setCycleCount(Timeline.INDEFINITE);
        transition.setAutoReverse(true);
        transition.play();
        */
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

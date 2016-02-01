package ru.yandex.zhmyd;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.geometry.Pos.CENTER;
import static javafx.scene.paint.Color.DARKGREEN;
import static javafx.scene.text.FontWeight.*;

public class AppFour extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        root.setAlignment(CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        Text text = new Text();
        text.setText("Title tu tu tu");
        text.setFont(Font.font("Tahoma", NORMAL, 20));
        root.add(text,0,0,1,1);


        Button button = new Button();
        button.setText("Hello");
        Button button1 = new Button();
        button1.setText("Hello");
        Button button2 = new Button();
        button2.setText("Hello");

        root.add(button,1,0,1,1);
        root.add(button1,0,2,1,1);
        root.add(button2,1,2,1,1);

        Scene scene = new Scene(root, 500, 500);
        scene.setFill(DARKGREEN);


        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

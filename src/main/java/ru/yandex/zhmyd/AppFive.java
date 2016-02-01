package ru.yandex.zhmyd;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppFive extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
    	GridPane grid = new GridPane();
    	grid.setAlignment(Pos.CENTER);
    	grid.setHgap(10);
    	grid.setVgap(10);
    	grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 300);
        grid.setId("root");
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0);

        primaryStage.setScene(scene);
        String url =AppFive.class.getResource("/AppFive.css").toExternalForm();
        scene.getStylesheets().add(url);
     

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

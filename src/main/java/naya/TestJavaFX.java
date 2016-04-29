package naya;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * Created by Naya on 29.04.2016.
 */
public class TestJavaFX extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First Window");

        StackPane layout = new StackPane();
        Box myBox = new Box(50,60,70);
        myBox.setRotationAxis(Rotate.X_AXIS);
        myBox.setRotate(35);
        myBox.setRotationAxis(Rotate.Y_AXIS);
        myBox.setRotate(75);
        myBox.getTransforms().addAll(new Rotate(35, Rotate.X_AXIS), new Rotate(55, Rotate.Y_AXIS));
        myBox.setMaterial(new PhongMaterial(Color.PINK));

        layout.getChildren().add(myBox);

        Scene scene = new Scene(layout,200,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

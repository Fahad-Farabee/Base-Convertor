package CLC;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//this is our main class (scene1) for the conversion calculator
public class clc extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("clc.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Base Conversion Calculator");
        stage.show();
    }
        //Open the fxml file in the sceneBuilder

    public static void main(String[] args) {
        launch(args);
    }
}

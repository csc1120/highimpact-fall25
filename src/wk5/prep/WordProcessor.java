package wk5.prep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WordProcessor extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("WordProcessor.fxml"));
        Scene s1 = new Scene(root, 400, 400);
        stage.setScene(s1);
        stage.show();
    }


}

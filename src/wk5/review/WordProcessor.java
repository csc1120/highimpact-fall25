package wk5.review;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WordProcessor extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("WordProcessor.fxml"));
        Scene s1 = new Scene(root, 400, 400);
        stage.setScene(s1);
        stage.show();
    }
}

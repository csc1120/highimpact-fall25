package wk5.review;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {


    @FXML
    private void saveFile(ActionEvent event){
        System.out.println("saving");
    }
    @FXML
    private void loadFile(ActionEvent event){
        System.out.println("loading");
    }

}

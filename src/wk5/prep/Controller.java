package wk5.prep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Controller {
    @FXML
    private TextArea wordEntry;
    @FXML
    private TextField filenameEntry;
    Alert alert = new Alert(Alert.AlertType.ERROR);

    @FXML
    private void saveFile(ActionEvent event){

    }

    @FXML
    private void loadFile(ActionEvent event) {
        String filename = filenameEntry.getText();

        try(FileInputStream in = new FileInputStream(filename);
            Scanner fileIn = new Scanner(in)){
            StringBuilder sb = new StringBuilder();
            while (fileIn.hasNextLine()){
                sb.append(fileIn.nextLine());
            }
            wordEntry.setText(sb.toString());
        } catch (IOException e){
            System.out.println("Error loading file "+filename);
            alert.setContentText("Error loading the file "+filename);
            alert.showAndWait();
        }

    }

}

package com.example.systemvars;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public AnchorPane rootPane;
    public GridPane grid;
    public Button programFilesBtn2;
    public Text txt1;
    public Text txt3;
    public Text txt2;
    public Button docInProgramFilesBtn;
    public Button programFilesBtn;

    public void getDocInProgramFiles() {

        String doc=System.getenv("\\DLCSPM\\SimSpeak\\doc\\");

        txt2.setText(doc);
    }

    public void getProgramFiles() {
        String programFiles = System.getenv("ProgramFiles");
        txt2.setText(programFiles);

    }

    public void getXprogramFiles() {
        String programFiles86= System.getenv("ProgramFiles(x86)");
        txt2.setText(programFiles86);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

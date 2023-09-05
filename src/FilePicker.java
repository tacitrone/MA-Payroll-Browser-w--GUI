import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;

public class FilePicker {

    @FXML private VBox root;
    @FXML private AnchorPane contentPane;
    @FXML private TextField file_textfield;
    @FXML private Button browse_button;
    @FXML private Button load_button;



    @FXML
    private void browse_for_file() {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(root.getScene().getWindow());
        if (selectedFile != null) {
            file_textfield.setText(selectedFile.getAbsolutePath());
        }
    }

    @FXML
    private void load_file() {
        // Add code to load the selected file here
    }

}
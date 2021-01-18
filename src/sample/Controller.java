package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {
    @FXML
    private TextField entryField;

    @FXML
    private Button Send;

    @FXML
    private TextArea chatWindow;

    @FXML
    void sendMessage(ActionEvent event) {
        if (!entryField.getText().isEmpty()) {
            chatWindow.setText(chatWindow.getText() + entryField.getText() + "\n");
            entryField.clear();
        }

    }
}

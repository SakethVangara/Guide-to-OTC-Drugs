package com.OTCDrugs.Guide;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class OTCGuideController {
    @FXML
    private Label messageLabel;

    public void handleButton() {
        messageLabel.setText("You pressed the button!");
    }
}

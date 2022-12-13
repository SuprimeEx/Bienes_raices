package co.edu.uniquindio.anthonyProyecto.application;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("EntornoPrincipalFX");
    }
}

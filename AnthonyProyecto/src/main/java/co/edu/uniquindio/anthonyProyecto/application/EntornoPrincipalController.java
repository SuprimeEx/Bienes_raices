package co.edu.uniquindio.anthonyProyecto.application;

import java.io.IOException;
import javafx.fxml.FXML;

public class EntornoPrincipalController {
	
	@FXML private void switchToTipoPropiedad() throws IOException{
		App.setRoot("TipoPropiedadFX");
	}
	
	@FXML private void switchToTipoPersona() throws IOException{
		App.setRoot("TipoPersonaFX");
	}
	

}

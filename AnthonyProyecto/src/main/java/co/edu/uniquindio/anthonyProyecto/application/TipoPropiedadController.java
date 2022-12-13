package co.edu.uniquindio.anthonyProyecto.application;

import java.io.IOException;
import javafx.fxml.FXML;

public class TipoPropiedadController {
	
	
		@FXML private void switchToRegistroApartamento() throws IOException{
			App.setRoot("RegistroApartamentoFX");
		}

		@FXML private void switchToRegistroParqueadero() throws IOException{
			App.setRoot("RegistroParqueaderoFX");
		}
		
		@FXML private void switchToReturn() throws IOException{
			App.setRoot("EntornoPrincipalFX");
		}
		
		@FXML private void switchToRegistroBodega() throws IOException{
			App.setRoot("RegistroBodegaFX");
		}
		
		@FXML private void switchToRegistroLote() throws IOException{
			App.setRoot("RegistroLoteFX");
		}
		
		@FXML private void switchToRegistroEdificio() throws IOException{
			App.setRoot("RegistroEdificioFX");
		}

		@FXML private void switchToRegistroCasa() throws IOException{
			App.setRoot("RegistroCasaFX");
		}
		
		@FXML private void switchToRegistroChalet() throws IOException{
			App.setRoot("RegistroChaletFX");
		}
		
	}


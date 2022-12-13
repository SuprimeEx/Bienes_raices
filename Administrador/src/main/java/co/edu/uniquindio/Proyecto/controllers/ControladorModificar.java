package co.edu.uniquindio.Proyecto.controllers;
import co.edu.uniquindio.Proyecto.Admin.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class ControladorModificar {
	Alert alert = new Alert(Alert.AlertType.ERROR);
	Alert confir = new Alert(Alert.AlertType.CONFIRMATION);
	Alert info = new Alert(Alert.AlertType.INFORMATION);
	controladorPrinci a = new controladorPrinci();
	Empleado b = new Empleado(null, null, null, 0, null);

	@FXML private Label nombre; 
	@FXML private Label apellido; 
	@FXML private Label telefono; 
	@FXML private Label edad; 
	
	
	@FXML public void modificar() {
		
	}
	
	
	

}

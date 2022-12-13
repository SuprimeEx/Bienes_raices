package co.edu.uniquindio.Login.controllers;

import java.io.IOException;

import co.edu.uniquindio.ProyectoFinal.application.App;
import javafx.fxml.FXML;

public class ControladorTipoIngreso {
	
	@FXML 
	public void onEmpleadoClick() {
		try {
			App.setRoot("MenuEmpleado");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	@FXML
	public void onAdministradorClick() {
		try {
			App.setRoot("MenuAdministrador");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}

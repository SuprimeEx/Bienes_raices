package co.edu.uniquindio.Login.controllers;


import java.io.IOException;
import Clases.Inmobiliaria;
import co.edu.uniquindio.ProyectoFinal.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javafx.scene.control.PasswordField;


public class ControladorEmpleados {
	
	@FXML 
	private TextField usuarioIngresado;
	
	@FXML 
	private PasswordField claveIngresada;	
	
	@FXML 
	public void onIngresarClick() {
		
		try {
			//ASIGNACION DE LAS VARIABLES RECIBIDAS
			String usuario=usuarioIngresado.getText();
			String clave=claveIngresada.getText();
			Inmobiliaria inmo = new Inmobiliaria();
			//COMPROBACION DE LOS DATOS
			var usuarioOptional = inmo.autenticar(usuario, clave );
			//CUANDO EL ACCESO ES DENEGADO
		 	if (usuarioOptional.isEmpty()) {
		 		mostrarMensaje("Usuario ó contraseña incorrecta");	
		 	//CUANDO EL ACCESO ES PERMITIDO		
			}else {
				App.setRoot("Entrada");
			}
		}catch(Exception e){
			e.printStackTrace();
			mostrarMensaje("Usuario ó contraseña incorrecta");			
		}
		
	}@FXML 
	public void onRecuperacionClick() throws IOException {
		try {
			App.setRoot("RecuperacionEmpleado");
		} catch (IOException e) {
			e.printStackTrace();
			mostrarInformacion("Algo salio mal. Intenta otra vez.:)");
			App.setRoot("MenuEmpleado");
		}
	}
	
	private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void mostrarInformacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}

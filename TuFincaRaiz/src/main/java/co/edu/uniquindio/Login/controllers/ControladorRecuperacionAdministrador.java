package co.edu.uniquindio.Login.controllers;

import java.io.IOException;
import Clases.Inmobiliaria;
import co.edu.uniquindio.ProyectoFinal.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class ControladorRecuperacionAdministrador {	
	
	@FXML 
	private TextField usuarioIngresado;
	
	@FXML 
	private PasswordField PalabrasecretaIngresada;	
		
	@FXML 
	public void onIngresarClick() throws IOException {
		
		try {
			//ASIGNACION DE LAS VARIABLES RECIBIDAS
			String usuario=usuarioIngresado.getText();
			String PalabraSecreta=PalabrasecretaIngresada.getText();
			Inmobiliaria inmo = new Inmobiliaria();
			//COMPROBACION DE LOS DATOS
			var usuarioOptional = inmo.autenticarPalabrasecreta(usuario, PalabraSecreta);
			//CUANDO EL ACCESO ES DENEGADO
		 	if (usuarioOptional.isEmpty()) {
		 		mostrarMensaje("Palabra Secreta No coincide.");	
			//CUANDO EL ACCESO ES PERMITIDO	
			}else {
				mostrarInformacion("Su clave es: " + usuarioOptional.get().getContraseña());
				App.setRoot("MenuAdministrador");
			}
		 	
		}catch(Exception e){
			e.printStackTrace();
			mostrarMensaje("Algo salio mal. Intenta otra vez.:)");	
			App.setRoot("MenuAdministrador");
		}
	}
	
	//METODO ADICIONAL DE RECUPERACION
	@FXML 
	public void onOtroMetodoClick() {
		try {
			App.setRoot("RecuperacionAdministrador");//CONEXION CON EL METODO DE RECUPERACION DE MIGUEL
		} catch (IOException e) {
			e.printStackTrace();
			mostrarMensaje("Usuario ó contraseña incorrecta");
		}
	}
	
    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Error");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void mostrarInformacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Información");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
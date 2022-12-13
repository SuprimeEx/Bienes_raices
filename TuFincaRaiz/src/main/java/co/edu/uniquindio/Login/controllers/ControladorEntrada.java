package co.edu.uniquindio.Login.controllers;

import Clases.Inmobiliaria;
import co.edu.uniquindio.ProyectoFinal.application.App;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;



public class ControladorEntrada {
	
	Alert alerta = new Alert(Alert.AlertType.ERROR);
	
	
	@FXML 
	private TextField usuarioIngresado;
	
	
	@FXML 
	private PasswordField claveIngresada;
	
	private Stage stage;
	
	/**
	 * public void pasarventana2(ActionEvent event) throws IOException {
	 * FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login/src/main/resources/co/edu/uniquindio/ProyectoFinal/application/Entrada.fxml"));
		Parent root = loader.load();
		ControladorEntrada controller = loader.getController();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		controller.init(stage, this);
		stage.show();
		this.stage.close();
	}
	 */
		

 
	App a = new App();
	
	@FXML 
	public void onIngresarClick() {
		
		try {
			String usuario=usuarioIngresado.getText();
			String clave=claveIngresada.getText();
			Inmobiliaria inmo = new Inmobiliaria();
			var usuarioOptional = inmo.autenticar(usuario, clave );
		 	if (usuarioOptional.isEmpty()) {
				alerta.setHeaderText(null);
				alerta.setTitle("Acceso denegado");
				alerta.setContentText("Usuario ó contraseña incorrecta");
				alerta.showAndWait();
				
				
			}else {
	
				App.setRoot("Entrada");

			
			}
		}catch(Exception e){
			e.printStackTrace();
			alerta.setHeaderText(null);
			alerta.setTitle("Acceso denegado");
			alerta.setContentText("Usuario ó contraseña incorrecta");
			alerta.showAndWait();
			
		}
	}




	private Parent loadFXML(String string) {
		return null;
	}
}
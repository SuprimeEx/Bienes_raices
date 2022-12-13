package co.edu.uniquindio.anthonyProyecto.application;


import java.io.IOException;

import co.edu.uniquindio.anthonyProyecto.listas.ListaEdificios;
import co.edu.uniquindio.anthonyProyecto.propiedad.Edificio;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class RegistroEdificioController {
	ListaEdificios listaEdificios = new ListaEdificios();
	
	@FXML private void switchToReturn() throws IOException{
		App.setRoot("TipoPropiedadFX");	
	}

    @FXML private TextField tfDireccion;
    @FXML private TextField tfValor;
    @FXML private TextField tfArea;
    @FXML private TextField tfCantidadPisos;
    
	
	@FXML private TableView<Edificio> tblEdificios;
    @FXML private TableColumn<Edificio, String> colDireccion;
    @FXML private TableColumn<Edificio, String> colValor;
    @FXML private TableColumn<Edificio, String> colArea;
    @FXML private TableColumn<Edificio, String> colCantidadPisos;
    ObservableList<Edificio> verlista=listaEdificios.mostrar();
   
    @FXML void initialize() {
    	this.colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
    	this.colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
    	this.colArea.setCellValueFactory(new PropertyValueFactory<>("area"));
    	this.colCantidadPisos.setCellValueFactory(new PropertyValueFactory<>("cantidadPisos"));
    	this.tblEdificios.setItems(verlista);
    }
    @FXML private void onGuardarClick() {
    	try {
    		String d=tfDireccion.getText();
    		double v= Double.parseDouble( tfValor.getText() );
    		float a = Float.parseFloat( tfArea.getText());
    		int c= Integer.parseInt(tfCantidadPisos.getText());
    		Edificio b = new Edificio(d,v,a,c);
    		this.listaEdificios.adicionarEdificio(b);	
    		this.tblEdificios.setItems(verlista);
    	}catch (Exception e) {
			System.out.println(" dato erroneo ");
		}
    	
    	
    	@FXML public void onCancelarClick() {
            limpiarCampos();
            tblEdificios.getSelectionModel().clearSelection();
        }
    
    	private void limpiarCampos() {
    		tfDireccion.setText("");
    		tfValor.setText("");
    		tfArea.setText("");
    		tfCantidadPisos.setText("");
    }
    
}
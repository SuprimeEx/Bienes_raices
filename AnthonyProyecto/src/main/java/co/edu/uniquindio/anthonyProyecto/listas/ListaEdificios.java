package co.edu.uniquindio.anthonyProyecto.listas;

import co.edu.uniquindio.anthonyProyecto.propiedad.Edificio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListaEdificios {
	ObservableList<Edificio> edificio=FXCollections.observableArrayList();

	public void adicionarEdificio(Edificio a) {
		edificio.add(a);
	}
	public ObservableList<Edificio> mostrar(){
		return edificio;
		
	}
}

package co.edu.uniquindio.Proyecto.Admin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

public class registroEmpleados {
	Alert alert = new Alert(Alert.AlertType.ERROR);
	ObservableList<Empleado> empleados=FXCollections.observableArrayList();
	
	public void añadir(Empleado a) {
		empleados.add(a);
	}
	public ObservableList<Empleado> mostrar(){
		return empleados;
	}
	public ObservableList<Empleado> OrdenarMenorMa() {
		 empleados.sort((p1,p2)->{
	            int r = p1.getNombre().compareTo(p2.getNombre());
	            if( r != 0){
	                r = p1.getEdad() - p2.getEdad();
	            }
	            return r;
		 });
		 return empleados;
	}
	public ObservableList<Empleado> OrdenarMayorMeno() {
		 empleados.sort((p1,p2)->{
	            int r = p2.getNombre().compareTo(p1.getNombre());
	            if( r != 0){
	                r = p2.getEdad() - p1.getEdad();
	            }
	            return r;
		 });
		 return empleados;
	}
	public void buscar() {
		
	}
	}
		

package co.edu.uniquindio.Proyecto.controllers;
import java.io.IOException;
import java.util.Optional;

import co.edu.uniquindio.Proyecto.Admin.Empleado;
import co.edu.uniquindio.Proyecto.Admin.Person;
import co.edu.uniquindio.Proyecto.Admin.registroEmpleados;
import co.edu.uniquindio.test.Proyecto_Final.App;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class controladorPrinci {
	registroEmpleados empleado = new registroEmpleados();
	Alert alert = new Alert(Alert.AlertType.ERROR);
	Alert confir = new Alert(Alert.AlertType.CONFIRMATION);
	Alert info = new Alert(Alert.AlertType.INFORMATION);
	//Text field
	@FXML private TextField nom;
	@FXML private TextField ape;
	@FXML private TextField tele;
	@FXML private TextField edad;
	@FXML private TextField cargo;
	
	//Tabla
	@FXML TableView<Empleado> tablaEmpleados;
	@FXML private TableColumn <Empleado,String>nombreC;
	@FXML private TableColumn <Empleado,String>apeC;
	@FXML private TableColumn <Empleado,String>telC;
	@FXML private TableColumn <Empleado,String>edaC;
	@FXML private TableColumn <Empleado,String>cargoC;
	ObservableList<Empleado> empleados=empleado.mostrar();
	
	@FXML void initialize(){
		this.nombreC.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.apeC.setCellValueFactory(new PropertyValueFactory<>("apellido"));
		this.telC.setCellValueFactory(new PropertyValueFactory<>("id"));
		this.edaC.setCellValueFactory(new PropertyValueFactory<>("edad"));
		this.cargoC.setCellValueFactory(new PropertyValueFactory<>("cargo"));
		empleados.add(new Empleado("Santiago","Cardoso Vinasco","188379383",18,"No se"));
		empleados.add(new Empleado("Andres","Camilo Pescador","1987392247",19,"No se"));
		empleados.add(new Empleado("Anthonio","Villada","194408493",21,"No se"));
		this.tablaEmpleados.setItems(empleados);
	    }
	//Le especifica al programa la casilla que yo selecione
	@FXML public void seleccionar() {
			Person p=this.tablaEmpleados.getSelectionModel().getSelectedItem();
			if(p !=null) {
				this.nom.setText(p.getNombre());
				this.ape.setText(p.getApellido());
				this.tele.setText(p.getId());
				//PAra que no detecte fallo se le ponen comilla doble
				this.edad.setText(p.getEdad()+" ");
			}
		}
	//Añade a empleados
	@FXML public void añadir () {
		try {
		String n=nom.getText();	
		String ap=ape.getText();
		String tel=tele.getText();
		int eda=Integer.parseInt(edad.getText());
		String car=cargo.getText();
		Empleado persona = new Empleado(n, ap, tel, eda,car);
		
		//Me dice si no existe la persona
		if(!empleados.contains(persona)) {	
			confir.setTitle("Verificar datos");
			confir.setContentText("NOMBRE: "+n
					+"\nAPELLIDOS: "+ap
					+"\nEDAD: "+eda);
			Optional<ButtonType> action = confir.showAndWait();
		
			if(action.get()==ButtonType.OK) {
					empleado.añadir(persona);
					nom.setText(null);
					ape.setText(null);
					tele.setText(null);
					this.tablaEmpleados.setItems(empleados);
					info.setHeaderText(null);
				    info.setTitle("!Felicidadez¡");
				    info.setContentText("SE AÑADIO AL NUEVO EMPLEADO");
				    info.showAndWait();
				}		
		}
		//Si  existe la persona salta la alarma
		else {
			alert.setHeaderText(null);
		    alert.setTitle("Error");
		    alert.setContentText("PERSONA YA EXISTE");
		    alert.showAndWait();
		}
		
		// Si los datos so mal ingresados
		}
		catch (Exception e) {
		    alert.setHeaderText(null);
		    alert.setTitle("Error");
		    alert.setContentText("Error en el ingreso de datos");
		    alert.showAndWait();
		}
		
			
	
	}
	//Elimina La persona de la casilla que selecione
	@FXML public void eliminar() {
		Empleado p=this.tablaEmpleados.getSelectionModel().getSelectedItem();
		if(p==null) {
			 alert.setHeaderText(null);
			    alert.setTitle("Error");
			    alert.setContentText("CASILLA VACIA");
			    alert.showAndWait();
		}
		else {
			confir.setTitle("COMPROBAR");
			confir.setContentText("¿Seguro que desea eliminar al empleado "+p.getNombre()+" "+p.getApellido()+" ?");
			Optional<ButtonType> action = confir.showAndWait();
			
			if(action.get()==ButtonType.OK) {
			this.empleados.remove(p);
			this.tablaEmpleados.refresh();
			info.setHeaderText(null);
		    info.setTitle("ADIOS");
		    info.setContentText("SE ELIMINO CORRECTAMENTE AL EMPLEADO");
		    info.showAndWait();
			}
		}
		
	}
	//Modifica la casilla que yo selecione
	@FXML public void modificar() {
			Empleado p=this.tablaEmpleados.getSelectionModel().getSelectedItem();
			if(p==null) {
				 alert.setHeaderText(null);
				 alert.setTitle("Error");
				 alert.setContentText("CASILLA VACIA");
				 alert.showAndWait();
			}
			else {
				try {
					String n=nom.getText();	
					String ap=ape.getText();
					String tel=tele.getText();
					int eda=Integer.parseInt(edad.getText());
					String car=cargo.getText();
					Empleado persona = new Empleado(n, ap, tel, eda,car);
					//Me dice si no existe la persona
					if(!empleados.contains(persona)) {	
						confir.setTitle("Verificar datos");
						confir.setContentText("NOMBRE: "+n
								+"\nAPELLIDOS: "+ap
								+"\nEDAD: "+eda);
						Optional<ButtonType> action = confir.showAndWait();
					
						if(action.get()==ButtonType.OK) {
							p.setNombre(persona.getNombre());
							p.setApellido(persona.getApellido());
							p.setEdad(persona.getEdad());
							p.setId(persona.getId());
							p.setCargo(persona.getCargo());
							this.tablaEmpleados.refresh();
							nom.setText(null);
							ape.setText(null);
							tele.setText(null);
							this.tablaEmpleados.setItems(empleados);
							info.setHeaderText(null);
							info.setTitle("!Felicidadez¡");
							info.setContentText("Datos actualizados");
							info.showAndWait();
							}		
					}
					//Si  existe la persona salta la alarma
					else {
						alert.setHeaderText(null);
					    alert.setTitle("Error");
					    alert.setContentText("PERSONA YA EXISTE");
					    alert.showAndWait();
					}
					
					// Si los datos so mal ingresados
					}
					catch (Exception e) {
					    alert.setHeaderText(null);
					    alert.setTitle("Error");
					    alert.setContentText("Error en el ingreso de datos");
					    alert.showAndWait();
					}
			}
	}
	//Ordena la lista por edades de menor a mayor
	@FXML public void MenoraMayor() {
		empleado.OrdenarMenorMa();
	}
	//Ordena la lista por edades de Mayor a menor
	@FXML public void MayoraMenor() {
		empleado.OrdenarMayorMeno();
	}
	
	@FXML public void buscar() throws IOException {
		App.setRoot("MenuPrincipal");
	}
	

}
